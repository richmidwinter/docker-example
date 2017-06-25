package uk.co.wansdykehouse.resources;

import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class StockResource {
	
	private static final AtomicInteger stockCount = new AtomicInteger(100); 

	@GET
	public Response getStockCount() {
		return Response.ok().entity(stockCount.get()).build();
	}
}
