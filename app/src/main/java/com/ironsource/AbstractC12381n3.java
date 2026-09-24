package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.n3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12381n3 {

    /* JADX INFO: renamed from: a */
    private final int f31528a;

    /* JADX INFO: renamed from: b */
    private final String f31529b;

    /* JADX INFO: renamed from: c */
    private final boolean f31530c;

    /* JADX INFO: renamed from: d */
    private final C12153dd f31531d;

    public AbstractC12381n3(int i, String placementName, boolean z, C12153dd c12153dd) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f31528a = i;
        this.f31529b = placementName;
        this.f31530c = z;
        this.f31531d = c12153dd;
    }

    /* JADX INFO: renamed from: a */
    public final C12153dd m32811a() {
        return this.f31531d;
    }

    /* JADX INFO: renamed from: b */
    public final int m32813b() {
        return this.f31528a;
    }

    /* JADX INFO: renamed from: c */
    public final String m32814c() {
        return this.f31529b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m32815d() {
        return this.f31530c;
    }

    public String toString() {
        return "placement name: " + this.f31529b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32812a(int i) {
        return this.f31528a == i;
    }

    public /* synthetic */ AbstractC12381n3(int i, String str, boolean z, C12153dd c12153dd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c12153dd);
    }
}
