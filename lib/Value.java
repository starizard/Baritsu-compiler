package com.shawnrebello.baritsu.lib;

public class Value {
   String type ;
   Object value;

   public Value (String type, Object value) {
     this.type = type;
     this.value = value;
   }
   public Value () {
    this.type = "UNDEFINED";
    this.value = null;
  }

   public String getType() {
     return this.type;
   }

}