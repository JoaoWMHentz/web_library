package org.joao.services;

import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.joao.entities.Bookcase;

public class BookcaseService {
    @Transactional()
    public static Response persistREST(Bookcase bookcase){
        try {
            Bookcase.persist(bookcase);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }

    @Transactional()
    public static Response removeRest(Bookcase bookcase){
        if (!(bookcase.id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Bookcase.deleteById(bookcase.id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }

    @Transactional()
    public static Response removeByIdRest(Long id){
        if (!(id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Bookcase.deleteById(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}