package com.senai.herois.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.herois.model.Heroi;
import com.senai.herois.repository.HeroiRepository;

@Service
public class HeroiService {

    @Autowired
    private HeroiRepository heroiRepository;


    public Heroi inserir(Heroi heroi) {
        // logica de negocio 
        heroiRepository.adicionar(heroi);
        return heroi;
    }

    public List<Heroi> consultar() {
        return heroiRepository.consultar();
    }
    
}