package com.ryansiu1995.sonar.rules.refactor;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Refactor.ModuleDependencies")
public class ModuleDependencies extends ElixirRule {
    @Override
    public String credoKey() {
        return "ModuleDependencies";
    }
}
