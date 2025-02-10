class LargestOfThree{
  public static void main(String[] args){
   
     int a= Integer.parseInt(args[0]);
     int b= Integer.parseInt(args[1]);
     int c= Integer.parseInt(args[2]);
   
     a = a>b?a:b;
     a = a>c?a:c;
    System.out.println("Largest Number among a,b,and c is: " + a);
   }
}