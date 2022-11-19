package com.ravi.springlearning.basic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author raviprakash
 *
 */
@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {
        // Let's assume below is the Bubble sort algorithm implementation
        Arrays.sort(arr);
        return arr;
    }
}
