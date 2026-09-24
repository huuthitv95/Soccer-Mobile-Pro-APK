package com.tiktok.unity;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTUnityBridge {
    public static void setConfigCallback(JSONObject config) {
        if (config == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            cls.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(cls, "TikTokInnerManager", "UpdateConfigFromNative", config.toString());
        } catch (Throwable unused) {
        }
    }
}
