package org.example.httpaspectstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "http.aspect", name = "enabled",havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(AspectProperties.class)
public class HttpAspectAutoConfiguration {
}
