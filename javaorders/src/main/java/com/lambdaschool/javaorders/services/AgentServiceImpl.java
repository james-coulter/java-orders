package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceImpl {

    @Autowired
    private AgentRepository agentRepo;

//    @Override
//    public Agent getAgentById(long id) {
//        return agentRepo.findById(id);
//    }

}
