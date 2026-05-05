package Entites;

public class Magazine extends LibraryItem {

    private int issueNumber;

    public  Magazine(String id, String title, int issueNumber){
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public String getDetails(){

        return "Magazine Details: ID=" + getId() +", Title=" +getTitle() + ", Issue Number=" + issueNumber+ ", Status=" +(isAvailable() ? "Available" : "Borrowed");
    }

}
