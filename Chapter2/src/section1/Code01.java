package section1;

public class Code01 {
	
	// like C lang 구조체
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 first = new Person1();
		first.name = "2름";
		first.number = "123";
		
		System.out.println(first.name);
		
		// class로 배열 만들 수 있다
		Person1 [] members = new Person1 [10];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		
		System.out.println(members[1].name);
		
		
		
		
	}

}
