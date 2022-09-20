package com.addata.sqladdata.repository;

import com.addata.sqladdata.model.Addata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddataRepo extends JpaRepository<Addata, Integer> {
}
