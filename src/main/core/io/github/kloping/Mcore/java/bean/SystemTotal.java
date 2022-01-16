package io.github.kloping.Mcore.java.bean;

import lombok.Data;

/**
 * SimpleMiraiCore
 *
 * @author : wpf
 * @date : 2022-01-16 13:09
 **/
@Data
public class SystemTotal {
    private String memTotal;
    private String memFree;
    private String memBuffers;
    private String memCached;
    private String memRealUsed;
    private String cpuNum;
    private String cpuRealUsed;
    private String time;
    private String system;
    private String isuser;
    private String isport;
    private String version;

    @Override
    public String toString() {
        return "服务器基本信息{" +
                "物理内存总量='" + memTotal + '\'' +
                ", 可用物理内存='" + memFree + '\'' +
                ", 系统缓冲='" + memBuffers + '\'' +
                ", 缓存化的内存='" + memCached + '\'' +
                ", 已使用物理内存='" + memRealUsed + '\'' +
                ", CPU核心数='" + cpuNum + '\'' +
                ", cpu使用率='" + cpuRealUsed + '\'' +
                ", 运行时间='" + time + '\'' +
                ", 服务器系统='" + system + '\'' +
                ", 版本='" + version + '\'' +
                '}';
    }
}
