class ReverseArray{
    public static void main(String[] args){

       System.out.println("Original array: ");
       for(String s: args){
         System.out.print(s+" ");
        }
       
       String[] rev= new String[args.length];

        for(int i=0; i< args.length; i++){
         rev[i] = args[args.length - 1 -i];
        }
    
      System.out.println("\nReversed array: ");
       for(String s: rev){
         System.out.print(s+" ");
        }
 

    }
}

