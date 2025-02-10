class MainMethodOverload{
     
public static void main(int x){
      System.out.println("Overloaded main method1: "+ x);

}

public static void main(double y){
     System.out.println("Overloaded main method2: " +y);

}
 public static void main(String [] args){
      System.out.println("Standard main method first by JVM");
      MainMethodOverload obj = new MainMethodOverload();
      obj.main(10);
      obj.main(10.00);
}


}