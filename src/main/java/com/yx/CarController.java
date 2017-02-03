package com.yx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yx on 17/2/3.
 */
@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;


    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/car")
    public List<Car> catList(){
        return carRepository.findAll();
    }

    //增加
    @PostMapping(value = "/car")
    public Car carAdd(@RequestParam("brand") String brand,
                      @RequestParam("price") Integer price){
        Car car = new Car();
        car.setBrand(brand);
        car.setPrice(price);
        return carRepository.save(car);
    }


    //查询单个
    @GetMapping(value = "/car/{id}")
    public Car QueryCarById(@RequestParam("id") Integer id){
        return carRepository.findOne(id);
    }


    //更新
    @PutMapping(value = "/car")
    public Car carUpdate(@RequestParam("id") Integer id,
                         @RequestParam("brand") String brand,
                         @RequestParam("price") Integer price){

        Car car = new Car();
        car.setId(id);
        car.setBrand(brand);
        car.setPrice(price);
        return carRepository.save(car);
    }

    //删除
    @DeleteMapping(value = "/car")
    public void carDelete(@RequestParam("id") Integer id){
        carRepository.delete(id);
    }
}
