package org.joao.controllers;



import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import org.joao.entities.CollectionItem;
import org.joao.services.CollectionItemService;

@Path("/collectionItem")
public class CollectionItemController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CollectionItem> getAll(){
        return CollectionItem.listAll(null);
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response set(CollectionItem collectionItem){
        return CollectionItemService.PersistREST(collectionItem);
    }
}
