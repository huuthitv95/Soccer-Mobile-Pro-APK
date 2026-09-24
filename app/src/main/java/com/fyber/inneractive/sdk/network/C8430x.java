package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8430x {

    /* JADX INFO: renamed from: a */
    public final JSONObject f18760a = new JSONObject();

    /* JADX INFO: renamed from: a */
    public final C8430x m20809a(Object obj, String str) {
        try {
            this.f18760a.put(str, obj);
            return this;
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", str, obj);
            return this;
        }
    }
}
