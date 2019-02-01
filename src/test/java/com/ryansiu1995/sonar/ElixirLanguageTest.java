package com.ryansiu1995.sonar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElixirLanguageTest {
    private ElixirLanguage language;

    @Before
    public void setup() {
        language = new ElixirLanguage();
    }

    @Test
    public void correctLangugaePack() {
        assertEquals("elixir", language.getName());
        assertEquals("ex", language.getKey());
    }

    @Test
    public void correctExtension() {
        String[] extensions = language.getFileSuffixes();

        assertEquals(2, extensions.length);
        assertEquals("ex", extensions[0]);
        assertEquals("exs", extensions[1]);
    }

}
