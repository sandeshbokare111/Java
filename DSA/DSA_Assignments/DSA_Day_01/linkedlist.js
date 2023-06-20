class Node {
    constructor(data, next = null)
    {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    add(data) {
        if(this.head == null){
            this.head = new Node(data);
            this.tail = this.head;
            this.size++;
        }
        else{
            this.tail.next = new Node(data);
            this.tail = this.tail.next;
            this.size++;
        }
    }

    remove(data)
    {
        let tempHead = this.head;
        let prevNode;
        while(tempHead.data !== data){
            prevNode = tempHead;
            tempHead = tempHead.next;
        }
        prevNode.next = tempHead.next;
        this.size--;
    }

    print() {
        let currentNode = this.head;

        while(currentNode) {
            console.log(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}

let item = new LinkedList();

$("#add").on('click', function() {
    item.add(parseInt(prompt("Enter a data to be inserted into the Linked List: ")));
})
$("#del").on('click', function() {
    item.remove(parseInt(prompt("Enter a data to be removed from the Linked List: ")));
})

$("#prnt").on('click', function() {
    item.print();
})
