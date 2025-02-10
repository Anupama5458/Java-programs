class AnonymousArrary{

 public static void main(String [] args){
  AnonymousArray.sum(new int [][]{{10,20,30},{40,50}});
  }

static void sum(int[][] num){
    int total=0;
    //using for loop
    for(int i=0;i<num.length; i++){

     for(int j=0;j<num[i].length; j++){
       System.out.println(num[i][j]+" ");
       total = total + num[i][j];
     }
    }
System.out.println(total);
}
  
 
}