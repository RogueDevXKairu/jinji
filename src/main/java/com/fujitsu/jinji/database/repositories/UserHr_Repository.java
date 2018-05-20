package com.fujitsu.jinji.database.repositories;

import com.fujitsu.jinji.models.UserHR_Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserHr_Repository extends JpaRepository<UserHR_Model,String> {
    public List<UserHR_Model> findByHrAccountStatus(String status);
}
