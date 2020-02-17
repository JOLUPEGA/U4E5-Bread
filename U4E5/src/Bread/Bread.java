
package Bread;

public class Bread {
    private String tipoPan;
    private String calorias;

    public Bread(){
        this.tipoPan = "rye";
        this.calorias = "0";    
    }
    
    public Bread(String tipoPan, String calorias){
        this.tipoPan = tipoPan;
        this.calorias = calorias;    
    }

    public String panBread(String tipoPan, String calorias){
        return this.tipoPan+" "+calorias;
    }
    
    public void setTipoPan(String tipoPan){
        this.tipoPan = tipoPan;
    }
    public void setCalorias(String calorias){
        this.calorias = calorias;
    }
    public String getTipoPan(){
        return this.tipoPan;
    }
    public String getCalorias(){
        return this.calorias;
    }
}
