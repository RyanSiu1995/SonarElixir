package com.ryansiu1995.sonar.refactor;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Refactor.CaseTrivialMatches")
public class CaseTrivialMatches extends ElixirRule {
    @Override
    public String credoKey() {
        return "CaseTrivialMatches";
    }
}
