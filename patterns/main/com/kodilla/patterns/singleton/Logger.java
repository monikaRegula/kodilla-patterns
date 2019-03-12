package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }
    public  void log(final String log){
        this.lastLog = log;
        System.out.println("Log: ["+log+"]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
