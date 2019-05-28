package com.yuer.ssm.dao;



import com.yuer.ssm.bean.Student;

import java.util.List;

public interface IStudentDAO {

    public List<Student> searchAll();
}
