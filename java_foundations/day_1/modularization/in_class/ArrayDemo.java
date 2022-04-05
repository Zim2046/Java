// THIS FILE IS WHERE ALL OF THE METHODS(LOGIC) HAPPEN

import java.util.Array;
import java.util.ArrayList;

public class ArrayDemo{
    public void arrayTest(){
        //ARRAYS
        int[] numArr; // 👈 you have to determine the aray type first
        numArr = new int[5];
        System.out.println(numArr);
        numArr[0] = 4;
        numArr[1] = 8;
        numArr[2] = 8;
        numArr[3] = 5;
        numArr[4] = 9;
        System.out.println(Arrays.tostring(numArr));

        for(int i=0; i < numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }

    public ArrayListTest(){
            //ArrayList                  👇 This means that we are instantiating a new object from a class     
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        System.out.println(myArray);
        myArray.remove(myArray.size() - 1);

        // STANDARD FOR LOOP - USED WHEN YOU WANT TO MANIPULATE THE VALUES WITHIN THE ARRAY LIST
        for(int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

        // ENHANCED FOR LOOP - RELATING 
        //          👇 parameters!
        for(Integer num : myArray) {
            System.out.println(num);
        }
    }

    public String hello(String name){
        return "Hello " + name;
    }

    public int getStreakGoal(){

    }

    public double getOrderTotal(double[] prices){

    }
}
