package com.ryansiu1995.sonar.rules;

public abstract class ElixirRule {
    private boolean enabled;

    public void setEnabled(boolean flag) {
        enabled = flag;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public abstract String credoKey();
}
