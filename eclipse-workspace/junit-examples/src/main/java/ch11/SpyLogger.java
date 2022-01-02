package ch11;

import java.util.logging.Logger;

public class SpyLogger extends Logger {

	//Spy用保持フィールド
	private String log;
	
	protected SpyLogger(String name, String resourceBundleName) {
		super(name, resourceBundleName);
		// TODO Auto-generated constructor stub
	}
	
	public SpyLogger() {
		super(null, null);
		this.log = "";
	}
	
	
	@Override
	public void info(String msg) {
		
		//Spy
		this.log += msg;
		
		// TODO Auto-generated method stub
		super.info(msg);
		
	}
	
	public String getLog() {
		return this.log;
	}

}
