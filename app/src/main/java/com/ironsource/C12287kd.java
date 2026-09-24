package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12287kd {

    /* JADX INFO: renamed from: a */
    private final String f30742a;

    /* JADX INFO: renamed from: b */
    private final LevelPlay.AdFormat f30743b;

    public C12287kd(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f30742a = placementName;
        this.f30743b = adFormat;
    }

    /* JADX INFO: renamed from: a */
    public final String m31954a() {
        return this.f30742a + "_" + this.f30743b;
    }
}
