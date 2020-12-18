package entity;

public class Xx {
    private int id;
    private String hh;
    private String txm;
    private String zwm;
    private String chandi;
    private String jiliangdanwei;
    private String yiji;
    private String erji;


    public Xx() {
        super();
    }

    public Xx(int id, String hh, String txm, String zwm, String chandi, String jiliangdanwei, String yiji, String erji) {
        this.id = id;
        this.hh = hh;
        this.txm = txm;
        this.zwm = zwm;
        this.chandi = chandi;
        this.jiliangdanwei = jiliangdanwei;
        this.yiji = yiji;
        this.erji = erji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHh() {
        return hh;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public String getTxm() {
        return txm;
    }

    public void setTxm(String txm) {
        this.txm = txm;
    }

    public String getZwm() {
        return zwm;
    }

    public void setZwm(String zwm) {
        this.zwm = zwm;
    }

    public String getChandi() {
        return chandi;
    }

    public void setChandi(String chandi) {
        this.chandi = chandi;
    }

    public String getJiliangdanwei() {
        return jiliangdanwei;
    }

    public void setJiliangdanwei(String jiliangdanwei) {
        this.jiliangdanwei = jiliangdanwei;
    }

    public String getYiji() {
        return yiji;
    }

    public void setYiji(String yiji) {
        this.yiji = yiji;
    }

    public String getErji() {
        return erji;
    }

    public void setErji(String erji) {
        this.erji = erji;
    }

    @Override
    public String toString() {
        return "Xx{" +
                "id=" + id +
                ", hh='" + hh + '\'' +
                ", txm='" + txm + '\'' +
                ", zwm='" + zwm + '\'' +
                ", chandi='" + chandi + '\'' +
                ", jiliangdanwei='" + jiliangdanwei + '\'' +
                ", yiji='" + yiji + '\'' +
                ", erji='" + erji + '\'' +
                '}';
    }
}