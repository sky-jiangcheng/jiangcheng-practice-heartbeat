package com.jiangc.practice.zk.zkclient;

import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.data.Stat;

import com.jiangc.practice.zk.zkclient.CuraterUnil;

public class Node_C {

	public static void main(String[] args) throws Exception {
		System.out.println("test begin");
		
		status();
		
		System.out.println("test done");
	}
	
	
	   public  static  void status() throws Exception {
	        //判断节点是否存在
	        CuratorFramework connection = CuraterUnil.createConnection();
	        Stat stat = connection.checkExists()
	                .forPath("/create1");
	        System.out.println(stat.getVersion());
	    }
}
