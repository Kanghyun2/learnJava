// 학생
// 국어
// 영어
// 수학
// 이름
// 펜

// 펜
// 가격
class Pen {
	private int price;

	public Pen(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}
	
}

public class Student {
	private int kor;
	private int eng;
	private int math;
	private String name;
	private Pen pen;


	@Override
	public String toString() {
		return "학생 [국어: " + kor + ", 영어: " + eng + ", 수학: " + math + ", 이름 :" + name + ", pen=" + pen + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		if (eng != other.eng) {
			return false;
		}
		if (kor != other.kor) {
			return false;
		}
		if (math != other.math) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public Student(int kor, int eng, int math, String name, Pen pen) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		this.pen = pen;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
