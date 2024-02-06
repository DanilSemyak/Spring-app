package ru.semyak.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("init yes");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy yes");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}