package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.DepartmentService;
import kodlama.hrms.core.utilities.results.DataResult;
import kodlama.hrms.core.utilities.results.SuccessDataResult;
import kodlama.hrms.dataAccess.abstracts.DepartmentDao;
import kodlama.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService {
	
	private DepartmentDao departmentDao;
	
   @Autowired 
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}


	@Override
	public DataResult<List<Department>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll(), "Data listelendi.");
				
			
	}

}
