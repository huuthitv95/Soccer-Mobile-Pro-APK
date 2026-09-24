package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkl {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfw zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzblh zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcl zzl;
    private zzbrp zzn;
    private zzesq zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcp zzw;
    private int zzm = 1;
    private final zzfjz zzo = new zzfjz();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzfkm zzA() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfkm(this, null);
    }

    public final boolean zzB() {
        return this.zzp;
    }

    public final boolean zzC() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzD() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzE() {
        return this.zzb;
    }

    final /* synthetic */ String zzF() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfw zzG() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzH() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzI() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzJ() {
        return this.zzg;
    }

    final /* synthetic */ zzblh zzK() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzL() {
        return this.zzi;
    }

    final /* synthetic */ AdManagerAdViewOptions zzM() {
        return this.zzj;
    }

    final /* synthetic */ PublisherAdViewOptions zzN() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcl zzO() {
        return this.zzl;
    }

    final /* synthetic */ int zzP() {
        return this.zzm;
    }

    final /* synthetic */ zzbrp zzQ() {
        return this.zzn;
    }

    final /* synthetic */ zzfjz zzR() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzS() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzT() {
        return this.zzq;
    }

    final /* synthetic */ zzesq zzU() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzV() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzW() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzX() {
        return this.zzu;
    }

    final /* synthetic */ boolean zzY() {
        return this.zzv;
    }

    public final zzfkl zzZ(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zzw = zzcpVar;
        return this;
    }

    public final zzfkl zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcp zzaa() {
        return this.zzw;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfkl zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfkl zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfkl zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfkl zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfkl zzi(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zzd = zzfwVar;
        return this;
    }

    public final zzfjz zzj() {
        return this.zzo;
    }

    public final zzfkl zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfkl zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfkl zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfkl zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfkl zzo(zzblh zzblhVar) {
        this.zzh = zzblhVar;
        return this;
    }

    public final zzfkl zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfkl zzq(zzbrp zzbrpVar) {
        this.zzn = zzbrpVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
        return this;
    }

    public final zzfkl zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfkl zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfkl zzt(zzesq zzesqVar) {
        this.zzr = zzesqVar;
        return this;
    }

    public final zzfkl zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzfkl zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfkl zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfkl zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final zzfkl zzz(zzfkm zzfkmVar) {
        this.zzo.zza(zzfkmVar.zzp.zza);
        this.zza = zzfkmVar.zzd;
        this.zzb = zzfkmVar.zzf;
        this.zzw = zzfkmVar.zzw;
        this.zzc = zzfkmVar.zzg;
        this.zzd = zzfkmVar.zza;
        this.zzf = zzfkmVar.zzh;
        this.zzg = zzfkmVar.zzi;
        this.zzh = zzfkmVar.zzj;
        this.zzi = zzfkmVar.zzk;
        zzs(zzfkmVar.zzm);
        zzr(zzfkmVar.zzn);
        this.zzp = zzfkmVar.zzq;
        this.zzq = zzfkmVar.zzr;
        this.zzr = zzfkmVar.zzc;
        this.zzs = zzfkmVar.zzs;
        this.zzt = zzfkmVar.zzt;
        this.zzu.set(zzfkmVar.zzu.get());
        this.zzv = zzfkmVar.zzv;
        return this;
    }
}
