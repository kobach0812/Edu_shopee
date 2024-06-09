package Model;

public class Department {
    private int ID;
    private String title;

    public Department(int ID, String title) {
        this.ID = ID;
        this.title = title;
    }
    public int getID() {
        return ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}

