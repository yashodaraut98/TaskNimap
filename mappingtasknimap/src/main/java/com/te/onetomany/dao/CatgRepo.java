package com.te.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.onetomany.procat.Categories;

public interface CatgRepo extends JpaRepository<Categories, Integer>{

}
