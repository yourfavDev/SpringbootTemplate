package org.template.service;

import org.springframework.stereotype.Service;
import org.template.model.PersonModel;

@Service
public class HelloService {
    public String getHello(String name) {
        String personName = new PersonModel(name).getName();
        return "{\"content\":\"" + personName + "\"}";
    }
}
