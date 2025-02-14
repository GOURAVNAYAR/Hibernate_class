package OO_visual_Get;

public class College { // Address

	private Integer id;
	private String name;
	private String city;
	private String zipCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
