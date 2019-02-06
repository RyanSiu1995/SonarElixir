package com.ryansiu1995.sonar;

import org.sonar.api.Plugin;
import org.sonar.api.Plugin.Context;

public class ElixirPlugin implements Plugin {

    @Override
    public void define(Context ctx) {
        ctx.addExtension(ElixirLanguage.class)
            .addExtension(new ElixirRulesDefinition(ctx.getRuntime()));
    }
}
