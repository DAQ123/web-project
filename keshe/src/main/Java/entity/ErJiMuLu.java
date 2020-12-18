package entity;

public class ErJiMuLu {
    private String id;
    private String one;
    private String two;


    public ErJiMuLu() {
        super();
    }


    public ErJiMuLu(String id, String one, String two) {
        this.id = id;
        this.one = one;
        this.two = two;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "ErJiMuLu{" +
                "id='" + id + '\'' +
                ", one='" + one + '\'' +
                ", two='" + two + '\'' +
                '}';
    }
}
