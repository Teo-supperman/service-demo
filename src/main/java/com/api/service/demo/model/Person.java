package com.api.service.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author tobi
 * @Date : 9/4/2023
 * @Time : 8:05 PM
 */
@Data
@Entity
public class Person {
    @Id
    private String uuid;

    private String fullName;
    private String birthDay;

}
