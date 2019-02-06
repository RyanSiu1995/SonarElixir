package com.ryansiu1995.sonar;

import org.sonar.api.SonarRuntime;
import org.sonar.api.server.rule.RulesDefinition;

public class ElixirRulesDefinition implements RulesDefinition {

    public static final String REPOSITORY_KEY = "elixir";
    public static final String RULE_REPOSITORY_NAME = "ElixirAnalyzer";

    private SonarRuntime sonarRuntime;

    public ElixirRulesDefinition(SonarRuntime sonarRuntime) {
        this.sonarRuntime = sonarRuntime;
    }

    @Override
    public void define(Context context) {
        NewRepository repository = context
            .createRepository(REPOSITORY_KEY, ElixirLanguage.LANGUAGE_KEY)
            .setName(RULE_REPOSITORY_NAME);
        ElixirRules.addToRepository(repository, sonarRuntime);
        repository.done();
    }
}
