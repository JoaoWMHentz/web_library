package org.joao.services;

import org.joao.entities.Category;
import org.joao.entities.CollectionItem;
import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class CollectionItemService {
    @Transactional()
    public static Response persistREST(CollectionItem collectionItem){
         try {
            Category.persist(collectionItem);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
    @Transactional()
    public static Response removeREST(CollectionItem collectionItem){
        if (!(collectionItem.id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
         try {
            Category.deleteById(collectionItem.id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
    @Transactional()
    public static Response removeByIdREST(Long id){
        if (!(id>0)) return Response.status(Response.Status.PARTIAL_CONTENT).entity(ResponsesEnum.ID_NOT_FOUND.getText()).build();
         try {
            Category.deleteById(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}