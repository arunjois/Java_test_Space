#!/bin/bash
javac --module-path $PATH_TO_FX --add-modules=javafx.controls $1
class_file=$(echo $1 | cut -d'.' -f1)
filename=$1
echo $filename
classname=$class_file
echo $classname
java --module-path $PATH_TO_FX --add-modules=javafx.controls $classname
