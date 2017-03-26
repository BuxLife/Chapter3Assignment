package com.naeembux.chapter3Assignment;

import junit.framework.TestCase;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bux_Life on 2017/03/26.
 */
public class MapCollectionTest extends TestCase {

    private LoadListInterface loadList;

    @Before
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        loadList = (LoadListInterface)ctx.getBean("loadList");
    }
    public void testLoadData() throws Exception {
        loadList.loadData();
    }

    public void testDisplayData() throws Exception {
        loadList.loadData();
        loadList.displayData();
    }

    public void testClearData() throws Exception {
        MapCollection topMovies = new MapCollection();
        topMovies.loadData();
        topMovies.displayData();
        topMovies.clearData();
        topMovies.displayData();
    }

}