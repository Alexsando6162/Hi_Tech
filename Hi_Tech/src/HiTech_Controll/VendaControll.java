
package HiTech_Controll;

import HiTech_Dao.VendasDAO;
import HiTech_Model.Vendas;
import java.util.ArrayList;


public class VendaControll {
    
    public static ArrayList<String[]> getVendas(){
        ArrayList<Vendas> vendas = VendasDAO.getVendas();
        ArrayList<String[]> Datasvendas = new ArrayList<>();
        
        for(int i=0; i< vendas.size();i++){
            Datasvendas.add(new String[] {vendas.get(i).getDatavenda()});
            
        }
        
        return Datasvendas;
        
    }
   
    public static ArrayList<Vendas> retornaVenda() {
        ArrayList<Vendas> vendass = VendasDAO.getVendas();
        return vendass;

    }
    
    public static boolean salvarVenda(String actionCommand, String actionCommand0, String text, String text0, String text1, String text2, String text3){
    
        Vendas vendasr = new Vendas(actionCommand, actionCommand0, text, text0, text1, text2, text3);
        
        return VendasDAO.salvarVendas(vendasr);
    }
    
}
