import java.util.Scanner;


class EmployeeDetails{
      public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Employee name: ");
      String empname = sc.nextLine();
      System.out.println("Enter Salary: ");
      double salary = sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter Position: ");
      String pos= sc.nextLine();
      System.out.println("Enter Experience: ");
      int exp= sc.nextInt();

      System.out.println("----------EMPLOYEE DETAILS----------");
      System.out.println("Employee name: " +empname);
      System.out.println("Position: "+ pos);
      System.out.println("Experience: "+ exp);
      System.out.println("Salary(previous): " + salary);

      if(salary<=15000){
      salary = salary + salary/10;
      System.out.println("The Employee is eligible for 10% hike in their salary!!");
      System.out.println("Updated salary: " + salary);
      }
     else {
       salary = salary + (3* salary/20);
      System.out.println("The Employee is eligible for 15% hike in their salary!!");    
      System.out.println("Updated salary: " + salary);
      }
  
  }
}    
