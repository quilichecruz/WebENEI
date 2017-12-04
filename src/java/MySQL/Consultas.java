/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author prac-enei5
 */
public class Consultas extends Conexion{
    public boolean autentication_user(String user_admin,String pass_admin){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from admin where user_admin= ? and pass_admin = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, user_admin);
            pst.setString(2, pass_admin);
            rs = pst.executeQuery();
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }finally{
            try {
                if (getConexion() != null) getConexion().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
}
