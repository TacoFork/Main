public class Product {
    private String description, code;
    private double price;
    protected static int count = 0; //a protected static variable

    public Product(){
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    @Override
    public String toString(){
        return  "Code:               " + this.code + "\n" +
                "Description:        " + this.description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private String getFormattedPrice(double price){
        return String.format("%.2f", price);
    }

    public static int getCount(){
        return count;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
