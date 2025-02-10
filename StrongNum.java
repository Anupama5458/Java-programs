class StrongNum{

    int fact(int r){
       if(r==0 || r==1){
         return 1;
        }
      else{
        return r* fact(r-1); 
       }
     }


   public static void main(String[] args){
      int num = Integer.parseInt(args[0]);
      int temp = num;
      int sum=0; 

      StrongNum obj= new StrongNum();

      while(num!=0){
       int r = num%10;
       sum = sum + obj.fact(r);   //sum = sum + new StrongNum().fact(r); 
       num = num/10;
      }

    if (sum == temp)
            System.out.println(temp + " is a Strong Number");
         else 
            System.out.println(temp + " is not a Strong Number");
 }
}
