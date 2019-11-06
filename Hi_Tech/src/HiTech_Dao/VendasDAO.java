
package HiTech_Dao;

import HiTech_Model.Vendas;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendasDAO {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "Hitech_Instruments";
    private static String url = "";
    private static Connection ConexaoHitech;
    
    public static boolean salvarVendas(Vendas l){
      return SimulaBD.getInstance().Salvar(l);
    }
   
    public static ArrayList<Vendas> getVendas(){
        return SimulaBD.getInstance().getVenda();
    }
}
