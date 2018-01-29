package com.magicliang

import org.apache.spark.sql.SparkSession


/**
  * @author liangchuan
  */
object SimpleApplication {

  println("hello world")

  // http://blog.csdn.net/csdn_chuxuezhe/article/details/75351762
  // 在 VM options 里增加 -Dspark.master=local 即可指定应用程序在本地单线程启动。
  // 暂时不知道为什么用 ide 启动只支持 local[k] 模式而不支持提交任务到 master url 的模式
  // https://spark.apache.org/docs/latest/submitting-applications.html spark 的几种启动模式参数，也可以在 submit 里指定
  // Spark 模式的总结：https://www.jianshu.com/p/65a3476757a5
  def main(args: Array[String]): Unit = {
    val logFile = "/Users/magicliang/Desktop/Programming/tools/spark-2.2.1-bin-hadoop2.7/README.md"
    val spark = SparkSession.builder.appName("SimpleApplication").getOrCreate()
    println("SparkSession created")
    val logData = spark.read.textFile(logFile).cache()
    println("Dataset created and cached")
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    // 这里这个 s 开头字符串本身就是可替换字符串的前缀，没有它是不可以做到字符串替换的。
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    Thread.sleep(20000)
    spark.stop()
  }

}
