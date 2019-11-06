
package HiTech_Model;


public class Vendas {
    
    public Vendas(String actionCommand, String actionCommand0, String text, String text0, String text1, String text2, String text3){
     
        vendasrealizadas++;
        
        this.idvenda = vendasrealizadas;
        this.clientevenda = clientevenda;
        this.produtovenda = produtovenda;
        this.datavenda = datavenda;
        this.quantidadevenda = quantidadevenda;
        this.valortotal = valortotal;
        
    }
     
    private static int vendasrealizadas;
    private int idvenda;
    private String clientevenda;
    private String datavenda;
    private String produtovenda;
     private int quantidadevenda;
    private float valortotal; 
    
    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public String getClientevenda() {
        return clientevenda;
    }

    public void setClientevenda(String clientevenda) {
        this.clientevenda = clientevenda;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getProdutovenda() {
        return produtovenda;
    }

    public void setProdutovenda(String produtovenda) {
        this.produtovenda = produtovenda;
    }
      public int getQuantidadevenda() {
        return quantidadevenda;
    }

    public void setQuantidadevenda(int quantidadevenda) {
        this.quantidadevenda = quantidadevenda;
        
    }
    
    public Vendas(String data){
        
        vendasrealizadas++;
        this.idvenda = vendasrealizadas;
        this.datavenda = datavenda;
        
    }
    
   public Vendas(int idvenda, String data){
       int vidvenda =0;
       this.idvenda = vidvenda;
       String vdatavenda = null;
       this.datavenda = datavenda;
       
   }
    
}
