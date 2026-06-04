package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Book;

public record BookResponse(Long id, String title, String author, String description, int rating) {

    public static BookResponse from(Book book) {
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(), book.getDescription(), book.getRating());
    }
}
