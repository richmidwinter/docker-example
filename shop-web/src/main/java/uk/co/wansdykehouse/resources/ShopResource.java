package uk.co.wansdykehouse.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uk.co.wansdykehouse.view.StockView;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class ShopResource {

	@GET
	public StockView get() {
		return new StockView();
	}
}
