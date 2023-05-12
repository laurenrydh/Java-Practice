package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher dylan = new Teacher(1,"Dylan", 100000);
        Teacher lauren = new Teacher(2,"Lauren",500000);
        Teacher pam = new Teacher(3,"Pamela", 80);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(dylan);
        teacherList.add(lauren);
        teacherList.add(pam);


        Student davin = new Student(1,"Davin",12);
        Student cookie = new Student(2,"Cookie",2);
        Student rabbit = new Student(3,"Rabbit",6);
        List<Student> studentList = new ArrayList<>();

        studentList.add(davin);
        studentList.add(cookie);
        studentList.add(rabbit);




        School ghs = new School(teacherList,studentList);

        Teacher greg = new Teacher(6,"Gregan", 900);

        ghs.addTeacher(greg);


        davin.payFees(5000);
        cookie.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        pam.receiveSalary(pam.getSalary());
        System.out.println("GHS has spent for salary to " + pam.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        dylan.receiveSalary(dylan.getSalary());
        System.out.println("GHS has spent for salary to " + dylan.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(cookie);

        lauren.receiveSalary(lauren.getSalary());

        System.out.println(rabbit);


    }
}
