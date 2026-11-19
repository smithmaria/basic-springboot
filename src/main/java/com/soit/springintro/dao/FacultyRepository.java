package com.soit.springintro.dao;

import com.soit.springintro.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

    // Method to sort results by last name ascending
    public List<Faculty> findAllByOrderByLastNameAsc();

}
