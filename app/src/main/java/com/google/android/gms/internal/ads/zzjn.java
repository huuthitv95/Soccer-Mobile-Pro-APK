package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.facebook.share.internal.MessengerShareContentUtility;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjn {
    public static final /* synthetic */ int zzA = 0;
    final Context zza;
    zzdo zzb;
    zzgto zzc;
    zzgto zzd;
    zzgto zze;
    zzgto zzf;
    zzgto zzg;
    zzgsn zzh;
    Looper zzi;
    int zzj;
    zzd zzk;
    int zzl;
    boolean zzm;
    zznc zzn;
    zznb zzo;
    long zzp;
    long zzq;
    int zzr;
    int zzs;
    int zzt;
    int zzu;
    boolean zzv;
    boolean zzw;
    String zzx;
    boolean zzy;
    zzix zzz;

    static {
        String str = zzfk.zza;
        String strZza = zzgsf.zza(Build.DEVICE);
        if (strZza.contains("emulator") || strZza.contains("emu64a") || strZza.contains("emu64x")) {
            return;
        }
        strZza.contains(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE);
    }

    public zzjn(final Context context, final zzmz zzmzVar) {
        zzgto zzgtoVar = new zzgto() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return zzmzVar;
            }
        };
        zzgto zzgtoVar2 = new zzgto() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return new zzwp(context, new zzafl());
            }
        };
        zzgto zzgtoVar3 = new zzgto() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return new zzaaq(context);
            }
        };
        zzjg zzjgVar = zzjg.zza;
        zzgto zzgtoVar4 = new zzgto() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                int i = zzjn.zzA;
                return zzabl.zzh(context);
            }
        };
        zzjf zzjfVar = zzjf.zza;
        context.getClass();
        this.zza = context;
        this.zzc = zzgtoVar;
        this.zzd = zzgtoVar2;
        this.zze = zzgtoVar3;
        this.zzf = zzjgVar;
        this.zzg = zzgtoVar4;
        this.zzh = zzjfVar;
        this.zzi = zzfk.zzf();
        this.zzk = zzd.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zznc.zzc;
        this.zzo = zznb.zza;
        this.zzz = new zzix(0.97f, 1.03f, 1000L, 1.0E-7f, zzfk.zzs(20L), zzfk.zzs(500L), 0.999f, null);
        this.zzb = zzdo.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = 600000;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        this.zzu = 600000;
        this.zzv = true;
        this.zzx = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zzjd.zza;
        }
        this.zzy = true;
    }
}
