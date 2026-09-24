package com.bytedance.sdk.openadsdk.p245mj;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.C1995ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2008ka;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.sdk.component.C2644lr;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2519di;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.jbs.C2635fi;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.p165mj.p166lr.C2677ka;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2718fr;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.C2735zf;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.component.utils.wjv;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.C2933di;
import com.bytedance.sdk.openadsdk.common.C2949nr;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3300oh;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.hcw;
import com.bytedance.sdk.openadsdk.core.jbs.C3228co;
import com.bytedance.sdk.openadsdk.core.p200co.C3149ik;
import com.bytedance.sdk.openadsdk.core.p218fi.C3212ri;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p225ri.C3310ri;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3317ka;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.xha;
import com.bytedance.sdk.openadsdk.p231fi.C3368ri;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.p251qt.C3493ri;
import com.bytedance.sdk.openadsdk.slm.C3520ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.C3528ri;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.tan.C3537ri;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3580nr;
import com.bytedance.sdk.openadsdk.utils.C3581oh;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ihz;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.C11540L6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mj.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3474ri {

    /* JADX INFO: renamed from: ri */
    public static final List<PAGSdk.PAGInitCallback> f12551ri = new ArrayList();

    /* JADX INFO: renamed from: lr */
    private static long f12550lr = 0;

    /* JADX INFO: renamed from: di */
    private static void m15735di() {
        C3332vr.m14980ri(1);
        try {
            List<PAGSdk.PAGInitCallback> list = f12551ri;
            synchronized (list) {
                Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.success();
                    }
                }
            }
            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.8
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("init");
                    return c3481ri;
                }
            });
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public static void m15736fi() {
        ShortcutManager shortcutManagerM37m;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextM14642ri = C3299nr.m14642ri();
                if (contextM14642ri == null || (shortcutManagerM37m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m37m(contextM14642ri.getSystemService(ComponentDialog$$ExternalSyntheticApiModelOutline0.m$2()))) == null) {
                    return;
                }
                C3304qt.m14669lr().m14699ri(shortcutManagerM37m.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    private static void m15737fi(final Context context, final InitConfig initConfig) {
        dzy.m16409ri(new AbstractRunnableC2676ik("init_sync") { // from class: com.bytedance.sdk.openadsdk.mj.ri.6
            @Override // java.lang.Runnable
            public void run() {
                C3332vr.m14982ri(initConfig.getData());
                C3606fi.m16705ri(context, initConfig.getAppId());
                C3606fi.m16709ri();
                C3476ik.m15762ri();
                C3476ik.m15760lr();
                new slm();
                C2519di.m9066ri(ihz.m16522ri() * 10);
                C3435lr.m15667ri(context);
                com.bytedance.sdk.openadsdk.core.slm.m14959ri().m14963lr();
                C3324ik.m14915ri();
                C3149ik.m13142ri();
                C3322sf.f11619fi = C3322sf.m14822ri(context);
                C3322sf.f11622ka = C3322sf.m14820lr(context);
                xha.m11134lr();
                C1979ri.m6220ri(C3299nr.m14639ka().m14867pc());
                C1979ri.m6218ri(CacheDirFactory.getICacheDir(0));
                C3322sf c3322sfM14639ka = C3299nr.m14639ka();
                if (!c3322sfM14639ka.m14885tw()) {
                    synchronized (c3322sfM14639ka) {
                        if (!c3322sfM14639ka.m14885tw()) {
                            c3322sfM14639ka.m14852ik();
                            c3322sfM14639ka.m14850ig();
                        }
                    }
                }
                C3332vr.m14974di();
                DeviceUtils.m16348sf();
                C3474ri.m15749ri(context);
                DeviceUtils.m16345ri(context);
                DeviceUtils.m16349sf(context);
                DeviceUtils.m16317co(context);
                C3528ri.m15964ri();
                C3317ka.m14788ri();
                C3521ka.m15938ka();
                C3571ig.jbs(context);
                C3414ik.m15529ri();
                C3474ri.m15736fi();
                C3324ik.m14912lr();
                C3212ri.m13464ri().m13474lr();
                C2677ka.m10054ri(C3332vr.m14978lr());
                if (C3087ri.m12350fi()) {
                    C2949nr.m11382ri().m11392ka();
                }
                C2722lr.m10242ri(new C2722lr.ri() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.1
                    @Override // com.bytedance.sdk.component.utils.C2722lr.ri
                    /* JADX INFO: renamed from: ik */
                    public ExecutorService mo10247ik() {
                        return dzy.jbs();
                    }

                    @Override // com.bytedance.sdk.component.utils.C2722lr.ri
                    /* JADX INFO: renamed from: lr */
                    public boolean mo10248lr() {
                        return C3606fi.m16703ri("start_act_asy", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.C2722lr.ri
                    /* JADX INFO: renamed from: ri */
                    public boolean mo10249ri() {
                        return C3606fi.m16703ri("start_activity_async", 0) == 1;
                    }
                });
                C3571ig.m16447ik();
                wjv.m10319ri(new wjv.InterfaceC2731lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.2
                    @Override // com.bytedance.sdk.component.utils.wjv.InterfaceC2731lr
                    /* JADX INFO: renamed from: ri */
                    public void mo10321ri(final String str, boolean z, final wjv.AbstractC2732ri abstractC2732ri) {
                        C3521ka.m15952ri(str, z, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.6.2.1
                            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                            /* JADX INFO: renamed from: ri */
                            public InterfaceC3530ik mo11574ri() throws Exception {
                                return C3531ka.m15967lr().m15985ri(str).m15980lr(abstractC2732ri.m10322lr());
                            }
                        });
                    }
                });
                C2735zf.m10346ri(C3606fi.m16707ri("webview_reuse_config", (String) null));
                C1979ri.m6219ri(C3606fi.m16707ri("video_play_config", (String) null));
                C3520ik.m15935ri();
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    private static void m15739ik(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            C2729uq.m10313ri((String) null);
            C2345ka.m8037ri((String) null);
        } else {
            C2729uq.m10313ri(initConfig.getPackageName());
            C2345ka.m8037ri(initConfig.getPackageName());
        }
        C3537ri.m16090ri(context);
        try {
            if (m15746lr(initConfig)) {
                C3300oh.m14646ri().mo13485lr();
                C3580nr.m16559ri();
            }
        } catch (Throwable unused) {
        }
        C3299nr.m14641lr(context);
        C3228co.m13618ri();
        C3149ik.m13143ri(context);
    }

    /* JADX INFO: renamed from: ik */
    private static void m15740ik(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            C3304qt.m14669lr().m14686ik(initConfig.getData());
        }
        C3304qt.m14669lr().m14687ik(m15746lr(initConfig));
    }

    /* JADX INFO: renamed from: ka */
    private static void m15741ka() {
        C3215ik.m13505ri().m13512ri("uuid", C3593su.m16658ri());
    }

    /* JADX INFO: renamed from: ka */
    private static void m15742ka(Context context, InitConfig initConfig) {
        if (com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri()) {
            C3611lr.m16741ik();
            C3332vr.f11697lr.set(true);
            try {
                C2531ri.m9163ri().m9172ri(new C3493ri());
            } catch (Exception e) {
                C2707ac.m10196ik("PAGSdk", e.getMessage());
            }
            m15740ik(initConfig);
            m15745lr(context, initConfig);
            C1995ik.m6297ri(context, null);
            C1995ik.m6296ri(2);
            C1995ik.m6298ri(C2751lr.m10463lr().m10466ik().xha());
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m15743lr() {
        C3299nr.m14639ka();
        C3535ri.m16063ri("sp_compliance_file", "a", 0);
        C3535ri.m16063ri("ttopenadsdk", "a", 0);
        C3535ri.m16063ri("sp_global_file", "a", 0);
        C3535ri.m16063ri("sp_global_app_id", "a", 0);
        C3535ri.m16063ri("tpl_fetch_model", "a", 0);
        C3535ri.m16063ri("tt_sp", "a", 0);
        C3535ri.m16072ri("pag_sp_bad_par", "did");
        C3535ri.m16072ri("pag_sp_bad_par", C11540L6.f24947V0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m15744lr(int i, String str) {
        C3332vr.m14980ri(2);
        try {
            List<PAGSdk.PAGInitCallback> list = f12551ri;
            synchronized (list) {
                Iterator<PAGSdk.PAGInitCallback> it = list.iterator();
                while (it.hasNext()) {
                    PAGSdk.PAGInitCallback next = it.next();
                    if (next != null) {
                        it.remove();
                        next.fail(i, str);
                    }
                }
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.9
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("init");
                        return c3481ri;
                    }
                });
            }
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: lr */
    private static void m15745lr(Context context, InitConfig initConfig) {
        C3332vr.f11699ri = true;
        C3300oh.m14646ri().mo13489ri(initConfig.getAppId()).mo13484ka(initConfig.getPA()).mo13480ik(C2718fr.m10223ri(context)).mo13488ri(initConfig.getTitleBarTheme()).mo13481ik(initConfig.getAdxId());
        C3304qt.ihz();
        if (initConfig instanceof PAGConfig) {
            C3300oh.m14646ri().mo13486lr(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        jbs.m10235ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m15746lr(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: renamed from: ri */
    public static final void m15747ri() {
        try {
            C2644lr.m9854ri(new C2644lr.ri() { // from class: com.bytedance.sdk.openadsdk.mj.ri.1
                @Override // com.bytedance.sdk.component.C2644lr.ri
                /* JADX INFO: renamed from: ri */
                public HandlerThread mo9872ri(String str, int i) {
                    return C2723mj.m10251ri(str, i);
                }

                @Override // com.bytedance.sdk.component.C2644lr.ri
                /* JADX INFO: renamed from: ri */
                public ExecutorService mo9873ri() {
                    return dzy.m16392fi();
                }
            });
            dzy.m16409ri(new AbstractRunnableC2676ik("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.mj.ri.2
                @Override // java.lang.Runnable
                public void run() {
                    C3369ri.m15224ri().m15233ri(false);
                    ApmHelper.initAPM();
                    C3474ri.m15743lr();
                }
            });
            C3332vr.m14981ri(System.currentTimeMillis());
            C3332vr.m14978lr();
            C2634di.setWebViewProvider(new C2634di.ka() { // from class: com.bytedance.sdk.openadsdk.mj.ri.3
                @Override // com.bytedance.sdk.component.jbs.C2634di.ka
                /* JADX INFO: renamed from: ri */
                public WebView mo9791ri(Context context, AttributeSet attributeSet, int i, C2634di.ik ikVar) {
                    if (C2735zf.m10339lr(ikVar)) {
                        return C2735zf.m10337lr(context, attributeSet, i, ikVar);
                    }
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new C2635fi(context, attributeSet) : new C2635fi(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new C2635fi(context, attributeSet) : new C2635fi(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            Log.i("PAGSdk", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15749ri(Context context) {
        C3310ri.m14753ri(context);
        C3581oh.m16562ri();
        C3583qd.m16609ri(context);
        m15741ka();
        C3299nr.m14637fi();
        String strM12377ri = C3089aw.m12377ri(context);
        C3324ik.m14913lr(strM12377ri);
        C3435lr.m15670ri(strM12377ri, true);
        C3228co.m13617lr();
        C3116ri.m12672ri().m12683lr();
    }

    /* JADX INFO: renamed from: ri */
    private static void m15750ri(Context context, InitConfig initConfig) {
        long j;
        try {
            if (PAGSdk.isInitSuccess()) {
                m15735di();
                return;
            }
            m15742ka(context, initConfig);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f12550lr;
            m15735di();
            m15737fi(context, initConfig);
            j = jElapsedRealtime;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - f12550lr;
            m15752ri(context, PAGSdk.isInitSuccess(), initConfig, jElapsedRealtime2, j);
            Long.valueOf(j);
            Long.valueOf(jElapsedRealtime2);
        } catch (Throwable th) {
            th.getMessage();
            C2707ac.m10196ik("PAGSdk", th.getMessage());
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - f12550lr;
            m15744lr(4000, th.getMessage());
            j = jElapsedRealtime3;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15751ri(Context context, InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        int pa;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f12550lr = jElapsedRealtime;
        C3332vr.f11695ik = jElapsedRealtime;
        C3299nr.m14641lr(context);
        if (pAGInitCallback != null) {
            List<PAGSdk.PAGInitCallback> list = f12551ri;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (C3332vr.m14977ka() == 3) {
                        return;
                    }
                }
            }
        }
        if (C2933di.m11291ri()) {
            m15744lr(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (PAGSdk.isInitSuccess()) {
            m15735di();
            m15740ik(initConfig);
            return;
        }
        if (initConfig == null) {
            m15744lr(4000, "PAGConfig is null, please check.");
            return;
        }
        C3332vr.m14980ri(3);
        if (C3307lr.m14718ri().m14733sf() && ((pa = initConfig.getPA()) < -1 || pa > 1)) {
            m15744lr(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED));
            return;
        }
        if (context == null) {
            m15744lr(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        m15739ik(context, initConfig);
        try {
            ApmHelper.initApm(context, initConfig.getAppId());
            C3304qt.m14675ri(new bgr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.4
                @Override // com.bytedance.sdk.openadsdk.core.bgr
                /* JADX INFO: renamed from: ri */
                public void mo12646ri(int i, String str) {
                    C3474ri.m15744lr(i, str);
                }
            });
            try {
                C2729uq.m10311ri(C3299nr.m14642ri(), "tt_ad_logo_txt");
                if (C2729uq.m10305ka(context, "tt_ad_logo") == 0) {
                    m15753ri(initConfig, pAGInitCallback);
                    return;
                }
                if (PAGSdk.isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        m15735di();
                    }
                } else {
                    final C3368ri c3368ri = new C3368ri();
                    SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.mj.ri.5
                        @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                        public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                            return c3368ri;
                        }
                    });
                    m15750ri(context, initConfig);
                }
            } catch (Throwable unused) {
                m15753ri(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            m15744lr(4000, "Internal Error, setting exception. ");
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m15752ri(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        C3521ka.m15952ri("pangle_sdk_init", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.mj.ri.7
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zM14688ik = C3304qt.m14669lr().m14688ik();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", true ^ com.bytedance.sdk.component.utils.ihz.m10229ri(context));
                    jSONObject.put("is_debug", C3474ri.m15746lr(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zM14688ik);
                    jSONObject.put("minSdkVersion", C3571ig.xha(context));
                    jSONObject.put("targetSdkVersion", C3571ig.m16434di(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    jSONObject.put("support_hevc_levels", C2008ka.m6444ri());
                    C3304qt.m14669lr().m14692lr(false);
                } catch (Exception e) {
                    C2707ac.m10206ri("PAGSdk", "run: ", e);
                }
                return C3531ka.m15967lr().m15985ri("pangle_sdk_init").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static void m15753ri(InitConfig initConfig, PAGSdk.PAGInitCallback pAGInitCallback) {
        C3332vr.m14980ri(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                m15744lr(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                m15744lr(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15754ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (C2933di.m11291ri()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, com.bytedance.sdk.openadsdk.core.jbs.m13550ri(10009)));
            return;
        }
        if (C3299nr.m14642ri() == null) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Context is null, please check."));
            return;
        }
        hcw hcwVarM14646ri = C3300oh.m14646ri();
        if (hcwVarM14646ri != null) {
            hcwVarM14646ri.mo13490ri(pAGBiddingRequest, pAGBidCallback);
        } else {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, "Internal exception"));
        }
    }
}
