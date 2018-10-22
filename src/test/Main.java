package test;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.*;
import java.util.function.Predicate;
/*

1) Create class-container for any types;
        2) Create class-container for numbers;
        3) Create utility method, which counts even numbers in given collection;
        4) Create utility method, which takes two lists and index and replaces element at given position in the first collection with corresponding element from the second one, without possibility to do vice versa;
        5) Create utility method, which takes two lists and index and switches elements at given position;
        6) Create utility method, which finds maximum element in the given list.
*/


public class Main {

    public static void main(String[] args) {

/*        ListUtils.swapElemWithImmutable(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55)), 1);
        ListUtils.swapElem(new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500)), new ArrayList<Integer>(Arrays.asList(111, 222, 333, 444, 555)), 2);

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Collections.max(listOfIntegers));

//1
        AnyTypeContainer container = new AnyTypeContainer(new ArrayList<>(Arrays.asList(1, 0.5, 300, 16.7f, 500l)));
        container.showFooContainer();
        System.out.println(container.getElemByIndex(0));
//2
        SingleNumberContainer<Double> doubleNumber = new SingleNumberContainer<>(0.7);
        doubleNumber.showFoo();

        NumberContainer data = new NumberContainer();
        data.setListOfIntegers(new ArrayList<>(Arrays.<Integer>asList(1, 2, 3, 4, 5)));
        data.ShowFoo();
        CountUtils.countSum(data.getListOfNumbers());
//6*/


        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", 30, 2000));
        workers.add(new Worker("Bruce", 31, 3000));
        workers.add(new Worker("Lee", 32, 4000));

        Worker w = workers.stream()
                .max((w1, w2) -> Integer.compare(w1.getAge(), w2.getAge()))
                .get();
        w.showFoo();

        workers.stream()
                .reduce((w1, w2) -> w1.getSalary() > w2.getSalary() ? w1 : w2)
                .ifPresent(System.out::println);

    }
}

