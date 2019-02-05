package com.ryansiu1995.sonar.rules.readability;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Readability.SinglePipe")
public class SinglePipe extends ElixirRule {
    @Override
    public String credoKey() {
        return "SinglePipe";
    }
}
