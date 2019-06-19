public class Pizza {
   private String Size;
   private String Crust;
   private boolean extraCheese;
   
   public Pizza(String s,String c,boolean ec) {
	   this.Size=s;
	   this.Crust=c;
	   this.extraCheese=ec;
   }
   
   public String getSize() {
      return Size;
   }
   
   public void setSize(String s) {
      this.Size = s;
   }
   
   public String getCrust() {
      return Crust;
   }
   
   public void setCrust(String c) {
      this.Crust = c;
   }
   
   public boolean getExtraCheese() {
	      return extraCheese;
	   }
	   
	   public void setExtraCheese(boolean ec) {
	      this.extraCheese = ec;
	   }
   
}