import java.util.List;


public class Doctor extends Person {
    private List<Patient> patients;
    public Doctor(int id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber);
    }
    public List<Patient> getPatients() {
        return patients;
    }
}
