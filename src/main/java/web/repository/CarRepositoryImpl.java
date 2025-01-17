package web.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
@AllArgsConstructor
@Getter
public class CarRepositoryImpl implements CarRepository {
    private final List<Car> cars = List.of(
            new Car(1L, "Car1", 2021),
            new Car(2L, "Car2", 2022),
            new Car(3L, "Car3", 2023),
            new Car(4L, "Car4", 2024),
            new Car(5L, "Car5", 2025));
}
