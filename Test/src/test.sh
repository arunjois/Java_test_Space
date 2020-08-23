#!/bin/bash
javac --module-path $PATH_TO_FX --add-modules=javafx.controls $1
class_file=$(echo $1 | tr ".java$" " ")
filename=$1
classname=${filename:0:-5}
echo $classname
java --module-path $PATH_TO_FX --add-modules=javafx.controls $classname
