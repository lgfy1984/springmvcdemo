/**
 * Copyright (c) 2013 Tianjian, Inc. All rights reserved.
 * This software is the confidential and proprietary information of 
 * Tianjian, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the 
 * license agreement you entered into with Tianjian.
 */

/**
 * TODO
 * <p>Title: asd.java</p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Tianjian</p>
 * <p>team: TianjianTeam</p>
 * @author: LengJiong
 * @date 2015年12月10日下午9:43:37
 * @version 1.0
 * 
 */
package com.lei.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="usermvc")
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public User(){
        super();
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    
    @Column(name="name",length=32)
    private String name;
    
    @Column(name="age")
    private Integer age;
    
    @Column(name="nice_name",length=32)
    private String nice_name;

    @Override
    public String toString() {
        return "User [id=" + id + ", user_name=" + name + ", age=" + age
                + ", nice_name=" + nice_name + "]";
    }

    public final Long getId() {
        return id;
    }

    public final void setId(Long id) {
        this.id = id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Integer getAge() {
        return age;
    }

    public final void setAge(Integer age) {
        this.age = age;
    }

    public final String getNice_name() {
        return nice_name;
    }

    public final void setNice_name(String nice_name) {
        this.nice_name = nice_name;
    }

}