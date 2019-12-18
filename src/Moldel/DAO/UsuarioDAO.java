package Moldel.DAO;

import BancodeDados.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import BancodeDados.conexao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class UsuarioDAO {
   
    private static UsuarioDAO instance;

    private UsuarioDAO() {
    }
    
    public static synchronized UsuarioDAO getInstance(){
        if(instance==null)
            instance=new UsuarioDAO();
         return instance;
    }
    
    public boolean verificarEmail(String email){
        
        String sql="select email from usuario where email= ?";
        
        try {
           Connection conectar=conexao.getInstance().abrir();
           PreparedStatement comando= conectar.prepareCall(sql);
           comando.setString(1,email);
           ResultSet resultset=comando.executeQuery();
           resultset.next();
           if(resultset.getString("email").equals(email))
               return true;
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    public String consultarDica(String nomeOuEmail){
        
        String sql ="select dicaSenha from usuario where login=? or email=?";
        
        try {
            Connection conectar=conexao.getInstance().abrir();
            PreparedStatement comando= conectar.prepareCall(sql);
            comando.setString(1,nomeOuEmail);
            comando.setString(2,nomeOuEmail);
            ResultSet resultset=comando.executeQuery();
            resultset.next();
                return resultset.getString("dicaSenha");
        } catch (Exception e) {
            return null;
        }
    }
    

}
