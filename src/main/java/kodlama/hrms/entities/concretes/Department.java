package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="department_name")
	
	private String DepartmentName;
	
	
	public Department(int id, String departmentName) {
		super();
		this.id = id;
		DepartmentName = departmentName;
	}
	
	public Department() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

}
