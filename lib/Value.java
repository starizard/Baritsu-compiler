package com.shawnrebello.baritsu.lib;

public class Value {
   String type = "UNDEFINED";
   Object value;

   public Value (String type, Object value) {
     this.type = type;
     this.value = value;
   }

   public String getType() {
     return this.type;
   }

}