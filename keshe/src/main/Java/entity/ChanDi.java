package entity;

public class ChanDi {
    private int id;
    private String ChanDi;

    public ChanDi() {
        super();
    }

    public ChanDi(int id, String chanDi) {
        this.id = id;
        ChanDi = chanDi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChanDi() {
        return ChanDi;
    }

    public void setChanDi(String chanDi) {
        ChanDi = chanDi;
    }

    @Override
    public String toString() {
        return "ChanDi{" +
                "id=" + id +
                ", ChanDi='" + ChanDi + '\'' +
                '}';
    }
}
