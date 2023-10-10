package com.politecnico.service.impl;

import com.politecnico.entity.Agenda;
import com.politecnico.repository.IAgendaRepository;
import com.politecnico.service.IAgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AgendaService implements IAgendaService {

    @Autowired
    IAgendaRepository agendaRepository;

    @Override
    public Agenda createAgenda(Agenda agenda) {
        Agenda response = agendaRepository.save(agenda);
        return response;
    }

    @Override
    public Agenda updateAgenda(Agenda agenda) {
        Agenda response = agendaRepository.save(agenda);
        return response;
    }

    @Override
    public boolean deleteAgenda(int id) {
        try {
            agendaRepository.deleteById(id);
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean deleteAgenda(Agenda agenda) {
        try {
            agendaRepository.delete(agenda);
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public Agenda getAgenda(int id) {
        Optional<Agenda> agenda = agendaRepository.findById(id);
        return agenda.isPresent() ? agenda.get() : null;
    }
}
