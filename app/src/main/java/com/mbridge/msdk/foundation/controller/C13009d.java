package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.C13067a;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.preload.C13603a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.net.C13642b;
import com.mbridge.msdk.timer.C13813b;
import com.unity3d.services.core.fid.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d */
/* JADX INFO: compiled from: SDKController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13009d {

    /* JADX INFO: renamed from: l */
    private static volatile C13009d f35519l;

    /* JADX INFO: renamed from: a */
    private int f35520a;

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f35521b;

    /* JADX INFO: renamed from: c */
    private FastKV f35522c;

    /* JADX INFO: renamed from: d */
    private boolean f35523d = false;

    /* JADX INFO: renamed from: e */
    private String f35524e;

    /* JADX INFO: renamed from: f */
    private String f35525f;

    /* JADX INFO: renamed from: g */
    private String f35526g;

    /* JADX INFO: renamed from: h */
    private Context f35527h;

    /* JADX INFO: renamed from: i */
    private String f35528i;

    /* JADX INFO: renamed from: j */
    private C13603a f35529j;

    /* JADX INFO: renamed from: k */
    private String f35530k;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$a */
    /* JADX INFO: compiled from: SDKController.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f35531a;

        a(Context context) {
            this.f35531a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13211m0.m37748h(this.f35531a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$b */
    /* JADX INFO: compiled from: SDKController.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            C13009d.this.m36600g();
            C13009d.this.m36598d();
            Looper.loop();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$c */
    /* JADX INFO: compiled from: SDKController.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13009d c13009d = C13009d.this;
            c13009d.m36593a(c13009d.f35524e);
            new C13146h(C13009d.this.f35527h).m37365a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d */
    /* JADX INFO: compiled from: SDKController.java */
    class d implements AbstractC13003a.e {
        d() {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$e */
    /* JADX INFO: compiled from: SDKController.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f35536a;

        e(String str) {
            this.f35536a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e) {
                C13219q0.m37816b("SDKController", e.getMessage());
            }
            new C13638j().m39746b(C13009d.this.f35527h, this.f35536a, C13009d.this.f35525f);
        }
    }

    private C13009d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m36600g() {
        try {
            C13813b.class.getDeclaredMethod("start", null).invoke(C13813b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
        } catch (Throwable th) {
            C13219q0.m37817b("SDKController", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m36605e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m36606f() {
    }

    /* JADX INFO: renamed from: c */
    private void m36596c() {
        C13008c.m36588n().m36535b(this.f35527h);
        C13008c.m36588n().m36545e(this.f35524e);
        C13008c.m36588n().m36547f(this.f35525f);
        C13008c.m36588n().m36543d(this.f35530k);
        C13008c.m36588n().m36537b(this.f35526g);
        C13008c.m36588n().m36540c(new d());
        try {
            C13121d.m37226h().m37237j();
        } catch (Throwable th) {
            C13219q0.m37816b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m36598d() {
        List<C13067a> listM39506g;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null || (listM39506g = c13635gM39718d.m39506g()) == null || listM39506g.size() <= 0) {
                return;
            }
            for (C13067a c13067a : listM39506g) {
                if (c13067a.m36783a() == 287) {
                    if (this.f35527h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", c13067a.m36784b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (c13067a.m36783a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", c13067a.m36784b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36603b() {
        m36590a(this.f35527h.getApplicationContext());
        try {
            C13167a.m37543b().execute(new b());
            C13167a.m37543b().execute(new c());
            C13148j.m37394b();
        } catch (Exception unused) {
            C13219q0.m37816b("SDKController", "get app setting failed");
        }
        this.f35523d = true;
    }

    /* JADX INFO: renamed from: a */
    public static C13009d m36589a() {
        if (f35519l == null) {
            synchronized (C13009d.class) {
                if (f35519l == null) {
                    f35519l = new C13009d();
                }
            }
        }
        return f35519l;
    }

    /* JADX INFO: renamed from: a */
    public void m36602a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                C13008c.m36588n().m36541c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    C13008c.m36588n().m36541c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f35524e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f35525f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f35530k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f35526g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f35528i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f35527h = context.getApplicationContext();
            m36596c();
            if (this.f35523d) {
                return;
            }
            m36603b();
            C13211m0.m37755l(context);
            long jM39393B0 = C13636h.m39706b().m39714b(this.f35524e).m39393B0();
            if (jM39393B0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jM39393B0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36604b(String str) {
        if (this.f35529j == null) {
            this.f35529j = new C13603a();
        }
        try {
            Map<String, Object> map = this.f35521b;
            if (map == null || map.size() <= 0 || !this.f35521b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f35521b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f35529j.m38975a(this.f35521b, this.f35520a);
                return;
            }
            if (1 == iIntValue) {
                this.f35529j.m38974a(this.f35521b);
            } else if (2 == iIntValue) {
                this.f35529j.m38976b(this.f35521b);
            } else {
                C13219q0.m37816b("SDKController", "unknow layout type in preload");
            }
        } catch (Exception e2) {
            C13219q0.m37816b("SDKController", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36590a(Context context) {
        String string;
        try {
            if (m36605e() && this.f35522c == null) {
                try {
                    this.f35522c = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), C13207k0.m37712a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f35522c = null;
                }
            }
            FastKV fastKV = this.f35522c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(C13207k0.m37712a("H+tU+bfPhM=="), "");
                String string4 = this.f35522c.getString(C13207k0.m37712a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(C13088a.f35856V) && TextUtils.isEmpty(C13088a.f35865g)) {
                    C13088a.f35856V = C12998a.m36460b().m36462a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    C13088a.f35865g = C12998a.m36460b().m36462a("c");
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(C13088a.f35856V) && TextUtils.isEmpty(C13088a.f35865g)) {
                        return;
                    }
                    this.f35522c.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                    this.f35522c.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                    return;
                }
                C13088a.f35856V = string3;
                C13088a.f35865g = string4;
                C12998a.m36460b().m36464a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                C12998a.m36460b().m36464a("c", C13088a.f35865g);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(C13207k0.m37712a("H+tU+FeXHM=="), 0);
            if (sharedPreferences != null) {
                string2 = sharedPreferences.getString(C13207k0.m37712a("H+tU+bfPhM=="), "");
                string = sharedPreferences.getString(C13207k0.m37712a("H+tU+Fz8"), "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(C13088a.f35856V) && TextUtils.isEmpty(C13088a.f35865g)) {
                C13088a.f35856V = C12998a.m36460b().m36462a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                C13088a.f35865g = C12998a.m36460b().m36462a("c");
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                if ((TextUtils.isEmpty(C13088a.f35856V) && TextUtils.isEmpty(C13088a.f35865g)) || sharedPreferences == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                editorEdit.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                editorEdit.apply();
                return;
            }
            C13088a.f35856V = string2;
            C13088a.f35865g = string;
            C12998a.m36460b().m36464a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
            C12998a.m36460b().m36464a("c", C13088a.f35865g);
        } catch (Throwable th) {
            C13219q0.m37817b("SDKController", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m36593a(String str) {
        if (C13636h.m39706b() == null) {
            return;
        }
        C13636h c13636hM39706b = C13636h.m39706b();
        if (c13636hM39706b != null) {
            C13635g c13635gM39718d = c13636hM39706b.m39718d(str);
            if (c13635gM39718d != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = c13635gM39718d.m39446V();
                MBridgeConstans.OMID_JS_H5_URL = c13635gM39718d.m39444U();
                if (!TextUtils.isEmpty(c13635gM39718d.m39571v())) {
                    C13121d.m37226h().f36032i = c13635gM39718d.m39571v();
                    C13121d.m37226h().m37233e();
                }
                if (!TextUtils.isEmpty(c13635gM39718d.m39575w())) {
                    C13121d.m37226h().f36036m = c13635gM39718d.m39575w();
                    C13121d.m37226h().m37234f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = C13642b.f38117b;
                MBridgeConstans.OMID_JS_H5_URL = C13642b.f38116a;
            }
        }
        if (C13636h.m39706b().m39724g(str) && C13636h.m39706b().m39713a(str, 1, (String) null)) {
            if (C12998a.m36460b().m36461a("is_first_init", 0) == 0) {
                try {
                    C12998a.m36460b().m36466b("is_first_init", 1);
                    if (TextUtils.isEmpty(C13198g.m37689d())) {
                        C13167a.m37543b().execute(new e(str));
                        return;
                    } else {
                        new C13638j().m39746b(this.f35527h, str, this.f35525f);
                        return;
                    }
                } catch (Throwable unused) {
                    new C13638j().m39746b(this.f35527h, str, this.f35525f);
                    return;
                }
            }
            new C13638j().m39746b(this.f35527h, str, this.f35525f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36601a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C13219q0.m37816b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f35521b = map;
        this.f35520a = i;
        String strM36533b = C13008c.m36588n().m36533b();
        if (map != null) {
            m36604b(strM36533b);
        }
    }
}
