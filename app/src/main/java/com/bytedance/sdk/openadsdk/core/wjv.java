package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.p236ka.C3400fi;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface wjv<T> {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.wjv$lr */
    public interface InterfaceC3357lr {
        /* JADX INFO: renamed from: ri */
        void mo10704ri(int i, String str);

        /* JADX INFO: renamed from: ri */
        void mo10705ri(C3112ay.lr lrVar);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.wjv$ri */
    public interface InterfaceC3358ri {
        /* JADX INFO: renamed from: ri */
        void mo10890ri(int i, String str);

        /* JADX INFO: renamed from: ri */
        void mo10891ri(C3289ri c3289ri, C3282ik c3282ik);
    }

    /* JADX INFO: renamed from: lr */
    C3400fi mo12634lr(JSONObject jSONObject);

    /* JADX INFO: renamed from: ri */
    C2518ri mo12635ri();

    /* JADX INFO: renamed from: ri */
    C3400fi mo12636ri(JSONObject jSONObject, String str, List<String> list);

    /* JADX INFO: renamed from: ri */
    JSONObject mo12637ri(JSONObject jSONObject);

    /* JADX INFO: renamed from: ri */
    void mo12638ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, ihz ihzVar);

    /* JADX INFO: renamed from: ri */
    void mo12640ri(String str);

    /* JADX INFO: renamed from: ri */
    void mo12641ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    /* JADX INFO: renamed from: ri */
    void mo12642ri(JSONObject jSONObject, InterfaceC3357lr interfaceC3357lr);

    /* JADX INFO: renamed from: ri */
    void mo12643ri(JSONObject jSONObject, String str);
}
