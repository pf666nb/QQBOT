/**
  * Copyright 2022 bejson.com 
  */
package io.github.kloping.Mcore.java.bean;
import java.util.List;

/**
 * Auto-generated: 2022-01-16 15:23:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Disk {

    private String filesystem;
    private String type;
    private String path;
    private List<String> size;
    private List<String> inodes;
    public void setFilesystem(String filesystem) {
         this.filesystem = filesystem;
     }
     public String getFilesystem() {
         return filesystem;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setSize(List<String> size) {
         this.size = size;
     }
     public List<String> getSize() {
         return size;
     }

    public void setInodes(List<String> inodes) {
         this.inodes = inodes;
     }
     public List<String> getInodes() {
         return inodes;
     }

}