package com.ryansiu1995.sonar.model;

import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CredoReport {
    private List<CredoIssue> issues;

    public CredoReport() {
        issues = new ArrayList<>();
    }

    public static class CredoIssue {
        private CredoCategory category;
        private int column;
        @JsonProperty("column_end")
        private int columnEnd;
        private String filename;
        @JsonProperty("line_no")
        private int lineNumber;
        private String message;
        private int priority;
        private String trigger;

        public CredoIssue() { }
    }
}
