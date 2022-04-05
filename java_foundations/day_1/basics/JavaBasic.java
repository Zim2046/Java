public class JavaBasic{
    //👇 POINT OF ENTRY METHOD. 
    public static void main(String args[]){
        System.out.println("Hello World!");
        System.out.println("Hello again!");

        // PRIMITIVE TYPES 
        // int
        int count = 12;
        int age = 31;
        // boolean
        boolean flag = false; // true
        // double 
        double dbl_price = 30.02;
        // char 
        char letter = 'a';

        // OBJECT TYPES 
        // String
        String name = "Timothy Thomas";
        System.out.println(name.length());


        //TODO TYPE CASTING 
        //TODO implicit casting
        //TODO Complicated => Simple
        int price = 1;
        double new_price;
        new_price = price * dbl_price;
        System.out.println("new_price");

        //TODO explicit
        //TODO Simple => Complicted
        double a = 1.0;
        int b = (int) a;
        System.out.println(b);

        // Normal string literals assignment
        // String c = "same string";
        // String d = "same string";
        // System.out.println(c == d); // true

        // // Creating new strings as separate objects (another way to create a String)
        // c = new String("same letters");
        // d = new String("same letters");
        // System.out.println(c == d); // false. Not the same object in memory.
        // System.out.println(c.equals(d)); // true. same exact characters.

        // boolean isRaining = false;
        // boolean isCold = false;
            
        // if(isRaining) {
        //     System.out.println("Bring an umbrella.");
        // }
        // else if(isCold) {
        //     System.out.println("Wear a coat.");
        // }
        // else {
        //     System.out.println("Have fun!");
        // }

        // String names = "James Gosling";
        // double amount = 3;
        // int age;
        // Double price = 3;

        public string hello() {
            return "HELLO";
        }
    }

}
