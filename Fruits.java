class Fruit{
  String name, taste;
  int size;
  
  Fruit(String name, String taste, int size){
    this.name=name;
    this.taste= taste;
    this.size= size;
   }
 
  void eat(){
    System.out.println("Fruit name: " +name +"Fruit taste: "+ taste);
    }
}

class Apple extends Fruit{
    Apple(int size){
     super("Apple", "Sweet", size);
    }

    void eat(){
    System.out.println("Taste of an "+ name+ " is: " + taste);
  }
}

class Orange extends Fruit{
     Orange(int size){
     super("Orange", "Tangy", size);
     }

    void eat(){
     System.out.println("Taste of an " +name+ " is: " + taste);
  }
}

class Fruits{
  public static void main(String[] args){
     Fruit apple = new Apple(6);  //here we have passed the object of child class to parent class reference
     Fruit orange = new Orange(12);
    
     apple.eat();
     orange.eat();
  }
}
 



 