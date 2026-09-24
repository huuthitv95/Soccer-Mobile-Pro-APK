package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8819r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f = ((C8820s) obj).f20653c;
        float f2 = ((C8820s) obj2).f20653c;
        if (f < f2) {
            return -1;
        }
        return f2 < f ? 1 : 0;
    }
}
