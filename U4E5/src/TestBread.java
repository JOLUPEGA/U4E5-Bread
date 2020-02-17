
import Bread.Bread;
import SandwichFilling.SandwichFilling;


public class TestBread {

    public static void main(String[] args) {
      Bread bimbo = new Bread();
      SandwichFilling relleno = new SandwichFilling();
      System.out.println(bimbo.panBread("rye", "34"));
      System.out.println(relleno.panFilling("ensalada de huevo", "27"));      
    }
    
}
