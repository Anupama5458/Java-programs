import java.util.Scanner;

class StudentMarks{

   public static void main(String[] args){
    
    Scanner sc= new Scanner(System.in);
    String[] subjects = {"Physics", "Chemistry", "Maths", "English", "IT"}; 
    int[] marks = new int[5];
    int sum=0;
  
    for(int i=0; i<5; i++){ 
    System.out.println("Enter the marks of "+ subjects[i] +": ");
    marks[i] = sc.nextInt();
    sum += marks[i];
    }

    System.out.println("Total marks obtained: " +sum +"/500");

    double percentage = sum/5.0;
    System.out.println("Percentage obtained: " + percentage +"%");
    System.out.print("GRADE: ");

    if(percentage>=90){
     System.out.print("A");
     }
    else if(percentage>=75 && percentage<=89){
      System.out.print("B");
     }
    else if(percentage>=55 && percentage<=74){
    System.out.print("C");
    }
    else{
     System.out.print("Fail");
    } 
 }
}