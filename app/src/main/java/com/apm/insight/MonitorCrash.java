package com.apm.insight;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.p016f.C1400b;
import com.apm.insight.p020j.C1411b;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.ConfigManager;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tiktok.util.UrlConst;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MonitorCrash {
    public static CustomRequestHeader mCustomRequestHeader;
    private static volatile boolean sAppMonitorCrashInit;
    Config mConfig;
    AttachUserData mCustomData;
    AttachUserData mCustomLongData;
    HeaderParams mParams;
    HashMap<String, String> mTagMap = new HashMap<>();

    public class Config {
        String mAid;
        String mChannel;
        String mDeviceId;
        String[] mPackageName;
        String mSSID;
        String[] mSoList;
        String[] mThreadList;
        String mUID;
        long mVersionInt = -1;
        String mVersionStr;

        public Config() {
        }

        public Config setChannel(String str) {
            this.mChannel = str;
            C1411b.m1191c();
            return this;
        }

        public Config setDeviceId(String str) {
            this.mDeviceId = str;
            C1411b.m1191c();
            return this;
        }

        public Config setPackageName(String str) {
            return setPackageName(str);
        }

        public Config setPackageName(String... strArr) {
            this.mPackageName = strArr;
            C1411b.m1191c();
            return this;
        }

        public Config setSSID(String str) {
            this.mSSID = str;
            C1411b.m1191c();
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mSoList = strArr;
            C1411b.m1191c();
            return this;
        }

        public Config setThreadList(String[] strArr) {
            this.mThreadList = strArr;
            C1411b.m1191c();
            return this;
        }

        public Config setUID(String str) {
            this.mUID = str;
            C1411b.m1191c();
            return this;
        }
    }

    public interface HeaderParams {
        Map<String, Object> getCommonParams();
    }

    private MonitorCrash(Context context, String str, long j, String str2) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        C1388d.m997a(context, this);
    }

    private MonitorCrash(String str, long j, String str2, String... strArr) {
        Config config = new Config();
        this.mConfig = config;
        config.mAid = str;
        this.mConfig.mVersionInt = j;
        this.mConfig.mVersionStr = str2;
        this.mConfig.mPackageName = strArr;
        C1388d.m998a(this);
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        if (sAppMonitorCrashInit) {
            return null;
        }
        synchronized (MonitorCrash.class) {
            if (sAppMonitorCrashInit) {
                return null;
            }
            sAppMonitorCrashInit = true;
            C1470l.m1663a(context);
            return new MonitorCrash(context, str, j, str2);
        }
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        C1470l.m1663a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3, String[] strArr) {
        C1470l.m1663a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, str3);
        monitorCrash.config().setPackageName(str3).setSoList(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String... strArr) {
        C1470l.m1663a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr);
        return monitorCrash;
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String[] strArr, String[] strArr2) {
        C1470l.m1663a(context);
        MonitorCrash monitorCrash = new MonitorCrash(str, j, str2, strArr);
        monitorCrash.config().setPackageName(strArr).setSoList(strArr2);
        return monitorCrash;
    }

    public static void setCustomRequestHeaderCallback(CustomRequestHeader customRequestHeader) {
        mCustomRequestHeader = customRequestHeader;
    }

    public MonitorCrash addTags(String str, String str2) {
        this.mTagMap.put(str, str2);
        return this;
    }

    public Config config() {
        return this.mConfig;
    }

    public void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        if (this == C1388d.f495a) {
            C1470l.m1664a(iCrashCallback, crashType);
        } else {
            C1470l.m1664a(new C1375b(this.mConfig.mAid, iCrashCallback), crashType);
        }
    }

    public void registerOOMCallback(IOOMCallback iOOMCallback) {
        if (this == C1388d.f495a) {
            C1470l.m1665a(iOOMCallback);
        } else {
            C1470l.m1665a(new C1375b(this.mConfig.mAid, iOOMCallback));
        }
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        C1400b.m1124a(this, th, str, str2, "core_exception_monitor");
    }

    public MonitorCrash setCustomDataCallback(AttachUserData attachUserData) {
        this.mCustomData = attachUserData;
        return this;
    }

    public MonitorCrash setReportUrl(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int iIndexOf = str.indexOf("://");
        if (iIndexOf < 0) {
            str = UrlConst.HTTPS.concat(String.valueOf(str));
            i = 8;
        } else {
            i = iIndexOf + 3;
        }
        int iIndexOf2 = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING, i);
        if (iIndexOf2 >= 0) {
            str = str.substring(0, iIndexOf2);
        }
        C1373a.m861a((Object) "set url ".concat(String.valueOf(str)));
        C1390e.m1034i().setLaunchCrashUrl(str + ConfigManager.EXCEPTION_URL_SUFFIX);
        C1390e.m1034i().setJavaCrashUploadUrl(str + ConfigManager.JAVA_URL_SUFFIX);
        C1390e.m1034i().setNativeCrashUrl(str + ConfigManager.NATIVE_URL_SUFFIX);
        C1390e.m1034i().setConfigUrl(str + ConfigManager.CONFIG_URL_SUFFIX);
        return this;
    }

    public MonitorCrash withOtherHeaders(HeaderParams headerParams) {
        this.mParams = headerParams;
        return this;
    }
}
