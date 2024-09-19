package web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarController {
    private CarService service;

    @GetMapping("/cars")
    public String getCars(
            @RequestParam(value = "count", defaultValue = "5", required = false) int count,
            Model model) {
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
