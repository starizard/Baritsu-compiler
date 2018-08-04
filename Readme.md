Baritsu, A simple JVM dynamic programming language made by me

## Sample Syntax

- Variable Declaration
```
def x = 42;  // Type inferred as Int
def y = "hi";  // Type inferred as String
def a;  // Variable defined, type not inferred yet
def z = true  // Type inferred to Boolean
def c = null;  // Type inferred to Null

```
Semicolons `;` are optional

- Comments
```
 // This is a single line comment

 /* 
 
 This is a 
 Multi Line
 Comment 
 
 */
```

- Printing

```
print "Dracarys"
print 3 * 12;
print 4 - 1;
```

Print to a new line:

```
puts 3 * 2;
puts 1 + 3
puts !false;
puts 3 + 2 * 2 + 50;
puts "The " + 7 + " Kingdoms ";
puts "Hodor " * 4;
puts 3 + 4
```
- Conditionals

```
if (x > 3) {
  print "x is larger than 3"
} else {
  puts "x is smaller than 3"
}

if (x > 3) {
  y = y + 2
} else if ( x == 3) {
  y = y - 2
} else {
  y = 0
}
```

- Loops

```
while (x < 10) {
  puts "Hello";
  x = x + 2;
}

while (1) {
  puts "Infinite loop";
}
```

Nested loops: 
```
while (x > 0) {
  x = x - 1;
  puts "Hello";
  y = 3;
  while (y > 0) {
    print "World"
    y = y - 1;
  }
}
```



