package org.sy.common.exception;

public class SyFrameWorkException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SyFrameWorkException(String message){
		super(message);
	}
	
	public SyFrameWorkException(Throwable cause)
	{
		super(cause);
	}
	
	public SyFrameWorkException(String message,Throwable cause)
	{
		super(message,cause);
	}
}
