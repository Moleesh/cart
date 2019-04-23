package com.mindtree.cart.dao;

import com.mindtree.cart.entity.Apparal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApparalDAO extends CrudRepository<Apparal, Integer> {
}
