package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgw {

    @Nullable
    private zzhgy zza;

    @Nullable
    private String zzb;

    @Nullable
    private zzhgx zzc;

    @Nullable
    private zzhel zzd;

    private zzhgw() {
        throw null;
    }

    /* synthetic */ zzhgw(byte[] bArr) {
    }

    public final zzhgw zza(zzhgy zzhgyVar) {
        this.zza = zzhgyVar;
        return this;
    }

    public final zzhgw zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhgw zzc(zzhgx zzhgxVar) {
        this.zzc = zzhgxVar;
        return this;
    }

    public final zzhgw zzd(zzhel zzhelVar) {
        this.zzd = zzhelVar;
        return this;
    }

    public final zzhgz zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhgy.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhgx zzhgxVar = this.zzc;
        if (zzhgxVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhel zzhelVar = this.zzd;
        if (zzhelVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhelVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhgxVar.equals(zzhgx.zza) && (zzhelVar instanceof zzhfq)) || ((zzhgxVar.equals(zzhgx.zzc) && (zzhelVar instanceof zzhgf)) || ((zzhgxVar.equals(zzhgx.zzb) && (zzhelVar instanceof zzhib)) || ((zzhgxVar.equals(zzhgx.zzd) && (zzhelVar instanceof zzhez)) || ((zzhgxVar.equals(zzhgx.zze) && (zzhelVar instanceof zzhfh)) || (zzhgxVar.equals(zzhgx.zzf) && (zzhelVar instanceof zzhfz))))))) {
            return new zzhgz(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(string.length() + 67 + String.valueOf(strValueOf).length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(string);
        sb.append(" when new keys are picked according to ");
        sb.append(strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
