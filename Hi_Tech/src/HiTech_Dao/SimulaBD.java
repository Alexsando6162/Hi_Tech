/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiTech_Dao;

import HiTech_Model.Clientef;
import HiTech_Model.Instrumentos;
import HiTech_Model.Vendas;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SimulaBD {
     private static SimulaBD techbd;
     
     private ArrayList<Clientef> Clientesfisicos;
    
      private ArrayList<Instrumentos> Produtos;
      
      private ArrayList<Vendas> DataVendas;
      
      
      private SimulaBD(){
          
          Clientesfisicos = new ArrayList<Clientef>();
          
          Produtos = new ArrayList<Instrumentos>();
          
          DataVendas = new ArrayList<Vendas>();
          
      }
      
      public static synchronized SimulaBD getInstance(){
          
          if(techbd == null){
              techbd = new SimulaBD();
          }
          return techbd;
      }

    public boolean Salvarcliente(Clientef k){
       Clientesfisicos.add(k);
       return true;
    }
   
    public ArrayList<Clientef> getClientef(){
        return this.Clientesfisicos;
    }
    
    public boolean AtualizarCliente( Clientef k){
        
        
        for( Clientef item : Clientesfisicos){
            if(item.getId() == k.getId()){
                item.setNome(k.getNome());
                item.setCpf(k.getCpf());
                item.setDatadenascimento(k.getDatadenascimento());
                item.setSexo(k.getSexo());
                item.setEndereco(k.getEndereco());
                item.setNumero(k.getNumero());
                item.setBairro(k.getBairro());
                item.setCidade(k.getCidade());
                item.setEstado(k.getEstado());
                item.setEmail(k.getEmail());
                
            }
        }
        return true;
    }

    public boolean ExcluirCliente(int i){
        Clientef Excluir = new Clientef();
        boolean presenteAqui= false;
        
        for(Clientef x: Clientesfisicos){
            
            if(x.getId() == i){
                Excluir = x;
                presenteAqui = true;
            }
        }
    if( presenteAqui) {
        
        Clientesfisicos.remove(Excluir);
    }
    return true;
    }
    
    
    
    public boolean SalvarProduto(Instrumentos k){
      
        Produtos.add(k);
        return true;
    }
    public ArrayList<Instrumentos> getInstrumentos(){
        return this.Produtos;
    }
    
    public boolean AtualizarProduto(Instrumentos k){
        
        for( Instrumentos item3: Produtos){
            if(item3.getId1() == k.getId1()){
                item3.setModalidade1(k.getModalidade1());
                item3.setValor1(k.getValor1());
                item3.setQuantidade1(k.getQuantidade1());
            }
        }
        return true;
    }
    
    public boolean ExcluirProduto(int i){
        
        Instrumentos DeletaInstrumento = new Instrumentos();
        
        boolean presenteAqui = false;
        
        for( Instrumentos y: Produtos){
            if(y.getId1() == i){
                DeletaInstrumento = y;
                presenteAqui = true;
                
            }
            
        }
        if(presenteAqui){
            Produtos.remove(DeletaInstrumento);
        }
    
    
    return true;
}
   
    
    public boolean Salvar(Vendas l){
        DataVendas.add(l);
        
        return true;
        
    }
    public ArrayList<Vendas> getVenda(){
        
      return this.DataVendas;  
    }
    
}
