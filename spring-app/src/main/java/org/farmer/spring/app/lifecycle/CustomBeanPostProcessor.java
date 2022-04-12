package org.farmer.spring.app.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author wuwenjun
 * @since 2022.04.12 20:12
 */
@Slf4j
@Component(value = "org.farmer.spring.app.lifecycle.customBeanPostProcessor")
public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    log.info("Post process before initialization of '{}'", bean);
    return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("Post process after initialization of '{}'", bean);
    return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
  }

  @Override
  public int getOrder() {
    return 0;
  }
}
