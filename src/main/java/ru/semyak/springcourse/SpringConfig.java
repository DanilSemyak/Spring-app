package ru.semyak.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.semyak.springcourse")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

}
