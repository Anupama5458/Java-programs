class Author{
    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender){
      this.name= name;
      this.email= email;
      this.gender= gender;
      }
   
    public String getName() {
        return name;
        }
    public String getEmail() {
        return email;
        }
    public char getGender() {
        return gender;
        }

    public void setEmail(String email){
       this.email= email;
      }

   public String toString(){
      return "Author: "+name+ " (" + gender + "), Email: "+ email;
     }

  
  }

class Book{
   private String name;
   private Author author; //object of Author class
   private double price;
   private int qtyInStock;

   public Book(String name, Author author, double price, int qtyInStock){
       this.name= name;
       this.author= author;
       this.price= price;
       this.qtyInStock= qtyInStock;
      }

  public String getName() {
        return name;
        }
  public Author getAuthor() {
        return author;
        }
  public double getPrice() {
        return price;
        }
  public int getQtyInStock() {
        return qtyInStock;
        }

  public void setPrice(double price){
      this.price= price;
     }
  public void setQtyInStock(int qtyInStock){
      this.qtyInStock= qtyInStock;
     }

  public String toString(){
      return "Book: " + name+ "\n" + author.toString() + "\nPrice: $ " + price+ " copies: " + qtyInStock ;
     }


   public static void main(String[] args){
     Author author = new Author("Brianna Weist", "brianna@gmail.com", 'F');
     Book obj= new Book("The Mountain is you", author, 350.0, 12);
  
     System.out.println(obj);
     }
}  
  
    
  
   