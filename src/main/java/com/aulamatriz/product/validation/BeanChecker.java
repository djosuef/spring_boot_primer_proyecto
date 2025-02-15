package com.aulamatriz.product.validation;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


//Esta Clase revisa que Spring esté detectando la configuracion del Bean productRepository en el contexto
@Component
public class BeanChecker {

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void checkBeans() {
        System.out.println("¿Repositorio encontrado? " + context.containsBean("productRepository"));
    }
}
