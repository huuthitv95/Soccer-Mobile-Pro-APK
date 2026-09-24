package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7335o4 implements InterfaceC5003Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC5002Bn.A00(this);
    }

    public C7335o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C4999Bk A00() {
        return C48879w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5003Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5003Bo
    public final boolean moveToPosition(int i) {
        return this.A00.moveToPosition(i);
    }
}
