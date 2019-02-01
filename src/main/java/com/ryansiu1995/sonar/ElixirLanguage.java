package com.ryansiu1995.sonar;

import org.sonar.api.resources.AbstractLanguage;

public class ElixirLanguage extends AbstractLanguage {
    public static final String LANGUAGE_NAME = "elixir";
    public static final String LANGUAGE_KEY = "ex";
    public static final String[] LANGUAGE_EXTENSIONS = {"ex", "exs"};

    public ElixirLanguage() {
        super(LANGUAGE_KEY, LANGUAGE_NAME);
    }

    @Override
    public String[] getFileSuffixes() {
        return LANGUAGE_EXTENSIONS;
    }
}
