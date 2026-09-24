package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Signer {

    /* JADX INFO: renamed from: a */
    public boolean f353a = false;

    /* JADX INFO: renamed from: b */
    public C1350d f354b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1347a f355c;

    /* JADX INFO: renamed from: d */
    public C1349c f356d;

    public static String getVersion() {
        return "3.47.0";
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m849a() {
        if (this.f353a) {
            return;
        }
        this.f354b = new C1350d();
        this.f356d = new C1349c(Build.VERSION.SDK_INT);
        this.f355c = new NativeLibHelper();
        this.f353a = true;
    }

    public synchronized void onResume() {
        m849a();
        C1350d c1350d = this.f354b;
        InterfaceC1347a interfaceC1347a = this.f355c;
        c1350d.getClass();
        if (!C1350d.f358a) {
            ((NativeLibHelper) interfaceC1347a).m847a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        m849a();
        C1350d c1350d = this.f354b;
        C1349c c1349c = this.f356d;
        InterfaceC1347a interfaceC1347a = this.f355c;
        c1350d.getClass();
        C1350d.m853a(context, c1349c, interfaceC1347a, map, str, str2);
    }

    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        m849a();
        C1350d c1350d = this.f354b;
        C1349c c1349c = this.f356d;
        InterfaceC1347a interfaceC1347a = this.f355c;
        c1350d.getClass();
        if (map == null || map.size() == 0 || map2 == null || map3 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
        } else {
            HashMap map4 = new HashMap();
            C1350d.m854a(map.keySet(), map, map4);
            String str = map2.get("activity_kind");
            String str2 = map2.get("client_sdk");
            if (DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B.equals(map2.get("a"))) {
                C1350d.m854a(map.keySet(), map, map3);
                C1350d.m854a(new HashSet(Arrays.asList("network_payload", C11341A5.f23827r)), map2, map3);
            } else {
                C1350d.m853a(context, c1349c, interfaceC1347a, map4, str, str2);
                if (map4.containsKey(InAppPurchaseMetaData.KEY_SIGNATURE) && map4.containsKey("adj_signing_id") && map4.containsKey("headers_id") && map4.containsKey("algorithm") && map4.containsKey("native_version")) {
                    String str3 = (String) map4.get("adj_signing_id");
                    String str4 = (String) map4.get("headers_id");
                    String str5 = (String) map4.get(InAppPurchaseMetaData.KEY_SIGNATURE);
                    String str6 = (String) map4.get("algorithm");
                    String str7 = (String) map4.get("native_version");
                    Locale locale = Locale.US;
                    String str8 = "algorithm=\"" + str6 + "\"";
                    map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str8 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + str7 + "\""));
                    C1350d.m854a(map.keySet(), map, map3);
                    C1350d.m854a(new HashSet(Arrays.asList("network_payload", C11341A5.f23827r)), map2, map3);
                } else {
                    Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
                }
            }
        }
    }
}
