package org.example.httpaspectstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TimerAutoConfiguration {

    @Bean
    public TimerAspect timerAspect() {
        return new TimerAspect();
    }
}
