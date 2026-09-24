package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3933n6 {

    /* JADX INFO: renamed from: c */
    public static final a f15477c = new a(null);

    /* JADX INFO: renamed from: a */
    public final int f15478a;

    /* JADX INFO: renamed from: b */
    public final int f15479b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n6$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3933n6 m18768a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new C3933n6(jSONObject.getInt("w"), jSONObject.getInt(CmcdData.Factory.STREAMING_FORMAT_HLS));
            }
            return null;
        }
    }

    public C3933n6(int i, int i2) {
        this.f15478a = i;
        this.f15479b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m18766a() {
        return this.f15479b;
    }

    /* JADX INFO: renamed from: b */
    public final int m18767b() {
        return this.f15478a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3933n6)) {
            return false;
        }
        C3933n6 c3933n6 = (C3933n6) obj;
        return this.f15478a == c3933n6.f15478a && this.f15479b == c3933n6.f15479b;
    }

    public int hashCode() {
        return (this.f15478a * 31) + this.f15479b;
    }

    public String toString() {
        return "Dimensions(width=" + this.f15478a + ", height=" + this.f15479b + ")";
    }
}
