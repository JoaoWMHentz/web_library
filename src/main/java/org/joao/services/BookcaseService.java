package org.joao.services;

import org.joao.enuns.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class BookcaseService {

    @Transactional()
    public static Response PersistREST(BookService bookService){
        try {
            org.joao.entities.Bookcase.persist(bookService);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}