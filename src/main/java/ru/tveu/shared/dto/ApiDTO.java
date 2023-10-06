package ru.tveu.shared.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApiDTO {

    private final String id;

    private int contentSize;

    private List<ContentDTO> content;

}