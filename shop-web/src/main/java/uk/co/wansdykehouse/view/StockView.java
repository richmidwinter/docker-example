package uk.co.wansdykehouse.view;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

import io.dropwizard.views.View;

public class StockView extends View {

	public StockView() {
		super("stockview.mustache");
	}

	public int getStockCount() {
		String uri = "http://stock.internal:8080/";
		
		try {
			return Integer.valueOf(Request.Get(uri)
				.execute().returnContent().asString());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			
			return -1;
		}
	}
}
