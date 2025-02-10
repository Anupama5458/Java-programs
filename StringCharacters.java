import java.util.Scanner;

class StringCharacters{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a String: ");
       String str1= sc.nextLine();
       
       System.out.println("Enter second string: ");
        String str2= sc.nextLine();
   
       int count=0;
       for(int i=0; i<str1.length(); i++){
         count++;
        }
  
      System.out.println("Number of characters in a string1 is: " +count);
      System.out.println("Is string1 empty?  "+ str1.isEmpty() );
      System.out.println("Calling trim() on str1: " + str1.trim());
      System.out.println("Is str1 equal to str2? " +str1.equals(str2));
      System.out.println("Is str1 equal to str2 if we ignore case-sensitivity? " +str1.equalsIgnoreCase(str2));
      System.out.println("Substring of " +str1 +" is " +str1.substring(1));
      System.out.println("On comparing " + str1+ " with  " +str2+ " : " + str1.compareTo(str2));
      
   }
}