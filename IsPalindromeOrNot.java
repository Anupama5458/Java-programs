class IsPalindromeOrNot{
  public static void main(String[] args){
     int n = Integer.parseInt(args[0]);
     int reverse=0;
     int temp = n;
     int r;

     while(n!=0){                
       r = n%10;
       reverse = reverse*10 + r;
       n = n/10;    
     }


if(reverse == temp){
  System.out.println("The number is Palindrome");
  }
 else
 System.out.println("Not a Palindrome");  
}
}