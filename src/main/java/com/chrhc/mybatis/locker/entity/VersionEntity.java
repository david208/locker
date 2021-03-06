package com.chrhc.mybatis.locker.entity;

import java.io.Serializable;

import com.chrhc.mybatis.locker.annotation.VersionLocker;

@VersionLocker
public class VersionEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Long version;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
