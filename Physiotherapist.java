public class Physiotherapist {
    private int id;
    private String name;
    private String area;
    private String contact;
    private String[] expertise;
    private String[] treatments;

    public Physiotherapist(int id, String name, String area, String contact, String[] expertise,String[] treatments) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.contact = contact;
        this.expertise = expertise;
        this.treatments = treatments;
    }


    public String[] getTreatments() {
        return treatments;
    }

    public void setTreatments(String[] treatments) {
        this.treatments = treatments;
    }

    public String[] getExpertise() {
        return expertise;
    }

    public void setExpertise(String[] expertise) {
        this.expertise = expertise;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
