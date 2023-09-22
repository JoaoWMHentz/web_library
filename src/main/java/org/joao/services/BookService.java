package org.joao.services;

import org.joao.entities.Book;
import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class BookService {
    @Transactional()
    public static Response persistREST(Book book){
        try {
            Book.persist(book);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }

    @Transactional()
    public static Response removeREST(Book book){
        if (!(book.id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Book.deleteById(book.id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
    
    @Transactional()
    public static Response removeByIdREST(Long id){
        if (!(id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Book.deleteById(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}
