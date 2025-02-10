class SwappingThird{
  public static void main(String[] args){
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int c;
     System.out.println("Before swapping, numbers were: a:" +a +" " +"b: " + b);
     c = a;
     a = b;
     b = c;
     
    System.out.println("After swapping, numbers were: a:" +a +" " +"b: " + b);
    }
}