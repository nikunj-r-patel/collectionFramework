package collectionFramework;

public class Employee {
	
	int idNo;
	String name,address;
	
	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(int idNo, String name, String address) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [idNo=" + idNo + ", name=" + name + ", address=" + address + "]";
	}
	

}
