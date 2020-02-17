
package SandwichFilling;

public class SandwichFilling {
    private String tipoRelleno;
    private String caloriasPorcion;

    public SandwichFilling(){
        this.tipoRelleno = "ensalada de huevo";
        this.caloriasPorcion = "0";    
    }
    
    public SandwichFilling(String tipoRelleno, String caloriasPorcion){
        this.tipoRelleno = tipoRelleno;
        this.caloriasPorcion = caloriasPorcion;    
    }

    public String panFilling(String tipoRelleno, String caloriasPorcion){
        return this.tipoRelleno+" "+caloriasPorcion;
    }
    
    public void setTipoRelleno(String tipoRelleno){
        this.tipoRelleno = tipoRelleno;
    }
    public void setCaloriasPorcion(String caloriasPorcion){
        this.caloriasPorcion = caloriasPorcion;
    }
    public String getTipoRelleno(){
        return this.tipoRelleno;
    }
    public String getCaloriasPorcion(){
        return this.caloriasPorcion;
    }
}
