package org.joao.controllers;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.joao.entities.Book;

import org.joao.services.BookService;

import java.util.List;

@Path("/books")
public class BookController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return Book.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postBook(Book book) {
        return BookService.PersistREST(book);
    }
}