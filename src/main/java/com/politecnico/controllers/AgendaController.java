package com.politecnico.controllers;


import com.politecnico.entity.Agenda;
import com.politecnico.service.IAgendaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (value = "*")
@RequestMapping("agenda")
public class AgendaController {

    private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);

    @Autowired
    IAgendaService agendaService;

    @PostMapping(value = "crear",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> crearCita(@RequestBody Agenda agenda) {
        agendaService.createAgenda(agenda);
        logger.info("dasd");
        return null;
    }

}
