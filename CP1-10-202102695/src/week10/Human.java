package week10;

public class Human {
	public static void main(String[] args) {
		Human a = new Human("춘향",18);
		Human b = new Human("몽룡",21);
		Human c = new Human("사또",50);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}
	private String name;
	private int age;
	
	public Human(String name, int age) {	
		setName(name);
		setAge(age);
	}

	public String toString() {		
		return "[name" + "=" + name +", " +"age" + "=" + age + "]";
	}
	
	public String getName() {		return name;}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {		return age;}
	public void setAge(int age) {	
		this.age = age;
	}
	
	
}
class Studant extends Human{
	
	private String major;
	public Studant(String name, int age, String major) {
		super(name, age);
		
	}

	public String getMajor() {	return major;}
	
	public void setMajor(String major) {	
		
	}
	public String toString() {
		return super.toString() + "[major" + "=" + major + "]";
	}
	
	public static void main(String[] args) {
		Studant d = new Studant("명진", 21, "컴퓨터");
		Studant e = new Studant("미현", 22, "경영");
		Studant f = new Studant("용준", 24, "경제");
		
		System.out.println(d.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
	}
	
}
