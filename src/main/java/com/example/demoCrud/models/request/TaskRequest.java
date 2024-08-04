package com.example.demoCrud.models.request;

import lombok.Data;

@Data
public class TaskRequest {

    private String title;
    private String description;
    private String schoolGroup ;

}
