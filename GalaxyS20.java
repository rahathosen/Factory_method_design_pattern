
package factory_method_design_pattern;

public class GalaxyS20 implements Model {
    
    @Override
   public void build() {
       System.out.println("build() method Inside GalaxyS20.");
   }
}
