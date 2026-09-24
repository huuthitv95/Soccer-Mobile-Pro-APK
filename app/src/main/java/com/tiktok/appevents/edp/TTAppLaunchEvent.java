package com.tiktok.appevents.edp;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTAppLaunchEvent {
    private JSONObject prop;

    /* JADX INFO: renamed from: ts */
    private long f41371ts;

    public TTAppLaunchEvent(JSONObject prop, long ts) {
        this.prop = prop;
        this.f41371ts = ts;
    }

    public JSONObject getProp() {
        return this.prop;
    }

    public long getTs() {
        return this.f41371ts;
    }

    public void setProp(JSONObject prop) {
        this.prop = prop;
    }

    public void setTs(long ts) {
        this.f41371ts = ts;
    }
}
