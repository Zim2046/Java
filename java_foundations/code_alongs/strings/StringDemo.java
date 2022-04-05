public class StringDemo {
     public static void main(String[] args) {
      String ninja = "Coding Dojo is Awesome!";
      int length = ninja.length();
      System.out.println( "String Length is : " + length );
      
      // Concatenate
      String string1 = "My name is ";
      String string2 = "Michael";
      String string3 = string1.concat(string2);
      System.out.println(string3);
      // will output My name is Michael  
      
      // Format: Another way of concatenating strings!
      String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
      System.out.println(ninja2);
      // Will print out Hi Jack, you owe me $25.00 !
      // Where %s is expecting a string
      // And %.2f is expecting a float data type. The value 2 will just  place two values to right of thed  cimal point.

      // IndexOf:
      String ninja3 = "Welcome to Coding Dojo!";
      int a = ninja3.indexOf("Coding"); // a is 11
      int b = ninja3.indexOf("co"); // b is 3
      int c = ninja3.indexOf("pizza"); // c is -1, "pizza" is not found
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

      // Trim: 
      String sentence = "   spaces everywhere!   ";
      System.out.println(sentence.trim());

      // Uppercase and Lowercase: 
      String aWord = "HELLO";
      String bWord = "world";
      System.out.println(aWord.toLowerCase()); // hello
      System.out.println(bWord.toUpperCase()); // WORLD

      // Equality:
      // Normal string assignment
      String aSentence = "same string";
      String bSentence = "same string";
      System.out.println(aSentence == bSentence); // true
      
      // When to use == and when to use .equals()
      // Creating new strings as separate objects (another way to create a String)
      aSentence = new String("same letters");
      bSentence = new String("same letters");
      System.out.println(aSentence == bSentence); // false. Not the same object in memory.
      System.out.println(aSentence.equals(bSentence)); // true. same exact characters.

      String aDojo = new String( "Dojo" );
      System.out.println( aDojo == "Dojo" );
      // surprisingly this will print out `false`. That's because one is a string and one is an Object... But isn't everythong in Java a class? .... which is an object? Im confused. 

      String aDojo2 = new String( "Dojo" );
      System.out.println( aDojo2.equals("Dojo") );
      // this actually will print out `true`


      public String guestGreeting(String name, String dayPeriod) {
      }

     }
}

