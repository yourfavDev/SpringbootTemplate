package org.template.service;

import org.springframework.stereotype.Service;
import org.template.model.PersonModel;

@Service
public class HelloService {
    public String getHello(String name) {
        return "Hello, " + new PersonModel(name).getName();
    }
}
