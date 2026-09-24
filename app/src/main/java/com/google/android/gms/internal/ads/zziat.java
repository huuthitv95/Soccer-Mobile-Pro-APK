package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zziat {
    @Deprecated
    public zziat() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzibs zzibsVar = new zzibs(zzibn.zza(sb));
            zzibsVar.zza(zziay.LENIENT);
            zzibo.zza.zza(zzibsVar, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zziav zze() {
        if (this instanceof zziav) {
            return (zziav) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzias zzf() {
        if (this instanceof zzias) {
            return (zzias) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zziax zzg() {
        if (this instanceof zziax) {
            return (zziax) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
