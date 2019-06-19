public class PizzaController {
   private Pizza p;
   private PizzaView view;

   public PizzaController(Pizza model, PizzaView view){
      this.p = model;
      this.view = view;
   }

   public void setSize(String s){
      p.setSize(s);		
   }

   public String getSize(){
      return p.getSize();		
   }

   public void setCrust(String c){
      p.setCrust(c);		
   }

   public String getCrust(){
      return p.getCrust();		
   }
   
   public boolean getExtraCheese() {
	      return p.getExtraCheese();
	   }
	   
	   public void setExtraCheese(boolean ec) {
	      p.setExtraCheese(ec);
	   }

   public void updateView(){				
      view.printPizzaDetails(p.getSize(), p.getCrust(),p.getExtraCheese());
   }	
}