package entity;

public class YiJiMuLu {
    private int id;
    private String One;

    public YiJiMuLu() {
        super();
    }

    public YiJiMuLu(int id, String one) {
        this.id = id;
        this.One = one;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOne() {
        return One;
    }

    public void setOne(String one) {
        this.One = one;
    }

    @Override
    public String toString() {
        return "YiJiMuLu{" +
                "id=" + id +
                ", one='" + One + '\'' +
                '}';
    }
}
