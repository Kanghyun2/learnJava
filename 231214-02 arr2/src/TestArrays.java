import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 5 };
		
		System.out.println(Arrays.toString(num));
		
		int[] copy = Arrays.copyOf(num, 4); // 복사
		System.out.println(Arrays.toString(copy));
		
		int[] copy1 = Arrays.copyOf(num, 3); // 줄여도 출력가능
		System.out.println(Arrays.toString(copy1));
		
		int[] copy2 = Arrays.copyOf(num, 5); // 늘리면 0을 넣어줌 .
		System.out.println(Arrays.toString(copy2));
	}
}
