class Box{
  
    int width,depth,height;

    void setData(int width,int depth, int height){
     this.width = width;
     this.depth = depth;
     this.height = height;
     }
    int volume(){
     return width*depth*height;
     }
}

class BoxDemo{
   public static void main(String[] args){
    Box obj= new Box();
    obj.setData(10, 10, 10);
    int vol= obj.volume();
    System.out.println("Volume of a box: "+ vol);
   }
}