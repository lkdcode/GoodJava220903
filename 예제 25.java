public class Main {
	static short getNumber() {
		return (short) (Math.random() * 45 + 1);
			// Math.random() 메소드는. 0.0부터 1.0 미만의 실수 중 하나를
			// 임의로 변환한다. 이 숫자에 45를 곱하면 0.0부터 45.0 미만이므로 1을 더하여
			// 1~45 중에서 하나가 나오도록 했다.
	}

	public static void main(String[] args) {
		short[] lotto = { 0, 0, 0, 0, 0, 0 };						// 추첨된 숫자를 담을 배열
		short i, k, num;											// 반복 변수 i,k와 뽑힌 숫자를 담을 변수 num
		char dupl = 'N';											// 이미 뽑힌 숫자인지 체크하기 위한 변수

		System.out.printf("** 로또 추첨을 시작합니다.** \n\n");

		for (i = 0; i < 6;) {
			num = getNumber();										// 숫자 1개를 뽑는다

			for (k = 0; k < 6; k++)									// 뽑은 숫자가 기존에 뽑은 숫자와 동일한지 확인하고
				if (lotto[k] == num)								
					dupl = 'Y';										// 동일하면 중복 확인 변수 에 'Y'를 대입한다.

			if (dupl == 'N')										// 뽑은 숫자가 처음 뽑은 것이라면
				lotto[i++] = num;									// 로또 배열에 넣고 i(뽑힌 개수)를 증가 시킨다.
			else													// 아니면 중복 확인 변수에 
				dupl = 'N';											// 'N'을 대입한다.
		}
		System.out.printf("추첨된 로또 번호 ==> ");						// 
		for (i = 0; i < 6; i++) {									// 뽑힌 6개의 숫자 출력
			System.out.printf("%d ", lotto[i]);						// 
		}
	}
}