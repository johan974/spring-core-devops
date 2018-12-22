package guru.springframework.controllers;

import guru.springframework.johan.properties.JohanProperties;
import guru.springframework.johan.properties.JohanProperties2;
import guru.springframework.profile.properties.FakeDataSource;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JohanController {
    private JohanProperties johanProperties;
    private JohanProperties2 johanProperties2;
    private FakeDataSource fakeDataSource;

    @Autowired
    public JohanController( JohanProperties johanProperties, JohanProperties2 johanProperties2, FakeDataSource fakeDataSource) {
        this.johanProperties2 = johanProperties2;
        this.fakeDataSource = fakeDataSource;
    }

    @RequestMapping("/johan")
    public String getJohanProperties(){
        return "{ \"firstname\":\"" + johanProperties.getFirstname() + "\",\"lastname\":\"" + johanProperties.getLastname() + "\"}";
    }
    @RequestMapping("/johan2")
    public String getJohanProperties2(){
        return "{ \"firstname\":\"" + johanProperties.getFirstname() + "\",\"lastname\":\"" + johanProperties.getLastname() + "\"}";
    }
    @RequestMapping("/johanprop")
    public String getJohanFakeDataSource(){
        return "{ \"datasource\":\"" + fakeDataSource.getConnectionInfo() + "\"}";
    }
}
