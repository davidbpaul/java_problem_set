
public class nissan extends Car{
	public nissan(int cylinders, String name) {
		super(cylinders, name);

	}

	public String startEngine() {
		return "nissan -> startEngine()";
	}

	public String accelerate() {
		return "nissan -> accelerate()";
	}

	public String brake() {
		return "nissan -> brake()";
	}
	
}
