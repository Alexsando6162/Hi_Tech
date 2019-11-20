
package HiTech_Controll;

import java.util.ArrayList;
import HiTech_Dao.ProdutosDAO;
import HiTech_Model.Produtos;

/**
 *
 * @author Secretaria
 */
public class ProdutosControll {
    
    public static boolean salvar(String categoria, String codBarras, String descricao, String marca, String quantidade, String valor1){
       Produtos l = new Produtos(categoria, codBarras, descricao, marca, quantidade, valor1); 
        return ProdutosDAO.salvar(l);
    }
    
    public static boolean excluir(String codBarras){
        return ProdutosDAO.excluir(codBarras);
    }
    
    public static boolean atualizar(String categoria, String codBarras, String descricao, String marca, String quantidade, String valor){
        
      Produtos l = new Produtos(categoria,codBarras, descricao, marca, quantidade, valor); 
        return ProdutosDAO.atualizar(l);
    }
    
    public static ArrayList<String[]> getProdutos(){
        
        ArrayList<Produtos> produtoIns = ProdutosDAO.getProdutos();
        ArrayList<String[]> Produto = new ArrayList<>();
        
        for(int i=0; i<produtoIns.size(); i++){
            Produto.add(new String[]{produtoIns.get(i).getCategoria(),String.valueOf(produtoIns.get(i).getCodBarras()),
                produtoIns.get(i).getDescricao(),produtoIns.get(i).getMarca(),String.valueOf(produtoIns.get(i).getQuantidade()),
                String.valueOf(produtoIns.get(i).getValor())});
                
            }
   
    return Produto;
    }
    
    
    public static ArrayList<Produtos> retornaListProdutos(){
        

        ArrayList<Produtos> Produto = ProdutosDAO.getProdutos();
        
        return Produto;
    }



        ArrayList<Produtos> produto = ProdutosDAO.getProdutos();
        
        return produto;
    }

    public static class getProdutos extends ArrayList<String[]> {
        public getProdutos() {
        } 
    }


    
    
}
