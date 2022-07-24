
package factory_method_design_pattern;

public class GalaxyA50 implements Model {
    
    @Override
   public void build() {
      System.out.println("build() method Inside GalaxyA50.");
   }
}
