package org.example.httpaspectstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties("http.aspect")
public class AspectProperties {
    private boolean enabled = true;

}
