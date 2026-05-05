package models;

public class Book extends LibraryItem{

    private  String author;

    public Book(String id, String title, String author){
        super(id , title);
        this.author= author;
    }

    public String getDetails() {
        return  "Book Details: ID=" + getId() + "," +
                "" +
                " Title= " + getTitle() + ", Author =" + author + " , Status=" + (isAvailable() ? "Available" : "Borrowed");
    }
}
