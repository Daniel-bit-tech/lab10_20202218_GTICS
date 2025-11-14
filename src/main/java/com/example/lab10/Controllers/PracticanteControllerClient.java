package com.example.lab10.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;


@Controller
public class PracticanteControllerClient {

    @Autowired
    RestTemplate restTemplate;
    private final String API_URL = "http://localhost:8081/practicantes";


}
