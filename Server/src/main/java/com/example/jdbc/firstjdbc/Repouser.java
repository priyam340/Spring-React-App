package com.example.jdbc.firstjdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repouser extends JpaRepository<User,Integer>{

}
