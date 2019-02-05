package com.ryansiu1995.sonar.rules.warning;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Warning.MapGetUnsafePass")
public class MapGetUnsafePass extends ElixirRule {
    @Override
    public String credoKey() {
        return "MapGetUnsafePass";
    }
}
