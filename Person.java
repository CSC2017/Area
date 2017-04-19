public class Person {

	    String name;
	        int  age =26;
		
		public Person() {
			
			this.name = "John";
		        this.age = 26;
		}
		
		public Person(String name, int age) {
			this.name = name;
		        this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
		
		public String toString(){
			return "Name: " + name +"Age: "+age;
		}
}
