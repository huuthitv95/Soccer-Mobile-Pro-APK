package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRequest {

    /* JADX INFO: renamed from: ik */
    private Bundle f8535ik = null;

    /* JADX INFO: renamed from: lr */
    private Map<String, Object> f8536lr;

    /* JADX INFO: renamed from: ri */
    private String f8537ri;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f8535ik == null) {
            this.f8535ik = new Bundle();
        }
        this.f8535ik.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.f8537ri;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f8536lr;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f8535ik;
    }

    public void setAdString(String str) {
        this.f8537ri = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f8536lr = map;
    }
}
