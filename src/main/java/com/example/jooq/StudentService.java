package com.example.jooq;

import com.example.jooq.sample.Tables;
import com.example.jooq.sample.tables.pojos.Student;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    DSLContext context;

    public List<Student> getStud(){
        return context
                .selectFrom(Tables.STUDENT)
                .fetchInto(Student.class);

    }
    public void insertUser(Student student){
        context
                .insertInto(Tables.STUDENT,Tables.STUDENT.ID,Tables.STUDENT.NAME,
                        Tables.STUDENT.SUBJECT,Tables.STUDENT.MARKS)
                .values(student.getId(), student.getName(), student.getSubject(), student.getMarks())
                .execute();
    }

}
