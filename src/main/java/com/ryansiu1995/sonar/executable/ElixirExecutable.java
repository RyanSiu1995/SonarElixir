package com.ryansiu1995.sonar.executable;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.javatuples.Pair;
import org.javatuples.Triplet;

public abstract class ElixirExecutable<T> {
    private String baseCommand = "mix";
    private String tool;
    private List<String> opts;

    public ElixirExecutable(String tool, List<String> opts) {
        this.tool = tool;
        this.opts = opts;
    }

    public ElixirExecutable(String pathToMIX, String tool, List<String> opts) {
        this.baseCommand = pathToMIX;
        this.tool = tool;
        this.opts = opts;
    }

    public abstract T result(String... target);

    public abstract boolean checkAvailability();

    public abstract String getMixVersion() throws IOException;

    private Triplet<Boolean, String, String> execute(List<String> commands) throws IOException {
        Process process = new ProcessBuilder().command(asList(baseCommand, "--version")).start();
        InputStream inputStream = process.getInputStream();
        InputStream errorStream = process.getErrorStream();
        // TODO Extract information
        return new Triplet<>(true, "stdout", "stderr");
    }
}
