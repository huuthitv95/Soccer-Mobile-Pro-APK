package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8750d extends AbstractC8753g {

    /* JADX INFO: renamed from: c */
    public final AtomicReference f20440c = new AtomicReference(new C8749c());

    /* JADX INFO: renamed from: a */
    public static boolean m21283a(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }
}
