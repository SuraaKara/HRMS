package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.DepartmentService;
import kodlama.hrms.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmensController {
	
	private DepartmentService departmentService;
	
	@Autowired
	public DepartmensController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@GetMapping("/getall")

	public List<Department> getAll(){
		
		return this.departmentService.getAll();
		
		//yorum satırı
		
		
	}

}
