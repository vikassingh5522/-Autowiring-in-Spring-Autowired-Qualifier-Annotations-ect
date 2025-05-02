package org.example;


import org.Configuration.springSpringConfigurationFile;
import org.sp.beans.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create Spring application context using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(springSpringConfigurationFile.class);

        // Get the Students bean from the context
        Students student = context.getBean(Students.class);

        student.display();
    }
}