/*
package com.hik.base.bean

import java.text.SimpleDateFormat

import com.hik.mtdailymac.{CETCProtocol, CommFunUtils}


class MacRecorder extends java.io.Serializable{
  /**
    * �ն�mac
    */
  private var mac = ""
  def setMac_= ( _mac : String ){
    mac =  _mac;
  }

  def getMac:String=mac
  /**
    * �ն�Ʒ��
    */
  private var bd = ""

  /**
    * ��ʷssid
    */
  private var cssid = ""

  /**
    * ����ʱ�䣨�ɼ�ʱ�䣩
    */
  private var ct = "";
  def setCt(time:String): Unit ={
    ct=time;
  }
  def getCt:String =ct

  /**
    * �뿪ʱ�䣨��ʧʱ�䣩
    */
  private var lt = "";
  def setLt(ltime:String): Unit ={
    lt=ltime;
  }
  def getLt:String=lt
  /**
    * פ��ʱ������λ��
    */
  private var rt = 0L
  def setRt(rtime:Long): Unit ={
    rt=rtime;
  }
  def getRt:Long = rt

  /**
    * �ն˳�ǿ
    */
  private var rssi = ""

  /**
    * ��ǰ����ssid
    */
  private var ssid = ""

  /**
    * �ȵ�mac
    */
  private var apmac = ""

  /**
    * �ȵ�ͨ��
    */
  private var apc = ""

  /**
    * �ȵ��������
    */
  private var ape = ""

  /**
    * x����
    */
  private var x = ""

  /**
    * y����
    */
  private var y = ""

  /**
    * �������
    */
  private var nw = ""
  def setNw_= ( _nw : String ){
    nw =  _nw;
  }
  /**
    * �豸���
    */
  private var devID = ""
  def setDevID_= ( _devID : String ){
    devID =  _devID;
  }
  def getDevId:String=devID

  /**
    * ����
    */
  private var lg = ""
  def setLg_= ( _lg : String ){
    lg =  _lg;
  }
  /**
    * ά��
    */
  private var la = ""

  /**
    * �Ƿ����
    */
  private var isenter = ""
  def setIsenter_= ( _isenter : String ){
    isenter =  _isenter;
  }
  def getIsenter:String=isenter

  /**
    *�����������
    */
  private var identitype = ""
  def setIdentitype_= ( _identitype : String ){
    identitype =  _identitype;
  }
  /**
    * �����������
    */
  private var certicode = ""
  def setCerticode_= ( _certicode : String ){
    certicode =  _certicode;
  }


  def ToMacRecoder(array: Array[String]): Unit = {
    mac = CETCProtocol.Escape(array(0)) //38-29-5A-0D-9B-29
    bd = CETCProtocol.Escape(array(1)) //GUANGDONG OPPO MOBILE TELECOMMUNICATIONS CORP.,LTD
    cssid = CETCProtocol.Escape(array(2))
    ct = CETCProtocol.GetStrDate(CETCProtocol.IntParse(CETCProtocol.Escape(array(3)))) //1548384668
    rssi = CETCProtocol.Escape(array(4)) //-63
    identitype = CETCProtocol.Escape(array(5)) //-1
    certicode = CETCProtocol.Escape(array(6))
    ssid = CETCProtocol.Escape(array(7)) //CMCC-NuxA
    apmac = CETCProtocol.Escape(array(8)) //D0-EF-C1-1A-00-98
    apc = CETCProtocol.Escape(array(9)) //5
    ape = CETCProtocol.Escape(array(10)) //2
    x = CETCProtocol.Escape(array(11)) //0
    y = CETCProtocol.Escape(array(12)) //0
    nw = CETCProtocol.Escape(array(13)) //42082139000003
    devID = CETCProtocol.Escape(array(14)) //14306073X00037F8364FB
    lg = CETCProtocol.Escape(array(15)) //113.12968
    la = CETCProtocol.Escape(array(16)) //31.02796
    isenter = CETCProtocol.Escape(array(17)) //1
    //isenterΪ0��Ϊ�뿪����ô��ǰ�Ľ���ʱ��Ϊ�ɼ�ʱ�䣬��ǰ�Ĳɼ�ʱ����Ϊ�뿪ʱ��
    if (isenter != null && (isenter.equals(CommFunUtils.EXIT))){
      lt = ct
      ct = CETCProtocol.GetStrDate(CETCProtocol.IntParse(CETCProtocol.Escape(array(18))))
    }else{
      //���Ϊ1��˵�������ڲ�����ɼ�ʱ����Ϊ����ʱ�䣬�ɼ�ʱ���1����Ϊ�뿪ʱ��
      lt=CETCProtocol.GetStrDate(CETCProtocol.IntParse(CETCProtocol.Escape(array(3)))+1)
    }
    //�뿪ʱ��-����ʱ����Ϊ����ʱ�䣬������ڲ���isenter==1����ͣ��ʱ������Ϊ1��
    val teformat:SimpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    rt=(teformat.parse(lt).getTime-teformat.parse(ct).getTime)/1000;
  }
}
*/
