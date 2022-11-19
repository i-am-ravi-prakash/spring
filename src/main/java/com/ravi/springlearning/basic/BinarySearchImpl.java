package com.ravi.springlearning.basic;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author raviprakash
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;
    
    /**
     * public BinarySearchImpl(SortAlgorithm _sortAlgorithm) { super();
     * this.sortAlgorithm = _sortAlgorithm; }
     */
    public int binarySearch(int[] arr, int key) {
        int[] sortedArr = sortAlgorithm.sort(arr);
        int index = Arrays.binarySearch(sortedArr, key);
        System.out.println(sortAlgorithm.getClass());
        return index;
    }
    
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    
    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct method called");
    }
    
    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy method called");
    }
}
