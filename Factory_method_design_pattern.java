
package factory_method_design_pattern;

public class Factory_method_design_pattern {

    public static void main(String[] args) {
        ModelFactory shapeFactory = new ModelFactory();
      
      Model model1 = shapeFactory.getShape("GalaxyS20");
      model1.build();
      
      Model model2 = shapeFactory.getShape("GalaxyA50");
      model2.build();
      
     Model model3 = shapeFactory.getShape("GalaxyM32");
      model3.build();
    } 
    
}
