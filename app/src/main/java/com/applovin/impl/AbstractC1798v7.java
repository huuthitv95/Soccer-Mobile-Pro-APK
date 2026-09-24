package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.v7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1798v7 {

    /* JADX INFO: renamed from: f */
    private static final List f3477f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a */
    private final C1748l f3478a;

    /* JADX INFO: renamed from: c */
    private final JSONObject f3480c;

    /* JADX INFO: renamed from: d */
    private final JSONObject f3481d;

    /* JADX INFO: renamed from: b */
    protected List f3479b = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final long f3482e = System.currentTimeMillis();

    public AbstractC1798v7(JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        this.f3478a = c1748l;
        this.f3480c = jSONObject;
        this.f3481d = jSONObject2;
    }

    /* JADX INFO: renamed from: a */
    public List m5482a() {
        return this.f3479b;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m5483b() {
        return this.f3480c;
    }

    /* JADX INFO: renamed from: c */
    public long m5484c() {
        return this.f3482e;
    }

    /* JADX INFO: renamed from: d */
    public int m5485d() {
        return this.f3479b.size();
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m5486e() {
        return this.f3481d;
    }

    /* JADX INFO: renamed from: f */
    public List m5487f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f3480c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f3477f;
    }

    /* JADX INFO: renamed from: g */
    public int m5488g() {
        return AbstractC1701q7.m4086c(JsonUtils.getInt(this.f3480c, "video_completion_percent", -1));
    }
}
