package com.ryansiu1995.sonar.rules.readability;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Readability.ParenthesesInCondition")
public class ParenthesesInCondition extends ElixirRule {
    @Override
    public String credoKey() {
        return "ParenthesesInCondition";
    }
}
