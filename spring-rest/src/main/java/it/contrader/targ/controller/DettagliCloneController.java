package it.contrader.targ.controller;

import it.contrader.targ.dto.DettagliCloneDTO;
import it.contrader.targ.service.DettagliCloneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dettagliClone")
@CrossOrigin(origins = "https://172.30.33.189:8111")
public class DettagliCloneController extends AbstractController<DettagliCloneDTO>{

    @Autowired
    private DettagliCloneService dettagliCloneService;

}
