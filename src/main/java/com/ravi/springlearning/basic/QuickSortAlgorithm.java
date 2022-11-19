package com.ravi.springlearning.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {
        // Let's assume below is the Quick sort algorithm implementation
        Arrays.sort(arr);
        return arr;
    }
}
