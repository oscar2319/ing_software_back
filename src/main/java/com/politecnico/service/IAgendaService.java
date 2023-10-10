package com.politecnico.service;

import com.politecnico.entity.Agenda;

public interface IAgendaService {

    Agenda createAgenda(Agenda agenda);

    Agenda updateAgenda(Agenda agenda);

    boolean deleteAgenda(int id);

    boolean deleteAgenda(Agenda agenda);

    Agenda getAgenda(int id);


}
