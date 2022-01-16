/**
  * Copyright 2022 bejson.com 
  */
package io.github.kloping.Mcore.java.bean;
import java.util.List;
import java.util.Date;

/**
 * Auto-generated: 2022-01-16 15:23:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class NetWorkBean {

    private Network network;
    private long upTotal;
    private long downTotal;
    private double up;
    private double down;
    private long downPackets;
    private long upPackets;
    private List<Double> cpu;
    private Cpu_times cpu_times;
    private Load load;
    private Mem mem;
    private Date version;
    private List<Disk> disk;
    private String title;
    private String time;
    private int site_total;
    private int ftp_total;
    private int database_total;
    private String system;
    private boolean installed;
    private User_info user_info;
    private Iostat iostat;
    public void setNetwork(Network network) {
         this.network = network;
     }
     public Network getNetwork() {
         return network;
     }

    public void setUpTotal(long upTotal) {
         this.upTotal = upTotal;
     }
     public long getUpTotal() {
         return upTotal;
     }

    public void setDownTotal(long downTotal) {
         this.downTotal = downTotal;
     }
     public long getDownTotal() {
         return downTotal;
     }

    public void setUp(double up) {
         this.up = up;
     }
     public double getUp() {
         return up;
     }

    public void setDown(double down) {
         this.down = down;
     }
     public double getDown() {
         return down;
     }

    public void setDownPackets(long downPackets) {
         this.downPackets = downPackets;
     }
     public long getDownPackets() {
         return downPackets;
     }

    public void setUpPackets(long upPackets) {
         this.upPackets = upPackets;
     }
     public long getUpPackets() {
         return upPackets;
     }

    public void setCpu(List<Double> cpu) {
         this.cpu = cpu;
     }
     public List<Double> getCpu() {
         return cpu;
     }

    public void setCpu_times(Cpu_times cpu_times) {
         this.cpu_times = cpu_times;
     }
     public Cpu_times getCpu_times() {
         return cpu_times;
     }

    public void setLoad(Load load) {
         this.load = load;
     }
     public Load getLoad() {
         return load;
     }

    public void setMem(Mem mem) {
         this.mem = mem;
     }
     public Mem getMem() {
         return mem;
     }

    public void setVersion(Date version) {
         this.version = version;
     }
     public Date getVersion() {
         return version;
     }

    public void setDisk(List<Disk> disk) {
         this.disk = disk;
     }
     public List<Disk> getDisk() {
         return disk;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setTime(String time) {
         this.time = time;
     }
     public String getTime() {
         return time;
     }

    public void setSite_total(int site_total) {
         this.site_total = site_total;
     }
     public int getSite_total() {
         return site_total;
     }

    public void setFtp_total(int ftp_total) {
         this.ftp_total = ftp_total;
     }
     public int getFtp_total() {
         return ftp_total;
     }

    public void setDatabase_total(int database_total) {
         this.database_total = database_total;
     }
     public int getDatabase_total() {
         return database_total;
     }

    public void setSystem(String system) {
         this.system = system;
     }
     public String getSystem() {
         return system;
     }

    public void setInstalled(boolean installed) {
         this.installed = installed;
     }
     public boolean getInstalled() {
         return installed;
     }

    public void setUser_info(User_info user_info) {
         this.user_info = user_info;
     }
     public User_info getUser_info() {
         return user_info;
     }

    public void setIostat(Iostat iostat) {
         this.iostat = iostat;
     }
     public Iostat getIostat() {
         return iostat;
     }

}