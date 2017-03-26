package com.naeembux.chapter3Assignment;

import junit.framework.TestCase;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class GenericCollectionTest extends TestCase {
    public void testLoadData() throws Exception {
        GenericCollection games = new GenericCollection();
        games.loadData();
    }

    public void testDisplayData() throws Exception {
        GenericCollection games = new GenericCollection();
        games.loadData();
        games.displayData();
    }

}