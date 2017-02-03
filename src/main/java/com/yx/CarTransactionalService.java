package com.yx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yx on 17/2/3.
 */
public class CarTransactionalService {
    @Autowired
    private CarRepository carRepository;

    @Transactional
    public void insertTwo(){
        Car carA = new Car();
        carA.setBrand("brand1");
        carA.setPrice(12);
        carRepository.save(carA);

        Car carB = new Car();
        carB.setBrand("brand2");
        carB.setPrice(22);
        carRepository.save(carB);
    }
}
