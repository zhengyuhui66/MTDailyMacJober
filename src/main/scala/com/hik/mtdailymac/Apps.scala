package com.hik.mtdailymac

import java.text.SimpleDateFormat
import java.util.Calendar

object Apps{
  def main(args: Array[String]): Unit = {
   /* val start:Calendar=Calendar.getInstance()
    val end:Calendar=Calendar.getInstance()
    start.add(Calendar.MONTH,-1)
    start.set(Calendar.DATE,1)
    start.set(Calendar.HOUR_OF_DAY,0)
    start.set(Calendar.MINUTE,0)
    start.set(Calendar.SECOND,0)
    start.set(Calendar.MILLISECOND,0)

    val lastDay = start.getActualMaximum(Calendar.DAY_OF_MONTH)
    end.add(Calendar.MONTH,-1)
    end.set(Calendar.DATE,lastDay)
    end.set(Calendar.HOUR_OF_DAY,0)
    end.set(Calendar.MINUTE,0)
    end.set(Calendar.SECOND,0)
    end.set(Calendar.MILLISECOND,0)
    println(start.getTime)*/
    //while(start.getTimeInMillis<end.getTimeInMillis){


    val start:Calendar=Calendar.getInstance()
    val end:Calendar=Calendar.getInstance()
    val simple = new SimpleDateFormat("yyyy-MM-dd")
    start.setTime(simple.parse("2019-02-20"))
    end.setTime(simple.parse("2019-02-26"))
    while(start.getTime.before(end.getTime)){
      start.add(Calendar.DATE,1)
      println(start.getTime+"------------"+end.getTime)
    }
  }
}