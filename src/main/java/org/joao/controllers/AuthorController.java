package org.joao.controllers;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.joao.entities.Author;
import org.joao.services.AuthorService;
import org.joao.services.CollectionItemService;

import java.util.List;

@Path("/author")
public class AuthorController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Author> getAll(){
        return Author.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response set(Author author) {
       return AuthorService.persistREST(author);
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public Response deleteById(@PathParam("id") Long id){
        return CollectionItemService.removeByIdREST(id);
    }
}
