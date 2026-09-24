package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzvd extends zzin {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvd(Throwable th, zzve zzveVar) {
        String str = zzveVar == null ? null : zzveVar.zza;
        String.valueOf(str);
        super("Decoder failed: ".concat(String.valueOf(str)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
