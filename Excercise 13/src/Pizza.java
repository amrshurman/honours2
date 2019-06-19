
public class Pizza {
	 private State state;
	 String type="";

	   public Pizza(String n){
		   type=n;
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}
