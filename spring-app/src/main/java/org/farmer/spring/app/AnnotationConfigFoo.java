package org.farmer.spring.app;

import org.farmer.spring.app.annotation.PrimaryConfigFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * A foo for {@link org.springframework.context.annotation.Configuration}.
 *
 * @author wuwenjun
 * @since 2022.04.11
 */
@ComponentScan(value = {"org.farmer.spring.app"})
@Configuration(value = "org.farmer.spring.app.AnnotationConfigFoo")
@Import(value = {PrimaryConfigFoo.class})
public class AnnotationConfigFoo {}
