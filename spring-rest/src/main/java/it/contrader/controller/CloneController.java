package it.contrader.controller;

import it.contrader.service.CloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clone")
@CrossOrigin(origins = "http://localhost:4200")
public class CloneController {
    @Autowired
    private CloneService cloneService;
}
