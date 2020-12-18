package entity;

public class JiLiangDanWei {

    private int id;
    private String JiLiangDanWei;

    public JiLiangDanWei() {
        super();
    }

    public JiLiangDanWei(int id, String jiLiangDanWei) {
        this.id = id;
        JiLiangDanWei = jiLiangDanWei;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJiLiangDanWei() {
        return JiLiangDanWei;
    }

    public void setJiLiangDanWei(String jiLiangDanWei) {
        JiLiangDanWei = jiLiangDanWei;
    }

    @Override
    public String toString() {
        return "JiLiangDanWei{" +
                "id=" + id +
                ", JiLiangDanWei='" + JiLiangDanWei + '\'' +
                '}';
    }
}
