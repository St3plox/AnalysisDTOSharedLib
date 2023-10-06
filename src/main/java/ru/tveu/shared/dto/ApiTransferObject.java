package ru.tveu.shared.dto;

import lombok.Data;

import java.util.List;

@Data
public class ApiTransferObject {

    private final String id;

    private int contentSize;

    private List<ContentObject> content;

}