package bstrom.akim.demoSpringBoot.demo.viaComponent.presentation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("chaine")
public interface InterfaceEcriture extends InitializingBean {

    void start();

}
