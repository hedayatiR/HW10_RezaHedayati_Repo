package ir.maktabsharif.model.Student.dao;


import ir.maktabsharif.core.dao.BaseDAO;
import ir.maktabsharif.model.Student.Student;

import java.util.List;

public interface StudentDAO extends BaseDAO<Student> {
    List<Student> findByName(String name);
    List<Student> findByNameCriteria(String name);
    List<Student> notResidentsOfCity(String city);
}
