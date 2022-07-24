
package factory_method_design_pattern;

public class GalaxyM32 implements Model {
    
    @Override
   public void build() {
       System.out.println("build() method Inside GalaxyM32.");
   }
}
