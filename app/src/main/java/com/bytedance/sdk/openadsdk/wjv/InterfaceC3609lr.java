package com.bytedance.sdk.openadsdk.wjv;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wjv.lr */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3609lr {

    /* JADX INFO: renamed from: ri */
    public static final ri<JSONObject> f13375ri = new ri<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.wjv.lr.1
        @Override // com.bytedance.sdk.openadsdk.wjv.InterfaceC3609lr.ri
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public JSONObject mo16739lr(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.wjv.lr$ri */
    public interface ri<T> {
        /* JADX INFO: renamed from: lr */
        T mo16739lr(String str);
    }
}
