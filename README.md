Make the following application to work. To check your result, print out all the object instances you created. 

Product.java

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice() {
        // Use the StringFormat class to format the price to 2 decimal places
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}

 

Book.java

public class Book extends Product {
    
    private String author;
    private int pages;
    
}

 

Software.java

public class Software extends Product {
    
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;
    
}

 

Main.java

public static void main(String[] args){
   
    Book b = new Book();
    // use setters to set values    

    Book c = new Book();
    // use setters to set values 

    Software s = new Software();
    // use setters to set values 

    System.out.println(b.toString());
    System.out.println(c.toString());
    System.out.println(s.toString());
}