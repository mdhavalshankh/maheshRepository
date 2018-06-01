package com.scp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scp.dao.EmpDAO;
import com.scp.model.EmpModel;

@Service
public class EmpService {

	@Autowired
	EmpDAO empDao;
	
	public List<EmpModel> getEmps() {
		
		return empDao.getEmps();
	}

	public void addEmp(EmpModel emp) {
		empDao.addEmp(emp);
		
	}

}
