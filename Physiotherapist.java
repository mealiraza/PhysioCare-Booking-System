public class Physiotherapist {
    private String id;
    private String name;
    private String area;
    private String contact;

    public Physiotherapist(String id, String name, String area, String contact) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.contact = contact;
    }

    public String getId() {
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
