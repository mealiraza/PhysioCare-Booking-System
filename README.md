PhysioCare Booking System 🏥💆‍♂️
Overview
PhysioCare is a simple console-based appointment booking system for the Boost Physio Clinic (BPC). It allows patients to book, manage, and attend treatments with physiotherapists based on their expertise and availability. The system also generates reports on treatment history and physiotherapist rankings.

🚀 Core Functionalities
🩺 Patient & Physiotherapist Management
✅ Maintain unique ID, name, address, and contact details for each patient and physiotherapist.
✅ Each physiotherapist has one or more areas of expertise (e.g., Physiotherapy, Osteopathy, Rehabilitation).
✅ Treatments offered include:

Neural Mobilisation
Acupuncture
Massage
Mobilisation of the Spine and Joints
Pool Rehabilitation
📅 Appointment Booking & Management
✅ Patients can book treatments in two ways:
1️⃣ By expertise (view available physiotherapists & book a treatment).
2️⃣ By physiotherapist name (view their available treatments & book a session).
✅ Patients can cancel or reschedule appointments.
✅ An appointment is marked as attended when a patient checks in.

📆 Treatment Timetable
✅ The system manages a 4-week treatment schedule for physiotherapists.
✅ Available treatment times are displayed for patient booking.

📊 Reporting & Statistics
✅ At the end of the term, the system generates a report including:

Physiotherapist Name
Treatment Name
Patient Name
Time
Appointment Status (Booked, Cancelled, Attended)
✅ Physiotherapist Ranking based on attended appointments (sorted in descending order).
🛠 Technology Stack
Java (Core system implementation)
JUnit (Testing framework)
Git (Version control)
Console Output (For booking and reports)
📜 Installation & Usage
1️⃣ Clone the Repository
bash
Copy
Edit
git clone https://github.com/your-username/PhysioCare-Booking-System.git
cd PhysioCare-Booking-System
2️⃣ Compile & Run the Program
bash
Copy
Edit
javac -d bin src/*.java  
java -cp bin Main  
3️⃣ Run Tests
bash
Copy
Edit
java -cp bin org.junit.runner.JUnitCore TestSuite  
📜 License
This project is open-source and available under the MIT License.

🎯 PhysioCare – Making physiotherapy booking simple & efficient! 💙💪







