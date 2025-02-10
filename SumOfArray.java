class SumOfArray{
   public static void main(String[] args){
       int sum=0;
   
       for(String s: args){
         sum = sum + Integer.parseInt(s);
        }

   System.out.println("Sum of array elements: " + sum);
  }
}

