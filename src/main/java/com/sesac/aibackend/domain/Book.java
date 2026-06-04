package com.sesac.aibackend.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

    private Long id;
    private String title;
    private String author;
    private String description;
    private String rating;
}
