package dao;

import tools.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Select {
    private Connection con;
    private PreparedStatement pst;


    public String getChanDi(String id) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();
        String sql ="SELECT id,ChanDi FROM t_cd";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            if(rs.getString(1).equals(id)){
                return rs.getString(2);
            }
        }

        jdbcUtil.close();
        return "";
    }

    public String getJiLiang(String id) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();

        String sql ="SELECT id,dw FROM t_dw";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            if(rs.getString(1).equals(id)){
                return rs.getString(2);
            }
        }

        jdbcUtil.close();
        return "";
    }

    public String getYiJi(String id) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();

        String sql ="SELECT id,One FROM t_ml";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            if(rs.getString(1).equals(id)){
                return rs.getString(2);
            }
        }

        jdbcUtil.close();
        return "";
    }

    public String getErJi(String id,String one) throws SQLException {
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();
        String sql ="SELECT id,One,Two FROM t_ml2";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            if(rs.getString(1).equals(id) && rs.getString(2).equals(one) ){
                return rs.getString(3);
            }
        }

        jdbcUtil.close();
        return "";
    }

}
