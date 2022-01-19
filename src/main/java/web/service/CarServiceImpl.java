package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car("Car" + i, i, 2010 + i));
        }
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
