package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5065Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C46435i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5065Cq(long j, C46435i c46435i, long j2) {
        Uri uri;
        if (c46435i != null) {
            uri = c46435i.A06;
        } else {
            uri = null;
        }
        this(j, c46435i, uri, Collections.emptyMap(), j2, 0L, 0L);
    }

    public C5065Cq(long j, C46435i c46435i, Uri uri, Map<String, List<String>> responseHeaders, long j2, long j3, long j4) {
        this.A03 = j;
        this.A05 = c46435i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
