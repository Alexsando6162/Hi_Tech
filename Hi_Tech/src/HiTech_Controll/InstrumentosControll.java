
package HiTech_Controll;

import java.util.ArrayList;
import HiTech_Dao.InstrumentosDAO;
import HiTech_Model.Instrumentos;

/**
 *
 * @author Secretaria
 */
public class InstrumentosControll {
    
    public static boolean salvar(String modalidade1, String valor1, int quantidade1){
        
       Instrumentos l = new Instrumentos(modalidade1, valor1, quantidade1); 
        return InstrumentosDAO.salvar(l);
    }
    
    public static boolean excluir(int id1){
        return InstrumentosDAO.excluir(id1);
    }
    
    public static boolean atualizar(int id1, String modalidade1, String valor1, int quantidade1){
        
      Instrumentos l = new Instrumentos(modalidade1, valor1, quantidade1); 
        return InstrumentosDAO.atualizar(l);
    }
    
    public static ArrayList<String[]> getInstrumentos(){
        
        ArrayList<Instrumentos> clientes1 = InstrumentosDAO.getInstrumentos();
        ArrayList<String[]> Produtos = new ArrayList<>();
        
        for(int i=0; i<clientes1.size(); i++){
            Produtos.add(new String[] {String.valueOf(clientes1.get(i).getId1()), clientes1.get(i).getModalidade1(), String.valueOf(clientes1.get(i).getQuantidade1()), clientes1.get(i).getValor1()});
        }
   
    return Produtos;
    }
    public static ArrayList<Instrumentos> retornaInstrumentos(){
        
        ArrayList<Instrumentos> produtos = InstrumentosDAO.getInstrumentos();
        
        return produtos;
    }

}
