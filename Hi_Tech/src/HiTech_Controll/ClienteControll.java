
package HiTech_Controll;

import HiTech_Dao.ClientefDAO;
import HiTech_Model.Clientef;
import java.util.ArrayList;




public class ClienteControll {
    
    public static boolean salvar (String nome,String cpf, String datadenascimento,String sexo, String endereco,String numero, String bairro,String cidade, String estado, String email,String telefone){
        Clientef cliente = new Clientef(nome, cpf, datadenascimento, sexo, endereco, numero, bairro, cidade,estado, email, telefone);
        return ClientefDAO.salvar(cliente);
    }
    
    public static boolean excluir ( int id){
        return ClientefDAO.excluir(id);
        
    }
   public static boolean atualizar(String nome,String cpf, String datadenascimento,String sexo, String endereco,String numero, String bairro,String cidade, String estado, String email, String telefone){
       Clientef k = new Clientef (nome, cpf, datadenascimento, sexo, endereco, numero, bairro, cidade,estado, email, telefone);
       return ClientefDAO.atualizar(k);
   }
    public static ArrayList<String[]> getClientef() {
        
        ArrayList<Clientef> clientes = ClientefDAO.getClientef();
        ArrayList<String[]> Clientesfisicos = new ArrayList<>();
        
        for ( int i=0; i< clientes.size(); i++){
            Clientesfisicos.add(new String[]{String.valueOf(clientes.get(i).getId()), clientes.get(i).getNome(), String.valueOf(clientes.get(i).getCpf()), clientes.get(i).getDatadenascimento(), clientes.get(i).getSexo(), clientes.get(i).getEndereco(),clientes.get(i).getNumero(), clientes.get(i).getBairro(), clientes.get(i).getCidade(), clientes.get(i).getEstado(), clientes.get(i).getEmail(),clientes.get(i).getTelefone()});
    }
    return Clientesfisicos;
    }

public static ArrayList<Clientef> retornaListClienteF(){
ArrayList<Clientef> clientes = ClientefDAO.getClientef();
return clientes;
}
}
