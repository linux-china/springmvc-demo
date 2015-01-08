package org.mvnsearch.springmvc.applicaiton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring application context
 *
 * @author linux_china
 */
public class AppContext implements ApplicationContextAware{
    /**
     * application context
     */
    private static ApplicationContext appContext;

    /**
     * set application context
     *
     * @param applicationContext application context
     * @throws org.springframework.beans.BeansException
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        appContext = applicationContext;
    }

    /**
     * get Spring application context
     *
     * @return application context
     */
    public static ApplicationContext getAppContext() {
        return appContext;
    }

    /**
     * get spring bean
     *
     * @param beanName bean name
     * @return spring bean
     */
    public static Object getBean(String beanName) {
        return appContext.getBean(beanName);
    }

    /**
     * get spring bean
     *
     * @param beanName bean name
     * @return spring bean
     */
    public static <T> T getBean(String beanName, Class<T> requiredType) {
        return appContext.getBean(beanName, requiredType);
    }


}
