#!/bin/bash

JUMPTO_PID=$(ps -ef | grep java | grep jumpto | awk '{print $2}')

if [ -z "$JUMPTO_PID" ];
then
    echo "JUMPTO is not running"
else
    kill -9 $JUMPTO_PID
    echo "JUMPTO stopped."
fi