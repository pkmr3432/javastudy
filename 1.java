/*
Constructors
Inheritance
Method Overriding and holding
Polymorphism
Nested
Arguments and wrapping
Arrays
Exception Handling
*/

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
	int average; // km/litre
	String category;
	
	public Car(String _name,int _cc, String _modelNo, int _average, String _category) { // whenever object is created using new for example "new Car()" constructor will be called
		name = _name;
		cc = _cc;
		modelNo = _modelNo;
		average = _average;
		category = _category;
	}
	
	public void printCarDetails() {
		System.out.println("The car " + this.name + " has " + this.cc + " cc and " + this.modelNo + " model no and " + this.average + " average and category is" + this.category);
	}
	
	public int giveFuelRequiredForJourney(int distanceInKm) {
		int fuelRequired = distanceInKm / average;
		System.out.println("Fuel required for " + distanceInKm + "km is " + fuelRequired + "litre");
		return distanceInKm / average;
	}
}

class SuperCar {
	String name;
	int cc;
	String modelNo;
	int average;
	String category;
	String vEngineCategory;
	
	public SuperCar(String _name,int _cc, String _modelNo, int _average, String _category, String _vEngineCategory) { // whenever object is created using new for example "new Car()" constructor will be called
		name = _name;
		cc = _cc;
		modelNo = _modelNo;
		average = _average;
		category = _category;
		vEngineCategory = _vEngineCategory;
	}
	
	public void printCarDetails() {
		System.out.println("---- This is a super car ----");
		System.out.println("The car " + this.name + " has " + this.cc + " cc and " + this.modelNo + " model no and " + this.average + " average and category is" + this.category + "and v engine category is " + this.vEngineCategory);
		System.out.println("-----------------------------");
	}
	
	public int giveFuelRequiredForJourney(int distanceInKm) {
		return distanceInKm / average;
	}
}

class SuperCar1 extends Car { // this is inheritance
	String vEngineCategory;
	public SuperCar1(String _name, int _cc, String _modelNo, int _average, String _category, String vEngineCategory) {
		super(_name, _cc, _modelNo, _average, _category); // calling the constructor of parent class
		this.vEngineCategory = vEngineCategory; // you can write it as vEngineCategory = _vEngineCategory;
	}
	
	public void printCarDetails() { // this method overrides parent pritnCarDetails method
		System.out.println("---- This is a super car ----");
		System.out.println("The car " + this.name + " has " + this.cc + " cc and " + this.modelNo + " model no and " + this.average + " average and category is" + this.category + "and v engine category is " + this.vEngineCategory);
		System.out.println("-----------------------------");
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
		
		String car6 = "lamborgani";
		int car6CC = 3000;
		String car6ModelNo = "xyz";
		int car6Average = 3;
		String car6category = "supercar";
		String vengineVersion = "v8";
		
		
		System.out.println("The car " + car1 + " has " + car1CC + " cc and " + car1ModelNo + " model no and " + car1Average + " average");
		System.out.println("The car " + car2 + " has " + car2CC + " cc and " + car2ModelNo + " model no and " + car2Average + " average");
		System.out.println("The car " + car3 + " has " + car3CC + " cc and " + car3ModelNo + " model no and " + car3Average + " average");
		System.out.println("The car " + car4 + " has " + car4CC + " cc and " + car4ModelNo + " model no and " + car4Average + " average");
		System.out.println("The car " + car5 + " has " + car5CC + " cc and " + car5ModelNo + " model no and " + car5Average + " average");
		System.out.println("The car " + car6 + " has " + car6CC + " cc and " + car6ModelNo + " model no and " + car6Average + " average and category is" + car6category);
		
		
		Car swift = new Car("swift", 1200, "lxi", 20, "normal");
		swift.printCarDetails();
		swift.giveFuelRequiredForJourney(100);
		new Car("nexon", 1200, "lxi", 20, "normal").printCarDetails();
		new Car("honda", 1200, "lxi", 20, "normal").printCarDetails();
		new Car("innova", 1200, "lxi", 20, "normal").printCarDetails();
		new Car("safari", 1200, "lxi", 20, "normal").printCarDetails();
		new Car("lamborghani", 3000, "lxi", 2, "supercar").printCarDetails();
		
		new SuperCar("lamborghani", 1200, "lxi", 20, "supercar", "v8").printCarDetails();
		
		SuperCar1 lamb = new SuperCar1("lamborghani", 3000, "lxi", 2, "supercar", "v8");
		lamb.printCarDetails();
		lamb.giveFuelRequiredForJourney(100);            

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
	
	
	
	
/**
 * 
 * Create subclasses for following:
 * 
 * Animal: Reptile, Domestic
 * Clothing: Winterwear, MensWear  
 * Person: Worker, Businessman
 * 
 * // read about inheritance, overriding methods
 * 
 * 
 */
	
	
---------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	class Report{  
    void report(){System.out.println("Medical Report Of the Person");}  
    }  
    class Ramesh extends Report{  
    void status1(){System.out.println("Ramesh is Mentally Ill");}  
    
    }  
    class Suresh extends Ramesh{  
    void status2(){System.out.println("Suresh is Mentally Fit");}   
    }  
    class Person{  
    public static void main(String args[]){  
    Suresh s=new Suresh();
    s.report();  
    s.status1();  
    s.status2();    
    }}  

-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	class Cloth{  
    void sale(){System.out.println("End season sale");}  
    }  
    class MensWear extends Cloth{  
    void winter(){System.out.println("50% of on WinterWears");}  
    
    }  
    class WomensWear extends MensWear{  
    void summer(){System.out.println("80% of on SummerWears");}   
    }  
    class Clothing2{  
    public static void main(String args[]){  
    WomensWear w=new WomensWear();
    w.sale();  
    w.winter();  
    w.summer();    
    }}  

---------------------------------------------------------------------------------------------------------------------------------------------------------
	
	class Animal{  
    void eat(){System.out.println("all are eating...");}  
    }  
    class Dog extends Animal{  
    void domestic(){System.out.println("Dog is a Domestic animal");}  
    }  
    class Lion extends Dog{  
    void wild(){System.out.println("lion is a wild animal");}  
    }  
    class Animal2{  
    public static void main(String args[]){  
    Lion l=new Lion();  
    l.domestic();  
    l.wild();  
    l.eat();  
    }}  

-----------------------------------------------------------------------------------------------------------------------------------------------------------
