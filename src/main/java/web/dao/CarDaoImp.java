package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    private static List<Car> carList = new ArrayList<>();
    static  {
        carList.add(new Car ("Toyota",  100, "red"));
        carList.add(new Car ("BMW",  200, "black"));
        carList.add(new Car ("Mercedes",  300, "blue"));
        carList.add(new Car ("Reno",  400, "white"));
        carList.add(new Car ("Kia",  500, "yellow"));


    }

    @Override
    public List<Car> getCars(int carCount) {
        return carList.stream().limit(carCount).toList();
    }
}
