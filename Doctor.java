import java.util.Scanner;

public class Doctor {
    public void doctorMenu() {
        String DoctorPassword = "HealthisWealth__@";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Only Doctor Can Access Doctor Pannel..\n");
        System.out.println("Enter Doctor Password:");
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(DoctorPassword)) {
            System.out.println("Incorrect Password, Try Again...");
            System.out.println("Enter Doctor Password:");
            enteredPassword = scanner.nextLine();
        }

        boolean exit = false;
        while (!exit) { 
            System.out.println("|*************Welcome Doctor**************|");
            System.out.println("1. See Booked Appointment");
            System.out.println("2. Verify Appointments");
            System.out.println("3. Add Prescription");
            System.out.println("4. Check Patients");
            System.out.println("5. Dashboard");
            System.out.println("6. Logout");
            System.out.println("______________________________________________________");            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SeeBookedAppointment bookedAppointment = new SeeBookedAppointment();
                    bookedAppointment.seeBookedAppointment();
                    break;
                case 2:
                    VerifyAppointment verifyAppointment = new VerifyAppointment();
                    verifyAppointment.verifyAppointment();
                    break;
                case 3:
                    AddPrescription addPrescription = new AddPrescription();
                    addPrescription.addPrescription();
                    break;
                case 4:
                    CheakPatient checkPatient = new CheakPatient();
                    checkPatient.CheakPatient();
                    break;
                case 5:
                    System.out.println("Welcome to Dashboard");
                    break;
                case 6:
                    System.out.println("Logging out...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }

        scanner.close(); // Scanner ko close karna best practice hai
    }
}
