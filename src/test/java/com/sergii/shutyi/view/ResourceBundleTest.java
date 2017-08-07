package com.sergii.shutyi.vieww;

import org.junit.Assert;
import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleTest {

    @Test
    public void testRussianLocale() throws Exception {
        Locale russianLocale = new Locale("ru", "RU");
        ResourceBundle bundle = ResourceBundle.getBundle("Labels", russianLocale);

        String actual = bundle.getString("please.enter");
        String expected = "Пожалуйста, введите ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEnglishLocale() throws Exception {
        Locale englishLocale = new Locale("en", "US");
        ResourceBundle bundle = ResourceBundle.getBundle("Labels", englishLocale);

        String actual = bundle.getString("please.enter");
        String expected = "Please, enter ";

        Assert.assertEquals(expected, actual);
    }
}