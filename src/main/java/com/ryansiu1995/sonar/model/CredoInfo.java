package com.ryansiu1995.sonar.model;

import java.util.List;

public class CredoInfo {
    private CredoConfig configs;

    public static class CredoConfig {
        private List<String> checks;

        public List<String> getChecks() {
            return checks;
        }
    }

    public CredoConfig getConfigs() {
        return configs;
    }
}
