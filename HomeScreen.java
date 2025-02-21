import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n==================================");
            System.out.println("  🏥 PhysioCare Booking System  ");
            System.out.println("==================================");
            System.out.println("1️⃣  Book an Appointment");
            System.out.println("2️⃣  View Available Treatments");
            System.out.println("3️⃣  Manage Appointments (Cancel/Reschedule)");
            System.out.println("4️⃣  View Reports");
            System.out.println("5️⃣  Exit");
            System.out.println("==================================");
            System.out.print("➡️  Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n📅 Redirecting to Appointment Booking...");
                        break;
                    case 2:
                        System.out.println("\n💆‍♂️ Showing Available Treatments...");
                        break;
                    case 3:
                        System.out.println("\n🔄 Managing Appointments...");
                        break;
                    case 4:
                        System.out.println("\n📊 Generating Reports...");
                        break;
                    case 5:
                        System.out.println("\n🚪 Exiting the system. Thank you for using PhysioCare!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n⚠️  Invalid choice! Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("\n⚠️  Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }
}
