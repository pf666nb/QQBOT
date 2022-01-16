package io.github.kloping.Mcore.java.services;

import io.github.kloping.Mcore.java.bean.SystemTotal;

/**
 * SimpleMiraiCore
 * 宝塔服务类
 *
 * @author : wpf
 * @date : 2022-01-16 13:31
 **/
public interface BtService {

    SystemTotal GetSystemTotal(String ip,String btSign);


}
