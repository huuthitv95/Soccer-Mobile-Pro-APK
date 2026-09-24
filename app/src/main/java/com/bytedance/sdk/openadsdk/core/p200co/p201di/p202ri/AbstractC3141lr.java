package com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri;

import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.C3136ri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3141lr {

    /* JADX INFO: renamed from: ri */
    protected wjv f10285ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.ri.lr$ri */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static AbstractC3141lr m13116ri(wjv wjvVar, C3136ri c3136ri) {
            if (wjvVar == null) {
                return null;
            }
            int iM14404go = wjvVar.m14404go();
            if (iM14404go == 1) {
                return new C3142ri(wjvVar, c3136ri);
            }
            if (iM14404go == 3) {
                return new C3140ka(wjvVar, c3136ri);
            }
            if (iM14404go == 7 || iM14404go == 8) {
                return new C3138fi(wjvVar, c3136ri);
            }
            return null;
        }
    }

    public AbstractC3141lr(wjv wjvVar) {
        this.f10285ri = wjvVar;
    }

    /* JADX INFO: renamed from: lr */
    public abstract JSONObject mo13112lr();

    /* JADX INFO: renamed from: ri */
    public abstract String mo13113ri();

    /* JADX INFO: renamed from: ri */
    public void mo13114ri(JSONObject jSONObject) {
    }
}
