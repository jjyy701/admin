package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMyBatis {

    @Test
    public void testSelectStudentById(){
        StudentDao dao  =  MyBatisUtils.getSqlSession().getMapper(StudentDao.class);

        Student student = dao.selectStudentById(1);

        System.out.println("student="+student);
    }

    @Test
    public void testSelectStudentById1(){
        StudentDao dao  =  MyBatisUtils.getSqlSession().getMapper(StudentDao.class);

        int age = dao.sage("www");

        System.out.println("student="+age);
    }
    @Test
    public void testSelectStudentByI2d1(){
        StudentDao dao  =  MyBatisUtils.getSqlSession().getMapper(StudentDao.class);

        String age = dao.sname(1);

        System.out.println("student="+age);
    }
    @Test
    public void testSelectStu2dentByI2d1(){
        StudentDao dao  =  MyBatisUtils.getSqlSession().getMapper(StudentDao.class);

        Student student = dao.s1(1);

        System.out.println("studentage="+student.getAge());
    }
    @Test
    public void testSelec3tStu2dentByI2d1(){
        StudentDao dao  =  MyBatisUtils.getSqlSession().getMapper(StudentDao.class);
        Student student = new Student();
        //student.setName("13");
        //student.setAge(1);
        List<Student> list = dao.s2(student);
        for (Student s:list) {
            System.out.println(s);
        }
    }

}
