package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfyt extends zzfyz {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfyt(String str, boolean z, int i, zzfyr zzfyrVar, int i2, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfyz) {
            zzfyz zzfyzVar = (zzfyz) obj;
            if (this.zzb.equals(zzfyzVar.zza())) {
                zzfyzVar.zzb();
                int i = this.zzc;
                int iZzd = zzfyzVar.zzd();
                if (i == 0) {
                    throw null;
                }
                if (i == iZzd) {
                    zzfyzVar.zzc();
                    int i2 = this.zzd;
                    int iZze = zzfyzVar.zze();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i2 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.zzc;
        String str2 = AbstractJsonLexerKt.NULL;
        if (i == 1) {
            str = "ALL_CHECKS";
        } else if (i == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i != 3) {
            str = i != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zzd == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final zzfyr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz
    public final int zze() {
        return this.zzd;
    }
}
