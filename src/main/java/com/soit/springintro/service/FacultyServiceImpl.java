package com.soit.springintro.service;

import com.soit.springintro.dao.FacultyRepository;
import com.soit.springintro.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {

    private FacultyRepository facultyRepository;

    @Autowired
    public FacultyServiceImpl(FacultyRepository theFacultyRepository){
        facultyRepository = theFacultyRepository;

    }

    @Override
    public List<Faculty> findAll() {
        return facultyRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Faculty findById(int theId) {
        return facultyRepository.findById(theId).get();
    }

    @Override
    public void save(Faculty theFaculty) {
        facultyRepository.save(theFaculty);
    }

    @Override
    public void deleteById(int theId) {

    }
}
