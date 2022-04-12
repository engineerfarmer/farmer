package org.farmer.spring.app.injection;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

/**
 * @author wuwenjun
 * @since 2022.04.12 20:53
 */
@Configuration
public class PrimaryConfigFoo {

  interface PrimaryFooInterface {
    void execute();

    @PostConstruct
    default void init() {
      LoggerFactory.getLogger(this.getClass()).info("PrimaryFooInterface bean: {}", this);
    }
  }

  @Bean(value = "PrimaryFooInterface.one")
  public PrimaryFooInterface one() {
    return () -> LoggerFactory.getLogger(this.getClass()).info("娃哈哈");
  }

  @Bean(value = "PrimaryFooInterface.two")
  public PrimaryFooInterface two() {
    return () -> {};
  }

  @Bean
  @Primary
  public PrimaryFooInterface firstBean() {
    return new PrimaryFooInterface() {
      @Override
      public void execute() {
        LoggerFactory.getLogger(this.getClass()).info("first bean");
      }
    };
  }

  @Bean
  public PrimaryFooInterface secondBean() {
    return new PrimaryFooInterface() {
      @Override
      public void execute() {
        LoggerFactory.getLogger(this.getClass()).info("second bean");
      }
    };
  }
}
