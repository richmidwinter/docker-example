package uk.co.wansdykehouse;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import uk.co.wansdykehouse.health.VoidHealthCheck;
import uk.co.wansdykehouse.resources.ShopResource;

public class ShopApplication extends Application<ShopConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ShopApplication().run(args);
    }

    @Override
    public String getName() {
        return "Shop";
    }

    @Override
    public void initialize(final Bootstrap<ShopConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<ShopConfiguration>());
    }

    @Override
    public void run(final ShopConfiguration configuration,
                    final Environment environment) {
		environment.healthChecks().register("Void", new VoidHealthCheck());
		environment.jersey().register(new ShopResource());
    }

}
