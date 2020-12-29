package com.annguyen.clothingstore.service.impl;

import com.annguyen.clothingstore.model.entity.Collection;
import com.annguyen.clothingstore.repository.CollectionRepository;
import com.annguyen.clothingstore.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    public CollectionRepository collectionRepository;


    @Override
    public List<Collection> getCollections() {
        return collectionRepository.findAll();
    }
}
