import java.util.Date;
// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.Month;
import java.time.*;
import java.text.SimpleDateFormat;




public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ", lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();

        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
    // YOUR CODE HERE
        if(conversation.indexOf("Alexis") >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";  
        }
        else if(conversation.indexOf("Alfred") >= 0){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right. And with that I shall retire."; 
        }
    }

    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    //Attempt 1
    // public String guestGreeting2(){
    //     String pattern = "K";
    //     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    //     String date = simpleDateFormat.format(new Date());
    //     int timeAsInt = Integer.parseInt(date); // Changes string 24 hour time to integer so we can use it in a boolean comparison. 
    //     if(int timeAsInt >= 0 && int timeAsInt <= double 11.99){
    //         return "Good morning, Beth Kane, lovely to see you.";  
    //     }
    //     else if(int timeAsInt = 12 && int timeAsInt <= double 17){
    //         return "Good afternoon, Beth Kane, lovely to see you.";
    //     }
    //     else{
    //         "Good evening, Beth Kane, lovely to see you.";
    //     }
    // }

    // public String guestGreeting(String name, String dayPeriod){
    //     return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    // }
    
    //ATTEMPT 2
    // public String guestGreeting2(){
    //     String pattern = "K";
    //     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    //     String date = simpleDateFormat.format(new Date());
    //     int timeAsInt = Integer.parseInt(date);
    //     System.out.println(timeAsInt);

    //     if( timeAsInt >= 0 &  timeAsInt <  12){
    //         return "Good morning, Beth Kane, lovely to see you.";  
    //     }
    //     else if( timeAsInt = 12 &  timeAsInt <  17){
    //         return "Good afternoon, Beth Kane, lovely to see you.";
    //     }
    //     else{
    //         return "Good evening, Beth Kane, lovely to see you.";
    //     }
    // }
    // //SENSEI VERSION

}




