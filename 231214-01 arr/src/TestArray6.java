
public class TestArray6 {
	// 입력받은 길이 만큼의 정수를 가지는 배열 생성하여 반환하는 정적 메소드
	// 원소의 값은 1, 2, 3 ..........................................................
	public static int[] createIntArray(int length) {
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		return arr;
	}
	
	// 정수와 길이값을 입력받아, 정수의 배수를 길이값 만큼 가지는 배열을 생성 및 반환하는 정적 메소드
	public static int[] createNumbersArray(int num, int length) {
		int [] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num * (i + 1);
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] result = createIntArray(4);
		System.out.println(result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		int[] two = createNumbersArray(2, 10);
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i]);
		}
	}
}
