package com.mindtree.cart.dao;

import com.mindtree.cart.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDAO extends CrudRepository<Book,Integer> {
}
