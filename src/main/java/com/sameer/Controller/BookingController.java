package com.sameer.Controller;

import com.sameer.Repository.CustomerRepository;
import com.sameer.Repository.DriverRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/booking")
public class BookingController {

    @Context

    @Inject
    private DriverRepository driverRepository;
    @Inject
    private CustomerRepository customerRepository;

    public BookingController(DriverRepository driverRepository, CustomerRepository customerRepository) {
        this.driverRepository = driverRepository;
        this.customerRepository = customerRepository;
    }

    @GET
    @Path("/details")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {
        return Response.status(200)
                .entity("booking details")
                .build();
    }

}
