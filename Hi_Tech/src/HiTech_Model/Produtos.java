
package HiTech_Model;


public class Produtos {

    
    //private static int instrumentos1;
    private String categoria;
    private String descricao;
    private String marca;
    private String quantidade;
    private String codBarras;
    private String valor;
    
    
    
       public Produtos(){
//    instrumentos1++;
//    this.id1 = instrumentos1;
    }
    
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getQuantidade() {
        return quantidade;
    } 
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
     
    public String getCodBarras() {
        return codBarras;
    }
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
     
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    

    public Produtos(String categoria, String codBarras, String descricao, String marca, String quantidade, String valor){
    
    this.categoria = categoria;    
    this.descricao = descricao;
    this.marca = marca;
    this.quantidade = quantidade;
    this.codBarras = codBarras;
    this.valor = valor;
    }

    public Produtos(int id, String categoria, String codBarras, String descricao, String marca, String quantidade, String valor){
    
    this.categoria = categoria;    
    this.descricao = descricao;
    this.marca = marca;
    this.quantidade = quantidade;
    this.codBarras = codBarras;
    this.valor = valor; 
    }

    
    
   public String toString() {

        return this.descricao;

    }
}