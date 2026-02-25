import java.util.List;

public class MedicationSystem {
    private Medication medication;
    private Patient patient;
    private Doctor doctor;
    private Prescription prescription;

    public Medication getMedication() {
        return medication;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public String searchMedicationByName(String name) {
        if (medication.getName().equalsIgnoreCase(name)) {
            return "Medication found: " + medication.getName() + ", Dose: " + medication.getDose() + ", Quantity: " + medication.getQuantity() + ", Expiration Date: " + medication.getExpirationDate();
        } else {
            return "Medication not found.";
        }
    }

    public String searchPatientByName(String name) {
        if (patient.getName().equalsIgnoreCase(name)) {
            return "Patient found: " + patient.getName() + ", Age: " + patient.getAge() + ", Phone Number: " + patient.getPhoneNumber() + ", ID: " + patient.getId();
        } else {
            return "Patient not found.";
        }
    }

    public String searchDoctorByName(String name) {
        if (doctor.getName().equalsIgnoreCase(name)) {
            return "Doctor found: " + doctor.getName() + ", Phone Number: " + doctor.getPhoneNumber() + ", ID: " + doctor.getId();
        } else {
            return "Doctor not found.";
        }
    }

    public String searchPrescriptionById(int id) {
        if (prescription.getId() == id) {
            return "Prescription found: ID: " + prescription.getId() + ", Doctor: " + prescription.getDoctor().getName() + ", Patient: " + prescription.getPatient().getName() + ", Medication: " + prescription.getMedication().getName() + ", Prescription Date: " + prescription.getPrescriptionDate();
        } else {
            return "Prescription not found.";
        }
    }

    public String AddToDoctorPatientsList(Patient patientToAdd) {
        List<Patient> patients = doctor.getPatients();
        if (!patients.contains(patientToAdd)) {
            patients.add(patientToAdd);
            return "Patient added to doctor's list successfully.";
        } else {
            return "Patient is already in the doctor's list.";
        }
    }

    public String acceptPercription(Prescription newPrescription) {
        if (newPrescription.getDoctor().getId() == doctor.getId() && newPrescription.getPatient().getId() == patient.getId()) {
            prescription = newPrescription;
            return "Prescription accepted successfully.";
        } else {
            return "Prescription does not match the doctor or patient.";
        }
    }

    public String editPatient(int id, String name, int age, String phoneNumber) {
        if (patient.getId() == id) {
            patient = new Patient(id, name, age, phoneNumber);
            return "Patient information updated successfully.";
        } else {
            return "Patient not found.";
        }
    }

    public String editDoctor(int id, String name, int age, String phoneNumber) {
        if (doctor.getId() == id) {
            doctor = new Doctor(id, name, age, phoneNumber);
            return "Doctor information updated successfully.";
        } else {
            return "Doctor not found.";
        }
    }

    public String editMedication(int id, String name, String dose, int quantity, java.util.Date expirationDate) {
        if (medication.getId() == id) {
            medication = new Medication(id, name, dose, quantity, expirationDate);
            return "Medication information updated successfully.";
        } else {
            return "Medication not found.";
        }
    }

    public String DeletePatient(int id) {
        if (patient.getId() == id) {
            patient = null;
            return "Patient deleted successfully.";
        } else {
            return "Patient not found.";
        }
    }

    public String DeleteDoctor(int id) {
        if (doctor.getId() == id) {
            doctor = null;
            return "Doctor deleted successfully.";
        } else {
            return "Doctor not found.";
        }
    }

    public String DeleteMedication(int id) {
        if (medication.getId() == id) {
            medication = null;
            return "Medication deleted successfully.";
        } else {
            return "Medication not found.";
        }
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Medication System Report:\n");
        report.append("Medication: ").append(medication != null ? medication.getName() + " " + medication.getDose() + " " + medication.getQuantity() + " " + medication.getExpirationDate() : "No medication").append("\n");
        report.append("Patient: ").append(patient != null ? patient.getName() + " " + patient.getAge() + " " + patient.getPhoneNumber() : "No patient").append("\n");
        report.append("Doctor: ").append(doctor != null ? doctor.getName() + " " + doctor.getAge() + " " + doctor.getPhoneNumber() : "No doctor").append("\n");
        report.append("Prescription: ").append(prescription != null ? "ID: " + prescription.getId() + ", Doctor: " + prescription.getDoctor().getName() + ", Patient: " + prescription.getPatient().getName() + ", Medication: " + prescription.getMedication().getName() + ", Prescription Date: " + prescription.getPrescriptionDate() : "No prescription").append("\n");
        return report.toString();
    }

    public String checkExpiredMedication() {
        if (medication != null && medication.getExpirationDate().before(new java.util.Date())) {
            return "Medication is expired.";
        } else {
            return "Medication is not expired.";
        }
    }

    public String checkMedicationbyDoctor(Doctor doctorToCheck) {
        if (prescription != null && prescription.getDoctor().getId() == doctorToCheck.getId()) {
            return "Medication prescribed by the doctor: " + prescription.getMedication().getName();
        } else {
            return "No medication found for the specified doctor.";
        }
    }

    public String restockMedication(int quantityToAdd) {
        if (medication != null) {
            int newQuantity = medication.getQuantity() + quantityToAdd;
            medication = new Medication(medication.getId(), medication.getName(), medication.getDose(), newQuantity, medication.getExpirationDate());
            return "Medication restocked successfully. New quantity: " + newQuantity;
        } else {
            return "Medication not found.";
        }
    }
}
