package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8584a extends AbstractC8586c {

    /* JADX INFO: renamed from: P0 */
    public final long f19524P0;

    /* JADX INFO: renamed from: Q0 */
    public final ArrayList f19525Q0;

    /* JADX INFO: renamed from: R0 */
    public final ArrayList f19526R0;

    public C8584a(int i, long j) {
        super(i);
        this.f19524P0 = j;
        this.f19525Q0 = new ArrayList();
        this.f19526R0 = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final C8584a m21121b(int i) {
        int size = this.f19526R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8584a c8584a = (C8584a) this.f19526R0.get(i2);
            if (c8584a.f19620a == i) {
                return c8584a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C8585b m21122c(int i) {
        int size = this.f19525Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8585b c8585b = (C8585b) this.f19525Q0.get(i2);
            if (c8585b.f19620a == i) {
                return c8585b;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.AbstractC8586c
    public final String toString() {
        return AbstractC8586c.m21123a(this.f19620a) + " leaves: " + Arrays.toString(this.f19525Q0.toArray()) + " containers: " + Arrays.toString(this.f19526R0.toArray());
    }
}
