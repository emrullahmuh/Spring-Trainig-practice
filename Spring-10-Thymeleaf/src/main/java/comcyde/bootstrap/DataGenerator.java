package comcyde.bootstrap;

import com.github.javafaker.Faker;
import comcyde.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
public static List<Student> createStudent(){
    List<Student>studentList=new ArrayList<>(Arrays.asList(
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state())


));
return studentList;}

List<Student>Student=new ArrayList<>(Arrays.asList(
        new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
         new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
         new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
         new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state()),
         new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(10,50),new Faker().address().state())


));

}

