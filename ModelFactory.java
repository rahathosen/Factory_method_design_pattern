
package factory_method_design_pattern;

public class ModelFactory {
    public Model getShape(String modelType){
      if(modelType == null){
         return null;
      }		
      if(modelType.equalsIgnoreCase("GalaxyS20")){
         return new GalaxyS20();
         
      } else if(modelType.equalsIgnoreCase("GalaxyA50")){
         return new GalaxyA50();
         
      } else if(modelType.equalsIgnoreCase("GalaxyM32")){
         return new GalaxyM32();
      }
      
      return null;
   }
}
