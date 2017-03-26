package com.naeembux.chapter3Assignment;

import junit.framework.TestCase;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class MapCollectionTest extends TestCase {
    public void testLoadData() throws Exception {
        MapCollection topMovies = new MapCollection();
        topMovies.loadData();
    }

    public void testDisplayData() throws Exception {
        MapCollection topMovies = new MapCollection();
        topMovies.loadData();
        topMovies.displayData();
    }

    public void testClearData() throws Exception {
        MapCollection topMovies = new MapCollection();
        topMovies.loadData();
        topMovies.displayData();
        topMovies.clearData();
        topMovies.displayData();
    }

}