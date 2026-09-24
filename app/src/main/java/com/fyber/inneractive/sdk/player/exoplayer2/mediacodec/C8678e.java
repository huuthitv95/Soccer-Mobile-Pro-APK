package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8678e {

    /* JADX INFO: renamed from: a */
    public final String f20243a;

    /* JADX INFO: renamed from: b */
    public final boolean f20244b;

    public C8678e(boolean z, String str) {
        this.f20243a = str;
        this.f20244b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C8678e.class) {
            C8678e c8678e = (C8678e) obj;
            if (TextUtils.equals(this.f20243a, c8678e.f20243a) && this.f20244b == c8678e.f20244b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20243a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f20244b ? 1231 : 1237);
    }
}
