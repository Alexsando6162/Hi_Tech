
package HiTech_Dao;

import HiTech_Model.Clientef;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ClientefDAO {

   private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "Hitech_Instruments";
    private static String url = "";
    private static Connection ConexaoHitech;
    
    
    
    public static boolean salvar(Clientef k) {
        return SimulaBD.getInstance().Salvarcliente(k); 
    }

    public static boolean excluir(String cpf) {
         return SimulaBD.getInstance().ExcluirCliente(cpf); 
    }

    public static boolean atualizar(Clientef k) {
       return SimulaBD.getInstance().AtualizarCliente(k); 
    }

    public static ArrayList<Clientef> getClientef() {
        return SimulaBD.getInstance().getClientef(); 
    }
//    public static ArrayList <Clientef> getClientefs() {
//        return SimulaBD.getInstance().getClientef();
//    }
}
