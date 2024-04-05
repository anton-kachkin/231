package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = carService.getCars(count != null ? count : 5);
        model.addAttribute("cars", cars);
        return "cars";
    }

//    private List<Car> getCarsList(Integer count) {
//        if (count == null || count >= 5) {
//            return carService.getCars();
//        } else {
//            return carService.getCars(count);
//        }
//    }
}