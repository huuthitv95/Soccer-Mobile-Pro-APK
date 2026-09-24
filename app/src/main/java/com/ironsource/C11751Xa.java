package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Xa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11751Xa implements ImpressionDataListener {

    /* JADX INFO: renamed from: a */
    private final LevelPlayImpressionDataListener f26543a;

    public C11751Xa(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26543a = listener;
    }

    /* JADX INFO: renamed from: a */
    public final LevelPlayImpressionDataListener m27948a() {
        return this.f26543a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11751Xa) {
            return Intrinsics.areEqual(this.f26543a, ((C11751Xa) obj).f26543a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26543a.hashCode();
    }

    @Override // com.ironsource.mediationsdk.impressionData.ImpressionDataListener
    public void onImpressionSuccess(C11698U8 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f26543a.onImpressionSuccess(new LevelPlayImpressionData(impressionData.m27600d()));
    }
}
