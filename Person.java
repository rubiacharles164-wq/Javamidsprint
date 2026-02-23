public class Person {
    private int Id;
    private String name;
    private String address;
    private String phoneNumber;

    public int getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person(int id, String name, String address, String phoneNumber) {
        Id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

