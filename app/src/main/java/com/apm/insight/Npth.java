package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.p017g.C1401a;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1427c;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.ConfigManager;
import com.ironsource.C12460ra;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C1390e.m1021b().m896b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C1390e.m1021b().m890a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        C1390e.m1021b().m893a(map);
    }

    public static void checkInnerNpth(boolean z) {
        C1470l.m1684c(z);
    }

    public static void dumpHprof(String str) {
        C1470l.m1683c(str);
    }

    public static void enableActivityDump(boolean z) {
        C1390e.m1029e(z);
    }

    public static void enableAnrInfo(boolean z) {
        C1470l.m1680b(z);
    }

    public static void enableLoopMonitor(boolean z) {
        C1470l.m1674a(z);
    }

    public static void enableMessageDump(boolean z) {
        C1390e.m1031f(z);
    }

    public static void enableNativeDump(boolean z) {
        C1470l.m1687d(z);
    }

    public static void enableThreadsBoost() {
        C1390e.m1037l();
    }

    public static ConfigManager getConfigManager() {
        return C1390e.m1034i();
    }

    public static boolean hasCrash() {
        return C1470l.m1697l();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return C1470l.m1698m();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return C1470l.m1699n();
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        if (sInit) {
            return;
        }
        sInit = true;
        C1470l.m1662a(application, context);
        C1390e.m1017a(application, context, iCommonParams);
        Map<String, Object> mapM1509a = C1390e.m1012a().m1509a();
        MonitorCrash monitorCrashInit = MonitorCrash.init(context, String.valueOf(C1427c.AnonymousClass1.m1303a(mapM1509a.get(C12460ra.f31825b), 4444)), C1427c.AnonymousClass1.m1303a(mapM1509a.get("update_version_code"), 0), String.valueOf(mapM1509a.get("app_version")));
        if (monitorCrashInit != null) {
            monitorCrashInit.config().setDeviceId(C1390e.m1012a().m1512d()).setChannel(String.valueOf(mapM1509a.get("channel")));
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        init(context, iCommonParams, true, false, false);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        init(context, iCommonParams, z, z, z2, z3);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        init(context, iCommonParams, z, z2, z3, z4, 0L);
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationM1033h;
        if (C1390e.m1033h() != null) {
            applicationM1033h = C1390e.m1033h();
        } else if (context instanceof Application) {
            applicationM1033h = (Application) context;
            if (applicationM1033h.getBaseContext() == null) {
                throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
            }
        } else {
            try {
                applicationM1033h = (Application) context.getApplicationContext();
                if (applicationM1033h == null) {
                    throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                }
                if (applicationM1033h.getBaseContext() != null) {
                    context = applicationM1033h.getBaseContext();
                }
            } catch (Throwable unused) {
                throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
        }
        init(applicationM1033h, context, iCommonParams, z, z2, z3, z4, j);
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        C1390e.m1040o();
        init(context, iCommonParams, true, false, true, true);
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        C1390e.m1040o();
        C1390e.m1022b(i, str);
        init(context, iCommonParams, true, true, true, true);
    }

    public static boolean isANREnable() {
        return C1470l.m1685c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return C1470l.m1681b();
    }

    public static boolean isNativeCrashEnable() {
        return C1470l.m1688d();
    }

    public static boolean isRunning() {
        return C1470l.m1694i();
    }

    public static boolean isStopUpload() {
        return C1470l.m1700o();
    }

    public static void openANRMonitor() {
        C1470l.m1692g();
    }

    public static void openJavaCrashMonitor() {
        C1470l.m1691f();
    }

    public static boolean openNativeCrashMonitor() {
        return C1470l.m1693h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C1470l.m1664a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        C1470l.m1665a(iOOMCallback);
    }

    public static void registerSdk(int i, String str) {
        C1390e.m1014a(i, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C1390e.m1021b().m897b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C1390e.m1021b().m891a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        C1470l.m1668a(str);
    }

    @Deprecated
    public static void reportError(String str) {
        C1470l.m1679b(str);
    }

    @Deprecated
    public static void reportError(Throwable th) {
        C1470l.m1673a(th);
    }

    public static void setAlogFlushAddr(long j) {
        C1470l.m1696k();
    }

    public static void setAlogFlushV2Addr(long j) {
        C1470l.m1661a(j);
    }

    public static void setAlogLogDirAddr(long j) {
        C1470l.m1675b(j);
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setApplication(Application application) {
        C1390e.m1015a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C1390e.m1021b().m890a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            C1390e.m1019a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        C1390e.m1021b().m892a(iCrashFilter);
    }

    public static void setCrashWaitTime(long j) {
        C1401a.m1150a(j);
    }

    public static void setCurProcessName(String str) {
        C1425a.m1289a(str);
    }

    public static void stopAnr() {
        C1470l.m1695j();
    }

    public static void stopUpload() {
        C1470l.m1701p();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C1470l.m1676b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C1470l.m1677b(iOOMCallback);
    }
}
