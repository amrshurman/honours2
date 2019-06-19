public class Meat implements Ingredient {
	 String types="";
	   public Meat(String typeName1, String typeName2) 
	   { 
	       this.types = typeName1+ " " + typeName2;
	   } 
	  @Override
	    public void showDetails()  
	    { 
	        System.out.println(types + " are present on this pizza"); 
	    } 
	} 