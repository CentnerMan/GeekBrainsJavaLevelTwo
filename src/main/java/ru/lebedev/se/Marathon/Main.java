package ru.lebedev.se.Marathon;

/**
 * @author Анатолий Лебедев
 * @version 1.0.0
 */

import ru.lebedev.se.Marathon.Obstacle.*;
import ru.lebedev.se.Marathon.Team.*;

public class Main {
    public static void main(String[] args) {

        Team team = new Team(new Human("Боб"), new Human("Джон"),new Cat("Барсик"), new Dog("Бобик"));
        Course course = new Course(new Cross(80), new Wall(2), new Water(10), new Cross(120));

        course.doIt(team);
        team.showResults();
    }
}
