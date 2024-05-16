package com.Insight_studios.Grociekart.controller;

import com.Insight_studios.Grociekart.entity.Grocie_Item;
import com.Insight_studios.Grociekart.repository.Grocie_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/grocie")
public class Grocie_Controller {

    @Autowired
    Grocie_repo grocie_repo;

    @GetMapping("/getItem")
    public List<Grocie_Item> getItem()
    {

        return grocie_repo.findAll();

    }

    @GetMapping("/getItem/{id}")
    public ResponseEntity<Grocie_Item> getItemById(@PathVariable Integer id) {
        return grocie_repo.findById(id)
                .map(item -> ResponseEntity.ok(item)) // Return item with OK status
                .orElseGet(() -> ResponseEntity.notFound().build()); // Return not found
    }


    @PostMapping("/postItem")
    public void  postItem(@RequestBody Grocie_Item grocie_item){
         grocie_repo.save(grocie_item);
    }


    @PutMapping("/updateItem")
    public void updateItem(@RequestBody Grocie_Item grocie_item ){


        Grocie_Item data = grocie_repo.findById(grocie_item.getId()).orElse(null);
        System.out.println(data);

        if(data!= null)
        {

            data.setItem_name(grocie_item.getItem_name());
            data.setItem_expDate(grocie_item.getItem_expDate());
            data.setFood_grade(grocie_item.getFood_grade());

            grocie_repo.save(data);
        }
    }

    //delete's value by id
    @DeleteMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable Integer id){
        grocie_repo.deleteById(id);
    }
}
