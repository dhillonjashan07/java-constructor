public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double pricePerDay = 50.0; // Example price

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double totalCost() {
        return pricePerDay * rentalDays;
    }
}

