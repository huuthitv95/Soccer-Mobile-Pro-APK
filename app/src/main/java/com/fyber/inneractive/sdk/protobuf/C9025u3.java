package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.u3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9025u3 extends AbstractC9035w3 {
    public C9025u3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final byte mo21754a(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21755a(long j, byte[] bArr, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21756a(Object obj, long j, byte b) {
        if (AbstractC9040x3.f21177h) {
            AbstractC9040x3.m21829a(obj, j, b);
        } else {
            AbstractC9040x3.m21835b(obj, j, b);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21757a(Object obj, long j, double d) {
        this.f21158a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21758a(Object obj, long j, float f) {
        this.f21158a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final void mo21759a(Object obj, long j, boolean z) {
        if (AbstractC9040x3.f21177h) {
            AbstractC9040x3.m21829a(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC9040x3.m21835b(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: a */
    public final boolean mo21760a(Object obj, long j) {
        if (AbstractC9040x3.f21177h) {
            return AbstractC9040x3.m21826a(obj, j) != 0;
        }
        return AbstractC9040x3.m21833b(obj, j) != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: b */
    public final byte mo21761b(Object obj, long j) {
        return AbstractC9040x3.f21177h ? AbstractC9040x3.m21826a(obj, j) : AbstractC9040x3.m21833b(obj, j);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: b */
    public final boolean mo21762b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: c */
    public final double mo21763c(Object obj, long j) {
        return Double.longBitsToDouble(this.f21158a.getLong(obj, j));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9035w3
    /* JADX INFO: renamed from: d */
    public final float mo21764d(Object obj, long j) {
        return Float.intBitsToFloat(this.f21158a.getInt(obj, j));
    }
}
