package com.shawnrebello.baritsu.lib;

public class Value {
 String type;
 Object value;

 public Value(String type, Object value) {
  this.type = type;
  this.value = value;
 }
 public Value() {
  this.type = "UNDEFINED";
  this.value = null;
 }

 public String getType() {
  return this.type;
 }

 @Override
 public String toString() {
  if (this.type == "NULL") {
   return "null";
  } else if (this.type != "UNDEFINED") {
   return this.value.toString();
  }
  return "undefined";
 }

 public static Value add(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", lValue + rValue);
  } else if ((lVal.type == rVal.type) && lVal.type == "STRING") {
   String lValue = (String) lVal.value;
   String rValue = (String) rVal.value;
   return new Value("STRING", lValue + rValue);
  } else if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
   Boolean lValue = (Boolean) lVal.value;
   Boolean rValue = (Boolean) rVal.value;
   Integer res = (lValue ? 1 : 0) + (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  } else if ((lVal.type == "NULL") && rVal.type != "NULL") {
   return rVal;
  } else if ((rVal.type == "NULL") && lVal.type != "NULL") {
   return lVal;
  }
  return new Value();
 }

 public static Value sub(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", lValue - rValue);
  } else if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
   Boolean lValue = (Boolean) lVal.value;
   Boolean rValue = (Boolean) rVal.value;
   Integer res = (lValue ? 1 : 0) - (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  } else if ((lVal.type == "NULL") && rVal.type == "BOOLEAN") {
   Boolean rValue = (Boolean) rVal.value;
   return new Value("BOOLEAN", !rValue);
  } else if ((rVal.type == "NULL") && lVal.type == "BOOLEAN") {
   Boolean lValue = (Boolean) lVal.value;
   return new Value("BOOLEAN", lValue);
  } else if ((lVal.type == "NULL") && rVal.type == "INTEGER") {
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", 0 - rValue);
  } else if ((rVal.type == "NULL") && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   return new Value("INTEGER", lValue);
  }
  return new Value();
 }

 public static Value multiply(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", lValue * rValue);
  } else if ((lVal.type == "INTEGER") && rVal.type == "STRING") {
   Integer lValue = (Integer) lVal.value;
   String rValue = (String) rVal.value;
   String res = new String(new char[lValue]).replace("\0", rValue);
   return new Value("STRING", res);
  } else if ((lVal.type == "STRING") && rVal.type == "INTEGER") {
   String lValue = (String) lVal.value;
   Integer rValue = (Integer) rVal.value;
   String res = new String(new char[rValue]).replace("\0", lValue);
   return new Value("STRING", res);
  } else if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
   Boolean lValue = (Boolean) lVal.value;
   Boolean rValue = (Boolean) rVal.value;
   Integer res = (lValue ? 1 : 0) * (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  }
  return new Value();
 }

 public static Value divide(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", lValue / rValue);
  } else if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
   Boolean lValue = (Boolean) lVal.value;
   Boolean rValue = (Boolean) rVal.value;
   Integer res = (lValue ? 1 : 0) / (rValue ? 1 : 0);
   return new Value("INTEGER", res);
  }
  return new Value();
 }

 public static Value not(Value val) {
  if (val.type == "BOOLEAN") {
   Boolean bVal = (Boolean) val.value;
   return new Value("BOOLEAN", !bVal);
  }
  return new Value();
 }

 public static Value or(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
    Boolean lValue = (Boolean) lVal.value;
    Boolean rValue = (Boolean) rVal.value;
    return new Value("BOOLEAN", lValue || rValue);
   }
  return new Value();
 }

 public static Value and(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "BOOLEAN") {
    Boolean lValue = (Boolean) lVal.value;
    Boolean rValue = (Boolean) rVal.value;
    return new Value("BOOLEAN", lValue && rValue);
   }
  return new Value();
 }

 public static Value eq(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("INTEGER", lValue == rValue);
  }
  return new Value();
 }

 public static Value greaterThan(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("BOOLEAN", lValue > rValue);
  }
  return new Value();
 }

 public static Value lessThan(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("BOOLEAN", lValue < rValue);
  }
  return new Value();
 }

 public static Value greaterThanEq(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("BOOLEAN", lValue >= rValue);
  }
  return new Value();
 }

 public static Value lessThanEq(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && lVal.type == "INTEGER") {
   Integer lValue = (Integer) lVal.value;
   Integer rValue = (Integer) rVal.value;
   return new Value("BOOLEAN", lValue <= rValue);
  }
  return new Value();
 }


}