package com.politecnico.repository;

import com.politecnico.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAgendaRepository extends JpaRepository<Agenda,Integer> {


}
