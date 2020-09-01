package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    Student selectStudentById(Integer id);

    public int sage(String name);

    String sname(int id);
    Student s1(int id);
    List<Student> s2(Student student);
}
