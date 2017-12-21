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
    
    public boolean registro_docente(String dni,String nombre,String apellidos,String tele,String dire,String corr,String cpre,String grad,String prof,String tipo,String cpos,String espe,String dipl,String expe,String sede,String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,String c9,String c10,String c11,String c12){ 
        
        PreparedStatement pst = null;
        
        try {
            String consulta="insert into profesores(dni_pro,nombre_pro,apellidos_pro,tele_pro,dire_pro,corr_pro,cpre_pro,grad_pro,prof_pro,tipo_pro,cpos_pro,espe_pro,dipl_pro,expe_pro,sede_pro,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, dni);
            pst.setString(2, nombre);
            pst.setString(3, apellidos);
            pst.setString(4, tele);
            pst.setString(5, dire);
            pst.setString(6, corr);
            pst.setString(7, cpre);
            pst.setString(8, grad);
            pst.setString(9, prof);
            pst.setString(10, tipo);
            pst.setString(11, cpos);
            pst.setString(12, espe);
            pst.setString(13, dipl);
            pst.setString(14, expe);
            pst.setString(15, sede);
            pst.setString(16, c1);
            pst.setString(17, c2);
            pst.setString(18, c3);
            pst.setString(19, c4);
            pst.setString(20, c5);
            pst.setString(21, c6);
            pst.setString(22, c7);
            pst.setString(23, c8);
            pst.setString(24, c9);
            pst.setString(25, c10);
            pst.setString(26, c11);
            pst.setString(27, c12);
            
            if(pst.executeUpdate() == 1){
            return true;
            }
        } catch (Exception ex) {
            System.err.println("ERROR"+ ex);
        }finally{
            try {
                 if (getConexion() != null) getConexion().close();
                 if (pst != null) pst.close();
                } catch (Exception e) {
            System.err.println("ERROR"+ e);
        }
      }
        return false;
    }

    public boolean registro_cursos(String nombrecur,int vaca,float cost,String desc){ 

    PreparedStatement pst = null;

    try {
        String consulta="insert into cursos(nombre_cur,vaca_cur,cost,desc_cur) values(?,?,?,?)";
        pst = getConexion().prepareStatement(consulta);
        pst.setString(1, nombrecur);
        pst.setInt(2, vaca);
        pst.setFloat(3, cost);
        pst.setString(4, desc);
        if(pst.executeUpdate() == 1){
        return true;
        }
    } catch (Exception ex) {
        System.err.println("ERROR"+ ex);
    }finally{
        try {
             if (getConexion() != null) getConexion().close();
             if (pst != null) pst.close();
            } catch (Exception e) {
        System.err.println("ERROR"+ e);
    }
  }
    return false;
}

    public boolean relation(String dni,int cod,String fechatini,String fechatfin,String esta,String labo,int paga,String frec){ 

    PreparedStatement pst = null;

    try {
        String consulta="insert into registro(dni_pro,cod_cur,fechatini,fechatfin,esta,labo,paga,frec) values(?,?,?,?,?,?,?,?)";
        pst = getConexion().prepareStatement(consulta);

        pst.setString(1, dni);
        pst.setInt(2, cod);
        pst.setString(3, fechatini);
        pst.setString(4, fechatfin);
        pst.setString(5, esta);
        pst.setString(6, labo);
        pst.setInt(7, paga);
        pst.setString(8, frec);

        if(pst.executeUpdate() == 1){
        return true;
        }
    } catch (Exception ex) {
        System.err.println("ERROR"+ ex);
    }finally{
        try {
             if (getConexion() != null) getConexion().close();
             if (pst != null) pst.close();
            } catch (Exception e) {
        System.err.println("ERROR"+ e);
    }
  }
    return false;
}

    public boolean session(int idregistro,String fechas,String horasini,String horasfin){ 

       PreparedStatement pst = null;

       try {
           String consulta="insert into sesion(id_registro,fecha,horasini,horasfin) values(?,?,?,?)";
           pst = getConexion().prepareStatement(consulta);

           pst.setInt(1, idregistro);
           pst.setString(2, fechas);
           pst.setString(3, horasini);
           pst.setString(4, horasfin);
           if(pst.executeUpdate() == 1){
           return true;
           }
       } catch (Exception ex) {
           System.err.println("ERROR"+ ex);
       }finally{
           try {
                if (getConexion() != null) getConexion().close();
                if (pst != null) pst.close();
               } catch (Exception e) {
           System.err.println("ERROR"+ e);
       }
     }
       return false;
   }
    
    public boolean buscar_docente(String dni, String nombrepro){ 

    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        String consulta = "select * from profesores where dni_pro = ? or nombre_pro = ? ";
        pst = getConexion().prepareStatement(consulta);
        pst.setString(1, dni);
        pst.setString(2, nombrepro);
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


