package com.ucbcba.logindemo.services;

import com.ucbcba.logindemo.entities.Car;
import com.ucbcba.logindemo.repositories.CarRepository;
import com.ucbcba.logindemo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImp implements CarService {

    private CarRepository carRepository;

    @Autowired
    @Qualifier(value = "carRepository")
    public void setCategoryRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void save(Car car) {
        this.carRepository.save(car);
    }
}
