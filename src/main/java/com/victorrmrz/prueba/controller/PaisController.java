package com.victorrmrz.prueba.controller;

import com.victorrmrz.prueba.dto.Mensaje;
import com.victorrmrz.prueba.dto.PaisDto;
import com.victorrmrz.prueba.entity.Pais;
import com.victorrmrz.prueba.service.PaisService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import org.apache.commons.lang3.StringUtils;
import org.springframework.util.StringUtils;


import java.util.List;

@RestController
@RequestMapping("/pais")
@CrossOrigin
public class PaisController {
    @Autowired
    PaisService paisService;

    @GetMapping("/lista")
    public ResponseEntity<List<Pais>> list() {
        List<Pais> list = paisService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PaisDto paisDto) {
        if(StringUtils.isEmpty(paisDto.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isEmpty(paisDto.getUrlImg()))
            return new ResponseEntity(new Mensaje("La imagen es obligatoria"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isEmpty(paisDto.getZonas()))
            return new ResponseEntity(new Mensaje("Las zonas horarias son obligatorias"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isEmpty(paisDto.getCapital()))
            return new ResponseEntity(new Mensaje("La capital es obligatoria"), HttpStatus.BAD_REQUEST);
        Pais pais = new Pais(paisDto.getNombre(), paisDto.getCapital(), paisDto.getUrlImg(), paisDto.getZonas());
        paisService.save(pais);
        return new ResponseEntity(new Mensaje("País agregado"), HttpStatus.OK);

    }
}
