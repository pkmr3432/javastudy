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



-----------------------------------------------------------------------------------------------
	
	
	
	class Animal{
    String name;
    int weight;
    String place;

    public Animal(
        String _name, int _weight, String _place
    )
    {
    name = _name;
    weight = _weight;
    place = _place;
    }

    public void printAnimalDetails(){
        System.out.println("The Weight Of " + this.name + " is " + this.weight +"kg and they belongs from " + this.place);
    }

    public class Main{
        public static void main(String[] args) {
        
            new Animal("Cheeta", 54, "Saharah-Africa").printAnimalDetails();
            new Animal("Elephant", 5000, "Africa").printAnimalDetails();
            new Animal("Giraff", 45, "Savannahs-Africa").printAnimalDetails();
                }
        
        }
}



-----------------------------------------------------------------------------------------------------------------------------------
	
	class Birds{
    String name;
    int age;
    
    public Birds(
        String _name, int _age
    )
    {
    name = _name;
    age = _age;
    }

    public void printBirdsDetails(){
        System.out.println("The name of Bird is " + this.name + " and its age is  " + this.age);
    }

    public class Main{
        public static void main(String[] args) {
        
            new Birds("Parrot", 54).printBirdsDetails();
            new Birds("Duck", 59).printBirdsDetails();
            new Birds("Kite", 50).printBirdsDetails();
                }
        
        }
}

------------------------------------------------------------------------------------------------------------------------------------
	
	class Laptop{
    String name;
    int model;
    int price;

    public Laptop(
        String _name, int _model, int _price
    )
    {
    name = _name;
    model = _model;
    price = _price;
    }

    public void printLaptopDetails(){
        System.out.println("The name of laptop is " + this.name + " ,model " + this.model +" and the price is " + this.price);
    }

    public class Main{
        public static void main(String[] args) {
        
            new Laptop("Lenovo", 5462, 32000).printLaptopDetails();
            new Laptop("Dell", 3521, 55000).printLaptopDetails();
            new Laptop("Asus", 505, 78000).printLaptopDetails();
                }
        
        }
}

---------------------------------------------------------------------------------------------------------------------------------------
	
	class Mobile{
    String name;
    int model;
    int price;

    public Mobile(
        String _name, int _model, int _price
    )
    {
    name = _name;
    model = _model;
    price = _price;
    }

    public void printMobileDetails(){
        System.out.println("Mobile name is  " + this.name + " ,model " + this.model +" and the price is " + this.price);
    }

    public class Main{
        public static void main(String[] args) {
        
            new Mobile("IPhone", 6, 32000).printMobileDetails();
            new Mobile("Nokia", 6600, 55000).printMobileDetails();
            new Mobile("Samsung", 5230, 78000).printMobileDetails();
                }
        
        }
}

--------------------------------------------------------------------------------------------------------------------------------------------------
