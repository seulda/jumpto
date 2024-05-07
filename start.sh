#!/bin/bash

#JAR=jumpto-0.0.1.jar
#LOG=/home/ubuntu/jumpto/jumpto.log

JAR=./build/libs/jumpto-0.0.1-SNAPSHOT.jar
LOG=./jumpto.log
export spring_profiles_active=prod

nohup java -Dspring.profiles.active=prod -jar $JAR > $LOG 2>&1 &