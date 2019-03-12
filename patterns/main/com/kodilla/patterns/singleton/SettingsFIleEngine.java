package com.kodilla.patterns.singleton;

public class SettingsFIleEngine {
    private String fileName = "";
    private static SettingsFIleEngine settingsFIleEngine = null;

    private SettingsFIleEngine() {
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName){
        this.fileName = fileName;
        System.out.println("Opening settings file");
    }

    public void close(){
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings(){
        System.out.println("Loading settings from file");
        return  true;
    }

    public boolean saveSettings(){
        System.out.println("Saving settings to file");
        return true;
    }

    public static SettingsFIleEngine getInstance(){

        if (settingsFIleEngine == null){
            synchronized (SettingsFIleEngine.class) {
                if (settingsFIleEngine == null) {
                    settingsFIleEngine = new SettingsFIleEngine();
                }
            }
        }
        return settingsFIleEngine;
    }
}
