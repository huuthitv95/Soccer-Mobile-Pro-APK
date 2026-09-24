package com.bytedance.sdk.openadsdk.component.p182fi;

import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2963lr {

    /* JADX INFO: renamed from: ri */
    public static final Comparator<C2963lr> f8958ri = new Comparator<C2963lr>() { // from class: com.bytedance.sdk.openadsdk.component.fi.lr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(C2963lr c2963lr, C2963lr c2963lr2) {
            return c2963lr.m11500fi() != c2963lr2.m11500fi() ? Long.compare(c2963lr2.m11500fi(), c2963lr.m11500fi()) : Long.compare(c2963lr2.m11501ik(), c2963lr.m11501ik());
        }
    };

    /* JADX INFO: renamed from: di */
    private final long f8959di;

    /* JADX INFO: renamed from: fi */
    private final long f8960fi;

    /* JADX INFO: renamed from: ik */
    private final String f8961ik;

    /* JADX INFO: renamed from: ka */
    private final long f8962ka;

    /* JADX INFO: renamed from: lr */
    private final String f8963lr;
    private final String xha;

    public C2963lr(String str, String str2, long j, long j2, long j3, String str3) {
        this.f8963lr = str;
        this.f8961ik = str2;
        this.f8962ka = j;
        this.f8960fi = j2;
        this.f8959di = j3;
        this.xha = str3;
    }

    /* JADX INFO: renamed from: ri */
    public static C2963lr m11498ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2963lr(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: di */
    public String m11499di() {
        return this.xha;
    }

    /* JADX INFO: renamed from: fi */
    public long m11500fi() {
        return this.f8959di;
    }

    /* JADX INFO: renamed from: ik */
    public long m11501ik() {
        return this.f8962ka;
    }

    /* JADX INFO: renamed from: ka */
    public long m11502ka() {
        return this.f8960fi;
    }

    /* JADX INFO: renamed from: lr */
    public String m11503lr() {
        return this.f8961ik;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m11504ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.f8963lr);
            jSONObject.putOpt("material", this.f8961ik);
            jSONObject.putOpt("expire_time", Long.valueOf(this.f8962ka));
            jSONObject.putOpt("create_time", Long.valueOf(this.f8960fi));
            jSONObject.putOpt("price", Long.valueOf(this.f8959di));
            jSONObject.putOpt("req_id", this.xha);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdCache{mRit=" + this.f8963lr + ", mExpireTime=" + this.f8962ka + ", mCreateTime=" + this.f8960fi + ", mPrice=" + this.f8959di + ", mReqId='" + this.xha + AbstractJsonLexerKt.END_OBJ;
    }
}
