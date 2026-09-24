package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1804w4;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.sdk.network.e */
/* JADX INFO: loaded from: classes3.dex */
public class C1766e extends C1762a {

    /* JADX INFO: renamed from: s */
    private String f3234s;

    /* JADX INFO: renamed from: t */
    private boolean f3235t;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.e$a */
    public static class a extends C1762a.a {

        /* JADX INFO: renamed from: r */
        private String f3236r;

        /* JADX INFO: renamed from: s */
        private boolean f3237s;

        public a(C1748l c1748l) {
            super(c1748l);
            this.f3183h = ((Integer) c1748l.m4801a(C1831z4.f3745J2)).intValue();
            this.f3184i = ((Integer) c1748l.m4801a(C1831z4.f3737I2)).intValue();
            this.f3185j = ((Integer) c1748l.m4801a(C1831z4.f3841V2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo5037a(AbstractC1804w4.a aVar) {
            this.f3192q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo5038a(Object obj) {
            this.f3182g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo5041a(JSONObject jSONObject) {
            this.f3181f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1766e mo5043a() {
            return new C1766e(this);
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a mo5040a(Map map) {
            this.f3180e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo5036a(int i) {
            this.f3183h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo5039a(String str) {
            this.f3178c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo5046b(Map map) {
            this.f3179d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a mo5044b(int i) {
            this.f3185j = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m5133e(String str) {
            this.f3236r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo5048c(int i) {
            this.f3184i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo5045b(String str) {
            this.f3177b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo5049c(String str) {
            this.f3176a = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo5042a(boolean z) {
            this.f3189n = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m5138h(boolean z) {
            this.f3237s = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.C1762a.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo5047b(boolean z) {
            this.f3191p = z;
            return this;
        }
    }

    protected C1766e(a aVar) {
        super(aVar);
        this.f3234s = aVar.f3236r;
        this.f3235t = aVar.f3237s;
    }

    /* JADX INFO: renamed from: b */
    public static a m5118b(C1748l c1748l) {
        return new a(c1748l);
    }

    /* JADX INFO: renamed from: s */
    public String m5119s() {
        return this.f3234s;
    }

    /* JADX INFO: renamed from: t */
    public boolean m5120t() {
        return this.f3234s != null;
    }

    /* JADX INFO: renamed from: u */
    public boolean m5121u() {
        return this.f3235t;
    }
}
