package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.lb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3892lb {

    /* JADX INFO: renamed from: a */
    public final String f15200a;

    /* JADX INFO: renamed from: b */
    public final List f15201b;

    /* JADX INFO: renamed from: c */
    public final C4188yj f15202c;

    /* JADX INFO: renamed from: d */
    public final List f15203d;

    /* JADX INFO: renamed from: e */
    public final List f15204e;

    public C3892lb(String str, List trackingEvents, C4188yj c4188yj, List mediaFiles, List icons) {
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f15200a = str;
        this.f15201b = trackingEvents;
        this.f15202c = c4188yj;
        this.f15203d = mediaFiles;
        this.f15204e = icons;
    }

    /* JADX INFO: renamed from: a */
    public final List m18500a() {
        return this.f15203d;
    }

    /* JADX INFO: renamed from: b */
    public final List m18501b() {
        return this.f15201b;
    }

    /* JADX INFO: renamed from: c */
    public final C4188yj m18502c() {
        return this.f15202c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3892lb)) {
            return false;
        }
        C3892lb c3892lb = (C3892lb) obj;
        return Intrinsics.areEqual(this.f15200a, c3892lb.f15200a) && Intrinsics.areEqual(this.f15201b, c3892lb.f15201b) && Intrinsics.areEqual(this.f15202c, c3892lb.f15202c) && Intrinsics.areEqual(this.f15203d, c3892lb.f15203d) && Intrinsics.areEqual(this.f15204e, c3892lb.f15204e);
    }

    public int hashCode() {
        String str = this.f15200a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f15201b.hashCode()) * 31;
        C4188yj c4188yj = this.f15202c;
        return ((((iHashCode + (c4188yj != null ? c4188yj.hashCode() : 0)) * 31) + this.f15203d.hashCode()) * 31) + this.f15204e.hashCode();
    }

    public String toString() {
        return "Linear(duration=" + this.f15200a + ", trackingEvents=" + this.f15201b + ", videoClicks=" + this.f15202c + ", mediaFiles=" + this.f15203d + ", icons=" + this.f15204e + ")";
    }
}
