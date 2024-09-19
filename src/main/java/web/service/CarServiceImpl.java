package web.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private CarRepository repository;

    @Override
    public List<Car> getCars(int count) {
        return repository.getCars(count);
    }
}
