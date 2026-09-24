package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C8740y {

    /* JADX INFO: renamed from: a */
    public final int f20422a;

    /* JADX INFO: renamed from: b */
    public final C8708o[] f20423b;

    /* JADX INFO: renamed from: c */
    public int f20424c;

    public C8740y(C8708o... c8708oArr) {
        if (c8708oArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f20423b = c8708oArr;
        this.f20422a = c8708oArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final int m21279a(C8708o c8708o) {
        int i = 0;
        while (true) {
            C8708o[] c8708oArr = this.f20423b;
            if (i >= c8708oArr.length) {
                return -1;
            }
            if (c8708o == c8708oArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8740y.class == obj.getClass()) {
            C8740y c8740y = (C8740y) obj;
            if (this.f20422a == c8740y.f20422a && Arrays.equals(this.f20423b, c8740y.f20423b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20424c == 0) {
            this.f20424c = Arrays.hashCode(this.f20423b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f20424c;
    }
}
