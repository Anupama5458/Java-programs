class Person{
   String name;
   String dateOfBirth;

  Person(String name, String dateOfBirth){
    this.name= name;
    this.dateOfBirth= dateOfBirth;
   }

 void display(){
   System.out.println("Name: " + name);
   System.out.println("Date of Birth: "+ dateOfBirth);
   }

}

class Teacher extends Person{
  int salary;
  String subject;
  
  Teacher(String name, String dateOfBirth, int salary, String subject){
   super(name, dateOfBirth);
   this.salary= salary;
   this.subject= subject;
    }

   @Override
   void display(){
    super.display();
    System.out.println("Salary: " + salary);
    System.out.println("Subject: " + subject);
    }
  }

class Student extends Person{
   int studentId;
   
   Student(String name, String dateOfBirth, int studentId){
    super(name, dateOfBirth);
    this.studentId = studentId;
    }

   @Override 
   void display(){
    super.display();
    System.out.println("Student ID: "+ studentId);
    }
}

class CollegeStudent extends Student{
     String collegename;
     String year;
    
    CollegeStudent(String name, String dateOfBirth, int studentId, String collegename, String year){
      super(name, dateOfBirth, studentId);
      this.collegename= collegename;
      this.year= year;
     }

   @Override
    void display(){
     super.display();
     System.out.println("College name: "+ collegename);
     System.out.println("Year: "+ year);
   }

  }

class CollegeQue{
    public static void main(String[] args){
       Teacher teacher= new Teacher("Jaynam Sanghvi", "12-04-1985", 70000, "Java");
       Student student= new Student("Anupama Dubey", "06-02-2003", 1134);
       CollegeStudent clgstd= new CollegeStudent("Ananya Dubey", "06-02-2003", 101, "MediCaps University","Fourth");

    //invoking display methods
    System.out.println("\n----------Teacher Details----------");
    teacher.display();
    System.out.println("\n----------Student Details----------");
    student.display();
    System.out.println("\n----------College Student Details----------");
    clgstd.display();
         
 }
}
       
       
 
   