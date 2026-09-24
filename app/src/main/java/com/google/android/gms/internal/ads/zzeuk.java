package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.Insets;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuk implements zzfbw {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final Insets zzk;
    public final zzeuh zzl;

    public zzeuk(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z, String str2, float f, int i, int i2, String str3, int i3, boolean z2, Insets insets, zzeuh zzeuhVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = i3;
        this.zzj = z2;
        this.zzk = insets;
        this.zzl = zzeuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        Bundle bundle = (Bundle) obj;
        int i = zzrVar.zze;
        zzflb.zzb(bundle, "smart_w", MessengerShareContentUtility.WEBVIEW_RATIO_FULL, i == -1);
        int i2 = zzrVar.zzb;
        zzflb.zzb(bundle, "smart_h", "auto", i2 == -2);
        zzflb.zzd(bundle, "ene", true, zzrVar.zzj);
        zzflb.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzflb.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        zzflb.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzflb.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzflb.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzflb.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzflb.zze(bundle, "format", this.zzb);
        zzflb.zzb(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzflb.zzb(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(AbstractC13068b.JSON_KEY_SH, this.zzg);
        String str2 = this.zzh;
        zzflb.zzb(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        int i3 = this.zzi;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        Insets insets = this.zzk;
        if (insets != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        zzeuh zzeuhVar = this.zzl;
        if (zzeuhVar != null) {
            bundle.putInt("rc_tl", zzeuhVar.zza);
            bundle.putInt("rc_tr", zzeuhVar.zzb);
            bundle.putInt("rc_bl", zzeuhVar.zzc);
            bundle.putInt("rc_br", zzeuhVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
