package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4031rg {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f16187a;

    /* JADX INFO: renamed from: b */
    public final String f16188b;

    /* JADX INFO: renamed from: c */
    public volatile long f16189c;

    /* JADX INFO: renamed from: d */
    public final int f16190d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f16191e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f16192f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f16193g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3943ng f16194h;

    public C4031rg(SharedPreferences mPrefs) {
        Intrinsics.checkNotNullParameter(mPrefs, "mPrefs");
        this.f16187a = mPrefs;
        this.f16191e = new AtomicInteger(0);
        this.f16192f = new AtomicInteger(0);
        this.f16193g = new AtomicInteger(0);
        this.f16194h = new InterfaceC3943ng() { // from class: com.chartboost.sdk.impl.rg$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.InterfaceC3943ng
            /* JADX INFO: renamed from: a */
            public final boolean mo18802a() {
                return C4031rg.m19347h();
            }
        };
        this.f16188b = m19348a();
        this.f16189c = SystemClock.uptimeMillis();
        Integer numValueOf = Integer.valueOf(m19355e() + 1);
        numValueOf = numValueOf.intValue() < 0 ? null : numValueOf;
        this.f16190d = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
        m19357g();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m19347h() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m19348a() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return C4017r2.m19290a(string);
    }

    /* JADX INFO: renamed from: a */
    public final void m19349a(AbstractC3628a0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, AbstractC3628a0.b.f13429g)) {
            this.f16191e.incrementAndGet();
        } else if (Intrinsics.areEqual(type, AbstractC3628a0.c.f13430g)) {
            this.f16192f.incrementAndGet();
        } else if (Intrinsics.areEqual(type, AbstractC3628a0.a.f13428g)) {
            this.f16193g.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19350a(InterfaceC3943ng interfaceC3943ng) {
        Intrinsics.checkNotNullParameter(interfaceC3943ng, "<set-?>");
        this.f16194h = interfaceC3943ng;
    }

    /* JADX INFO: renamed from: b */
    public final int m19351b() {
        return this.f16190d;
    }

    /* JADX INFO: renamed from: b */
    public final int m19352b(AbstractC3628a0 abstractC3628a0) {
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            return this.f16191e.get();
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
            return this.f16192f.get();
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            return this.f16193g.get();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final long m19353c() {
        if (this.f16194h.mo18802a()) {
            return SystemClock.uptimeMillis() - this.f16189c;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public final String m19354d() {
        return this.f16188b;
    }

    /* JADX INFO: renamed from: e */
    public final int m19355e() {
        return this.f16187a.getInt("session_key", 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m19356f() {
        this.f16189c = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: g */
    public final void m19357g() {
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorEdit = this.f16187a.edit();
        if (editorEdit == null || (editorPutInt = editorEdit.putInt("session_key", this.f16190d)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    /* JADX INFO: renamed from: i */
    public final C4053sg m19358i() {
        return new C4053sg(this.f16188b, m19353c(), this.f16190d, m19352b(AbstractC3628a0.a.f13428g), m19352b(AbstractC3628a0.c.f13430g), m19352b(AbstractC3628a0.b.f13429g));
    }
}
