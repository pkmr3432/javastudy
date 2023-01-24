class Cloth {
	void sale() {
		System.out.println("End season sale");
	}
}

class MensWear extends Cloth {
	void winter() {
		System.out.println("50% of on WinterWears");
	}

}

class MensJackets extends MensWear {
	void offersOnJacket() {
		System.out.println("40% of on leather jackets");
	}
}

// Cloth -> MensWear -> MensJackets


/*
 * Cloth - MensWear
 *       - WomensWear
 * 
 * */

class WomensWear extends MensWear {
	void summer() {
		System.out.println("80% of on SummerWears");
	}
}

class Clothing2 {
	public static void main(String args[]) {
		WomensWear w = new WomensWear();
		w.sale();
		w.winter();
		w.summer();
	}
}


