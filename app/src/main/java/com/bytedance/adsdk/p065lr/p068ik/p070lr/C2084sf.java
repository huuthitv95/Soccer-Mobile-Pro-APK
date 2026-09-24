package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import android.graphics.PointF;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2158vr;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2084sf implements InterfaceC2076ik {

    /* JADX INFO: renamed from: fi */
    private final boolean f5006fi;

    /* JADX INFO: renamed from: ik */
    private final InterfaceC2088aw<PointF, PointF> f5007ik;

    /* JADX INFO: renamed from: ka */
    private final C2094lr f5008ka;

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2088aw<PointF, PointF> f5009lr;

    /* JADX INFO: renamed from: ri */
    private final String f5010ri;

    public C2084sf(String str, InterfaceC2088aw<PointF, PointF> interfaceC2088aw, InterfaceC2088aw<PointF, PointF> interfaceC2088aw2, C2094lr c2094lr, boolean z) {
        this.f5010ri = str;
        this.f5009lr = interfaceC2088aw;
        this.f5007ik = interfaceC2088aw2;
        this.f5008ka = c2094lr;
        this.f5006fi = z;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m6875fi() {
        return this.f5006fi;
    }

    /* JADX INFO: renamed from: ik */
    public InterfaceC2088aw<PointF, PointF> m6876ik() {
        return this.f5007ik;
    }

    /* JADX INFO: renamed from: ka */
    public InterfaceC2088aw<PointF, PointF> m6877ka() {
        return this.f5009lr;
    }

    /* JADX INFO: renamed from: lr */
    public C2094lr m6878lr() {
        return this.f5008ka;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2158vr(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6879ri() {
        return this.f5010ri;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f5009lr + ", size=" + this.f5007ik + AbstractJsonLexerKt.END_OBJ;
    }
}
