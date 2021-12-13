package net.osgg.ejemploAppRecetas.service;

public class FileStorangeException extends RuntimeException {
    private static final long serialVersionUID =1L;
	private String msg;
	
	public FileStorangeException(String msg) {
		this.msg= msg;
	}
	
	public String getMsg() {
		return msg;
	}

}
