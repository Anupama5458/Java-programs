class Animal{

  void eat(){
      System.out.println("Hello from eat() of Animal class");
     }

  void sleep(){
     System.out.println("Hello from sleep() of Animal class");
    }

}

class Bird extends Animal{
   @Override
   void eat(){
     System.out.println("Hello from eat() of Bird class");
     }
   @Override
   void sleep(){
      System.out.println("Hello from sleep() of Bird class");
    }
 
  void fly(){
     System.out.println("Hello from fly() of Bird class");
    }

    public static void main(String[] args){
     Animal animal= new Animal();
     animal.eat();
     animal.sleep();
   
    Bird bird= new Bird();
    bird.eat();
    bird.sleep();
    bird.fly();
   }
   
}
 

   
     