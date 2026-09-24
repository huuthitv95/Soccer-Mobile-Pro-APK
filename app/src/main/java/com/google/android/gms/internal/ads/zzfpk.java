package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfpk implements zzfpi {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfpx zzj = zzfpx.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfpk(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ String zzE() {
        return this.zzf;
    }

    final /* synthetic */ String zzF() {
        return this.zzg;
    }

    final /* synthetic */ String zzG() {
        return this.zzh;
    }

    final /* synthetic */ String zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzfpx zzI() {
        return this.zzj;
    }

    final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ String zzK() {
        return this.zzl;
    }

    final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfpk zzM(int i) {
        this.zzq = i;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzd(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzf(zzfpx zzfpxVar) {
        zzu(zzfpxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzg(zzfkd zzfkdVar) {
        zzv(zzfkdVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final synchronized zzfpl zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzq();
        }
        if (this.zzc < 0) {
            zzr();
        }
        return new zzfpl(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final /* bridge */ /* synthetic */ zzfpi zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized zzfpk zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzm(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfpk zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfpk zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfpk zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfpk zzu(zzfpx zzfpxVar) {
        this.zzj = zzfpxVar;
        return this;
    }

    public final synchronized zzfpk zzv(zzfkd zzfkdVar) {
        String str = zzfkdVar.zzb.zzb;
        if (!TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        Iterator it = zzfkdVar.zza.iterator();
        while (it.hasNext()) {
            String str2 = ((zzfjt) it.next()).zzab;
            if (!TextUtils.isEmpty(str2)) {
                this.zzg = str2;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfpk zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzdby zzdbyVar = (zzdby) iBinder;
            String strZzk = zzdbyVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.zzf = strZzk;
            }
            String strZzf = zzdbyVar.zzf();
            if (!TextUtils.isEmpty(strZzf)) {
                this.zzg = strZzf;
            }
        }
        return this;
    }

    public final synchronized zzfpk zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfpk zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkb)).booleanValue()) {
            this.zzl = zzbzm.zzf(th);
            this.zzk = (String) zzgtl.zza(zzgsk.zzc('\n')).zzd(zzbzm.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfpk zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkb)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
