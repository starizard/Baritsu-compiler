package com.shawnrebello.baritsu.lib;
import java.util.HashMap;
import java.util.Map;

public class Variable {
  String context;
  Map variables = new HashMap < String, Value > ();


  public void define(String name, Object value) {
    this.variables.put(name, value);
  }

  public void update(String name, Object value) {
    if (this.variables.containsKey(name)) {
      this.variables.put(name, value);
    }
    else {
      System.out.println("Undefined reference to "+name);
    }
  }

  public Value get(String name) {
    if (this.variables.containsKey(name)) {
      Value val = (Value) this.variables.get(name);
      return val;
    } else {
      Value undefinedValue = new Value("UNDEFINED", null);
      return undefinedValue;
    }
  }
}