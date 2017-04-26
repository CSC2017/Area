public class CarDriver {
	  public static void main(String [] args) {

		  Car myCar = new Car();
		  Car hisCar = new Car("gray", "Volks", 400, 3.5);
		  Car herCar = new Car("orange", "Honda", 400, 3.5);

		  System.out.println(myCar);
		  System.out.println(hisCar);
		  System.out.println(herCar);
		  
		  myCar.setColor("blue");
		  hisCar.setColor("blue");
		  herCar.setColor("blue");

		  myCar.setMake("BMW");
		  hisCar.setMake("BMW");
		  herCar.setMake("BMW");

		  myCar.setHorsepower(650);
		  hisCar.setHorsepower(650);
		  herCar.setHorsepower(650);

		  myCar.setEngineSize(5.5);
		  hisCar.setEngineSize(5.5);
		  herCar.setEngineSize(5.5);
		  
		  System.out.println("myCar: " + myCar.getColor() + " " + myCar.getHorsepower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
		  System.out.println("hisCar: " + hisCar.getColor() + " " + hisCar.getHorsepower() + " " +  hisCar.getEngineSize() + " " + hisCar.getMake());
		  System.out.println("herCar: " + herCar.getColor() + " " + herCar.getHorsepower() + " " +  herCar.getEngineSize() + " " + herCar.getMake());
	  }
}
