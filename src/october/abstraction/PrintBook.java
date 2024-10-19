package october.abstraction;

import javax.xml.transform.stream.StreamSource;

public class PrintBook extends Book{

    public PrintBook(String Name, String Author, int Price) {
        super(Name, Author, Price);
    }

    @Override
    void getDetails() {
        System.out.println(Name);
        System.out.println(Author);
        System.out.println(Price);
    }

}
