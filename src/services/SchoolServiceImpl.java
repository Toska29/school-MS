package services;

import db.SchoolDb;
import exceptions.SchoolNotFoundException;
import models.School;
import models.Student;

import java.util.List;

public class SchoolServiceImpl implements  SchoolService{
    private SchoolDb schoolDb;
    private List<School> schools;

    @Override
    public void add(Student student) {

    }

    @Override
    public void add(School school) {
        schoolDb.add(school);
    }

    @Override
    public void delete(School school) {
        schoolDb.delete(school);
    }

    @Override
    public School update(long id, School newSchool) throws SchoolNotFoundException {
        School OldSchool = schoolDb.findById(id);

        return newSchool;
    }

    @Override
    public School findById(long id) throws SchoolNotFoundException {
        School foundSchool = schoolDb.findById(id);
        if(foundSchool == null){
            throw new SchoolNotFoundException("School with this id is not present");
        }

        return foundSchool;
    }

    @Override
    public List<School> getAll() {
        return schools;
    }
}
