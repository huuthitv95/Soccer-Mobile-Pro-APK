package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.chartboost.sdk.privacy.model.COPPA;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.metrics.C12756b;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.status.C12839b;
import com.mbridge.msdk.config.component.status.InterfaceC12838a;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.config.manager.callback.InterfaceC12908a;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.net.C13107Aa;
import com.mbridge.msdk.foundation.same.report.C13143e;
import com.mbridge.msdk.foundation.same.report.C13144f;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13199g0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13225t0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.MIMManager;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.mbridge.msdk.system.a */
/* JADX INFO: compiled from: BaseMBridgeSDK.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13706a implements MBridgeSDK {
    protected static final String LOG_TAG = "com.mbridge.msdk";
    public static Map<String, String> map;
    private C13707b mBridgeSDKImplDiff;
    protected volatile Context mContext;
    protected SDKInitStatusListener mStatusListener;
    protected volatile AtomicBoolean sdkInited;
    public static volatile AtomicBoolean componentSDKInitFinish = new AtomicBoolean(false);
    public static Map<String, Object> componentParams = new HashMap();
    public boolean isCoolStart = true;
    protected volatile MBridgeSDK.PLUGIN_LOAD_STATUS STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;
    protected boolean initCallbacked = false;
    protected boolean isRegisteredLifeCycle = false;
    protected volatile boolean isMIMinited = false;
    protected volatile boolean isInitStarted = false;
    private final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.system.a$a */
    /* JADX INFO: compiled from: BaseMBridgeSDK.java */
    class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (AbstractC13706a.this.isMIMinited) {
                MIMManager.m37565b().m37586f();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (AbstractC13706a.this.isMIMinited) {
                MIMManager.m37565b().m37587g();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C13219q0.m37816b("com.mbridge.msdk", "onActivityPaused currentActivityNum:" + C13008c.m36588n().m36548g());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int iM36548g = C13008c.m36588n().m36548g();
            C13219q0.m37816b("com.mbridge.msdk", "onActivityStarted currentActivityNum:" + iM36548g);
            C13219q0.m37816b("com.mbridge.msdk", "onActivityStarted isCoolStart:" + AbstractC13706a.this.isCoolStart);
            if (!AbstractC13706a.this.isCoolStart && iM36548g == 0) {
                C13148j.m37390a("1");
            }
            if (AbstractC13706a.this.mBridgeSDKImplDiff != null) {
                C13707b c13707b = AbstractC13706a.this.mBridgeSDKImplDiff;
                AbstractC13706a abstractC13706a = AbstractC13706a.this;
                c13707b.m40150a(activity, iM36548g, abstractC13706a.isCoolStart, abstractC13706a.mContext);
            }
            AbstractC13706a.this.isCoolStart = false;
            C13008c.m36588n().m36526a(iM36548g + 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int iM36548g = C13008c.m36588n().m36548g();
            C13219q0.m37816b("com.mbridge.msdk", "onActivityStopped currentActivityNum:" + iM36548g);
            if (iM36548g == 1 || iM36548g == 0) {
                C13148j.m37390a("2");
            }
            C13008c.m36588n().m36526a(iM36548g - 1);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.system.a$b */
    /* JADX INFO: compiled from: BaseMBridgeSDK.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f38554a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f38555b;

        b(boolean z, String str) {
            this.f38554a = z;
            this.f38555b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKInitStatusListener sDKInitStatusListener = AbstractC13706a.this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (this.f38554a) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(this.f38555b);
                }
            }
        }
    }

    private void callbackToDeveloper(boolean z, long j, boolean z2, String str) {
        this.isInitStarted = false;
        if (z) {
            C13167a.m37544c().post(new b(z2, str));
        } else {
            SDKInitStatusListener sDKInitStatusListener = this.mStatusListener;
            if (sDKInitStatusListener != null) {
                if (z2) {
                    sDKInitStatusListener.onInitSuccess();
                } else {
                    sDKInitStatusListener.onInitFail(str);
                }
            }
        }
        C13148j.m37392a(z2, j, str);
    }

    private void init() {
        SDKInitStatusListener sDKInitStatusListener;
        SDKInitStatusListener sDKInitStatusListener2;
        if (this.sdkInited == null) {
            this.sdkInited = new AtomicBoolean(false);
        }
        this.initCallbacked = false;
        try {
            if (this.sdkInited.get() && (sDKInitStatusListener2 = this.mStatusListener) != null && !this.initCallbacked) {
                this.initCallbacked = true;
                sDKInitStatusListener2.onInitSuccess();
                return;
            }
        } catch (Exception e) {
            C13219q0.m37816b("com.mbridge.msdk", e.getMessage());
        }
        if (this.mContext == null && (sDKInitStatusListener = this.mStatusListener) != null) {
            this.initCallbacked = true;
            sDKInitStatusListener.onInitFail("Context can not be null.");
            return;
        }
        if (this.isInitStarted) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final boolean z = Looper.myLooper() == Looper.getMainLooper();
        this.isInitStarted = true;
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44657lambda$init$0$commbridgemsdksystema(z, jCurrentTimeMillis);
                }
            };
            C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44659lambda$init$2$commbridgemsdksystema(z, jCurrentTimeMillis);
                }
            });
            C13167a.m37543b().execute(runnable);
        } catch (Exception e2) {
            C13219q0.m37817b("com.mbridge.msdk", "INIT FAIL", e2);
            if (this.sdkInited != null) {
                this.sdkInited.set(false);
            }
            if (this.initCallbacked) {
                return;
            }
            this.initCallbacked = true;
            callbackToDeveloper(z, System.currentTimeMillis() - jCurrentTimeMillis, false, e2.getMessage());
        }
    }

    private void initMIMManager() {
        try {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                return;
            }
            this.isMIMinited = true;
            MIMManager.m37565b().m37581b(this.mContext.getApplicationContext());
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    static /* synthetic */ void lambda$registerActivityLifecycleListener$3(C12710b c12710b) {
        String strM34844c = c12710b.m34844c();
        strM34844c.hashCode();
        if (strM34844c.equals("916003")) {
            C13148j.m37390a("1");
        } else if (strM34844c.equals("916004")) {
            C13148j.m37390a("2");
        }
    }

    private void sendApiCallEvent(String str, String str2) {
        if (this.mContext != null && C12907a.m36194c().m36202d()) {
            C12907a.m36194c().m36201b(str, str2, componentParams);
        }
    }

    private void setDefaultComponentValue() {
        try {
            if (!componentParams.containsKey("allow_acquire_id")) {
                componentParams.put("allow_acquire_id", 1);
            }
            if (!componentParams.containsKey("allow_transfer_ids_if_limit")) {
                componentParams.put("allow_transfer_ids_if_limit", 1);
            }
            if (!componentParams.containsKey("consent_status")) {
                componentParams.put("consent_status", 3);
            }
            if (!componentParams.containsKey("do_not_track")) {
                componentParams.put("do_not_track", 0);
            }
            if (!componentParams.containsKey(COPPA.COPPA_STANDARD)) {
                componentParams.put(COPPA.COPPA_STANDARD, 0);
            }
            if (componentParams.containsKey("channel")) {
                return;
            }
            componentParams.put("channel", C13107Aa.m37185a());
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    private void unregisterActivityLifecycleListener(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (!this.isRegisteredLifeCycle || (activityLifecycleCallbacks = this.activityLifecycleCallbacks) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public void checkAliveContext(Context context) {
        if (C13008c.m36588n().m36542d() != null || context == null) {
            return;
        }
        this.mContext = context.getApplicationContext();
        C13008c.m36588n().m36535b(context);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public boolean getConsentStatus(Context context) {
        checkAliveContext(context);
        return C13006c.m36583m().m36572b();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap map2 = new HashMap();
        map2.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        map2.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        map2.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        map2.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        componentParams.put("app_id", str);
        componentParams.put("app_key", str2);
        componentParams.put("wx_app_id", str3);
        componentParams.put("crash_report", String.valueOf(1));
        sendApiCallEvent(C12770c.m35199a(), "get_configuration_map");
        return map2;
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public Map<String, String> getMBConfigurationMap(String str, String str2, boolean z) {
        return getMBConfigurationMap(str, str2, "");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.STATUS;
    }

    public void init(Application application) {
        this.mContext = application.getApplicationContext();
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void init(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application) {
        this.mContext = application.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = application;
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context) {
        this.mContext = context.getApplicationContext();
        map = map2;
        init();
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void initAsync(Map<String, String> map2, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.mContext = context.getApplicationContext();
        this.mStatusListener = sDKInitStatusListener;
        map = map2;
        init();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: lambda$init$0$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m44657lambda$init$0$commbridgemsdksystema(boolean z, long j) {
        try {
            C13225t0.m37849a(this.mContext);
            C13707b c13707b = new C13707b();
            this.mBridgeSDKImplDiff = c13707b;
            c13707b.m40152a(map);
            C13009d.m36589a().m36602a(map, this.mContext);
            this.STATUS = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            this.mBridgeSDKImplDiff.m40151a(this.mContext);
            C13144f.m37354a().m37357c();
            C13229v0.m37929f();
            initMIMManager();
            C13199g0.m37691a().m37694c();
            this.sdkInited.set(true);
            if (!this.initCallbacked) {
                this.initCallbacked = true;
                callbackToDeveloper(z, System.currentTimeMillis() - j, true, "");
            }
            try {
                C13143e.m37344c().m37350b();
            } catch (Throwable th) {
                C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
            }
            try {
                if (this.mContext instanceof Application) {
                    registerActivityLifecycleListener((Application) this.mContext);
                    return;
                }
                return;
            } catch (Throwable th2) {
                C13219q0.m37816b("com.mbridge.msdk", th2.getMessage());
                return;
            }
        } catch (Throwable th3) {
            this.sdkInited.set(false);
            if (this.initCallbacked) {
            }
            this.initCallbacked = true;
            callbackToDeveloper(z, System.currentTimeMillis() - j, false, th3.getMessage());
        }
        this.sdkInited.set(false);
        if (this.initCallbacked) {
            this.initCallbacked = true;
            callbackToDeveloper(z, System.currentTimeMillis() - j, false, th3.getMessage());
        }
    }

    /* JADX INFO: renamed from: lambda$init$1$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m44658lambda$init$1$commbridgemsdksystema(boolean z, long j, Map map2) {
        componentSDKInitFinish.set(true);
        C12907a.m36194c().m36197a();
        if (map2 != null) {
            Object obj = map2.get("init_status");
            int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : 1;
            Object obj2 = map2.get("reason");
            String strValueOf = obj2 instanceof String ? String.valueOf(obj2) : "";
            if (!this.initCallbacked) {
                callbackToDeveloper(z, System.currentTimeMillis() - j, iIntValue == 1, TextUtils.isEmpty(strValueOf) ? "" : strValueOf);
            }
            HashMap map3 = new HashMap();
            map3.put("result", Integer.valueOf(iIntValue));
            map3.put("duration", Long.valueOf(System.currentTimeMillis() - j));
            C12756b.m35099a("m_pipe_sdk_init_end", map3);
        }
    }

    /* JADX INFO: renamed from: lambda$init$2$com-mbridge-msdk-system-a, reason: not valid java name */
    /* synthetic */ void m44659lambda$init$2$commbridgemsdksystema(final boolean z, final long j) {
        try {
            C13008c.m36588n().m36535b(this.mContext);
            setDefaultComponentValue();
            C13229v0.m37929f();
            HashMap map2 = new HashMap();
            map2.put("callback", new InterfaceC12908a() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda1
                @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12908a
                /* JADX INFO: renamed from: a */
                public final void mo36204a(Map map3) {
                    this.f$0.m44658lambda$init$1$commbridgemsdksystema(z, j, map3);
                }
            });
            componentParams.put("sdk_context", map2);
            C12907a.m36194c().m36199a(componentParams);
            sendApiCallEvent(C12770c.m35199a(), "c0");
            if (componentParams.containsKey("app_id")) {
                Object obj = componentParams.get("app_id");
                if (obj instanceof String) {
                    C12769b.m35186a(this.mContext).m35195b("app_id", String.valueOf(obj));
                }
            }
            C12756b.m35099a("m_pipe_sdk_init_start", new HashMap());
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preload(Map<String, Object> map2) {
        if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C13009d.m36589a().m36601a(map2, 0);
        }
        componentParams.put("preload", map2);
        sendApiCallEvent(C12770c.m35199a(), "c21");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void preloadFrame(Map<String, Object> map2) {
        C13009d.m36589a().m36601a(map2, 1);
    }

    protected void registerActivityLifecycleListener(Application application) {
        boolean z;
        try {
            z = C13223s0.m37831a().m37843b("c_r_a_l_c", 0) == 0;
        } catch (Exception e) {
            C13219q0.m37816b("com.mbridge.msdk", e.getMessage());
        }
        try {
            C12839b c12839b = AbstractC13003a.f35477s;
            if (c12839b != null) {
                c12839b.m35721a(new InterfaceC12838a() { // from class: com.mbridge.msdk.system.a$$ExternalSyntheticLambda0
                    @Override // com.mbridge.msdk.config.component.status.InterfaceC12838a
                    /* JADX INFO: renamed from: a */
                    public final void mo35715a(C12710b c12710b) {
                        AbstractC13706a.lambda$registerActivityLifecycleListener$3(c12710b);
                    }
                });
                this.isRegisteredLifeCycle = true;
            } else {
                if (application == null || !z) {
                    return;
                }
                application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
                this.isRegisteredLifeCycle = true;
            }
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void release() {
        try {
            if (this.STATUS == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
                C13009d.m36589a().m36606f();
            }
            if (this.mContext instanceof Application) {
                unregisterActivityLifecycleListener((Application) this.mContext);
            }
            C13707b c13707b = this.mBridgeSDKImplDiff;
            if (c13707b != null) {
                c13707b.m40149a();
            }
            C13199g0.m37691a().m37696e();
            sendApiCallEvent(C12770c.m35199a(), "c24");
            MIMManager.m37565b().m37589i();
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowAcquireIds(boolean z) {
        componentParams.put("allow_acquire_ids", Integer.valueOf(z ? 1 : 2));
        AbstractC13005b.m36558a(z);
        sendApiCallEvent(C12770c.m35199a(), "c5");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setAllowTransferIdsIfLimit(boolean z) {
        componentParams.put("allow_transfer_ids_if_limit", Integer.valueOf(z ? 1 : 2));
        AbstractC13005b.m36560b(z);
        sendApiCallEvent(C12770c.m35199a(), "c25");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context) {
        checkAliveContext(context);
        C13006c.m36583m().m36569a(context, (OnCompletionListener) null);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(C12770c.m35199a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, int i) {
        checkAliveContext(context);
        componentParams.put("consent_status", Integer.valueOf(i != 1 ? 2 : 1));
        C13006c.m36583m().m36568a(i);
        sendApiCallEvent(C12770c.m35199a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setConsentStatus(Context context, OnCompletionListener onCompletionListener) {
        checkAliveContext(context);
        C13006c.m36583m().m36569a(context, onCompletionListener);
        componentParams.put("consent_status", 3);
        sendApiCallEvent(C12770c.m35199a(), "c8");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setCoppaStatus(Context context, boolean z) {
        checkAliveContext(context);
        componentParams.put(COPPA.COPPA_STANDARD, Integer.valueOf(z ? 1 : 2));
        C13006c.m36583m().m36571b(z ? 1 : 2);
        sendApiCallEvent(C12770c.m35199a(), "c7");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo) {
        if (AbstractC13005b.m36562i() || developerTransferIdInfo == null || TextUtils.isEmpty(developerTransferIdInfo.getGaid())) {
            return;
        }
        C13198g.m37683a(developerTransferIdInfo.getGaid());
        componentParams.put("developer_gaid", developerTransferIdInfo.getGaid());
        sendApiCallEvent(C12770c.m35199a(), "c9");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setDoNotTrackStatus(Context context, boolean z) {
        checkAliveContext(context);
        componentParams.put("do_not_track", Integer.valueOf(z ? 1 : 2));
        C13006c.m36583m().m36574c(z ? 1 : 0);
        sendApiCallEvent(C12770c.m35199a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void setDoNotTrackStatus(boolean z) {
        componentParams.put("do_not_track", Integer.valueOf(z ? 1 : 2));
        C13006c.m36583m().m36574c(z ? 1 : 0);
        sendApiCallEvent(C12770c.m35199a(), "c10");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setPlayVideoMute(int i, int i2) {
        HashMap map2 = new HashMap();
        if (i == 94) {
            C13088a.f35857W = i2;
        } else if (i == 287) {
            C13088a.f35858X = i2;
        }
        map2.put("ad_type", Integer.valueOf(i));
        map2.put("mute_state", Integer.valueOf(i2));
        componentParams.put("player_video_mute", map2);
        sendApiCallEvent(C12770c.m35199a(), "c12");
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setThirdPartyFeatures(Map<String, Object> map2) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void setUserPrivateInfoType(Context context, String str, int i) {
        checkAliveContext(context);
        C13006c.m36583m().m36570a(str, i);
        try {
            if (componentParams.containsKey("device_info_range_limit")) {
                Object obj = componentParams.get("device_info_range_limit");
                if (obj instanceof Map) {
                    ((Map) obj).put(str, Integer.valueOf(i == 1 ? 1 : 2));
                }
            } else {
                HashMap map2 = new HashMap();
                map2.put(str, Integer.valueOf(i == 1 ? 1 : 2));
                componentParams.put("device_info_range_limit", map2);
            }
            sendApiCallEvent(C12770c.m35199a(), "c11");
        } catch (Throwable th) {
            C13219q0.m37816b("com.mbridge.msdk", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    @Deprecated
    public void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        C13008c.m36588n().m36531a(weakReference);
    }

    @Override // com.mbridge.msdk.MBridgeSDK
    public AuthorityInfoBean userPrivateInfo(Context context) {
        checkAliveContext(context);
        return C13006c.m36583m().m36567a();
    }
}
