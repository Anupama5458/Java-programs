import java.util.Scanner;

class Patient{
    
    static String patientName;
    static double height;
    static double weight;
   
    double computeBMI(){
     return weight/ (height*height) ; 
    }

     public static void main(String[] args){
       Patient p= new Patient();
       
       Scanner sc = new Scanner(System.in);
       System.out.println("----------Patient Details----------");
       System.out.println("Enter patients name: ");
       patientName= sc.nextLine();
       System.out.println("Height: "); 
       height= sc.nextDouble();
       sc.nextLine();
       System.out.println("Weight: ");
       weight= sc.nextDouble();
       sc.nextLine();

       System.out.println(p.computeBMI());
   }
}      
       
            
           
  