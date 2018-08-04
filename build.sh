#!/bin/sh
ANTLR_PATH='/usr/local/lib/antlr-4.7.1-complete.jar'
echo "Generating grammar files"
cd grammar; java -jar $ANTLR_PATH -long-messages -no-listener -visitor *.g4 -o ../recognizer; cd ..
echo "Compiling source files"
javac  */*.java */*.java -g -d .
#alias baritsu='java com.shawnrebello.baritsu.src.Compiler'
