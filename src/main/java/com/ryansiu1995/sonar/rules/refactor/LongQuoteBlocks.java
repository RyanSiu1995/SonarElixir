package com.ryansiu1995.sonar.refactor;

import org.sonar.check.Rule;
import com.ryansiu1995.sonar.rules.ElixirRule;

@Rule(key = "Credo.Check.Refactor.LongQuoteBlocks")
public class LongQuoteBlocks extends ElixirRule {
    @Override
    public String credoKey() {
        return "LongQuoteBlocks";
    }
}
