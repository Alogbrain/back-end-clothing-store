package com.annguyen.clothingstore.web;

import com.annguyen.clothingstore.model.entity.Collection;
import com.annguyen.clothingstore.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    public CollectionService collectionService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Collection> getCollections() {
        return collectionService.getCollections();
    }
}
