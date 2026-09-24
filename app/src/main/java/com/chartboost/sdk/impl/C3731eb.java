package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.eb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3731eb {

    /* JADX INFO: renamed from: a */
    public final int f14065a;

    public C3731eb(int i) {
        this.f14065a = i;
    }

    public /* synthetic */ C3731eb(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: a */
    public final int m17537a() {
        return this.f14065a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3731eb) && this.f14065a == ((C3731eb) obj).f14065a;
    }

    public int hashCode() {
        return this.f14065a;
    }

    public String toString() {
        return "InterruptionConfig(audioFocusType=" + this.f14065a + ")";
    }
}
