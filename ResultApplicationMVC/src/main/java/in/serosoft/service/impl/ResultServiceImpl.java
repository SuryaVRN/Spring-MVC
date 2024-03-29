package in.serosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.serosoft.dao.ResultDAO;
import in.serosoft.entity.Result;
import in.serosoft.model.ResultModel;
import in.serosoft.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{
	
	@Autowired
	private ResultDAO resultDAO;

	@Override
	public Boolean create(Result result) {
		return resultDAO.create(result);
	}

	@Override
	public Result findById(Long id) {
		return resultDAO.findById(id);
	}

	@Override
	public List<Result> findAll() {
		return resultDAO.findAll();
	}

	@Override
	public ResultModel calculateResult(Long studentId) {
		// TODO Auto-generated method stub
		return resultDAO.calculateResult(studentId);
	}


}
