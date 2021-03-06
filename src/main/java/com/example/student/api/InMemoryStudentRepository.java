package com.example.student.api;
import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
   Map<String,Student> database= new  HashMap<>();
    @Override
    public void save(Student student) {
        //todo:save this student in the database
        database.put(student.id, student);
        System.out.println("student saved in database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }
}
