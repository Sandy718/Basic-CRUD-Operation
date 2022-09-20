package com.addata.sqladdata.service;


import com.addata.sqladdata.model.Addata;
import java.util.List;

public interface IAddataService {

    // Creating Table(C in Crud Operation)
    Addata insertData(Addata add);

    // Reading Data from Table(R in CRUD Operation)
    List<Addata> showData();

    // Updating Data in Table by id(U in CRUD Operation)
    Addata updateData(int id, Addata update);

    // Deleting Data from Table by id(D in CRUD operation)
    void deleteData(int id);
}
