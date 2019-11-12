/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiTech_Dao;

import HiTech_Model.Clientef;
import HiTech_Model.Produtos;
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
    
      private ArrayList<Produtos> Produto;
      
      private ArrayList<Vendas> DataVendas;
      
      
      private SimulaBD(){
          
          Clientesfisicos = new ArrayList<Clientef>();
          
          Produto = new ArrayList<Produtos>();
          
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
            if(item.getCpf().equals(k.getCpf())){
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
                item.setTelefone(k.getTelefone());
            }
        }
        return true;
    }

    public boolean ExcluirCliente(String i){
        Clientef Excluir = new Clientef();
        boolean presenteAqui= false;
        
        for(Clientef x: Clientesfisicos){
            
            if(x.getCpf()== i){
                Excluir = x;
                presenteAqui = true;
            }
        }
    if( presenteAqui) {
        
        Clientesfisicos.remove(Excluir);
    }
    return true;
    }
    
    
    
    public boolean SalvarProduto(Produtos k){
      
        Produto.add(k);
        return true;
    }
    
    public ArrayList<Produtos> getProdutos(){
        return this.Produto;
    }
    
    public boolean AtualizarProduto(Produtos k){
        
        for( Produtos item: Produto){
            if(item.getCodBarras()== k.getCodBarras()){
                item.setCategoria(k.getCategoria());
                item.setCodBarras(k.getCodBarras());
                item.setDescricao(k.getDescricao());
                item.setMarca(k.getMarca());
                item.setQuantidade(k.getQuantidade());
                item.setValor(k.getValor());
            }
        }
        return true;
    }
    
    public boolean ExcluirProduto(String i){
        
        Produtos DeletaInstrumento = new Produtos();
        
        boolean presenteAqui = false;
        
        for( Produtos p: Produto){
            if(p.getCodBarras() == i){
                DeletaInstrumento = p;
                presenteAqui = true;
            }
        }
        if(presenteAqui){
            Produto.remove(DeletaInstrumento);
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
