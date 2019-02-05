package com.ryansiu1995.sonar.rules.consistency;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Consistency.ParameterPatternMatching")
public class ParameterPatternMatching extends ElixirRule {
    @Override
    public String credoKey() {
        return "ParameterPatterMatching";
    }
}
