package designpatterns.builder.case1;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
////        Map<ParamValues, Object> mp = new HashMap<>();
////        mp.put(ParamValues.name, "naman");
////        mp.put(ParamValues.age, 18);
//
//        StudentHelper helper = new StudentHelper();
//        helper.age = 18;
//        helper.name = "Naman";
//
//        Student student = new Student(helper);
//
//
//        Student.StudentBuilder s = Student.getBuilder()
//                .setAge(18)
//                .setName("Naman")
//                .setPhone("1234")
//                .setBatch("Aug21");
//
//        Student s1 = s.build();
//
//        s.setName("Anmol");
//        Student s2 = s.build();

        StudentCopy.StudentBuilder builder = StudentCopy.getBuilder().
                setAge(18)
                .setName("naman")
                .setPhone("1234");

        StudentCopy s1 = builder.build();
        StudentCopy s2 = builder.build();

    }
}

// Journey
// We had a lot of parameters
// Instead of constructor,. we passed a map
// Issues: TypeCasing, Typos
// Solve Typos: Enums
// TypeCasting
// Separate Class
// Code Duplication
// Inner Class

