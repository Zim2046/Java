public class TestGreetings {
//  👇 A fucntion that belongs to a class -> a main method
//  |<--'function' -->| 
//  |<-- keyword   -->|  👇 name of function
    public static void main(String[] args) {
                           //👆arguments👆

    	// To use the greetings methods
    	// create a variable of type Greetings
    	Greetings greeterApp = new Greetings();
 
    	// Use the variable to access Greetings methods
    	// using dot notation.
        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);
    }
}


// int ourInt;    // 1
// String ourString = "hello world";    // 
// ourInt = "Hello world";    // 3 ERROR!

 
