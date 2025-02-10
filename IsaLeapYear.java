class IsaLeapYear{
  public static void main(String[] args){
   int a = Integer.parseInt(args[0]);
   
   if(a%400 ==0){
    System.out.println("Is a leap year");
      }
     else if(a%100==0){
        System.out.println("Is not a leap year");
       }
   else if(a%4==0){
     System.out.println("Is a leap year");
     }
  else{
     System.out.println("Is not a leap year");
    }
}
}