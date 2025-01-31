package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.PlayCard;

@Repository("playcardDao")
public interface PlaycardDao extends JpaRepository<PlayCard, Integer> {

}
