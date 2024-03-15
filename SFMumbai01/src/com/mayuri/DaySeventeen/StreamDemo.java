package com.mayuri.DaySeventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Demo on the basics of stream API
public class StreamDemo {

	public static void main(String[] args) {
	
		Stream<Integer> stream= Stream.of(10,20,30,40,50,60,70,80,90);
		System.out.println(stream.count());
		
		
//To convert array elements into streams in order to perform stream operations on array.
		
		//another way of creating array
		Integer[] values = new Integer[] {1,2,3,4,5};
		//to create stream of array
		Arrays.stream(values);
		System.out.println(Arrays.toString(values));// to print
		
		//math function using lambda expression
		stream = stream.map(m->m*m);
		stream.forEach(System.out::println);
		
		
		//list elements into stream
		List<String> words = Arrays.asList("HEllo", "Good", "Evening");
		Stream<String> stream1 = words.stream();
		System.out.println("UPPERCASE WORDS");
		//to store the result in a List
		List<String> s1 = stream1.map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		
		//to store the result for lower case in a stream without using collect method.
		System.out.println("lowercase words");
		stream1 = words.stream();
		stream1.map(str->str.toLowerCase()).forEach(System.out::println);//not using collect method, direct print
		
		//Original words
		System.out.println("Original words");
		System.out.println(words);

	}

}
