import java.lang.Math;  

class ArmstrongOrNot{
   public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int count=0;
    int temp= n, arm=n, sum=0;   

    while(temp!=0){
      temp=temp/10;
      count++;
     }
  
  while(n!=0){
   int r= n%10;
   sum +=  (Math.pow(r, count)); 
   n = n/10;
   }

 if(sum == arm){
  System.out.println("The number is armstrong");
  }
  else
    System.out.println("Not an armstrong");
 }
}