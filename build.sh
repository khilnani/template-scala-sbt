#!/bin/sh

sbt clean package

rm ./dist/*.jar
cp ./target/**/name_*.jar ./dist
cp -r ./lib-scala/ ./dist/
