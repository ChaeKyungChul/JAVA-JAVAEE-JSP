package sec03;

import java.util.Scanner;

public class KeycontrolExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0; 
		
		while(run) { 
			System.out.println("------------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-------------------------------");
			System.out.println("����: ");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("���� �ӵ� : " + speed );
				
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			}else if(strNum.equals("3")) {
				run = false;
			}
			
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
	}

}