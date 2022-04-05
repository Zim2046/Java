// THIS FILE CALLS THE METHODS

import java.util.Array;
import java.util.ArrayList;

public class Test {
    //POINT OF ENTRY METHOD
    public static void main(String[] args){
        // INSTANTIATE THE ARRRAY DEMO OBJECT
        ArrayDemo test = new ArrayDemo();
       
        test.arrayTest();
        test.arrayListTest();
        System.out.println(test.hello("Edward"));
    }
}