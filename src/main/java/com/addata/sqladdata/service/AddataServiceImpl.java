package com.addata.sqladdata.service;

import com.addata.sqladdata.model.Addata;
import com.addata.sqladdata.repository.AddataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AddataServiceImpl implements IAddataService {

    @Autowired
    private AddataRepo repo;


    @Override
    public Addata insertData(Addata add) {
        return repo.save(add);
    }

    @Override
    public List<Addata> showData() {
        return repo.findAll();
    }

    public List<Addata> showDataById(int id){
        return repo.findAllById(Collections.singleton(id));
    }

    @Override
    public Addata updateData(int id, Addata update){
        return repo.save(update);
    }

//    @Override
//    public

    @Override
    public void deleteData(int id) {
        repo.deleteById(id);
    }
}
