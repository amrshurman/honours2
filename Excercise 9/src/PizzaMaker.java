import java.util.ArrayList; 
import java.util.List; 
  
public class PizzaMaker implements Ingredient 
{ 
    private List<Ingredient> ingredientList = new ArrayList<Ingredient>(); 
       
    @Override
    public void showDetails()  
    { 
        for(Ingredient i:ingredientList) 
        { 
            i.showDetails(); 
        } 
    } 
       
    public void addIngredient(Ingredient i) 
    { 
    	ingredientList.add(i); 
    } 
       
    public void removeIngredient(Ingredient i) 
    { 
    	ingredientList.remove(i); 
    } 
} 