package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8712s {

    /* JADX INFO: renamed from: d */
    public static final C8712s f20317d = new C8712s(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f20318a;

    /* JADX INFO: renamed from: b */
    public final float f20319b;

    /* JADX INFO: renamed from: c */
    public final int f20320c;

    public C8712s(float f, float f2) {
        this.f20318a = f;
        this.f20319b = f2;
        this.f20320c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8712s.class == obj.getClass()) {
            C8712s c8712s = (C8712s) obj;
            if (this.f20318a == c8712s.f20318a && this.f20319b == c8712s.f20319b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f20319b) + ((Float.floatToRawIntBits(this.f20318a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
