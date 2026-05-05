package models;

public class DVD extends LibraryItem {
    private int duration;

    public DVD(String id, String title, int duration) {
        super(id, title);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DVD Details: ID=" + getId() + ", Title=" + getTitle() +
                ", Duration=" + duration + " mins, Status=" + (isAvailable() ? "Available" : "Borrowed");
    }

    @Override
    public String getDetails() {
        return "";
    }
}
