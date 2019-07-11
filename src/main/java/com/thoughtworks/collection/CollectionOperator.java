package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int min = Math.min(left,right);
        int max = Math.max(left,right);
        List<Integer> result = IntStream.rangeClosed(min,max).boxed().collect(Collectors.toList());
        if (left>right){
            Collections.reverse(result);
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        int min = Math.min(left,right);
        int max = Math.max(left,right);
        List<Integer> result = IntStream.rangeClosed(min,max).filter(x ->x%2==0).boxed().collect(Collectors.toList());
        System.out.println(result);
        if (left>right){
            Collections.reverse(result);
        }
        return result;
    }

    public List<Integer> popEvenElments(Integer[] array) {
        List<Integer> arrayList = Arrays.asList(array);
        return arrayList.stream().filter(x ->x%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
