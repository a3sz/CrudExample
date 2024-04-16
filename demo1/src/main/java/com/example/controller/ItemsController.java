package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Items;
import com.example.service.ItemService;
@RestController
public class ItemsController {
    @Autowired
    ItemService itemService;
    @GetMapping("/item")
    private List<Items> getAllItems(){
        return itemService.getAllItems();
    }
    @GetMapping("/item/{itemId}")
    private Items getItems(@PathVariable("itemId") int itemId){
        return itemService.getItemById(itemId);
    }
    @PostMapping("/items")
    private int saveItem(@RequestBody Items items){
        itemService.saveOrUpdate(items);
        return items.getItemId();
    }
    @PutMapping("/items")
    private Items update(@RequestBody Items items){
        itemService.saveOrUpdate(items);
        return items;
    }

}
