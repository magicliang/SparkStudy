#!/usr/bin/env bash
# 这是真集群模式，能够创建真正的 driver
spark-submit --class "com.magicliang.SimpleApplication" --master spark://magicliang:7077 --deploy-mode cluster target/scala-2.11/first-application_2.11-0.1.jar
