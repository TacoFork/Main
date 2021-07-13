public class Main {
    public static void main(String[] args){
        Book b = new Book();
        b.setCode("00001");
        b.setDescription("A book on Java fundamentals");
        b.setPrice(25.00);
        b.setAuthor("John Doe");
        b.setPages(200);

        Book c = new Book();
        c.setCode("00002");
        c.setDescription("A book about stuff and things");
        c.setPrice(50.00);
        c.setAuthor("Jane Doe");
        c.setPages(531);

        Software s = new Software();
        s.setCode("00003");
        s.setDescription("Word processor software");
        s.setPrice(150.00);
        s.setProgrammer("Mike Smith");
        s.setPlatform("linux");
        s.setOs("Unix");

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }
}
