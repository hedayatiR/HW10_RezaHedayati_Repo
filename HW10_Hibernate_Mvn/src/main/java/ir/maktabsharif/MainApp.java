package ir.maktabsharif;

import ir.maktabsharif.model.Address.Address;
import ir.maktabsharif.model.Student.Student;
import ir.maktabsharif.model.Student.dao.StudentDAO;
import ir.maktabsharif.model.Student.dao.StudentDAOImpl;
import ir.maktabsharif.model.Teacher.Teacher;
import ir.maktabsharif.model.Teacher.dao.TeacherDAO;
import ir.maktabsharif.model.Teacher.dao.TeacherDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Address address1 = new Address("Tehran", "Tehran11", "09121435634", "Tarasht1", "111");
        Address address2 = new Address("Shiraz", "Tehran22", "22", "Tarasht2", "222");
        Address address3 = new Address("Tehran", "Tehran33", "33", "Tarasht3", "333");
        Address address4 = new Address("Shiraz", "Tehran44", "09127847902", "Tarasht4", "444");




        // --------- Teacher part ------------------------------------------------

        // create
        TeacherDAO teacherDao = new TeacherDaoImpl(factory);

        Teacher teacher1 = new Teacher("Reza", "Hedayati", 1, 1000, LocalDate.of(1990, 4, 10));
        teacher1.setAddress(address1);
        teacherDao.create(teacher1);
        Teacher teacher2 = new Teacher("Ali", "Ahmadi", 2, 2000, LocalDate.of(2000, 4, 10));
        teacher2.setAddress(address2);
        teacherDao.create(teacher2);
        Teacher teacher3 = new Teacher("Hossein", "Alavi", 33, 3000, LocalDate.of(1960, 4, 10));
        teacher3.setAddress(address3);
        teacherDao.create(teacher3);
        Teacher teacher4 = new Teacher("Naghi", "Imani", 44, 4000, LocalDate.of(1940, 4, 10));
        teacher4.setAddress(address4);
        teacherDao.create(teacher4);

        // all objects are detached now.

        // Teacher queries
        // 1. List of teachers living in Tehran:
        List<Teacher> teachers1 = teacherDao.residentsOfCity("Tehran");
        System.out.println();
        System.out.println();
        System.out.println("List of teachers living in Tehran :");
        System.out.println(teachers1);
        System.out.println();
        System.out.println();

        //2. List of teachers with number starting with 0912 :
        List<Teacher> teachers2 = teacherDao.numberStartWith("0912");
        System.out.println();
        System.out.println();
        System.out.println("List of teachers with number starting with 0912 :");
        System.out.println(teachers2);
        System.out.println();
        System.out.println();

        //2. List of teachers with number starting with 0912 living in Tehran :
        List<Teacher> teachers3 = teacherDao.numberPrefixAndCity("0912", "Tehran");
        System.out.println();
        System.out.println();
        System.out.println("List of teachers with number starting with 0912 living in Tehran :");
        System.out.println(teachers3);
        System.out.println();
        System.out.println();


        // --------- Student part ------------------------------------------------

        // create
        Address address5 = new Address("Tehran", "Tehran55", "55", "Tarasht5", "555");
        Address address6 = new Address("Shiraz", "Tehran66", "66", "Tarasht6", "666");
        Address address7 = new Address("Tehran", "Tehran77", "77", "Tarasht7", "777");
        Address address8 = new Address("Shiraz", "Tehran88", "88", "Tarasht8", "888");
        Address address9 = new Address("Tehran", "Tehran99", "99", "Tarasht9", "999");

        StudentDAO studentDAO = new StudentDAOImpl(factory);

        Student student1 = new Student("Mohammadali", "Rezvani");
        student1.setAddress(address5);
        studentDAO.create(student1);

        Student student2 = new Student("Alimohammad", "Taghavi");
        student2.setAddress(address6);
        studentDAO.create(student2);

        Student student3 = new Student("Mohammad", "Nazari");
        student3.setAddress(address7);
        studentDAO.create(student3);

        Student student4 = new Student("Sara", "Mohammadi");
        student4.setAddress(address8);
        studentDAO.create(student4);

        Student student5 = new Student("Naser", "Abdollahi");
        student5.setAddress(address9);
        studentDAO.create(student5);

        // student queries
        // 4. List of students NOT living in Tehran :
        List<Student> students = studentDAO.notResidentsOfCity("Tehran");
        System.out.println();
        System.out.println();
        System.out.println("List of students NOT living in Tehran :");
        System.out.println(students);
        System.out.println();
        System.out.println();



        factory.close();
    }
}
