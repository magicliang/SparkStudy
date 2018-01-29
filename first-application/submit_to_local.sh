#!/usr/bin/env bash
# 这个脚本不需要启动伪集群也可以执行
spark-submit --class "com.magicliang.SimpleApplication" --master local[4] target/scala-2.11/first-application_2.11-0.1.jar
# 其实不加入这行参数，spark-submit 也可以自动在 local 模式下运行

