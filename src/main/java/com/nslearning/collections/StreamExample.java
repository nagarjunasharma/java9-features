package com.nslearning.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		/* Stream takeWhile() method takes each element that matches its predicate. It stops when it get unmatched element. 
		It returns a subset of elements that contains all matched elements, other part of stream is discarded. */
		List<Integer> evenList = Stream.of(2,3,4,5,6,7,8,9,1,0).takeWhile(i -> (i %2 == 0)).collect(Collectors.toList());
		System.out.println(evenList);
		
		/*
		Stream dropWhile method returns result on the basis of order of stream elements.
		Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.
		Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate. */
		List<Integer> leftoverList = Stream.of(2,3,4,5,6,7,8,9,1,0).dropWhile(i -> (i %2 == 0)).collect(Collectors.toList());
		System.out.println(leftoverList);
		
	}

}
