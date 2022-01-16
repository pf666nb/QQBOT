package io.github.kloping.Mcore.java.services.impl;

import io.github.kloping.Mcore.java.bean.SystemTotal;
import io.github.kloping.Mcore.java.services.BtService;
import io.github.kloping.Mcore.java.utils.BTClintUtils;
import io.github.kloping.MySpringTool.annotations.Entity;

/**
 * SimpleMiraiCore
 * 宝塔服务实现类
 *
 * @author : wpf
 * @date : 2022-01-16 13:33
 **/
@Entity("base2")
public class BtServicelmpl implements BtService {

    @Override
    public SystemTotal GetSystemTotal(String ip, String btSign) {
        return BTClintUtils.getBTinfo(ip,btSign);
    }
}
