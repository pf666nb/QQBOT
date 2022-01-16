package io.github.kloping.Mcore.java.controllers;

import io.github.kloping.Mcore.java.services.BtService;
import io.github.kloping.MySpringTool.annotations.Action;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.Controller;
import io.github.kloping.MySpringTool.annotations.Param;

/**
 * SimpleMiraiCore
 * 宝塔控制类
 *
 * @author : wpf
 * @date : 2022-01-16 13:30
 **/
@Controller
public class BtController {

    private static String IP = "";

    private static String BtSign = "";

    @AutoStand
    BtService btService;

    @Action("服务器信息")
    public String btServer() {
        if (IP.equals("")||BtSign.equals("")){
            return"请先绑定服务器ip和密钥";
        }
        return btService.GetSystemTotal(IP,BtSign).toString();
    }
    @Action("我的服务器")
    public String MyServer(){
        if (IP.equals("")){
            return"请先绑定服务器！指令——》绑定服务器+ip";
        }
        return IP;
    }
    @Action("setIp<.+=>ip>")
    public String BindServer(@Param("ip")String ip) {
        System.out.println(ip);
        IP = ip;
        return "绑定成功!当前服务器为-》"+IP;
    }
    @Action("setKey<.+=>str>")
    public String BindPWD(@Param("str")String btSign) {
        System.out.println(btSign);
        BtSign = btSign;
        return "绑定成功!当前密钥为-》"+BtSign;
    }

    @Action("实时状态")
    public String getNetwork(){
        return"";
    }

}
