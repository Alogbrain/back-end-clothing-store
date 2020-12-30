package com.annguyen.clothingstore.service;

import com.annguyen.clothingstore.model.entity.Collection;
import com.annguyen.clothingstore.model.entity.Item;

import java.util.List;

public interface CollectionService {
    List<Collection> getCollections();
    void checkOutCart(List<Item> itemsCart);
}
