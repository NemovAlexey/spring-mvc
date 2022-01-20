package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
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
            return cars;
        }
        return cars.subList(0, count);
    }
}
