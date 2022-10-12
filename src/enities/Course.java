package enities;

public class Course {
	private int id;
	private String name;
	private String category;
	private String instructor;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String intructor) {
		this.instructor = intructor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
