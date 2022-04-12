package org.farmer.spring.app.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author wuwenjun
 * @since 2022.04.12 20:58
 */
@Component
public class PrimaryDependencyFoo implements PrimaryConfigFoo.PrimaryFooInterface {

  @Resource private PrimaryConfigFoo.PrimaryFooInterface primaryFooInterface;

  @Resource(name = "PrimaryFooInterface.one")
  private PrimaryConfigFoo.PrimaryFooInterface one;

  @Override
  public void execute() {
    this.primaryFooInterface.execute();
    this.one.execute();
  }

  @PostConstruct
  public void init() {
    this.execute();
  }
}
