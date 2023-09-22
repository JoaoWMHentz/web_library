package org.joao.services;


import org.joao.entities.Category;
import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class CategoryService {
    @Transactional()
    public static Response persistREST(Category category){
        try {
            Category.persist(category);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }

    @Transactional()
    public static Response removeREST(Category category){
        if (!(category.id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Category.deleteById(category.id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.OK).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    } 
    
    @Transactional()
    public static Response removeByIdREST(Long id){
        if (!(id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
        try {
            Category.deleteById(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.OK).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    } 
}
