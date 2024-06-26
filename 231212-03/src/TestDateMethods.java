import java.util.Calendar;

public class TestDateMethods {
	public static void main(String[] args) {
		// 현재 시간을 가지는 Calendar 인스턴스 생성 
		Calendar cal = Calendar.getInstance();
		
		// (int 변경하고자하는필드, int 값)
		cal.set(Calendar.DAY_OF_MONTH, 13);
		// (int 년, int 월, int 일)
		cal.set(2023, Calendar.DECEMBER, 13);
		
		                                    //요일 호출 
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek == Calendar.WEDNESDAY);
		
		//년도 호출
		int year = cal.get(Calendar.YEAR); 
		System.out.println(year);
		
		// Calendar 월을 0부터 ~ 11
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		// 해당 월의 마지막 날짜
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
	}
}
