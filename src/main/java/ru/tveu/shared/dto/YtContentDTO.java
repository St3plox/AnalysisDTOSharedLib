package ru.tveu.shared.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class YtContentDTO extends ContentDTO {

    private String authorDisplayName;

    private Date publishedAt;


    public YtContentDTO(String id, String content, String authorDisplayName, Date publishedAt) {
        super(id, content);
        this.authorDisplayName = authorDisplayName;
        this.publishedAt = publishedAt;

    }

}