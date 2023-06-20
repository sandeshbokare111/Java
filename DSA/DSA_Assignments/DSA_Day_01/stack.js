class Stack {
    constructor() {
        this.items = [];
        let top = -1;
    }

    push(element)
    {
        this.items.push(element);
    }

    pop()
    {
        if(this.items.length == 0)
        {
            return "Stack Underflow";
        }
        return this.items.pop();
    }

    print() 
    {
        var str = "";
        for(let i = 0; i < this.items.length; i++)
        {
            str += this.items[i] + " ";
        }
        document.write(str);
    }
}

let stacker = new Stack();

$("#push").on('click', function() {
    stacker.push(prompt("Enter a value to the Stack"));
    newTableData = `<tr> <td> ${stacker.items} </td> </tr>`;
    tableRow = $("table tbody");
    tableRow.append(newTableData);
})

$("#pop").on('click', function() {
    stacker.pop();
    remTableData = `<tr> <td> ${stacker.items} </td> </tr>`;
    tableRow = $("table tbody");
    tableRow.append(remTableData);
})

$("#print").on('click', function() {
    stacker.print();
})

