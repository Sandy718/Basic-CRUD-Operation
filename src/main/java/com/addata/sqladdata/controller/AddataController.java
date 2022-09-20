package com.addata.sqladdata.controller;

import com.addata.sqladdata.model.Addata;
import com.addata.sqladdata.service.AddataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/data")
public class AddataController {

    @Autowired
    private AddataServiceImpl service;

    @PostMapping("/save")
    public Addata saveData(@RequestBody Addata add){
        return service.insertData(add);
    }

    @GetMapping("/view")
    public List<Addata> showData(){
        return service.showData();
    }

    @GetMapping("/view/{id}")
    public List<Addata> showDataById(@PathVariable("id") int id){
        return service.showDataById(id);
    }

    @PutMapping("/update/{id}")
    public Addata updateData(@PathVariable("id") int id, @RequestBody Addata update){
        return service.updateData(id, update);
    }

    @DeleteMapping("/delete/{id}")
    public void deleted(@PathVariable("id") int id){
        service.deleteData(id);
    }
}
