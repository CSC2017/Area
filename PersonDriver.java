public class PersonDriver {
	    public static void main(String [] args) {
		    
		    Person person = new Person();

	            System.out.println(person.getAge());
		    System.out.println(person.getName());

		    Person mike = new Person("Mike",24);
		    Person peter = new Person("peter", 23);
		    
		    System.out.println(mike.getAge());
	            System.out.println(mike.getName());
		    System.out.println(peter.getAge());
		    System.out.println(peter.getName());
		    System.out.println(peter);
		    System.out.println(mike);

		    if(mike.getName().equals(peter.getName()) && mike.getAge()== peter.getAge()){
			    System.out.println(true);
		    }else{
			    System.out.println(false);
		    }
		    
		    if (mike.getName().equals(peter.getName())){
			    System.out.println(true);
		    }else{
			    System.out.println(false);
		    }
		    
		    if (mike.getAge()==peter.getAge()){
			    System.out.println(true);
		    }else{
			    System.out.println(false);
		    }
		    
		    if (mike.getAge() > peter.getAge()){
			    System.out.println("Mike is older than Peter");
		    }else{
			    System.out.println("Peter is older than Mike ");
		    }
		    
		    if (mike.getAge() < peter.getAge()){
			    System.out.println("Mike is yonger than Peter");
		    }else{
			    System.out.println("Peter is yonger than Mike ");
		    }
	    }
}

