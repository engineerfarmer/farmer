package org.farmer.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * A foo for {@link org.springframework.context.annotation.Configuration}.
 *
 * @author wuwenjun
 * @since 2022.04.11
 */
@ComponentScan(value = {"org.farmer.spring.app"})
@Configuration(value = "org.farmer.spring.app.AnnotationConfigFoo")
public class AnnotationConfigFoo {}
