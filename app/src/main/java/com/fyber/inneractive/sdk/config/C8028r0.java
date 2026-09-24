package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.AbstractC9140c1;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.r0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8028r0 implements InterfaceC8041s0 {

    /* JADX INFO: renamed from: a */
    public String f17811a;

    /* JADX INFO: renamed from: b */
    public String f17812b;

    /* JADX INFO: renamed from: c */
    public C8016l0 f17813c;

    /* JADX INFO: renamed from: d */
    public C8022o0 f17814d;

    /* JADX INFO: renamed from: e */
    public C8024p0 f17815e;

    /* JADX INFO: renamed from: f */
    public C8043t0 f17816f;

    /* JADX INFO: renamed from: g */
    public C8045u0 f17817g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        AbstractC9140c1.m21959a(jSONObject, "id", this.f17811a);
        AbstractC9140c1.m21959a(jSONObject, "spotId", this.f17812b);
        AbstractC9140c1.m21959a(jSONObject, "display", this.f17813c);
        AbstractC9140c1.m21959a(jSONObject, "monitor", this.f17814d);
        AbstractC9140c1.m21959a(jSONObject, "native", this.f17815e);
        AbstractC9140c1.m21959a(jSONObject, "video", this.f17816f);
        AbstractC9140c1.m21959a(jSONObject, "viewability", this.f17817g);
        return jSONObject.toString();
    }
}
