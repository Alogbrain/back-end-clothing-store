package com.annguyen.clothingstore.repository;

import com.annguyen.clothingstore.model.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
