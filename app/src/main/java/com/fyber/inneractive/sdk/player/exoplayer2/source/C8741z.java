package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C8741z {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f20425d = 0;

    /* JADX INFO: renamed from: a */
    public final int f20426a;

    /* JADX INFO: renamed from: b */
    public final C8740y[] f20427b;

    /* JADX INFO: renamed from: c */
    public int f20428c;

    static {
        new C8741z(new C8740y[0]);
    }

    public C8741z(C8740y... c8740yArr) {
        this.f20427b = c8740yArr;
        this.f20426a = c8740yArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8741z.class == obj.getClass()) {
            C8741z c8741z = (C8741z) obj;
            if (this.f20426a == c8741z.f20426a && Arrays.equals(this.f20427b, c8741z.f20427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20428c == 0) {
            this.f20428c = Arrays.hashCode(this.f20427b);
        }
        return this.f20428c;
    }
}
