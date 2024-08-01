package com.crio.coderhackV2.entity;


import java.util.List;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="list")
@Data
public class User {
    
    @Id
    private String userId;
    private String username;
    private int score;
    private List<String> badges;

    public User() {
        this.score = 0;
        this.badges = new ArrayList<>();
    }



    
    
    
}
