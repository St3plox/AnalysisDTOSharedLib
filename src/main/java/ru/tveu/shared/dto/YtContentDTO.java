package ru.tveu.shared.dto;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class YtContentDTO extends ContentDTO {

    private String authorDisplayName;

    private String publishedAt;


    public YtContentDTO(String id, String content, String authorDisplayName, String publishedAt) {
        super(id, content);
        this.authorDisplayName = authorDisplayName;
        this.publishedAt = publishedAt;

    }

}