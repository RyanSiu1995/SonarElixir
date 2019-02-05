package com.ryansiu1995.sonar.rules.warning;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Warning.BoolOperationOnSameValues")
public class BoolOperationOnSameValues extends ElixirRule {
    @Override
    public String credoKey() {
        return "BoolOperationOnSameValues";
    }
}
