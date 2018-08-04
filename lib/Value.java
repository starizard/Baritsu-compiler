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

 public static Boolean isInt(Value val) {
  return val.type == "INTEGER";
 }

 public static Boolean isBool(Value val) {
  return val.type == "BOOLEAN";
 }

public static Boolean isString(Value val) {
  return val.type == "STRING";
 }

public static Boolean isNull(Value val) {
  return val.type == "NULL";
 }

public static Boolean toBool(Value val){
  if(isBool(val)) {
    return (Boolean) val.value;
  }
  else if(isInt(val)) {
   Integer intVal = (Integer) val.value;
   if(intVal > 0) return true;
   return false;
  }
  else return false;
}

public static Integer toInt(Value val) {
  if (isInt(val)){
    return (Integer) val.value;
  } else if (isBool(val)) {
    Boolean bool = (Boolean) val.value;
    return (bool ? 1 : 0);
  }
  else {
    return -1;
  }
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
  if ((lVal.type == rVal.type) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("INTEGER", lValue + rValue);
  } else if ((lVal.type == rVal.type) && isString(lVal)) {
   String lValue = (String) lVal.value;
   String rValue = (String) rVal.value;
   return new Value("STRING", lValue + rValue);
  } else if ((lVal.type == rVal.type) && isBool(lVal)) {
   Boolean lValue = toBool(lVal);
   Boolean rValue = toBool(rVal);
   Integer res = (lValue ? 1 : 0) + (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  } else if ((isNull(lVal)) && rVal.type != "NULL") {
   return rVal;
  } else if ((rVal.type == "NULL") && lVal.type != "NULL") {
   return lVal;
  } else if (isString(lVal)|| rVal.type == "STRING") {
    String lValue =  lVal.value.toString();
    String rValue =  rVal.value.toString();
    return new Value("STRING", lValue + rValue);
  }
  return new Value();
 }

 public static Value sub(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("INTEGER", lValue - rValue);
  } else if ((lVal.type == rVal.type) && isBool(lVal)) {
   Boolean lValue = toBool(lVal);
   Boolean rValue = toBool(rVal);
   Integer res = (lValue ? 1 : 0) - (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  } else if ((isNull(lVal)) && isBool(rVal)) {
   Boolean rValue = toBool(rVal);
   return new Value("BOOLEAN", !rValue);
  } else if ((rVal.type == "NULL") && isBool(lVal)) {
   Boolean lValue = toBool(lVal);
   return new Value("BOOLEAN", lValue);
  } else if ((isNull(lVal)) && isInt(rVal)) {
   Integer rValue = toInt(rVal);
   return new Value("INTEGER", 0 - rValue);
  } else if ((rVal.type == "NULL") && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   return new Value("INTEGER", lValue);
  }
  return new Value();
 }

 public static Value multiply(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("INTEGER", lValue * rValue);
  } else if ((isString(lVal)) && rVal.type == "STRING") {
   Integer lValue = toInt(lVal);
   String rValue = (String) rVal.value;
   String res = new String(new char[lValue]).replace("\0", rValue);
   return new Value("STRING", res);
  } else if ((isString(lVal)) && isInt(rVal)) {
   String lValue = (String) lVal.value;
   Integer rValue = toInt(rVal);
   String res = new String(new char[rValue]).replace("\0", lValue);
   return new Value("STRING", res);
  } else if ((lVal.type == rVal.type) && isBool(lVal)) {
   Boolean lValue = toBool(lVal);
   Boolean rValue = toBool(rVal);
   Integer res = (lValue ? 1 : 0) * (rValue ? 1 : 0);
   return new Value("BOOLEAN", res);
  }
  return new Value();
 }

 public static Value divide(Value lVal, Value rVal) {
  if ((lVal.type == rVal.type) && isString(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("INTEGER", lValue / rValue);
  } else if ((lVal.type == rVal.type) && isBool(lVal)) {
   Boolean lValue = toBool(lVal);
   Boolean rValue = toBool(rVal);
   Integer res = (lValue ? 1 : 0) / (rValue ? 1 : 0);
   return new Value("INTEGER", res);
  }
  return new Value();
 }

 public static Value not(Value val) {
  if (isBool(val)) {
   Boolean bVal = (Boolean) val.value;
   return new Value("BOOLEAN", !bVal);
  }
  return new Value();
 }

 public static Value or(Value lVal, Value rVal) {
  if (isBool(rVal) && isBool(lVal)) {
    Boolean lValue = toBool(lVal);
    Boolean rValue = toBool(rVal);
    return new Value("BOOLEAN", lValue || rValue);
   }
  return new Value();
 }

 public static Value and(Value lVal, Value rVal) {
  if (isBool(rVal) && isBool(lVal)) {
    Boolean lValue = toBool(lVal);
    Boolean rValue = toBool(rVal);
    return new Value("BOOLEAN", lValue && rValue);
   }
  return new Value();
 }

 public static Value eq(Value lVal, Value rVal) {
  if (isInt(rVal) && isInt(lVal)) {
   return new Value("BOOLEAN", toInt(lVal) == toInt(rVal));
  }
  else if(isBool(lVal) && isBool(rVal)) {
    return new Value("BOOLEAN", toBool(lVal) == toBool(rVal));
  }
  return new Value();
 }

 public static Value greaterThan(Value lVal, Value rVal) {
  if (isInt(rVal) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("BOOLEAN", lValue > rValue);
  }
  return new Value();
 }

 public static Value lessThan(Value lVal, Value rVal) {
  if (isInt(rVal) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("BOOLEAN", lValue < rValue);
  }
  return new Value();
 }

 public static Value greaterThanEq(Value lVal, Value rVal) {
  if (isInt(rVal) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("BOOLEAN", lValue >= rValue);
  }
  return new Value();
 }

 public static Value lessThanEq(Value lVal, Value rVal) {
  if (isInt(rVal) && isInt(lVal)) {
   Integer lValue = toInt(lVal);
   Integer rValue = toInt(rVal);
   return new Value("BOOLEAN", lValue <= rValue);
  }
  return new Value();
 }

 public static Boolean isTruthy(Value val) {
  if (isInt(val)) {
   return toBool(val);
  } else if (isBool(val)) {
     return toBool(val);
   }
  return false;
 }


}