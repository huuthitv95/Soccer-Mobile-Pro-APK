package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.g */
/* JADX INFO: compiled from: BaseSameDiTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13198g {

    /* JADX INFO: renamed from: a */
    public static volatile String f36291a = null;

    /* JADX INFO: renamed from: b */
    public static String f36292b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f36293c = false;

    /* JADX INFO: renamed from: d */
    public static int f36294d = 0;

    /* JADX INFO: renamed from: e */
    private static String f36295e = "";

    /* JADX INFO: renamed from: f */
    private static boolean f36296f = false;

    /* JADX INFO: renamed from: g */
    private static String f36297g = "";

    /* JADX INFO: renamed from: h */
    private static boolean f36298h = false;

    /* JADX INFO: renamed from: i */
    private static boolean f36299i = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.g$a */
    /* JADX INFO: compiled from: BaseSameDiTool.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36300a;

        a(Context context) {
            this.f36300a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID) && AbstractC13005b.m36562i()) {
                try {
                    Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f36300a);
                    C13198g.m37683a(advertisingIdInfo.getId());
                    C13198g.f36294d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    C13198g.m37685b(this.f36300a, advertisingIdInfo.getId(), C13198g.f36294d);
                } catch (Exception unused) {
                    C13219q0.m37820d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        C13186c.b bVarM37638a = new C13186c().m37638a(this.f36300a);
                        C13198g.m37683a(bVarM37638a.m37639a());
                        C13198g.f36294d = bVarM37638a.m37640b() ? 1 : 0;
                        C13198g.m37685b(this.f36300a, bVarM37638a.m37639a(), C13198g.f36294d);
                    } catch (Exception unused2) {
                        C13219q0.m37820d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m37685b(Context context, String str, int i) {
        try {
            if (C13182a1.m37597b(str)) {
                C13235y0.m37957b(context, MBridgeConstans.SP_GA_ID, str);
            }
            C13235y0.m37957b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i));
        } catch (Exception e) {
            C13219q0.m37816b("DomainSameDiTool", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m37687c() {
        if (!C13006c.m36582l() || !C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!AbstractC13005b.m36562i()) {
            return TextUtils.isEmpty(f36292b) ? "" : f36292b;
        }
        if (!TextUtils.isEmpty(f36292b)) {
            if (AbstractC13005b.m36563j()) {
                return f36292b;
            }
            return f36294d == 0 ? f36292b : "";
        }
        if (!f36293c) {
            m37681a(C13008c.m36588n().m36542d());
            f36293c = true;
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static String m37689d() {
        if (!C13006c.m36582l() || !C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!AbstractC13005b.m36562i()) {
            return TextUtils.isEmpty(f36291a) ? "" : f36291a;
        }
        if (!TextUtils.isEmpty(f36291a)) {
            if (AbstractC13005b.m36563j()) {
                return f36291a;
            }
            return f36294d == 0 ? f36291a : "";
        }
        C13211m0.m37756l();
        if (!f36293c) {
            m37681a(C13008c.m36588n().m36542d());
            f36293c = true;
        }
        return TextUtils.isEmpty(f36291a) ? "" : f36291a;
    }

    /* JADX INFO: renamed from: e */
    public static String m37690e() {
        if (TextUtils.isEmpty(f36297g) && !f36296f) {
            m37684b();
        }
        return f36297g;
    }

    /* JADX INFO: renamed from: a */
    public static int m37679a() {
        return f36294d;
    }

    /* JADX INFO: renamed from: a */
    public static void m37680a(int i) {
        f36294d = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m37681a(Context context) {
        new Thread(new a(context)).start();
    }

    /* JADX INFO: renamed from: b */
    public static String m37684b() {
        if (!C13006c.m36582l() || !C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f36296f) {
            return f36295e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = C13008c.m36588n().m36542d().getContentResolver();
                int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f36297g = string2;
                    f36295e = C13207k0.m37713b(string2);
                }
            } catch (Settings.SettingNotFoundException e) {
                C13219q0.m37816b("DomainSameDiTool", e.getMessage());
            }
        } catch (Throwable th) {
            C13219q0.m37816b("DomainSameDiTool", th.getMessage());
        }
        f36296f = true;
        return f36295e;
    }

    /* JADX INFO: renamed from: c */
    public static void m37688c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37683a(String str) {
        f36292b = C13207k0.m37713b(str);
        f36291a = str;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37686b(Context context) {
        try {
            if (f36299i) {
                return f36298h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                f36298h = context.getPackageManager().checkPermission(C13207k0.m37712a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                f36298h = true;
            }
            f36299i = true;
            return f36298h;
        } catch (Exception unused) {
            f36298h = false;
        }
    }
}
