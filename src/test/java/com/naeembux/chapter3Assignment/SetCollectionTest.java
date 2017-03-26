package com.naeembux.chapter3Assignment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class SetCollectionTest {
    @org.junit.Test
    public void testLoadData() throws Exception {
        SetCollection readingList = new SetCollection();
        readingList.loadData();
    }

    @org.junit.Test
    public void testDisplayData() throws Exception {
        SetCollection readingList = new SetCollection();
        readingList.loadData();
        readingList.displayData();
    }



}