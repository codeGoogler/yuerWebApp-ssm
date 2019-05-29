package com.yuer.ssm.serviceimpl;

import com.yuer.ssm.bean.Student;
import com.yuer.ssm.dao.IStudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//通过@Service注解定义为一个Service bean
@Service
public class StudentServiceImpl implements StudentService {
    //    自动装配DAO的实例
    @Autowired
    private IStudentDAO studentDAO;

    public List<Student> searchAll() {
        return studentDAO.searchAll();
    }
}