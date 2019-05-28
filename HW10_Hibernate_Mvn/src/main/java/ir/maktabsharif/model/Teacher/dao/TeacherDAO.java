package ir.maktabsharif.model.Teacher.dao;

import ir.maktabsharif.core.dao.BaseDAO;
import ir.maktabsharif.model.Teacher.Teacher;

import java.util.List;

public interface TeacherDAO extends BaseDAO<Teacher> {
    void deleteByCode(long code);

    List<Teacher> youngOldTeachers();

    List<Teacher> minMaxSalary();

    List<Teacher> residentsOfCity(String city);

    List<Teacher> numberStartWith(String numberPrefix);

    List<Teacher> numberPrefixAndCity(String numberPrefix, String city);

}
