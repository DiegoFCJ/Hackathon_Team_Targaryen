package it.contrader.hackaTarg.controller;

import it.contrader.hackaTarg.dto.DettagliCloneDTO;
import it.contrader.hackaTarg.service.DettagliCloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dettagliClone")
@CrossOrigin(origins = "http://localhost:4200")
public class DettagliCloneController extends AbstractController<DettagliCloneDTO>{

    @Autowired
    private DettagliCloneService dettagliCloneService;

}
