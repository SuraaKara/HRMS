package kodlama.hrms.business.abstracts;

import java.util.List;

import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.entities.concretes.Department;

public interface DepartmentService {
	
	DataResult<List<Department>>  getAll();

}
