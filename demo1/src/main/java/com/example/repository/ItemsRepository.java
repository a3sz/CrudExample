package com.example.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.model.Items;
public interface ItemsRepository extends CrudRepository<Items, Integer>{
}
