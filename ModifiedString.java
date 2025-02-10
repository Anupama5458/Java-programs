import java.util.Scanner;

class ModifiedString{
      public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        int strlength= str.length();
    
        if(strlength<2){
          System.out.println("Length should be more than 2");
          }
        else{
          for(int i=1; i<strlength-1; i++){
             System.out.print(str.charAt(i));
             }
          }

      }
 }    






                                                   
   