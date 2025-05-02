package org.Configuration;


import org.sp.beans.Address;
import org.sp.beans.Students;
import org.sp.beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class springSpringConfigurationFile {

    @Bean
    public Address createAddress() {
        Address address = new Address();
        address.setAddress("Ayush Park");
        address.setCity("Pune");
        address.setZip("1456");
        address.setState("Maharashtra");
        return address;
    }

    @Bean
    public Subject createSubject1() {
        Subject subject = new Subject();
        List<String> list = new ArrayList<String>();
        list.add("math");
        list.add("c++");
        list.add("java");
        list.add("python");
        list.add("php");

        subject.setStudents(list);

        return  subject;

    }
    @Bean
    public Subject createSubject2() {
        Subject subject = new Subject();
        List<String> list = new ArrayList<String>();
        list.add("html");
        list.add("css");
        list.add("js");
        list.add("web");


        subject.setStudents(list);

        return  subject;

    }

    @Bean
    public Students CreateStudents () {

        Students students1 = new Students();
        students1.setName("vikas");
        students1.setAge(22);
        students1.setId(145);

          // students1.setAddress(createAddress());  // manually  DI
        //  students1.setSubject(createSubject());   // manually Di

        return students1;
    }



}
