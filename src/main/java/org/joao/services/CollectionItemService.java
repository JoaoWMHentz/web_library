package org.joao.services;

import org.joao.entities.Category;
import org.joao.entities.CollectionItem;
import org.joao.enums.ResponsesEnum;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

public class CollectionItemService {
    @Transactional()
    public static Response PersistREST(CollectionItem collectionItem){
         try {
            Category.persist(collectionItem);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ResponsesEnum.ERRO.getText() + e.getMessage()).build();
        }
        return Response.status(Response.Status.CREATED).entity(ResponsesEnum.SUCCESSFULLY.getText()).build();
    }
}