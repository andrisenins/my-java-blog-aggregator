package com.andrisenins.jba.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.andrisenins.jba.entity.Item;
import com.andrisenins.jba.exception.RssException;

public class RssServiceTest {
    
    public RssService rssService;
    
    @Before
    public void setUp() throws Exception {
        rssService = new RssService();
    }

    @Test
    public void testGetItemsFile() throws RssException {
        List<Item> items = rssService.getItems(new File("test-rss/javavids.xml"));
        assertEquals(10, items.size());
    }
    
    @Test
    public void testCheckFirstItemTitleDate() throws RssException {
        List<Item> items = rssService.getItems(new File("test-rss/javavids.xml"));
        Item firstItem = items.get(0);
        assertEquals("How to solve Source not found error during debug in Eclipse", firstItem.getTitle());
        assertEquals("22 06 2014 23:35:49", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
    }
}
