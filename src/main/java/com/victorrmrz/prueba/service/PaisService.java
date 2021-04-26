package com.victorrmrz.prueba.service;

import com.victorrmrz.prueba.entity.Pais;
import com.victorrmrz.prueba.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public List<Pais> list() {
        return paisRepository.findAll();
    }

    public void save(Pais pais) {
        paisRepository.save(pais);
    }
}
