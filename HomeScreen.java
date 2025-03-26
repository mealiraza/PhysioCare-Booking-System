import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
                            System.out.print("Treatments: ");
                            System.out.println(String.join(", ", physio.getTreatments()));
                            System.out.println("----------------------");
                        }
                        System.out.println("Please number doctor ID: ");
                        Scanner physiotherapistInput = new Scanner(System.in);
                        int physiotherapistId = physiotherapistInput.nextInt()-1;
                        System.out.println("ID: " + physiotherapists[physiotherapistId].getId());
                        System.out.println("Name: " + physiotherapists[physiotherapistId].getName());
                        System.out.print("Expertise: ");
                        System.out.println(String.join(", ", physiotherapists[physiotherapistId].getExpertise()));
                        System.out.print("Treatments: ");
                        System.out.println(String.join(", ", physiotherapists[physiotherapistId].getTreatments()));
                        printMonthlyTimetable();
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
    public static void printMonthlyTimetable() {
        // Use current system date
        LocalDate currentDate = LocalDate.now();
        LocalDate endOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

        // Define formatters for date and time
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        // Print overall header
        System.out.println("Timetable from " + currentDate.format(dateFormatter) +
                " to " + endOfMonth.format(dateFormatter));
        System.out.println();

        // Iterate through the month in chunks of 5 days
        LocalDate startOfRow = currentDate;
        while (!startOfRow.isAfter(endOfMonth)) {
            // Calculate the end of this 5-day row (or less if near month end)
            LocalDate endOfRow = startOfRow.plusDays(4);
            if (endOfRow.isAfter(endOfMonth)) {
                endOfRow = endOfMonth;
            }

            // Determine how many days in this row (up to 5)
            int daysInRow = (int) java.time.temporal.ChronoUnit.DAYS.between(startOfRow, endOfRow) + 1;
            LocalDate[] days = new LocalDate[daysInRow];
            for (int i = 0; i < daysInRow; i++) {
                days[i] = startOfRow.plusDays(i);
            }

            // Print day headers for this row
            System.out.printf("%-20s", "Time");
            for (LocalDate day : days) {
                System.out.printf("%-25s", day.format(dateFormatter));
            }
            System.out.println("\n" + "-".repeat(20 + 25 * daysInRow));

            // Print time slots from 9:00 AM to 6:00 PM
            LocalTime startTime = LocalTime.of(9, 0);
            LocalTime endTime = LocalTime.of(18, 0);
            LocalTime time = startTime;

            while (!time.isAfter(endTime)) {
                LocalTime nextTime = time.plusMinutes(30);
                System.out.printf("%-20s", time.format(timeFormatter) + " - " + nextTime.format(timeFormatter));
                for (int i = 0; i < daysInRow; i++) {
                    System.out.printf("%-25s", "Available");
                }
                System.out.println();
                time = nextTime;
            }

            // Move to the next row of 5 days
            startOfRow = endOfRow.plusDays(1);
            System.out.println(); // Blank line between rows
        }
    }
    public static Physiotherapist[] getPhysiotherapistsData() {
        return new Physiotherapist[] {
                new Physiotherapist(1, "Dr. John Doe", "London", "+44 123 456 789",
                        new String[]{"Sports Therapy", "Orthopedic Rehabilitation"},
                        new String[]{"Massage Therapy", "Joint Manipulation", "Exercise Prescription"}),
                new Physiotherapist(2, "Dr. Sarah Smith", "Manchester", "+44 987 654 321",
                        new String[]{"Neurological Physiotherapy", "Post-Surgery Recovery"},
                        new String[]{"Electrotherapy", "Gait Training", "Muscle Stimulation"}),
                new Physiotherapist(3, "Dr. Alex Brown", "Birmingham", "+44 456 789 123",
                        new String[]{"Pediatric Physiotherapy", "Geriatric Care"},
                        new String[]{"Play Therapy", "Mobility Exercises", "Fall Prevention"}),
                new Physiotherapist(4, "Dr. Emily White", "Liverpool", "+44 321 654 987",
                        new String[]{"Cardio-Respiratory Therapy", "Pain Management"},
                        new String[]{"Breathing Exercises", "TENS Therapy", "Heat Therapy"}),
                new Physiotherapist(5, "Dr. Michael Green", "Leeds", "+44 741 852 963",
                        new String[]{"Manual Therapy", "Postural Correction"},
                        new String[]{"Soft Tissue Mobilization", "Spinal Alignment", "Ergonomic Training"}),
                new Physiotherapist(6, "Dr. Olivia Wilson", "Bristol", "+44 852 963 741",
                        new String[]{"Post-Surgery Recovery", "Musculoskeletal Physiotherapy"},
                        new String[]{"Range of Motion Exercises", "Strength Training", "Ultrasound Therapy"}),
                new Physiotherapist(7, "Dr. William Harris", "Sheffield", "+44 369 852 147",
                        new String[]{"Balance Disorders", "Vestibular Rehabilitation"},
                        new String[]{"Eye Movement Training", "Coordination Exercises", "Dizziness Management"}),
                new Physiotherapist(8, "Dr. Ava Clarke", "Nottingham", "+44 753 159 852",
                        new String[]{"Pediatric Physiotherapy", "Neurodevelopmental Therapy"},
                        new String[]{"Sensory Integration", "Developmental Exercises", "Posture Training"}),
                new Physiotherapist(9, "Dr. James Turner", "Edinburgh", "+44 951 357 468",
                        new String[]{"Pain Management", "Aquatic Therapy"},
                        new String[]{"Hydrotherapy Exercises", "Cold Therapy", "Pain Modulation Techniques"}),
                new Physiotherapist(10, "Dr. Sophia Hall", "Glasgow", "+44 852 456 753",
                        new String[]{"Manual Therapy", "Myofascial Release"},
                        new String[]{"Trigger Point Therapy", "Fascial Manipulation", "Stretching Techniques"}),
                new Physiotherapist(11, "Dr. Daniel Evans", "Cardiff", "+44 357 159 753",
                        new String[]{"Cardio-Respiratory Therapy", "Exercise Therapy"},
                        new String[]{"Pulmonary Rehabilitation", "Cardiac Exercises", "Endurance Training"}),
                new Physiotherapist(12, "Dr. Mia Baker", "Belfast", "+44 258 369 147",
                        new String[]{"Orthopedic Rehabilitation", "Acupuncture"},
                        new String[]{"Dry Needling", "Joint Stabilization", "Rehabilitation Exercises"}),
                new Physiotherapist(13, "Dr. Benjamin Scott", "Newcastle", "+44 159 357 258",
                        new String[]{"Neurological Physiotherapy", "Stroke Rehabilitation"},
                        new String[]{"Constraint-Induced Therapy", "Functional Training", "Neuroplasticity Exercises"}),
                new Physiotherapist(14, "Dr. Lily Adams", "Brighton", "+44 753 852 147",
                        new String[]{"Sports Therapy", "Kinesiology Taping"},
                        new String[]{"Sports Massage", "Taping Techniques", "Injury Prevention Training"}),
                new Physiotherapist(15, "Dr. Henry Carter", "Leicester", "+44 159 753 456",
                        new String[]{"Geriatric Care", "Chronic Pain Management"},
                        new String[]{"Gentle Mobilization", "Pain Relief Techniques", "Functional Exercises"}),
                new Physiotherapist(16, "Dr. Charlotte King", "Coventry", "+44 357 852 951",
                        new String[]{"Musculoskeletal Physiotherapy", "Joint Mobilization"},
                        new String[]{"Manual Joint Therapy", "Muscle Energy Techniques", "Therapeutic Exercises"}),
                new Physiotherapist(17, "Dr. Jack Wright", "Oxford", "+44 951 357 753",
                        new String[]{"Postural Correction", "Pelvic Floor Rehabilitation"},
                        new String[]{"Core Strengthening", "Pelvic Exercises", "Posture Re-education"}),
                new Physiotherapist(18, "Dr. Grace Lewis", "Cambridge", "+44 357 951 258",
                        new String[]{"Aquatic Therapy", "Pediatric Physiotherapy"},
                        new String[]{"Water-based Exercises", "Developmental Play", "Flotation Therapy"}),
                new Physiotherapist(19, "Dr. Ethan Walker", "York", "+44 258 753 951",
                        new String[]{"Post-Surgery Recovery", "Myofascial Release"},
                        new String[]{"Scar Tissue Management", "Fascial Stretching", "Progressive Exercises"}),
                new Physiotherapist(20, "Dr. Isabella Martin", "Southampton", "+44 951 258 753",
                        new String[]{"Pain Management", "Vestibular Rehabilitation"},
                        new String[]{"Relaxation Techniques", "Balance Training", "Vestibular Exercises"})
        };
    }
}
