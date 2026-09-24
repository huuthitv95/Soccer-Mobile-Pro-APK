package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.pf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3986pf {

    /* JADX INFO: renamed from: a */
    public InterfaceC4074tf f15818a;

    /* JADX INFO: renamed from: b */
    public final boolean f15819b;

    /* JADX INFO: renamed from: c */
    public final long f15820c;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19064a(AbstractC3986pf abstractC3986pf, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        abstractC3986pf.mo17316a(f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19065a(AbstractC3986pf abstractC3986pf, EnumC3704d7 enumC3704d7, EnumC4020r5 enumC4020r5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEngagement");
        }
        if ((i & 2) != 0) {
            enumC4020r5 = null;
        }
        abstractC3986pf.mo17975a(enumC3704d7, enumC4020r5);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo17313a(Context context, Continuation continuation);

    /* JADX INFO: renamed from: a */
    public void mo17316a(float f) {
    }

    /* JADX INFO: renamed from: a */
    public void mo17318a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17975a(EnumC3704d7 enumC3704d7, EnumC4020r5 enumC4020r5);

    /* JADX INFO: renamed from: a */
    public abstract void mo17319a(EnumC3737eh enumC3737eh);

    /* JADX INFO: renamed from: a */
    public final void m19066a(InterfaceC4074tf interfaceC4074tf) {
        this.f15818a = interfaceC4074tf;
    }

    /* JADX INFO: renamed from: a */
    public void mo17321a(boolean z) {
    }

    /* JADX INFO: renamed from: g */
    public long mo17324g() {
        return this.f15820c;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo17325h() {
        return this.f15819b;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC4074tf m19067i() {
        return this.f15818a;
    }

    /* JADX INFO: renamed from: j */
    public float mo17326j() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: k */
    public abstract View mo17327k();

    /* JADX INFO: renamed from: l */
    public void mo17328l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo17329m() {
    }

    /* JADX INFO: renamed from: n */
    public void mo17330n() {
    }

    /* JADX INFO: renamed from: o */
    public void mo17331o() {
    }
}
