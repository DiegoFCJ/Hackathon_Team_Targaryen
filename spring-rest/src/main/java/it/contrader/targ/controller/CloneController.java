package it.contrader.targ.controller;

import it.contrader.targ.service.CloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clone")
@CrossOrigin(origins = "https://172.30.33.189:8111")
public class CloneController {
    @Autowired
    private CloneService cloneService;
}
