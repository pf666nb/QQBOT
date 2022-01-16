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
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new Exception("MD5加密出现错误，"+e.toString());
        }
    }

    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "text/xml,text/javascript,text/html,application/json");
            conn.setRequestProperty("connection", "Keep-Alive");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
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
