package com.ryansiu1995.sonar.model;

public enum CredoCategory {
    CONSISTENCY("consistency"),
    READABILITY("readability"),
    REFACTOR("refactor"),
    DESIGN("design"),
    WARNING("warning");

    private String value;

    private CredoCategory(String category) {
        value = category;
    }
}
