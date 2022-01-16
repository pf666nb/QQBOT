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
public class Eth0 {

    private long upTotal;
    private long downTotal;
    private double up;
    private double down;
    private long downPackets;
    private long upPackets;
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

}