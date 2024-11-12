// Base class
class Doctor {
    public void diagnose() {
        System.out.println("Doctor is diagnosing the patient.");
    }

    public void prescribeMedicine() {
        System.out.println("Doctor prescribes medicine.");
    }

    public void performDuties() {
        System.out.println("Doctor performs general duties.");
    }
}

// Derived class (Multilevel Inheritance)
class Surgeon extends Doctor {
    public void performDuties() {
        System.out.println("Surgeon performs surgery.");
    }

    public void performSurgery() {
        System.out.println("Surgeon is performing surgery.");
    }
}

// Another derived class (Hierarchical Inheritance)
class Nurse extends Doctor {
    public void performDuties() {
        System.out.println("Nurse assists patients and doctors.");
    }

    public void assistDoctor() {
        System.out.println("Nurse is assisting the doctor.");
    }
}

// Main class to test the program
public class Hospital {
    public static void main(String[] args) {
        // Create objects of each class
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        // Calling methods on Doctor
        System.out.println("Doctor's duties:");
        doctor.diagnose();
        doctor.prescribeMedicine();
        doctor.performDuties();
        System.out.println();

        // Calling methods on Surgeon (showing method overriding)
        System.out.println("Surgeon's duties:");
        surgeon.diagnose();
        surgeon.prescribeMedicine();
        surgeon.performDuties(); // Overridden method
        surgeon.performSurgery();
        System.out.println();

        // Calling methods on Nurse (showing method overriding)
        System.out.println("Nurse's duties:");
        nurse.diagnose();
        nurse.prescribeMedicine();
        nurse.performDuties(); // Overridden method
        nurse.assistDoctor();
    }
}


/*
OUTPUT
Doctor's duties:
Doctor is diagnosing the patient.
Doctor prescribes medicine.
Doctor performs general duties.

Surgeon's duties:
Doctor is diagnosing the patient.
Doctor prescribes medicine.
Surgeon performs surgery.
Surgeon is performing surgery.

Nurse's duties:
Doctor is diagnosing the patient.
Doctor prescribes medicine.
Nurse assists patients and doctors.
Nurse is assisting the doctor.


*/
