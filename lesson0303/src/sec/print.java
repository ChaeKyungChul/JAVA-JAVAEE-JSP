package sec;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 123;
		System.out.printf("상품의 가격은 %d 원입니다.\n", value);
		System.out.printf("상품의 가격은 %6d 원입니다.\n", value);
		System.out.printf("상품의 가격은 %-6d 원입니다.\n", value);
		System.out.printf("상품의 가격은 %06d 원입니다.\n", value);
		
		double area = 3.14159 * 10 *10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String name ="홍길동";
		String job ="도둑놈";
		System.out.printf("%d | %-10s |%10s=n", 1, name, job);
	}

}
