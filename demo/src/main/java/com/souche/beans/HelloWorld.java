package com.souche.beans;

public class HelloWorld {

	private String msg;

	public void sayHello(){
		System.out.println(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
