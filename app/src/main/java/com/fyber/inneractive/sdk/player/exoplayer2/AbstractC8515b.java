package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.b */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC8515b {

    /* JADX INFO: renamed from: a */
    public static final int f19086a;

    /* JADX INFO: renamed from: b */
    public static final UUID f19087b;

    static {
        f19086a = AbstractC8827z.f20671a < 23 ? 1020 : 6396;
        f19087b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* JADX INFO: renamed from: a */
    public static long m21012a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
