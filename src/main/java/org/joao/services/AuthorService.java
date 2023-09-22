package org.joao.services;

import org.joao.entities.Author;
import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class AuthorService {
    @Transactional()
    public static Response persistREST(Author author){
         try {
            Author.persist(author);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
    @Transactional()
    public static Response removeREST(Author author){
        if (!(author.id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
         try {
            Author.deleteById(author.id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
     @Transactional()
    public static Response removeByIdREST(Long id){
        if (!(id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
         try {
            Author.deleteById(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}