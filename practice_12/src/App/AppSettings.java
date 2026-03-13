package App;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppSettings {
    private static AppSettings instance;
    private final ConcurrentHashMap<String, String> settings;

    private AppSettings() {
        settings = new ConcurrentHashMap<>();
    }

    public static AppSettings getInstance() {
        if (instance == null) instance = new AppSettings();
        return instance;
    }

    public void setSettings(String key, String value) {
        settings.put(key, value);
    }

    public String getSettings(String key) {
        return settings.getOrDefault(key, "Настройка отсутсвует");
    }
}
