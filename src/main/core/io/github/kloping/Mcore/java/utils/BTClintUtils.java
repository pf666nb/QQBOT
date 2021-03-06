package io.github.kloping.Mcore.java.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.kloping.Mcore.java.bean.NetWorkBean;
import io.github.kloping.Mcore.java.bean.SystemTotal;
import io.github.kloping.MySpringTool.annotations.AutoStand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author frank
 * @date 2020-01-04
 * @email:345690014@qq.com
 */
public class BTClintUtils {
//    @AutoStand(id = "btSign")
//    public static String btSign = "";
//    @AutoStand(id = "ip")
//    public static String ip = "";

    public  static SystemTotal getBTinfo(String ip, String btSign) {
        try {
//            String bt = "dCp0rK9LZ0OAwkr8MFcBgJEV4yAnSF02";
            String url = "http://"+ip+":8888/system?action=GetSystemTotal";
            String timestamp = (new Date().getTime()+"");
            String md5Sign = getMd5(btSign);
            String temp = timestamp+md5Sign;
            String token = getMd5(temp);
            String json = "request_time="+timestamp+"&request_token="+token;
            String responseText = sendPost(url,json);
            SystemTotal systemTotal = JSON.parseObject(responseText, SystemTotal.class);
            System.out.println(systemTotal);
            return systemTotal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static SystemTotal getNetwork(String ip,String btSign) {
        try {

            String url = "http://"+ip+":8888/system?action=GetNetWork";
            String timestamp = (new Date().getTime()+"");
            String md5Sign = getMd5(btSign);
            String temp = timestamp+md5Sign;
            String token = getMd5(temp);
            String json = "request_time="+timestamp+"&request_token="+token;
            String responseText = sendPost(url,json);
            SystemTotal systemTotal = JSON.parseObject(responseText, SystemTotal.class);
            System.out.println(systemTotal);
            return systemTotal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)
    {
        try {
//            String timestamp = (new Date().getTime()+"");
//            String md5Sign = getMd5(btSign);
//            String temp = timestamp+md5Sign;
//            String token = getMd5(temp);
//            String json = "request_time="+timestamp+"&request_token="+token;
//            String responseText = sendPost(url,json);
//            NetWorkBean systemTotal = JSON.parseObject(responseText, NetWorkBean.class);
//            System.out.println(systemTotal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getMd5(String str) throws Exception
    {
        try {
            // ????????????MD5??????????????????
            MessageDigest md = MessageDigest.getInstance("MD5");
            // ??????md5??????
            md.update(str.getBytes());
            // digest()??????????????????md5 hash??????????????????8?????????????????????md5 hash??????16??????hex?????????????????????8????????????
            // BigInteger????????????8????????????????????????16???hex??????????????????????????????????????????????????????hash???
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new Exception("MD5?????????????????????"+e.toString());
        }
    }

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        try {
            URL realUrl = new URL(url);
            // ?????????URL???????????????
            URLConnection conn = realUrl.openConnection();
            // ???????????????????????????
            conn.setRequestProperty("accept", "text/xml,text/javascript,text/html,application/json");
            conn.setRequestProperty("connection", "Keep-Alive");
            // ??????POST??????????????????????????????
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // ??????URLConnection????????????????????????
            out = new PrintWriter(conn.getOutputStream());
            // ??????????????????
            out.print(param);
            // flush??????????????????
            out.flush();
            // ??????BufferedReader??????????????????URL?????????
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println("?????? POST ?????????????????????"+e);
            e.printStackTrace();
        }
        //??????finally?????????????????????????????????
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result.toString();
    }

}
