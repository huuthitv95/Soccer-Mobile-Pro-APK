package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11744X3;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C3594uq {

    /* JADX INFO: renamed from: ik */
    public static final String[] f13333ik = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: lr */
    public static int f13334lr = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ri */
    public static int f13335ri = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: lr */
    public static synchronized void m16661lr() {
        if (f13334lr == 0) {
            return;
        }
        f13334lr = 0;
        C3304qt.m14670lr(0);
    }

    /* JADX INFO: renamed from: ri */
    public static String m16662ri() {
        if (f13335ri == Integer.MIN_VALUE) {
            f13335ri = C3304qt.m14667fi();
        }
        if (f13335ri < 0) {
            f13335ri = 0;
        }
        String[] strArr = f13333ik;
        try {
            return strArr[f13335ri % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16663ri(C2634di c2634di, String str) {
        HashMap map = new HashMap();
        map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        c2634di.m9785ri(str, map);
    }

    /* JADX INFO: renamed from: ri */
    public static synchronized void m16664ri(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                String[] strArr = f13333ik;
                if (i >= strArr.length) {
                    break;
                }
                if (str.contains(strArr[i])) {
                    int i2 = f13335ri + 1;
                    f13335ri = i2;
                    C3304qt.m14674ri(i2);
                    break;
                }
                i++;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        if (str.contains("/api/ad/union/sdk/settings/") || str.contains("/api/ad/union/sdk/strategies/adn")) {
            if (f13334lr == Integer.MIN_VALUE) {
                f13334lr = C3304qt.m14666di();
            }
            int i3 = f13334lr + 1;
            f13334lr = i3;
            if (i3 >= 3) {
                final String strM14854jc = C3322sf.m14819lr().m14854jc();
                final int i4 = f13334lr;
                C3322sf.m14819lr().m14837de();
                f13334lr = 0;
                C3521ka.m15952ri("clear_domain", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.utils.uq.1
                    @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
                    /* JADX INFO: renamed from: ri */
                    public InterfaceC3530ik mo11574ri() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(C11744X3.j.f26410D, strM14854jc);
                            jSONObject.put("times", i4);
                        } catch (Exception unused) {
                        }
                        return C3531ka.m15967lr().m15985ri("clear_domain").m15980lr(jSONObject.toString());
                    }
                });
            }
            C3304qt.m14670lr(f13334lr);
        }
    }
}
