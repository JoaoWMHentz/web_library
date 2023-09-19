package org.joao.services;

import org.joao.entities.Book;
import org.joao.enuns.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class BookService {
    @Transactional()
    public static Response PersistREST(Book book){
        try {
            Book.persist(book);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}
