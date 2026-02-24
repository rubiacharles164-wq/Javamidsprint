public class Person {
    private int Id;
    private String name;
    private String age;
    private String phoneNumber;

    public int getId() {
        return Id;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person(int id, String name, String age, String phoneNumber) {
        Id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}

