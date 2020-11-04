package com.sameer.Controller;


import com.sameer.Repository.DriverRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sample")
public class SampleController {
    private DriverRepository driverRepository;

    public SampleController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GET
    @Path("/getIt")
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "Got it!";
    }


}
