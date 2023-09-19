package org.joao.controllers;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.joao.entities.Category;
import org.joao.services.CategoryService;

import java.util.List;
@Path("/category")
public class CategoryController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> getAll() {
        return Category.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response set(Category category) {
       return CategoryService.PersistREST(category);
    }
}


