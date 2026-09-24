package com.bytedance.sdk.openadsdk.p235ik;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3384lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C3384lr f12034ri;

    /* JADX INFO: renamed from: lr */
    private final wjv<C3430ri> f12035lr = C3299nr.m14638ik();

    private C3384lr() {
    }

    /* JADX INFO: renamed from: ri */
    public static C3384lr m15309ri() {
        if (f12034ri == null) {
            synchronized (C3384lr.class) {
                if (f12034ri == null) {
                    f12034ri = new C3384lr();
                }
            }
        }
        return f12034ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15310ri(String str, List<FilterWord> list, String str2) {
        m15311ri(str, list, null, null, str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m15311ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.f12035lr.mo12641ri(str, list, jSONObject, str2, str3);
    }
}
