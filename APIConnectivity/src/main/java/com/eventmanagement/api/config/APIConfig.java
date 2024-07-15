package com.eventmanagement.api.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfig {
    @Bean 
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("EventManagement", r -> r
                .path("/*/**")
                .uri("http://localhost:8081"))
//            .route("EventManagement", r -> r
//                .path("/bookings/**")
//                .uri("http://localhost:8081"))
//        	.route("EventManagement", r -> r 
//    			.path("/users/**")
//    			.uri("http://localhost:8081"))
//        	.route("EventManagement", r -> r 
//        			.path("/offers/**")
//        			.uri("http://localhost:8081"))
//        	.route("EventManagement", r -> r 
//        			.path("/halls/**")
//        			.uri("http://localhost:8081"))
        	.build();
    }
	
}
 