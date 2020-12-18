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

public class SelectErJi {
    private Connection con;
    private PreparedStatement pst;

    public Map getEr(String one){
        //连接数据库，获取信息
        JdbcUtil jdbcUtil = new JdbcUtil();
        con = jdbcUtil.getConnection();
        Map map = new HashMap();

        try {
            map.put("erji",getErJi(one));
            jdbcUtil.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return map;
    }

    public List<ErJiMuLu> getErJi(String one) throws SQLException {
        List<ErJiMuLu> list = new ArrayList<>();
        String sql ="SELECT id,One,Two FROM t_ml2";
        pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            String id = rs.getString(1);
            String o = rs.getString(2);
            String t = rs.getString(3);
            ErJiMuLu erJiMuLu = new ErJiMuLu(id,o,t);

            if(o.equals(one)){
                list.add(erJiMuLu);
            }
        }

        return list;
    }

}
