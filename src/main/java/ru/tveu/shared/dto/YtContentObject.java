package ru.tveu.shared.dto;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class YtContentObject extends ContentObject {

    private String authorDisplayName;

    private String publishedAt;


    public YtContentObject(String id, String content, String authorDisplayName, String publishedAt) {
        super(id, content);
        this.authorDisplayName = authorDisplayName;
        this.publishedAt = publishedAt;

    }

}