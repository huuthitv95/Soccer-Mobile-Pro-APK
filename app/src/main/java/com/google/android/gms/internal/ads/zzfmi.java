package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmi> CREATOR = new zzfmj();

    @Nullable
    public final Context zza;
    public final zzfmf zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfmf[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfmi(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfmf[] zzfmfVarArrValues = zzfmf.values();
        this.zzh = zzfmfVarArrValues;
        int[] iArrZza = zzfmg.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfmh.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfmfVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfmi zza(zzfmf zzfmfVar, Context context) {
        if (zzfmfVar == zzfmf.Rewarded) {
            return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzho)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhw)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhy), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhq), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhs));
        }
        if (zzfmfVar == zzfmf.Interstitial) {
            return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhx)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhz), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhr), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzht));
        }
        if (zzfmfVar != zzfmf.AppOpen) {
            return null;
        }
        return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhE)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhF)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhA), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhB), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhD));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfmi(@Nullable Context context, zzfmf zzfmfVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfmf.values();
        this.zzl = zzfmg.zza();
        this.zzm = zzfmh.zza();
        this.zza = context;
        this.zzi = zzfmfVar.ordinal();
        this.zzb = zzfmfVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
