public static void main(String[] args) {
        // Create a doctor
        Doctor doctor = new Doctor(1, "Dr. Smith", 45, "555-1234");
        
        // Create a patient
        Patient patient = new Patient(1, "John Doe", 30, "555-5678");
        
        // Add the patient to the doctor's list of patients
        // Not sure how to add it wont accept the parameters created
        
        // Create a medication
        Medication medication = new Medication(1, "Aspirin", "500mg", 30, new java.util.Date());


        //Check if the medication is expired
        MedicationSystem medicationSystem = new MedicationSystem();
        String isExpired = medicationSystem.checkExpiredMedication();

        //Restock the pharmacy drugs
        MedicationSystem Restock = new MedicationSystem();
        Restock.restockMedication(10);
        
        
        
        //System callouts
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Medication: " + medication.getName());
        System.out.println("Is Medication Expired: " + isExpired);
        System.out.println("Medication System Report:\n" + medicationSystem.generateReport());
        System.out.println("Restock Medication: " + Restock.restockMedication(10));
        //System.out.println("Doctor's Patients: " + doctor.getPatients().size());
    }