package ru.tveu.shared.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApiDTO<T extends ContentDTO>{

    private final String id;

    private int contentSize;

    private List<T> content;

}