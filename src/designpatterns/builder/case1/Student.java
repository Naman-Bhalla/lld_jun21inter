package designpatterns.builder.case1;

import java.security.InvalidParameterException;
import java.util.Map;

class StudentHelper {
    String name;
    int age;
    String phone;
    String batch;
    String email;
    String password;
}

public class Student {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private String email;
    private String password;

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

//    public Student(String name, int age, String phone, String batch, String email, String password) {
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.batch = batch;
//        this.email = email;
//        this.password = password;
//    } Bad for readability

//    public Student(Map<ParamValues, Object> parameters) {
//        this.name = (String) parameters.get(ParamValues.name);
//        this.age = (int) parameters.get(ParamValues.age);
//
//    }

    public Student(StudentHelper helper) {
        if (helper.age < 18) {
            throw new InvalidParameterException();
        }

        if (helper.name == null) {
            throw  new NullPointerException();
        }
        this.name = helper.name;
        this.age = helper.age;
    }

    private Student() {

    }

    public static class StudentBuilder {
        private Student student = new Student();

        public StudentBuilder setName(String name) {
            student.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            student.age = age;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            student.phone = phone;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            student.batch = batch;
            return this;
        }

        public Student build() {
            if (student.age < 18) {
                throw new InvalidParameterException();
            }

            if (student.name == null) {
                throw new NullPointerException();
            }

            if (student.phone == null) {
                throw new RuntimeException("Phone number doen't exist");
            }

            return student;
        }
    }
}

// Tell me if we know something that is very much like a map, dictionary
// But allows to store values of multiple types
// Class is nothing but a map that can allow to store values of different types
// {
//
//
// }
