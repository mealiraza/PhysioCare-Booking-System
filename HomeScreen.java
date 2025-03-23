import java.util.Scanner;

public class HomeScreen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Physiotherapist[] physiotherapists = getPhysiotherapistsData();


        int choice;

        while (true) {
            System.out.println("\n==================================");
            System.out.println("  PhysioCare Booking System  ");
            System.out.println("==================================");
            System.out.println("1 Book an Appointment");
            System.out.println("2 View Available Physiotherapists");
            System.out.println("3 Manage Appointments (Cancel/Reschedule)");
            System.out.println("4 View Reports");
            System.out.println("5 Exit");
            System.out.println("==================================");
            System.out.print("➡ Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n Redirecting to Appointment Booking...");
                        break;
                    case 2:
                        System.out.println("\n️ Showing Available Physiotherapists...");
                        for (Physiotherapist physio : physiotherapists) {
                            System.out.println("ID: " + physio.getId());
                            System.out.println("Name: " + physio.getName());
                            System.out.print("Expertise: ");
                            System.out.println(String.join(", ", physio.getExpertise()));
                            System.out.println("----------------------");
                        }

                        Scanner physiotherapistInput = new Scanner(System.in);
                        int physiotherapistId = physiotherapistInput.nextInt()-1;
                        System.out.println("ID: " + physiotherapists[physiotherapistId].getId());
                        System.out.println("Name: " + physiotherapists[physiotherapistId].getName());
                        System.out.print("Expertise: ");
                        System.out.println(String.join(", ", physiotherapists[physiotherapistId].getExpertise()));

                        break;
                    case 3:
                        System.out.println("\n Managing Appointments...");
                        break;
                    case 4:
                        System.out.println("\n Generating Reports...");
                        break;
                    case 5:
                        System.out.println("\n Exiting the system. Thank you for using PhysioCare!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n  Invalid choice! Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("\n   Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }

    public static Physiotherapist[] getPhysiotherapistsData() {
        return new Physiotherapist[] {
                new Physiotherapist(1, "Dr. John Doe", "London", "+44 123 456 789", new String[]{"Sports Therapy", "Orthopedic Rehabilitation"}),
                new Physiotherapist(2, "Dr. Sarah Smith", "Manchester", "+44 987 654 321", new String[]{"Neurological Physiotherapy", "Post-Surgery Recovery"}),
                new Physiotherapist(3, "Dr. Alex Brown", "Birmingham", "+44 456 789 123", new String[]{"Pediatric Physiotherapy", "Geriatric Care"}),
                new Physiotherapist(4, "Dr. Emily White", "Liverpool", "+44 321 654 987", new String[]{"Cardio-Respiratory Therapy", "Pain Management"}),
                new Physiotherapist(5, "Dr. Michael Green", "Leeds", "+44 741 852 963", new String[]{"Manual Therapy", "Postural Correction"}),
                new Physiotherapist(6, "Dr. Olivia Wilson", "Bristol", "+44 852 963 741", new String[]{"Post-Surgery Recovery", "Musculoskeletal Physiotherapy"}),
                new Physiotherapist(7, "Dr. William Harris", "Sheffield", "+44 369 852 147", new String[]{"Balance Disorders", "Vestibular Rehabilitation"}),
                new Physiotherapist(8, "Dr. Ava Clarke", "Nottingham", "+44 753 159 852", new String[]{"Pediatric Physiotherapy", "Neurodevelopmental Therapy"}),
                new Physiotherapist(9, "Dr. James Turner", "Edinburgh", "+44 951 357 468", new String[]{"Pain Management", "Aquatic Therapy"}),
                new Physiotherapist(10, "Dr. Sophia Hall", "Glasgow", "+44 852 456 753", new String[]{"Manual Therapy", "Myofascial Release"}),
                new Physiotherapist(11, "Dr. Daniel Evans", "Cardiff", "+44 357 159 753", new String[]{"Cardio-Respiratory Therapy", "Exercise Therapy"}),
                new Physiotherapist(12, "Dr. Mia Baker", "Belfast", "+44 258 369 147", new String[]{"Orthopedic Rehabilitation", "Acupuncture"}),
                new Physiotherapist(13, "Dr. Benjamin Scott", "Newcastle", "+44 159 357 258", new String[]{"Neurological Physiotherapy", "Stroke Rehabilitation"}),
                new Physiotherapist(14, "Dr. Lily Adams", "Brighton", "+44 753 852 147", new String[]{"Sports Therapy", "Kinesiology Taping"}),
                new Physiotherapist(15, "Dr. Henry Carter", "Leicester", "+44 159 753 456", new String[]{"Geriatric Care", "Chronic Pain Management"}),
                new Physiotherapist(16, "Dr. Charlotte King", "Coventry", "+44 357 852 951", new String[]{"Musculoskeletal Physiotherapy", "Joint Mobilization"}),
                new Physiotherapist(17, "Dr. Jack Wright", "Oxford", "+44 951 357 753", new String[]{"Postural Correction", "Pelvic Floor Rehabilitation"}),
                new Physiotherapist(18, "Dr. Grace Lewis", "Cambridge", "+44 357 951 258", new String[]{"Aquatic Therapy", "Pediatric Physiotherapy"}),
                new Physiotherapist(19, "Dr. Ethan Walker", "York", "+44 258 753 951", new String[]{"Post-Surgery Recovery", "Myofascial Release"}),
                new Physiotherapist(20, "Dr. Isabella Martin", "Southampton", "+44 951 258 753", new String[]{"Pain Management", "Vestibular Rehabilitation"})
        };
    }
}
