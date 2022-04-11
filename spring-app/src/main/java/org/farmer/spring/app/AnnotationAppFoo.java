package org.farmer.spring.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * A foo for {@link org.springframework.context.annotation.AnnotationConfigApplicationContext}.
 *
 * @author wuwenjun
 * @since 2022.04.11
 */
@Slf4j
public class AnnotationAppFoo {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationAppFoo().createContext();
    context.registerShutdownHook();
  }

  private AnnotationConfigApplicationContext createContext() {
    return new AnnotationConfigApplicationContext(AnnotationConfigFoo.class);
  }
}
