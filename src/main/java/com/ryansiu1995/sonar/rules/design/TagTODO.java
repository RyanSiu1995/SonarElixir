package com.ryansiu1995.sonar.rules.design;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Design.TagTODO")
public class TagTODO extends ElixirRule {
    @Override
    public String credoKey() {
        return "TagTODO";
    }
}
