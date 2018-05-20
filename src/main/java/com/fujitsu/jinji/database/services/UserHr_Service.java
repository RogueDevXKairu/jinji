package com.fujitsu.jinji.database.services;

import com.fujitsu.jinji.database.repositories.UserHr_Repository;
import com.fujitsu.jinji.models.UserHR_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserHr_Service {
    @Autowired
    private UserHr_Repository userHr_repository;

    public void saveUserHR(UserHR_Model hr_model){
        userHr_repository.save(hr_model);
    }

    public List<UserHR_Model> findAllPending(){
        return  userHr_repository.findByHrAccountStatus("PENDING");
    }
}
