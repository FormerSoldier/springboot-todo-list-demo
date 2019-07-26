#!/bin/bash

JAVA_VERSION=`java -version 2>&1 | awk 'NR==1{gsub(/"/,"");print $3}'`
if [ $JAVA_VERSION ]
then 
  echo "Current Java version: $JAVA_VERSION"
else 
  echo "Can not run Java on this machine. "
  exit 1
fi

git fetch --all
git reset --hard origin/master

echo "Gradle building..."
gradle clean build
echo "Gradle testing..."
gradle test
echo "Gradle assembling..."
gradle bootJar
echo "Gradle deploying..."

echo "Stoping SpringBoot "
pid=`ps -ef | grep todolist-| grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
echo "Old app pid：$pid"
kill -9 $pid
else 
echo "No old application instance running"
fi

#echo "Starting application"
#nohup java -jar build/libs/todolist-0.0.1-SNAPSHOT.jar > logfile 2>&1 &
#echo "Application start successfully"
