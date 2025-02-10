import java.util.Scanner;

class EvenOddStrings{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        int len = str.length();
        if(len<2){
        System.out.println("The string length should be more than 2");
       
        if(len %2 ==0){
         for(int i=0; i<len/2; i++){
           System.out.print(str.charAt(i));
           }
         }
        else
         System.out.println("null");
   }
}