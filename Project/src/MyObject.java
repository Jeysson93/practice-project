import java.util.ArrayList;

public class MyObject {

	public static void printHello(String name) {
		if (name == "Jeysson") {
			System.out.println("hey " + name);
		}

		else if (name == "Pablo") {
			System.out.println("What's up " + name);
		}

		else {
			System.out.println("Hello " + name);
		}

	}

	public static void addTwoNumbers(int numberOne, int numberTwo) {
		int sum = numberOne + numberTwo;
		System.out.println(numberOne + "+" + numberTwo + "=" + sum);
	}

	
	public static void main(String[] args) {

		Person pablo = new Person();
		pablo.name = "Pablo";
		pablo.age = 21;
		pablo.isMale = true;
		
		Person kendy = new Person();
		kendy.name = "Kendy";
		kendy.age = 26;
		kendy.isMale = false;
		
		Person ivan = new Person();
		ivan.name = "Ivan";
		ivan.age = 40;
		ivan.isMale = true;

		Person jeysson = new Person();
		jeysson.name = "Jeysson";
		jeysson.age = 24;
		jeysson.isMale = true;
		jeysson.allFriends = new ArrayList<Person>();
		jeysson.allFriends.add(ivan);
		jeysson.allFriends.add(pablo);
		jeysson.allFriends.add(kendy);

		for (Person friend : jeysson.allFriends) {
			System.out.println(friend.name);
		}
	}

	
}
