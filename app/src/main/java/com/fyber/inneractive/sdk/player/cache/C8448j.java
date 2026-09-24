package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8448j extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8449k f18803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8448j(C8449k c8449k, int i) {
        super(i);
        this.f18803a = c8449k;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.f18803a.f18805b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
