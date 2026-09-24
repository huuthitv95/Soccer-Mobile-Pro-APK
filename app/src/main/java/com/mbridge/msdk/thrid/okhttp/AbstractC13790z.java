package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.z */
/* JADX INFO: compiled from: RequestBody.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13790z {

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.z$a */
    /* JADX INFO: compiled from: RequestBody.java */
    static class a extends AbstractC13790z {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13785u f39288a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f39289b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ byte[] f39290c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f39291d;

        a(C13785u c13785u, int i, byte[] bArr, int i2) {
            this.f39288a = c13785u;
            this.f39289b = i;
            this.f39290c = bArr;
            this.f39291d = i2;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
        /* JADX INFO: renamed from: a */
        public long mo40692a() {
            return this.f39289b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
        /* JADX INFO: renamed from: a */
        public void mo40693a(InterfaceC13794d interfaceC13794d) throws IOException {
            interfaceC13794d.write(this.f39290c, this.f39291d, this.f39289b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13790z
        @Nullable
        /* JADX INFO: renamed from: b */
        public C13785u mo40694b() {
            return this.f39288a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC13790z m40848a(@Nullable C13785u c13785u, byte[] bArr) {
        return m40849a(c13785u, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC13790z m40849a(@Nullable C13785u c13785u, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        C13723c.m40281a(bArr.length, i, i2);
        return new a(c13785u, i2, bArr, i);
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo40692a() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo40693a(InterfaceC13794d interfaceC13794d) throws IOException;

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract C13785u mo40694b();
}
