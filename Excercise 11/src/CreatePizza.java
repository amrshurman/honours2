
public class CreatePizza {
private String p;
public CreatePizza(String p) {
	this.p=p;
}
@Override
public String toString() {
    return p + " has been created and is ready to get served.";
}
}
