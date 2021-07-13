public class Book extends Product {
    private String author;
    private int pages;

    public Book(){
        author = "";
        pages = 0;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Author:             " + this.author + "\n" +
                "Pages:              " + this.pages + "\n";
    }
}
