import java.util.ArrayList;
import java.io.PrintStream;
// THIS FILE IS WHERE ALL OF THE METHODS(LOGIC) HAPPEN
public class CafeUtil{
    public int getStreakGoal(){
        //ARRAYS
        int sum = 0;
        for(int i=1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        //ARRAYS
        double total = 0;
        for(int i=0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        //ARRAYS
        double total = 0;
        for(int i=0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        //ARRAYS
        System.out.println("PLease enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!" ); // to add an item to an ArrayList
        System.out.println("There are "+ customers.size()+" people in front of you"); // to add an item to an ArrayList
        customers.add(userName);
        System.out.println(customers);
         
    }


}

    