package com.finall;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TestDemo {

    public void countNumbers(List<Integer> numbers) {
        Long count = numbers.stream().filter(n -> n % 2 != 0).count();
        System.out.println("count: " + count);
    }

    public void swap(Integer[] numsArray, int index1, int index2) {
        // 通过第三变量来做
        Integer temp = numsArray[index1];
        numsArray[index1] = numsArray[index2];
        numsArray[index2] = temp;
    }

    public void findArraysNums(List<Integer> list, int begin, int end) {
        if (begin > end || end >= list.size()) {
            throw  new IllegalArgumentException("Invalid range");
        }

        Integer max = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            Integer element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        System.out.println();
        System.out.println("max: " + max);
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();

        // replace
        Integer[] numbers = {1,2,3,4,5};
        System.out.println("before sorting: ");
        for (Integer num : numbers) {
            System.out.print(num + ",");
        }
        testDemo.swap(numbers, 1,2);
        System.out.println("\nafter sorting: ");
        for (Integer num : numbers) {
            System.out.print(num + ",");
        }

        // max
        List<Integer> numbers2 = Arrays.asList(1,5,3,8,2,7,4);
        testDemo.findArraysNums(numbers2, 3, 5);

        // Odd number
        testDemo.countNumbers(numbers2);
    }
}
