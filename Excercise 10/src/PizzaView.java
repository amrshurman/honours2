public class PizzaView {
   public void printPizzaDetails(String s, String c,boolean ec){
      System.out.println("Pizza: ");
      System.out.println("Size: " + s);
      System.out.println("Crust: " + c);
      String extraC ="";
      if (ec==false) {
    	  extraC="Not present";
      }
      else {
    	  extraC="present";
      }
      System.out.println("Extra cheese: " + extraC);
   }
}