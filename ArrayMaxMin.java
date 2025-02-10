class ArrayMaxMin{ 
   public static void main(String[] args){
      int max = Integer.parseInt(args[0]);
      int min = Integer.parseInt(args[0]);

      for(String s: args){
       int num= Integer.parseInt(s);
       if(max< num) {
        max = num;
       }
       
       if(min> num) {
        min = num;
       }
      }
   System.out.println("Maximum Number: " + max);
   System.out.println("Minimum Number: " + min);

 }
}