package day49_Recap_Abstraction;

abstract class shapes {
	
	public abstract void Area();
	
}

abstract class T extends shapes{
	// public abstract void Area();   inherited
}

// concrete
class traingle extends shapes{
	double lenght;
	public traingle(double lenght) {
		this.lenght=lenght;
	}
	
	public  void Area() {
		double area=3*lenght;
	System.out.println(area);
	}
	
}



public class Practice {

public static void main(String[] args) {
	traingle obj=new traingle(6);
	obj.Area();
	
	
	
	
	
	
}

}
