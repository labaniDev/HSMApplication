package com.example.demo.exception;

public class AdminNotAddedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AdminNotAddedException() {
	}

	public AdminNotAddedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AdminNotAddedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AdminNotAddedException(String message) {
		super(message);
	}

	public AdminNotAddedException(Throwable cause) {
		super(cause);
	}

	public AdminNotAddedException(Long adminId) {
		super("Admin not added with id ---" + adminId);
	}
	

}
