package dao;

import entity.*;
import tools.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectAll {
    private Connection con;
    private PreparedStatement pst;

    public Map getAll(){
        //连接数据库，获取信息
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();
        Map map = new HashMap();

        try {
            map.put("chandi",getChanDi());
            map.put("yiji",getYiJi());
            map.put("jiliang",getJiLiang());
            jdbcUtil.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return map;
    }

    public List<ChanDi> getChanDi() throws SQLException {
        List<ChanDi> list = new ArrayList<>();
        String sql ="SELECT id,ChanDi FROM t_cd";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            int id = rs.getInt(1);
            String cd = rs.getString(2);
            ChanDi chanDi = new ChanDi(id,cd);

            list.add(chanDi);
        }

        return list;
    }

    public List<YiJiMuLu> getYiJi() throws SQLException {
        List<YiJiMuLu> list = new ArrayList<>();
        String sql ="SELECT id,One FROM t_ml";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            int id = rs.getInt(1);
            String one = rs.getString(2);
            YiJiMuLu yiJiMuLu = new YiJiMuLu(id,one);
            list.add(yiJiMuLu);
        }
        return list;
    }

    public List<JiLiangDanWei> getJiLiang() throws SQLException {
        List<JiLiangDanWei> list = new ArrayList<>();
        String sql ="SELECT id,dw FROM t_dw";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            int id = rs.getInt(1);
            String dw = rs.getString(2);
            JiLiangDanWei jiLiangDanWei = new JiLiangDanWei(id,dw);
            list.add(jiLiangDanWei);
        }
        return list;
    }
}
