package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.AbstractC7810a;
import com.fyber.inneractive.sdk.bidder.C7855b;
import com.fyber.inneractive.sdk.bidder.C7863f;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7914c;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C7948b0;
import com.fyber.inneractive.sdk.config.C7961e;
import com.fyber.inneractive.sdk.config.C7963f;
import com.fyber.inneractive.sdk.config.C7965g;
import com.fyber.inneractive.sdk.config.C8009i;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8023p;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.C8042t;
import com.fyber.inneractive.sdk.config.C8048w;
import com.fyber.inneractive.sdk.config.C8050x;
import com.fyber.inneractive.sdk.config.C8051x0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8027r;
import com.fyber.inneractive.sdk.config.RunnableC7960d0;
import com.fyber.inneractive.sdk.config.RunnableC8018m0;
import com.fyber.inneractive.sdk.config.cellular.AbstractC7954d;
import com.fyber.inneractive.sdk.config.cellular.C7951a;
import com.fyber.inneractive.sdk.config.cellular.InterfaceC7958h;
import com.fyber.inneractive.sdk.config.global.C7967a;
import com.fyber.inneractive.sdk.factories.AbstractC8063b;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.AbstractC8069h;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.nativead.C8352b;
import com.fyber.inneractive.sdk.nativead.C8355e;
import com.fyber.inneractive.sdk.network.C8392l0;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.serverapi.extradata.C9119d;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9171n;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.AbstractC9208z;
import com.fyber.inneractive.sdk.util.C9136b0;
import com.fyber.inneractive.sdk.util.C9188s1;
import com.fyber.inneractive.sdk.util.C9206y;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.RunnableC9176o1;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.C9219b1;
import com.ironsource.C11744X3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class InneractiveAdManager implements InterfaceC8027r {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* JADX INFO: renamed from: e */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f17908e;

    /* JADX INFO: renamed from: f */
    public static C8056c f17909f;

    /* JADX INFO: renamed from: a */
    public volatile Context f17910a;

    /* JADX INFO: renamed from: b */
    public String f17911b;

    /* JADX INFO: renamed from: c */
    public boolean f17912c = false;

    /* JADX INFO: renamed from: d */
    public boolean f17913d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    /* JADX INFO: renamed from: a */
    public static void m20459a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (AbstractC8057d.f17942a.f17910a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        C8428w c8428w = new C8428w(EnumC8415t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (AbstractC9087e) null);
        if (!TextUtils.isEmpty(str)) {
            c8428w.m20807a("message", str);
        }
        c8428w.m20807a("init_status", fyberInitStatus.name());
        c8428w.m20808a((String) null);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g != null) {
            c7965g.m20399a();
        } else {
            IAlog.m21950f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.f17654M.f17694z.f21513a = null;
    }

    public static void clearLgpdConsentData() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g != null) {
            c7965g.m20403b();
        } else {
            IAlog.m21950f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g != null) {
            c7965g.m20404c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g == null) {
            IAlog.m21950f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (AbstractC9174o.f21470a != null) {
            c7965g.f17738j = Boolean.TRUE;
        } else {
            c7965g.getClass();
            IAlog.m21950f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void currentAudienceIsAChild() {
        AbstractC8057d.f17942a.f17912c = true;
    }

    public static void destroy() {
        C8252l c8252l;
        IAlog.m21945a("InneractiveAdManager:destroy called", new Object[0]);
        if (AbstractC8057d.f17942a.f17910a == null) {
            IAlog.m21945a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        AbstractC8057d.f17942a.f17910a = null;
        IAConfigManager.removeListener(f17908e);
        f17908e = null;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        iAConfigManager.f17694z.f21513a = null;
        iAConfigManager.f17676h = false;
        try {
            C7951a c7951a = iAConfigManager.f17668L;
            if (c7951a != null && c7951a.f17701a != null) {
                c7951a.f17703c.clear();
                c7951a.f17701a.mo20389a((InterfaceC7958h) c7951a);
                c7951a.f17701a.mo20387a();
            }
        } catch (Throwable th) {
            IAlog.m21944a("failed to destroy network watchdog", th, new Object[0]);
        }
        C9119d c9119d = iAConfigManager.f17664H;
        c9119d.f21372d.clear();
        c9119d.f21374f = null;
        C8248h c8248h = iAConfigManager.f17660D;
        if (!TextUtils.isEmpty(c8248h.f18418l) && (c8252l = c8248h.f18422p) != null) {
            c8252l.destroy();
            c8248h.f18422p = null;
        }
        AbstractC9166l0.f21461a.m21980a();
        C9136b0 c9136b0 = AbstractC9208z.f21514a;
        synchronized (c9136b0) {
            if (c9136b0.f21437c != null) {
                IAlog.m21945a("%sremoving screen state receiver and destroying singleton", IAlog.m21943a(c9136b0));
                try {
                    c9136b0.f21437c.unregisterReceiver(c9136b0.f21438d);
                } catch (Exception unused) {
                }
                c9136b0.f21437c = null;
                c9136b0.f21438d = null;
                c9136b0.f21435a.clear();
            }
        }
        AbstractC8065d.f17949a.f17950a.clear();
        AbstractC8063b.f17947a.f17948a.clear();
        AbstractC8069h.f17951a.f17952a.clear();
        InneractiveAdSpotManager.destroy();
        AbstractC9171n.f21465a.clear();
        C7855b c7855b = C7855b.f17518h;
        C7863f c7863f = c7855b.f17522d;
        if (c7863f != null) {
            try {
                AbstractC9174o.f21470a.unregisterReceiver(c7863f);
            } catch (Exception unused2) {
            }
        }
        c7855b.f17522d = null;
        C7951a c7951a2 = IAConfigManager.f17654M.f17668L;
        if (c7951a2 != null) {
            try {
                c7951a2.f17703c.remove(c7855b);
            } catch (Throwable th2) {
                IAlog.m21944a("failed to remove network observer", th2, new Object[0]);
            }
        }
        C8352b.f18613f.m20725a();
    }

    public static String getAppId() {
        return IAConfigManager.f17654M.f17671c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return AbstractC8057d.f17942a.f17911b;
    }

    public static Boolean getGdprConsent() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g != null) {
            return c7965g.m20405d();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g != null) {
            return c7965g.f17734f;
        }
        IAlog.m21950f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.f17654M.f17679k;
    }

    public static String getUserId() {
        return IAConfigManager.f17654M.f17659C.f17735g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.f17654M.f17678j;
    }

    public static String getVersion() {
        return "8.4.3";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String language;
        List<ResolveInfo> listQueryIntentServices;
        int i;
        char c;
        if (context == null || str == null) {
            IAlog.m21946b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            m20459a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? "appid" : "context").concat(" is null"));
            return;
        }
        String str2 = IAConfigManager.f17654M.f17671c;
        boolean z = (str2 == null || str2.equalsIgnoreCase(str)) ? false : true;
        if (AbstractC8057d.f17942a.f17910a != null && !z) {
            IAlog.m21945a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            m20459a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.f21428c.retainAll(Collections.singleton(IAlog.f21427b));
        int i2 = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str3 : property.split(",")) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str3).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.f21428c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        AbstractC9174o.f21470a = (Application) context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        boolean z2 = z;
        IAlog.m21945a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.m21945a("Firing Event 999 for %s", string);
            C8428w c8428w = new C8428w(EnumC8424u.IA_UNCAUGHT_EXCEPTION);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_name", string3);
                i = 2;
                c = 1;
            } catch (Exception unused2) {
                i = 2;
                c = 1;
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "exception_name", string3);
            }
            try {
                jSONObject.put("description", string2);
            } catch (Exception unused3) {
                Object[] objArr = new Object[i];
                objArr[0] = "description";
                objArr[c] = string2;
                IAlog.m21950f("Got exception adding param to json object: %s, %s", objArr);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused4) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = "stack_trace";
                objArr2[c] = string;
                IAlog.m21950f("Got exception adding param to json object: %s, %s", objArr2);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        if (f17909f == null) {
            f17909f = new C8056c();
        }
        C8056c c8056c = f17909f;
        c8056c.f17940a = sharedPreferences;
        Thread.setDefaultUncaughtExceptionHandler(c8056c);
        C9136b0 c9136b0 = AbstractC9208z.f21514a;
        Context applicationContext = context.getApplicationContext();
        c9136b0.getClass();
        IAlog.m21945a("%sinit called", IAlog.m21943a(c9136b0));
        c9136b0.f21437c = applicationContext;
        c9136b0.f21438d = new C9206y(c9136b0);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        c9136b0.f21437c.registerReceiver(c9136b0.f21438d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(AbstractC9174o.f21470a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> listAsList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new C8355e());
        for (BroadcastReceiver broadcastReceiver : listAsList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused5) {
                IAlog.m21950f("%sCould not trigger receiver for %s", IAlog.m21942a(AbstractC7810a.class), broadcastReceiver);
            }
        }
        if (AbstractC8065d.f17949a.f17950a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (listAsList.size() == 0) {
            IAlog.m21946b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            m20459a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        C8054a c8054a = new C8054a(context, onFyberMarketplaceInitializedListener);
        f17908e = c8054a;
        IAConfigManager.addListener(c8054a);
        if (z2) {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            iAConfigManager.f17671c = str;
            HashMap map = iAConfigManager.f17669a;
            if (map != null) {
                map.clear();
            }
            HashMap map2 = iAConfigManager.f17670b;
            if (map2 != null) {
                map2.clear();
            }
            iAConfigManager.f17673e = null;
            iAConfigManager.f17672d = "";
            IAConfigManager.m20375a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.f17654M;
            if (!iAConfigManager2.f17676h) {
                iAConfigManager2.f17689u = new C8009i(context, applicationContext3);
                C9188s1 c9188s1 = new C9188s1();
                iAConfigManager2.f17692x = c9188s1;
                c9188s1.f21487c = applicationContext3.getApplicationContext();
                AbstractC9183r.f21477a.execute(new RunnableC9176o1(c9188s1));
                C8392l0 c8392l0 = iAConfigManager2.f17686r;
                if (!c8392l0.f18674b) {
                    c8392l0.f18674b = true;
                    for (int i3 = 0; i3 < 6; i3++) {
                        c8392l0.f18676d.submit(c8392l0.f18677e);
                    }
                }
                C9219b1.f21525c.getClass();
                iAConfigManager2.f17659C = new C7965g();
                C8040s c8040s = new C8040s(applicationContext3);
                iAConfigManager2.f17688t = c8040s;
                iAConfigManager2.f17690v = new C8042t(c8040s);
                iAConfigManager2.f17662F.m20743a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.f17688t.f17863c.add(new C8050x(iAConfigManager2));
                C8040s c8040s2 = iAConfigManager2.f17688t;
                c8040s2.getClass();
                IAConfigManager.f17654M.f17686r.m20768a(new C8427v0(new C8023p(c8040s2), c8040s2.f17861a, c8040s2.f17865e));
                iAConfigManager2.f17693y = new C7967a();
                IAlog.m21945a("Initializing config manager", new Object[0]);
                IAlog.m21945a("Config manager: lib name = %s", C11744X3.f26142d);
                IAlog.m21945a("Config manager: app version = %s", "8.4.3");
                C8048w c8048w = AbstractC8044u.f17878a;
                if (c8048w.f17885a == null) {
                    c8048w.f17885a = applicationContext3;
                    new Thread(new RunnableC8018m0(applicationContext3, c8048w)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.m21946b("************************************************************************************************************************", new Object[0]);
                    IAlog.m21946b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.m21946b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.m21946b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.f17674f = applicationContext3;
                iAConfigManager2.f17671c = str;
                iAConfigManager2.f17678j = new InneractiveUserConfig();
                iAConfigManager2.f17676h = true;
                C8051x0 c8051x0 = iAConfigManager2.f17691w;
                c8051x0.getClass();
                C7961e c7961e = new C7961e(c8051x0);
                c8051x0.f17889b = c7961e;
                c7961e.m20395a();
                c8051x0.f17891d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                C7916e c7916e = new C7916e();
                c8051x0.f17888a = c7916e;
                RunnableC7914c runnableC7914c = new RunnableC7914c(c7916e);
                ThreadPoolExecutor threadPoolExecutor = AbstractC9183r.f21477a;
                threadPoolExecutor.execute(runnableC7914c);
                iAConfigManager2.f17657A = new C8427v0(new C7948b0(iAConfigManager2), iAConfigManager2.f17674f, new C7963f());
                threadPoolExecutor.execute(new RunnableC7960d0(iAConfigManager2));
                try {
                    language = Locale.getDefault().getLanguage();
                    try {
                        IAlog.m21945a("Available device language: %s", language);
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    language = null;
                }
                iAConfigManager2.f17683o = language;
                C8248h c8248h = iAConfigManager2.f17660D;
                c8248h.f18407a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = c8248h.f18407a;
                c8248h.f18418l = (context2 == null || (listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) == null || listQueryIntentServices.size() <= 0) ? null : listQueryIntentServices.get(0).serviceInfo.packageName;
                C7951a c7951a = new C7951a(iAConfigManager2.f17674f);
                iAConfigManager2.f17668L = c7951a;
                AbstractC7954d abstractC7954d = c7951a.f17701a;
                if (abstractC7954d != null) {
                    try {
                        abstractC7954d.mo20388a(c7951a);
                    } catch (Throwable th) {
                        IAlog.m21944a("failed to register network detector", th, new Object[0]);
                    }
                }
            }
        }
        AbstractC8057d.f17942a.f17910a = context.getApplicationContext();
        IAConfigManager iAConfigManager3 = IAConfigManager.f17654M;
        iAConfigManager3.f17688t.f17863c.remove(AbstractC8057d.f17942a);
        iAConfigManager3.f17688t.f17863c.add(AbstractC8057d.f17942a);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return AbstractC8057d.f17942a.f17912c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        AbstractC8057d.f17942a.f17911b = str;
    }

    public static void setExtraData(String str, String str2) {
        C9119d c9119d = IAConfigManager.f17654M.f17664H;
        c9119d.getClass();
        if (!AbstractC9195v.m22030a(str)) {
            IAlog.m21945a("%sCould not set extra data, key can't be null or empty", "UserExtraDataManager");
            return;
        }
        if (!AbstractC9195v.m22030a(str2)) {
            c9119d.f21372d.remove(str.trim());
            IAlog.m21945a("%sCleared extra data successfully for key: %s", "UserExtraDataManager", str);
        } else {
            String strTrim = str.trim();
            String strTrim2 = str2.trim();
            c9119d.f21372d.put(strTrim, strTrim2);
            IAlog.m21945a("%sSet extra data successfully for key: %s, value: %s", "UserExtraDataManager", strTrim, strTrim2);
        }
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g == null) {
            IAlog.m21950f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (AbstractC9174o.f21470a == null) {
            c7965g.getClass();
            IAlog.m21950f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        c7965g.f17729a = Boolean.valueOf(z);
        if (!c7965g.m20402a(z, "IAGDPRBool")) {
            IAlog.m21950f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
        c7965g.f17734f = gdprConsentSource;
        if (c7965g.m20401a("IAGdprSource", gdprConsentSource.name())) {
            return;
        }
        IAlog.m21950f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setGdprConsentString(String str) {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g == null) {
            IAlog.m21950f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (AbstractC9174o.f21470a == null) {
            c7965g.getClass();
            IAlog.m21950f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            c7965g.f17732d = str;
            if (c7965g.m20401a("IAGdprConsentData", str)) {
                return;
            }
            IAlog.m21950f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
        }
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.f17654M.f17694z.f21513a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z) {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g == null) {
            IAlog.m21950f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (AbstractC9174o.f21470a == null) {
            c7965g.getClass();
            IAlog.m21950f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            c7965g.f17737i = Boolean.valueOf(z);
            if (c7965g.m20402a(z, "IALgpdConsentStatus")) {
                return;
            }
            IAlog.m21950f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setLogLevel(int i) {
        IAlog.f21426a = i;
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            iAConfigManager.f17681m = inneractiveMediationName;
            iAConfigManager.f17680l = inneractiveMediationName.getKey();
        }
    }

    public static void setMediationName(String str) {
        IAConfigManager.f17654M.f17680l = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.f17654M.f17682n = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.f17654M.f17679k = z;
    }

    public static void setUSPrivacyString(String str) {
        C7965g c7965g = IAConfigManager.f17654M.f17659C;
        if (c7965g == null) {
            IAlog.m21950f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (AbstractC9174o.f21470a == null) {
            c7965g.getClass();
            IAlog.m21950f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            c7965g.f17736h = str;
            if (c7965g.m20401a("IACCPAConsentData", str)) {
                return;
            }
            IAlog.m21950f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
        }
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.f17654M.getClass();
    }

    public static void setUserId(String str) {
        if (AbstractC9174o.f21470a != null) {
            IAConfigManager.f17654M.f17659C.m20400a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            IAlog.m21950f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.f17654M.f17678j = inneractiveUserConfig;
        IAlog.m21945a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.f17654M.f17685q = z;
        IAlog.m21945a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (AbstractC9186s.m22012a() || z) {
            return;
        }
        IAlog.m21950f("************************************************************************************************************************", new Object[0]);
        IAlog.m21950f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.m21950f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.m21950f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return AbstractC8057d.f17942a.f17910a != null;
    }

    public Context getAppContext() {
        return this.f17910a;
    }

    @Override // com.fyber.inneractive.sdk.config.InterfaceC8027r
    public void onGlobalConfigChanged(C8040s c8040s, C8021o c8021o) {
        if (c8021o == null || !c8021o.m20446a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        AbstractC9183r.f21478b.post(new RunnableC8055b());
    }
}
