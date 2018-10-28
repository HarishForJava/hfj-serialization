package com.hfj.serialization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfj.serialization.model.SerializedEnjoyer;
/**
 * @author HFJ
 *
 */
public interface EnjoyerRepository extends JpaRepository<SerializedEnjoyer, Integer> {
}
