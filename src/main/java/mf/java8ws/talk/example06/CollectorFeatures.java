package mf.java8ws.talk.example06;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.function.BinaryOperator.maxBy;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.reducing;

public class CollectorFeatures {

    public static void main(String... args) {
        System.out.println("Dishes grouped by type: " + groupDishesByType());
        System.out.println("Most caloric Dish by type: " + mostCaloricDishByType());
    }

    private static Map<Dish.Type, List<Dish>> groupDishesByType() {
        return null;
    }

    private static Map<Dish.Type, Dish> mostCaloricDishByType() {
//        return Dish.menu.stream().collect(collectingAndThen(groupingBy(Dish::getType, reducing(maxBy(comparingInt(Dish::getCalories)))), Optional::get);
        return null;

    }


}
