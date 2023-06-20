class Queue {
    constructor()
    {
        this.data = [];
        this.rear = 0;
        this.size = 10;
    }

    insert(element) {
        if(this.rear < this.size)
        {
            this.data[this.rear] = element;
            this.rear = this.rear + 1;        
        }
    }

    isEmpty() {
        return this.rear === 0;
    }

    delete()
    {
        if(this.isEmpty() === false)
        {
            this.rear = this.rear - 1;
            return this.data.shift();
        }
    }

    print()
    {
        for(let i = 0; i < this.rear; i++)
        {
            console.log(this.data[i]);
        }
    }
}

let q = new Queue();

$("#add").on('click', function() {
    q.insert(prompt("Enter a value to the Queue"));
    newTableData = `<tr> <td> ${q.data} </td> </tr>`;
    tableRow = $("table tbody");
    tableRow.append(newTableData);
})

$("#del").on('click', function() {
    q.delete();
    remTableData = `<tr> <td> ${q.data} </td> </tr>`;
    tableRow = $("table tbody");
    tableRow.append(remTableData);
})

$("#prnt").on('click', function() {
    q.print();
})