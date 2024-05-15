package com.Insight_studios.Grociekart.repository;

import com.Insight_studios.Grociekart.entity.Grocie_Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Grocie_repo extends MongoRepository<Grocie_Item,Integer> {
}
