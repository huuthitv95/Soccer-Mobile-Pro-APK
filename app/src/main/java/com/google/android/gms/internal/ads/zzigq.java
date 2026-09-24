package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzigq {
    zzigq() {
    }

    protected static final int zzb(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(zziee.zza);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }

    abstract boolean zza(byte[] bArr, int i, int i2);
}
