package thisandsuper;

public class Vehicle {
	int maxSpeed = 120;
	}

	class Car extends Vehicle
	{
		int maxSpeed = 180;

		void display()
		{
			System.out.println("Maximum Speed: " + super.maxSpeed);
		}
	}

	class Test_Class
	{
		public static void main(String[] args)
		{
			Car small = new Car();
			small.display();
		}
}
