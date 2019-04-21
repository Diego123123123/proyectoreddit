package com.ucbcba.logindemo.controllers;


import com.ucbcba.logindemo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CarController {

    CarService carService;

    @Autowired
    public void setCategoryService(CarService carService)
    {
        this.carService = carService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ResponseEntity cars(){
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("modelo", "toyota");
        return ResponseEntity.ok(mapa);
    }

}
