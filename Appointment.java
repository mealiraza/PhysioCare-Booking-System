public class Appointment {
    private int id;
    private String dateTime;
    private int physioId;
    private int patientId;

    public Appointment(int id, String dateTime, int physioId, int patientId) {
        this.id = id;
        this.dateTime = dateTime;
        this.physioId = physioId;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getPhysioId() {
        return physioId;
    }

    public void setPhysioId(int physioId) {
        this.physioId = physioId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
