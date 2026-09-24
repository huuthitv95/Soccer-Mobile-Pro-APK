package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.sdk.controller.InterfaceC12497f;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.info.provider.listener.InterfaceC12778a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13186c;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.subprovider.a */
/* JADX INFO: compiled from: ADIDProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12779a {

    /* JADX INFO: renamed from: h */
    private static volatile C12779a f34036h;

    /* JADX INFO: renamed from: a */
    private String f34037a = "";

    /* JADX INFO: renamed from: b */
    private String f34038b = "";

    /* JADX INFO: renamed from: c */
    private int f34039c = -1;

    /* JADX INFO: renamed from: d */
    private int f34040d = -1;

    /* JADX INFO: renamed from: e */
    private String f34041e = "";

    /* JADX INFO: renamed from: f */
    private String f34042f = "";

    /* JADX INFO: renamed from: g */
    public AtomicBoolean f34043g = new AtomicBoolean(false);

    private C12779a() {
    }

    /* JADX INFO: renamed from: b */
    public static C12779a m35254b() {
        if (f34036h == null) {
            synchronized (C12779a.class) {
                if (f34036h == null) {
                    f34036h = new C12779a();
                }
            }
        }
        return f34036h;
    }

    /* JADX INFO: renamed from: c */
    private void m35257c() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        this.f34038b = C12769b.m35186a(contextM36542d).m35192a(InterfaceC12497f.b.f32089c, "");
        this.f34040d = C12769b.m35186a(contextM36542d).m35190a("isLimitAdId", -1);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35258a() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f34037a)) {
            str = TextUtils.isEmpty(this.f34038b) ? "" : this.f34038b;
        } else {
            str = this.f34037a;
        }
        int i = this.f34039c;
        if (i == -1 && (i = this.f34040d) == -1) {
            i = 0;
        }
        map.put(InterfaceC12497f.b.f32089c, str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : C13207k0.m37713b(str));
        map.put("adIdLimit", String.valueOf(i));
        map.put("amazonIdInfo", this.f34041e);
        map.put("amazonIdInfoB64", this.f34042f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35255b(InterfaceC12778a interfaceC12778a) {
        try {
            Map<String, Object> mapM35259a = m35259a(C13008c.m36588n().m36542d());
            m35253a(this.f34037a, this.f34039c);
            if (interfaceC12778a != null) {
                interfaceC12778a.mo35252a(mapM35259a);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("ADIDProvider", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35260a(final InterfaceC12778a interfaceC12778a) {
        C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m35255b(interfaceC12778a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35259a(Context context) {
        String str;
        if (context == null) {
            return new HashMap();
        }
        try {
            m35257c();
            try {
                try {
                    Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    this.f34037a = advertisingIdInfo.getId();
                    this.f34039c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                } catch (Exception unused) {
                    C13219q0.m37820d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
                }
            } catch (Exception unused2) {
                C13186c.b bVarM37638a = new C13186c().m37638a(context);
                this.f34037a = bVarM37638a.m37639a();
                this.f34039c = bVarM37638a.m37640b() ? 1 : 0;
            } catch (Throwable th) {
                C13219q0.m37816b("ADIDProvider", th.getMessage());
            }
            if (!m35256b(context)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    ContentResolver contentResolver = C13008c.m36588n().m36542d().getContentResolver();
                    int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    jSONObject.put("status", i);
                    jSONObject.put("amazonId", string);
                    String string2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(string2)) {
                        this.f34041e = string2;
                        this.f34042f = C13207k0.m37713b(string2);
                    }
                } catch (Throwable th2) {
                    C13219q0.m37816b("ADIDProvider", th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            C13219q0.m37816b("ADIDProvider", th3.getMessage());
        }
        if (TextUtils.isEmpty(this.f34037a)) {
            str = TextUtils.isEmpty(this.f34038b) ? "" : this.f34038b;
        } else {
            str = this.f34037a;
        }
        this.f34037a = str;
        int i2 = this.f34039c;
        if (i2 == -1 && (i2 = this.f34040d) == -1) {
            i2 = 0;
        }
        this.f34039c = i2;
        this.f34043g.set(true);
        HashMap map = new HashMap();
        map.put(InterfaceC12497f.b.f32089c, this.f34037a);
        map.put("adIdB64", C13207k0.m37713b(this.f34037a));
        map.put("isLimitAdId", Integer.valueOf(this.f34039c));
        map.put("amazonIdInfo", this.f34041e);
        map.put("amazonIdInfoB64", this.f34042f);
        return map;
    }

    /* JADX INFO: renamed from: b */
    private boolean m35256b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || (context != null ? context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") : false);
    }

    /* JADX INFO: renamed from: a */
    private void m35253a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (str.equals(this.f34038b) && i == this.f34040d) {
            return;
        }
        C12769b.m35186a(contextM36542d).m35195b(InterfaceC12497f.b.f32089c, str);
        C12769b.m35186a(contextM36542d).m35194b("isLimitAdId", i);
    }
}
