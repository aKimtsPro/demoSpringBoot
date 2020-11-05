package bstrom.akim.demoSpringBoot.demo.viaComponent.presentation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public interface InterfaceEcriture extends InitializingBean {

    void start();

}
