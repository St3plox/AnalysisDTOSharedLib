package ru.tveu.shared.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ContentDTO {

    private String id;

    private String content;
}