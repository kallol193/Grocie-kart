package com.Insight_studios.Grociekart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grocie_Item {

    @Id
    private Integer id;


    private String item_name;
    private String item_expDate;
    private String food_grade;
}
