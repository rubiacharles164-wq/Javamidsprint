public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantity;
    private java.util.Date expirationDate;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDose() {
        return dose;
    }

    public int getQuantity() {
        return quantity;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }
    
    public Medication(int id, String name, String dose, int quantity, java.util.Date expirationDate) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }
}
