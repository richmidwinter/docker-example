package uk.co.wansdykehouse.health;

import com.codahale.metrics.health.HealthCheck;

public class VoidHealthCheck extends HealthCheck {
    
	@Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
