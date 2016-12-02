package com.xuxl.common.code;

import java.io.Serializable;

public abstract class AbstractReturnCode implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private final String msg;
    
    private final int code;

    public AbstractReturnCode(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

	public String getMsg() {
		return msg;
	}
}
