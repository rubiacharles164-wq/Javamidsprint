public class Prescription {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private java.util.Date prescriptionDate;

    public int getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public java.util.Date getPrescriptionDate() {
        return prescriptionDate;
    }

    
}
