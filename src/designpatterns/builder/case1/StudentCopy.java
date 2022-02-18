package designpatterns.builder.case1;

import java.security.InvalidParameterException;
import java.util.Map;


public class StudentCopy {
    private String name;
    private int age;
    private String phone;
    private String batch;
    private String email;
    private String password;

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }


    public static class StudentBuilder {
        private StudentCopy student = new StudentCopy();


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

        public StudentCopy clone(StudentCopy student) {
            StudentCopy studentCopy = new StudentCopy();
            studentCopy.name = student.name;
            studentCopy.age = student.age;
            studentCopy.batch = student.batch;

            return studentCopy;
        }

        public StudentCopy build() {
            if (student.age < 18) {
                throw new InvalidParameterException();
            }

            if (student.name == null) {
                throw new NullPointerException();
            }

            if (student.phone == null) {
                throw new RuntimeException("Phone number doen't exist");
            }

            return clone(student);
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
