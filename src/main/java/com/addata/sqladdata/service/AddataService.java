package com.addata.sqladdata.service;

import com.addata.sqladdata.model.Addata;
import com.addata.sqladdata.repository.AddataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public class AddataService implements CommandLineRunner {


    AddataRepo repos;


    // Hard Inserting the data into the table
//     which is good for testing but ideal for performing CRUD Operation
    @Override
    public void run(String... args) throws Exception{
        repos.saveAll(List.of(
                new Addata(1001, "Sandeep", "Deputy Manager IT", "3768248776", "800000"),
                new Addata(1002, "Vishal", "Deputy Manager IT", "78364868273", "800000"),
                new Addata(1003, "Arun", "Deputy Manager IT", "2387467233", "800000"),
                new Addata(1004, "ABC", "Senior Manager", "9847937473", "1200000")
        ));
    }

    public void getdata(){

    }
}
