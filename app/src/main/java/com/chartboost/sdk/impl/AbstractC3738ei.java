package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ei */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3738ei {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3807hi f14101a;

    /* JADX INFO: renamed from: b */
    public final String f14102b;

    /* JADX INFO: renamed from: c */
    public final String f14103c;

    /* JADX INFO: renamed from: d */
    public final String f14104d;

    /* JADX INFO: renamed from: e */
    public final Mediation f14105e;

    /* JADX INFO: renamed from: f */
    public final b f14106f;

    /* JADX INFO: renamed from: g */
    public C4076th f14107g;

    /* JADX INFO: renamed from: h */
    public boolean f14108h;

    /* JADX INFO: renamed from: i */
    public boolean f14109i;

    /* JADX INFO: renamed from: j */
    public long f14110j;

    /* JADX INFO: renamed from: k */
    public float f14111k;

    /* JADX INFO: renamed from: l */
    public a f14112l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ei$a */
    public enum a {
        LOW,
        HIGH;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumEntries f14116e = EnumEntriesKt.enumEntries(m17588a());
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ei$b */
    public enum b {
        INFO,
        CRITICAL,
        ERROR;


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f14121f = EnumEntriesKt.enumEntries(m17589a());
    }

    public AbstractC3738ei(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, b bVar, C4076th c4076th, boolean z, boolean z2, long j, float f, a aVar) {
        this.f14101a = interfaceC3807hi;
        this.f14102b = str;
        this.f14103c = str2;
        this.f14104d = str3;
        this.f14105e = mediation;
        this.f14106f = bVar;
        this.f14107g = c4076th;
        this.f14108h = z;
        this.f14109i = z2;
        this.f14110j = j;
        this.f14111k = f;
        this.f14112l = aVar;
    }

    public /* synthetic */ AbstractC3738ei(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, b bVar, C4076th c4076th, boolean z, boolean z2, long j, float f, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3807hi, str, str2, str3, mediation, bVar, (i & 64) != 0 ? new C4076th(null, null, null, null, null, null, null, null, 255, null) : c4076th, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? System.currentTimeMillis() : j, (i & 1024) != 0 ? 0.0f : f, aVar, null);
    }

    public /* synthetic */ AbstractC3738ei(InterfaceC3807hi interfaceC3807hi, String str, String str2, String str3, Mediation mediation, b bVar, C4076th c4076th, boolean z, boolean z2, long j, float f, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3807hi, str, str2, str3, mediation, bVar, c4076th, z, z2, j, f, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final String m17570a() {
        return this.f14103c;
    }

    /* JADX INFO: renamed from: a */
    public final void m17571a(float f) {
        this.f14111k = f;
    }

    /* JADX INFO: renamed from: a */
    public final void m17572a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f14112l = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m17573a(C4076th c4076th) {
        this.f14107g = c4076th;
    }

    /* JADX INFO: renamed from: a */
    public final void m17574a(boolean z) {
        this.f14108h = z;
    }

    /* JADX INFO: renamed from: b */
    public final float m17575b() {
        return this.f14111k;
    }

    /* JADX INFO: renamed from: b */
    public final void m17576b(boolean z) {
        this.f14109i = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m17577c() {
        return this.f14104d;
    }

    /* JADX INFO: renamed from: d */
    public final Mediation m17578d() {
        return this.f14105e;
    }

    /* JADX INFO: renamed from: e */
    public final String m17579e() {
        return this.f14102b;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC3807hi m17580f() {
        return this.f14101a;
    }

    /* JADX INFO: renamed from: g */
    public final a m17581g() {
        return this.f14112l;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17582h() {
        return this.f14109i;
    }

    /* JADX INFO: renamed from: i */
    public final long m17583i() {
        return this.f14110j;
    }

    /* JADX INFO: renamed from: j */
    public final long m17584j() {
        return AbstractC3760fh.m17737a(this.f14110j);
    }

    /* JADX INFO: renamed from: k */
    public final C4076th m17585k() {
        return this.f14107g;
    }

    /* JADX INFO: renamed from: l */
    public final b m17586l() {
        return this.f14106f;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m17587m() {
        return this.f14108h;
    }

    public String toString() {
        return "TrackingEvent(name=" + this.f14101a.getValue() + ", message='" + this.f14102b + "', impressionAdType='" + this.f14103c + "', location='" + this.f14104d + "', mediation=" + this.f14105e + ", type=" + this.f14106f + ", trackAd=" + this.f14107g + ", isLatencyEvent=" + this.f14108h + ", shouldCalculateLatency=" + this.f14109i + ", timestamp=" + this.f14110j + ", latency=" + this.f14111k + ", priority=" + this.f14112l + ", timestampInSeconds=" + m17584j() + ")";
    }
}
