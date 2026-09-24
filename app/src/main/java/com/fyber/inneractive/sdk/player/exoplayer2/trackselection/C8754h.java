package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8754h {

    /* JADX INFO: renamed from: a */
    public final int f20443a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8748b[] f20444b;

    /* JADX INFO: renamed from: c */
    public int f20445c;

    public C8754h(AbstractC8748b... abstractC8748bArr) {
        this.f20444b = abstractC8748bArr;
        this.f20443a = abstractC8748bArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8754h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20444b, ((C8754h) obj).f20444b);
    }

    public final int hashCode() {
        if (this.f20445c == 0) {
            this.f20445c = Arrays.hashCode(this.f20444b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f20445c;
    }
}
