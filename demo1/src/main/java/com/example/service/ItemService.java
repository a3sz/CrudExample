package com.example.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Items;
import com.example.repository.ItemsRepository;
@Service
public class ItemService {
    @Autowired
    ItemsRepository itemsRepository;
    public List<Items> getAllItems() {
        List<Items> items=new ArrayList<Items>();
        itemsRepository.findAll().forEach(items1 -> items.add(items1));
        return items;
    }
public Items getItemById(int id) {
        return itemsRepository.findById(id).get();
}
public void saveOrUpdate(Items items){
        itemsRepository.save(items);
}
}
