package com.example.demo.practise;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LearningStream {
    public static void main(String[] args) {

        List<Integer>  xList = List.of(4,5,6,7,8,9);


        // this is how stream work
        Stream<Integer> data = xList.stream();
        Stream<Integer> mappedDAta = data.map(x -> x * 2);
        mappedDAta.forEach(System.out::println);

        // wer can map this in a single line


        System.out.println("Created My Function");

        Function<Integer , Integer> xx = e-> e*2;
        xList.stream()
                .map(xx)
                .forEach(System.out::println);

        // lets filter the data

        System.out.println("Created My Function");

        xList.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .forEach(System.out::println);


        Stream<Integer> xStream = xList.stream();

        xStream.forEach(System.out::println);
        //       xStream.forEach(System.out::println);

        // Again using the stream will give the error,
        // Because stream can only be use once

        int[] arr = {4,3,6,3,5,6,4,6,8,6};

        LongStream arrStream = Arrays.stream(arr).asLongStream();
        System.out.println(Arrays.toString(arrStream.toArray()));







        List<String> name = List.of("Mayank" , "Sonu" ,"Tarun" , "Verma" , "Chahar" , "Suri");
        List<String> newNames = name.stream().filter(e -> e.startsWith("M")).collect(Collectors.toList());
        newNames.forEach(e -> System.out.println(e));


        List<Integer> number = List.of(2 ,4 ,6 ,7 ,9 ,0);
        List<Integer > newList = number.stream().map(integer -> integer * 10).collect(Collectors.toList());
        number.stream().map(integer -> integer * 10).forEach(System.out::println);
        newList.forEach(System.out::println);

        // Sort Function

        number.stream().sorted().forEach(System.out::println);

        Integer intn = number.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min " + intn);

        Integer intMax = number.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("max " + intMax);
    }
}
