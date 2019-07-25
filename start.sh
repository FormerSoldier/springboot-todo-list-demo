#!/bin/bash

mv -f build/libs/todolist-0.0.1-SNAPSHOT.jar /webapp/springboot-todo
chmod 777 /webapp/springboot-todo/todolist-0.0.1-SNAPSHOT.jar
nohup java -jar /webapp/springboot-todo/todolist-0.0.1-SNAPSHOT.jar > /webapp/springboot-todo/logfile 2>1 &
