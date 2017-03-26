package com.naeembux.chapter3Assignment;

import junit.framework.TestCase;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class ArraylistCollectionTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testLoadData() throws Exception {
        ArraylistCollection alc = new ArraylistCollection();
        alc.loadData();
        alc.displayData();
    }

    public void testDisplayData() throws Exception {
        ArraylistCollection alc = new ArraylistCollection();
        alc.displayData();
    }

    public void testRemoveElement() throws Exception {
        ArraylistCollection alc = new ArraylistCollection();
        alc.loadData();
        alc.displayData();
    }

}