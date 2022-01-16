/**
  * Copyright 2022 bejson.com 
  */
package io.github.kloping.Mcore.java.bean;

/**
 * Auto-generated: 2022-01-16 15:23:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Cpu_times {

    private double user;
    private int nice;
    private double system;
    private double idle;
    private int iowait;
    private int irq;
    private int softirq;
    private int steal;
    private int guest;
    private int guest_nice;
    private int 总进程数;
    private int 活动进程数;
    public void setUser(double user) {
         this.user = user;
     }
     public double getUser() {
         return user;
     }

    public void setNice(int nice) {
         this.nice = nice;
     }
     public int getNice() {
         return nice;
     }

    public void setSystem(double system) {
         this.system = system;
     }
     public double getSystem() {
         return system;
     }

    public void setIdle(double idle) {
         this.idle = idle;
     }
     public double getIdle() {
         return idle;
     }

    public void setIowait(int iowait) {
         this.iowait = iowait;
     }
     public int getIowait() {
         return iowait;
     }

    public void setIrq(int irq) {
         this.irq = irq;
     }
     public int getIrq() {
         return irq;
     }

    public void setSoftirq(int softirq) {
         this.softirq = softirq;
     }
     public int getSoftirq() {
         return softirq;
     }

    public void setSteal(int steal) {
         this.steal = steal;
     }
     public int getSteal() {
         return steal;
     }

    public void setGuest(int guest) {
         this.guest = guest;
     }
     public int getGuest() {
         return guest;
     }

    public void setGuest_nice(int guest_nice) {
         this.guest_nice = guest_nice;
     }
     public int getGuest_nice() {
         return guest_nice;
     }

    public void set总进程数(int 总进程数) {
         this.总进程数 = 总进程数;
     }
     public int get总进程数() {
         return 总进程数;
     }

    public void set活动进程数(int 活动进程数) {
         this.活动进程数 = 活动进程数;
     }
     public int get活动进程数() {
         return 活动进程数;
     }

}