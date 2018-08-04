package com.shawnrebello.baritsu.lib;
import java.util.HashMap;
import java.util.Map;

public class Environment {
  Variable variables = new Variable();
  String context;

  public Environment (String context) {
    this.context = context;
  }

  public Variable getEnvironmentVariables() {
    return this.variables;
  }

  public Variable setEnvironmentVariables(Variable variables) {
    this.variables = variables;
    return this.variables;
  }
  public void clearEnvironmentVariables(String context) {
    this.variables = new Variable();
  }
}
