#!/usr/bin/env bash
spark-submit --class "com.magicliang.SimpleApplication" --master spark://magicliang:7077 target/scala-2.11/first-application_2.11-0.1.jar
