package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.Department;

public interface DepartmentDao extends JpaRepository<Department,Integer>{
	
	

}
