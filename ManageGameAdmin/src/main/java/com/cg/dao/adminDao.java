package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Admin;

@Repository("adminDao")
public interface adminDao extends JpaRepository<Admin, Integer>{

}
