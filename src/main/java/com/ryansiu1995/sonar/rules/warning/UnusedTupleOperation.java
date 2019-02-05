package com.ryansiu1995.sonar.rules.warning;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Warning.UnusedTupleOperation")
public class UnusedTupleOperation extends ElixirRule {
    @Override
    public String credoKey() {
        return "UnusedTupleOperation";
    }
}
