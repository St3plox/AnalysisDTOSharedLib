package ru.tveu.shared.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@SuperBuilder
public class ContentDTO {

    private String id;

    private String content;
}