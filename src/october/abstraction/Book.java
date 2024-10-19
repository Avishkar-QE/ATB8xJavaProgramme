package october.abstraction;

abstract class  Book {

    protected String Name;
    protected String Author;
    protected int Price;


    public Book (String Name, String Author, int Price){
        this.Name = Name;
        this.Author = Author;
        this.Price = Price;

    }

    abstract void getDetails();

}
