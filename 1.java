import javax.swing.JFrame;


class CarTest {
	int x = 5;
	void show (int x1) { // this is void type method returns nothing
		x = x1;
		System.out.println(x);
	}
	int showIntMethod(int x1) { // this is int type method
		x = x1;
		return x;
	}
}

// i have 5 cars = swift, nexon, innova, safari, honda city
// print details of these cars - cc, model no, average


class Car {
	String name;
	int cc;
	String modelNo;
	int average;
	
	public Car(String _name,int _cc,String _modelNo,int _average) { // whenever object is created using new for example "new Car()" constructor will be called
		name = _name;
		cc = _cc;
		modelNo = _modelNo;
		average = _average;
	}
	
	public void printCarDetails() {
		System.out.println("The car " + this.name + " has " + this.cc + " cc and " + this.modelNo + " model no and " + this.average + " average");
	}
}

public class Main {

	public static void main(String[] args) {
//		int y1 = new CarTest().show(10); // this will give error 
		
		int y2 = new CarTest().showIntMethod(20); // this returns a value y2 = 20
		
		
		String car1 = "swift";
		int car1CC = 1200;
		String car1ModelNo = "lxi";
		int car1Average = 20;
		
		String car2 = "nexon";
		int car2CC = 1200;
		String car2ModelNo = "lxi";
		int car2Average = 20;
		
		String car3 = "honda";
		int car3CC = 1200;
		String car3ModelNo = "lxi";
		int car3Average = 20;
		
		String car4 = "innova";
		int car4CC = 1200;
		String car4ModelNo = "lxi";
		int car4Average = 20;
		
		String car5 = "safari";
		int car5CC = 1200;
		String car5ModelNo = "lxi";
		int car5Average = 20;
		
		System.out.println("The car " + car1 + " has " + car1CC + " cc and " + car1ModelNo + " model no and " + car1Average + " average");
		System.out.println("The car " + car2 + " has " + car2CC + " cc and " + car2ModelNo + " model no and " + car2Average + " average");
		System.out.println("The car " + car3 + " has " + car3CC + " cc and " + car3ModelNo + " model no and " + car3Average + " average");
		System.out.println("The car " + car4 + " has " + car4CC + " cc and " + car4ModelNo + " model no and " + car4Average + " average");
		System.out.println("The car " + car5 + " has " + car5CC + " cc and " + car5ModelNo + " model no and " + car5Average + " average");
		
		
		new Car("swift", 1200, "lxi", 20).printCarDetails();
		new Car("nexon", 1200, "lxi", 20).printCarDetails();
		new Car("honda", 1200, "lxi", 20).printCarDetails();
		new Car("innova", 1200, "lxi", 20).printCarDetails();
		new Car("safari", 1200, "lxi", 20).printCarDetails();

		

		//Creating the window with all its awesome snaky features
//		Window f1= new Window();
		
		//Setting up the window settings
//		f1.setTitle("Snake");
//		f1.setSize(300,300);
//		f1.setVisible(true);
//		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}

/**
 * 
 * Create class for following:
 * 
 * Animal
 * Laptop
 * Mobile
 * Bird
 * Food
 * Bike
 * Book
 * Earphone
 * Clothe
 * Person
 * 
 * 
 * 
 * 
 */
