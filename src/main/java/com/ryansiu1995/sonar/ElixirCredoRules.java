package com.ryansiu1995.sonar;

import java.util.List;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import com.ryansiu1995.sonar.model.CredoInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Context;
import org.sonar.api.server.rule.RulesDefinition.NewRepository;

public class ElixirCredoRules implements RulesDefinition {
    private final String REPOSITORY_NAME = "elixir_credo";
    private final String NAME = "Elixir Credo";

    @Override
    public void define(Context context) {
        NewRepository repository =
            context
            .createRepository(REPOSITORY_NAME, ElixirLanguage.LANGUAGE_KEY)
            .setName(NAME);
        try {
            getCheckNames().forEach((check) -> {
                create(repository, check);
            });
        } catch (Exception exception) {
            // TODO Handle Exception
        } finally {
            repository.done();
        }
    }

    private List<String> getCheckNames() throws IOException, InterruptedException {
        Process exec = new ProcessBuilder("mix", "credo", "info", "--format=json").start();
        exec.waitFor();
        InputStream stdout = exec.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        CredoInfo info = objectMapper.readValue(builder.toString(), CredoInfo.class);
        return info.getConfigs().getChecks();
    }

    private void create(NewRepository repository, String checkName) {
        String[] splitted = checkName.split(".");
        NewRule rule =
            repository
            .createRule(checkName)
            .setName(splitted[splitted.length - 1]);
    }
}
