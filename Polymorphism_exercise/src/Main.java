
public class Main {

	public static void main(String[] args) {
		Car car = new Car(8, "supercar");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		ford tuff = new ford(1, "truck");
		System.out.println(tuff.startEngine());
		System.out.println(tuff.accelerate());
		System.out.println(tuff.brake());
		
		nissan rouge = new nissan(4, "gtr");
		System.out.println(rouge.startEngine());
		System.out.println(rouge.accelerate());
		System.out.println(rouge.brake());
		
		jaguar f12 = new jaguar(1, "f type");
		System.out.println(f12.startEngine());
		System.out.println(f12.accelerate());
		System.out.println(f12.brake());
	}

}
