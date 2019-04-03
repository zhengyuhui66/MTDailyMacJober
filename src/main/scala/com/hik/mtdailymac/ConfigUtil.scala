package com.hik.mtdailymac

import org.apache.commons.configuration.XMLConfiguration

class ConfigUtil(path: String) extends Serializable {
  val conf = new XMLConfiguration(path)

  def getConfigSetting(key: String, default: String): String ={
    if(conf != null)
      conf.getString(key)
    else
      default
  }
  var confPath:String=""
  def setConfPath(path:String): Unit ={
    confPath=path;
  }
  def getConfPath():String={
    confPath
  }
  /**
    *spark应用名称
    */
  val appName: String = getConfigSetting("appName", "BaseMacRecoder")
  /**
    *mac原始记录表
    */
  val recoderTable: String = getConfigSetting("recoderTable", "")
  /**
    *
    */
  val recoderMacInx:String=getConfigSetting("recoderMacInxTable","")
  /**
    *
    */
  val recoderDateInx:String=getConfigSetting("recoderDateInxTable","")

  val connectdays:String=getConfigSetting("connectdays","")

  val connectcot:String=getConfigSetting("connectcot","")

  val mtDailyMac:String=getConfigSetting("mtDailyMac","")
  val mtDailyWorkMac:String=getConfigSetting("mtDailyWorkMac","")
  val mtDailyRestMac:String=getConfigSetting("mtDailyRestMac","")
  val mtDailyMacCountByDevId:String=getConfigSetting("mtDailyMacCount","")
}
