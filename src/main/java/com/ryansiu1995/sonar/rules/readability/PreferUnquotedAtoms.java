package com.ryansiu1995.sonar.rules.readability;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Readability.PreferUnquotedAtoms")
public class PreferUnquotedAtoms extends ElixirRule {
    @Override
    public String credoKey() {
        return "PreferUnquotedAtoms";
    }
}
