// Monday
/*  
Intro to Singly Linked List
- OOP
- Array vs  SLL
*/

var arr = ['a', 'b', 'c', 'd', 'e']

// TODO the two classes youll  need
class SLNode {
    constructor(value){
        this.value = value
        this.next = null
    }
}

// This singly linked class is in charge of knowing where the begining of the list is
class SLL{
    constructor(){
        this.head = null;
    }
    printValues(){
        //1. SLL IS EMPTY AND
        if(this.head === null){
            console.log("SLL IS EMPTY")
            
        }
        // 2. SLL IS NOT EMPTY 
        var runner = this.head
        while(runner.next != null){
            console.log(runner.value)
            runner = runner.next
        }
        console.log(runner.value)
    }

    insertAtBack(data){

    }
    seedFromArr(vals){

    }


}

var newList = new SLL()
newList.printValues()
// TODo ednd of those two classes











//Three separate nodes that are NOT linked together yet. They are unlinked. 
// var a = new SLNode(6)
// var b = new SLNode(2)
// var c = new SLNode(1)

// console.log(a.value) // 6
// console.log(a.next) // null

//now we can link them together
// a.next = b //
// b.next = c // 
// console.log(a.next) //

// var head = a

// console.log(head)

// var runner = head
// while(runner.next != null){
//     runner = runner.next
// }

// Python version of the above 
//
// class SLNode:
//     def __init__(self, value):
//         self = value
//         self.next = null

// somevar = SLNode(6)