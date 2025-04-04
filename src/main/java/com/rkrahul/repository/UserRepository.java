package com.rkrahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkrahul.component.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData,Long>{

}
