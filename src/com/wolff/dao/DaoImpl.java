//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wolff.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;

public class DaoImpl extends Conexion {
    public DaoImpl() {
    }

    public String lists(Button channel) {
        String sql = "select * from site channel=" + channel.getAccessibleText();
        String url = "";
        this.getConn();

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                url = rs.getString("url");
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return url;
    }

    public String getUrl(String site) throws SQLException {
        String sql = "select url from site where channel=?";
        String result = "";
        this.getConn();

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, site);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getString("url");
            }
        } catch (SQLException var6) {
            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, (String)null, var6);
        }

        return result;
    }
}
