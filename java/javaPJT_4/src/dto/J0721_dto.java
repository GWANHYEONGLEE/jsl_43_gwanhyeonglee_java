package dto;

public class J0721_dto {
	String no, name, depart, position;
	int age;
	public J0721_dto(String no, String name, String depart, String position, int age) {
		super();
		this.no = no;
		this.name = name;
		this.depart = depart;
		this.position = position;
		this.age = age;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}
	public String getPosition() {
		return position;
	}
	public int getAge() {
		return age;
	}
}
