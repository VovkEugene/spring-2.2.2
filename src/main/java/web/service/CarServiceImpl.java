package web.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository repository;

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = repository.getCars();
        if (count < 0 || count >= cars.size()) {
            return cars;
        }
        return cars.stream()
                .limit(count)
                .toList();
    }
}
