 class ConstructorDemo{
    int i;
    void setVaule(int i){
        this.i=i;
    }
    void display(){
        System.out.println(i);
    }

}
class DemoWithThis{
    public static void main(String [] args){
        ConstructorDemo d1= new ConstructorDemo();
        d1.setVaule(22);
        d1.display();
    }
}