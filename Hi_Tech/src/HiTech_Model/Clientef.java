
package HiTech_Model;


public class Clientef {
   
    //private static int Clientesfcriados;
   // private int id;
    private String nome;
    private String cpf;
    private String datadenascimento;
    private String sexo;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private String telefone;

    public Clientef() {
        //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNome() {
        return nome.toLowerCase();
    }

    public void setNome(String fnome) {
        this.nome = fnome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String fcpf) {
        this.cpf = fcpf;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String fdatadenascimento) {
        this.datadenascimento = fdatadenascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String fsexo) {
        this.sexo = fsexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String fendereco) {
        this.endereco = fendereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String fnumero) {
        this.numero = fnumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String fbairro) {
        this.bairro = fbairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String fcidade) {
        this.cidade = fcidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String festado) {
        this.estado = festado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String femail) {
        this.email = femail;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String ftelefone) {
        this.telefone = ftelefone;
    }
   

    
    public Clientef( String nome, String cpf, String datadenascimento, String sexo,String endereco, String numero,String bairro, String cidade, String estado,String email, String telefone){ 
    
//     Clientesfcriados++;  
//     this.id = Clientesfcriados;
     this.nome = nome;
     this.cpf = cpf;
     this.datadenascimento = datadenascimento;
     this.sexo = sexo;
     this.endereco = endereco;
     this.numero = numero;
     this.bairro = bairro;
     this.cidade = cidade;
     this.estado = estado;
     this.email = email;
     this.telefone = telefone;
}
    
    public Clientef (int id, String fnome, String fcpf, String fdatadenascimento, 
                 String fsexo, String fendereco, String fnumero,String fbairro,
                 String fcidade, String festado,String femail, String ftelefone){
        
     this.nome = fnome;
     this.cpf = fcpf;
     this.datadenascimento = fdatadenascimento;
     this.sexo = fsexo;
     this.endereco = fendereco;
     this.numero = fnumero;
     this.bairro = fbairro;
     this.cidade = fcidade;
     this.estado = festado;
     this.email = femail;
     this.telefone = ftelefone;
    }
     public String toString() {
        return this.nome;
    }
}
