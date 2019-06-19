
public class Peppers implements Ingredient {
	 String type="";
	   public Peppers(String typeName) 
	   { 
	       this.type=typeName;
	   } 
	  @Override
	    public void showDetails()  
	    { 
	        System.out.println(type + " Peppers are present on this pizza"); 
	    } 
	} 