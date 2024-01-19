package section1;

// 프리미티브 타입이 아닌 변수는 모두 참조변수다
// ex) int[] : 프리미티브 아니므로 참조변수.. 배열형 객체
public class Code01_2 {
	
	// like C lang 구조체
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 first = new Person1();
		first.name = "2름";
		first.number = "123";
		
		Person1 second = first;
		// 객체는 new 명령어에 의해 생긴다
		// second도 first와 같은 객체를 가르킨다

		Person1 [] members = new Person1[100];
		// members[0] 는 주소 참조하고 있어
		members[0] = first;
		members[1] = second;
		/* 참조변수이므로 바로 값을 넣을 수 없어
		members[2].name = "David";
		members[2].number = "2342244";
		member[2] -> null 값
		*/
		
		members[2] = new Person1();
		members[2].name = "David";
			
		
		System.out.println(first.name);
		System.out.println(second.name);
		System.out.println(members[0].name);
		System.out.println(members[2].name);
		
		// 배열 값 넘겨줄 때는 주소 넘겨주므로 그대로 넘겨줄 수 있어
		
		
		
	}

}
