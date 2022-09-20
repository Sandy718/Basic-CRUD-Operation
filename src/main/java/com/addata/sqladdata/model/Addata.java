package com.addata.sqladdata.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Addata {

    @Id
    @NonNull
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String department;

    private String mobile;
    private String salary;
}
