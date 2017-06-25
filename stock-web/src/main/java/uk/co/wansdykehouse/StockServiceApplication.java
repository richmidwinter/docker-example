package uk.co.wansdykehouse;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import uk.co.wansdykehouse.health.VoidHealthCheck;
import uk.co.wansdykehouse.resources.StockResource;

public class StockServiceApplication extends Application<StockServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new StockServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "StockService";
    }

    @Override
    public void initialize(final Bootstrap<StockServiceConfiguration> bootstrap) {
        
    }

    @Override
    public void run(final StockServiceConfiguration configuration,
                    final Environment environment) {
    		environment.healthChecks().register("Void", new VoidHealthCheck());
    		environment.jersey().register(new StockResource());
    }
}
