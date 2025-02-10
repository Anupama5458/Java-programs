class FactorialNum{
   public static void main(String[] args){

     int n = Integer.parseInt(args[0]);
     int f= 1;
     int fact(int n){
     f= f*n--;
     }


     if(n==0 || n==1){
       System.out.println("1");
      }
     else{
         System.out.println(fact(int n));
      }
  } 
 } 
     