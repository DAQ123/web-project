package dao;

import entity.*;
import tools.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Set {
    private Connection con;
    private PreparedStatement pst;

    public void SetAll(Xx xx){
        //连接数据库,获取信息
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();

        try {
            SetXx(xx);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jdbcUtil.close();
    }
    public void SetXx(Xx xx) throws SQLException {
        String sql = "insert into t_xx(hh,txm,zwm,chandi,jiliangdanwei,yiji,erji) value(?,?,?,?,?,?,?)";

        pst = con.prepareStatement(sql);
        pst.setString(1,xx.getHh());
        pst.setString(2,xx.getTxm());
        pst.setString(3,xx.getZwm());

        String chandi = new Select().getChanDi(xx.getChandi());
        pst.setString(4,chandi);

        String danwei = new Select().getJiLiang(xx.getJiliangdanwei());
        pst.setString(5,danwei);

        String one = new Select().getYiJi(xx.getYiji());
        pst.setString(6,one);

        String two = new Select().getErJi(xx.getErji(),one);
        System.out.println(xx.getErji()+" "+one);
        pst.setString(7,two);
        pst.executeUpdate();
    }
}
