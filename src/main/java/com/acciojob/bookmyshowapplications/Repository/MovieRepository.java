package com.acciojob.bookmyshowapplications.Repository;

import com.acciojob.bookmyshowapplications.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
