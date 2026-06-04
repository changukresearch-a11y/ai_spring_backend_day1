package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Book;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record BookRequest(
        @NotBlank String title,
        @NotBlank String author,
        @NotBlank String description,
        @Min(0) int rating
) {
    public Book toEntity() { return Book.builder().title(title).author(author).description(description).rating(rating).build();}
}
