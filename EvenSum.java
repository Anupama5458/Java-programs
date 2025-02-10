class EvenSum{
  public static void main(String[] args){
  int sum=0;
  int n= Integer.parseInt(args[0]);
  
  for(int i=2;i<=(n*2); i+=2){  
      
     sum= sum + i;
   
    }
   System.out.println("Sum of first "+n+ " even natural numbers is: "+sum);
  }
}