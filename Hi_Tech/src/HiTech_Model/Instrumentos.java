
package HiTech_Model;


public class Instrumentos {
    
    
    private static int instrumentos1;
    private int id1;
    private String modalidade1;
    private String valor1;
    private int quantidade1;

  

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getModalidade1() {
        return modalidade1;
    }

    public void setModalidade1(String modalidade1) {
        this.modalidade1 = modalidade1;
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public int getQuantidade1() {
        return quantidade1;
    }

    public void setQuantidade1(int quantidade1) {
        this.quantidade1 = quantidade1;
    }
    

  

    public Instrumentos(){
    instrumentos1++;
    this.id1 = instrumentos1;
}

    public Instrumentos(String modalidade1, String valor1, int quantidade1){
    instrumentos1++;
    this.id1 = instrumentos1;
    this.modalidade1 = modalidade1;
    this.quantidade1 = quantidade1;
    
    }


/*   public Instrumentos(int id1, String 1modalidade1, String 1quantidade1, String 1valor1){
    
    this.id1 = id1;
    this.modalidade1 = 1modalidade1;
    this.quantidade1 = 1quantidade1;
    this.valor1 = 1valor1;
}
*/
   public String toString() {

        return this.modalidade1;

    }
}