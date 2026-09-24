package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11377C5;
import com.ironsource.C11471H9;
import com.ironsource.C11561M9;
import com.ironsource.C11716V9;
import com.ironsource.C12317m4;
import com.ironsource.C12404o8;
import com.ironsource.C12547u8;
import com.ironsource.C12565v8;
import com.ironsource.C12583w8;
import com.ironsource.InterfaceC11474Hc;
import com.ironsource.InterfaceC11665S9;
import com.ironsource.sdk.controller.C12496e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a */
    static final String f31913a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b */
    private static InterfaceC11665S9 f31914b;

    /* JADX INFO: renamed from: c */
    private static List<InterfaceC11474Hc> f31915c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private static C11716V9 f31916d;

    /* JADX INFO: renamed from: a */
    private static void m33323a(Context context, JSONObject jSONObject, String str, String str2, String str3, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            C11377C5 c11377c5M33934a = C12565v8.m33934a(jSONObject);
            if (c11377c5M33934a.m25560a()) {
                C12547u8.m33893a(c11377c5M33934a, C12565v8.m33936a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(InterfaceC11474Hc interfaceC11474Hc) {
        C11716V9 c11716v9 = f31916d;
        if (c11716v9 == null) {
            f31915c.add(interfaceC11474Hc);
        } else if (c11716v9.m27679b()) {
            interfaceC11474Hc.onSuccess();
        } else {
            interfaceC11474Hc.onFail(f31916d.m27678a());
        }
    }

    public static synchronized void destroyAd(C11471H9 c11471h9) throws Exception {
        m33322a();
        f31914b.mo26533b(c11471h9);
    }

    public static synchronized C12496e getControllerManager() {
        return f31914b.mo26512a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        Context context2;
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            Logger.m33640e(f31913a, "applicationKey is NULL");
            return;
        }
        if (f31914b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                context2 = context;
                str3 = str;
                str4 = str2;
                try {
                    m33323a(context2, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str4, str3, C12583w8.m34049a(), map);
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    C12317m4.m32153d().m32155a(exc);
                    Logger.m33640e(f31913a, "Failed to init event tracker: " + exc.getMessage());
                }
            } catch (Exception e2) {
                e = e2;
                context2 = context;
                str3 = str;
                str4 = str2;
            }
            f31914b = C11561M9.m26502a(context2, str3, str4);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(C11471H9 c11471h9) {
        InterfaceC11665S9 interfaceC11665S9 = f31914b;
        if (interfaceC11665S9 == null) {
            return false;
        }
        return interfaceC11665S9.mo26529a(c11471h9);
    }

    public static synchronized void loadAd(C11471H9 c11471h9, Map<String, String> map) throws Exception {
        m33322a();
        f31914b.mo26516a(c11471h9, map);
    }

    public static synchronized void loadAdView(Activity activity, C11471H9 c11471h9, Map<String, String> map) throws Exception {
        m33322a();
        f31914b.mo26532b(activity, c11471h9, map);
    }

    public static void onPause(Activity activity) {
        InterfaceC11665S9 interfaceC11665S9 = f31914b;
        if (interfaceC11665S9 == null) {
            return;
        }
        interfaceC11665S9.mo26531b(activity);
    }

    public static void onResume(Activity activity) {
        InterfaceC11665S9 interfaceC11665S9 = f31914b;
        if (interfaceC11665S9 == null) {
            return;
        }
        interfaceC11665S9.mo26513a(activity);
    }

    public static synchronized void release(Activity activity) {
        InterfaceC11665S9 interfaceC11665S9 = f31914b;
        if (interfaceC11665S9 == null) {
            return;
        }
        interfaceC11665S9.mo26538c(activity);
    }

    public static synchronized void showAd(Activity activity, C11471H9 c11471h9, Map<String, String> map) throws Exception {
        m33322a();
        f31914b.mo26514a(activity, c11471h9, map);
    }

    public static synchronized void updateInitFailed(C12404o8 c12404o8) {
        f31916d = new C11716V9(c12404o8);
        Iterator<InterfaceC11474Hc> it = f31915c.iterator();
        while (it.hasNext()) {
            it.next().onFail(c12404o8);
        }
        f31915c.clear();
    }

    public static synchronized void updateInitSucceeded() {
        f31916d = new C11716V9();
        Iterator<InterfaceC11474Hc> it = f31915c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
        f31915c.clear();
    }

    /* JADX INFO: renamed from: a */
    private static synchronized void m33322a() throws Exception {
        if (f31914b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
