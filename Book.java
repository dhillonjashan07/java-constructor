public class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public String borrow() {
        if (availability) {
            availability = false;
            return "You have borrowed '" + title + "'.";
        } else {
            return "'" + title + "' is currently unavailable.";
        }
    }
}
