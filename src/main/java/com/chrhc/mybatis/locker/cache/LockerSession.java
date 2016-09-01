package com.chrhc.mybatis.locker.cache;

public class LockerSession {
	
	private static ThreadLocal<Boolean> lockerFlag = new ThreadLocal<Boolean>() {

	    @Override
	    protected Boolean initialValue() {
	        return false;
	    }
	};

	public static boolean getLockerFlag() {
		return lockerFlag.get();
	}

	public static void setLockerFlag(boolean flag) {
		lockerFlag.set(flag);
	}
	
	public static void clearLockerFlag() {
		lockerFlag.set(false);
	}

}
