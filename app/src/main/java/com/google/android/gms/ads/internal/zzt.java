package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcfa;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcih;
import com.google.android.gms.internal.ads.zzcky;
import com.google.android.gms.internal.ads.zzekv;
import com.google.android.gms.internal.ads.zzekw;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbha zzA;
    private final zzcdn zzB;
    private final zzcg zzC;
    private final zzcih zzD;
    private final zzcfs zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcky zze;
    private final zzcfa zzf;
    private final zzz zzg;
    private final zzbez zzh;
    private final zzcer zzi;
    private final zzaa zzj;
    private final zzbgl zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbik zzn;
    private final zzbjd zzo;
    private final zzax zzp;
    private final zzcay zzq;
    private final zzcfl zzr;
    private final zzbtn zzs;
    private final com.google.android.gms.ads.internal.overlay.zzz zzt;
    private final zzbq zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbul zzx;
    private final zzbr zzy;
    private final zzekw zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcky zzckyVar = new zzcky();
        zzcfa zzcfaVar = new zzcfa();
        int i = Build.VERSION.SDK_INT;
        zzz zzyVar = i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : i >= 24 ? new zzu() : new com.google.android.gms.ads.internal.util.zzt();
        zzbez zzbezVar = new zzbez();
        zzcer zzcerVar = new zzcer();
        zzaa zzaaVar = new zzaa();
        zzbgl zzbglVar = new zzbgl();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbik zzbikVar = new zzbik();
        zzbjd zzbjdVar = new zzbjd();
        zzax zzaxVar = new zzax();
        zzcay zzcayVar = new zzcay();
        zzcfl zzcflVar = new zzcfl();
        zzbtn zzbtnVar = new zzbtn();
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz();
        zzbq zzbqVar = new zzbq();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbul zzbulVar = new zzbul();
        zzbr zzbrVar = new zzbr();
        zzekv zzekvVar = new zzekv();
        zzbha zzbhaVar = new zzbha();
        zzcdn zzcdnVar = new zzcdn();
        zzcg zzcgVar = new zzcg();
        zzcih zzcihVar = new zzcih();
        zzcfs zzcfsVar = new zzcfs();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzckyVar;
        this.zzf = zzcfaVar;
        this.zzg = zzyVar;
        this.zzh = zzbezVar;
        this.zzi = zzcerVar;
        this.zzj = zzaaVar;
        this.zzk = zzbglVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbikVar;
        this.zzo = zzbjdVar;
        this.zzp = zzaxVar;
        this.zzq = zzcayVar;
        this.zzr = zzcflVar;
        this.zzs = zzbtnVar;
        this.zzu = zzbqVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbulVar;
        this.zzy = zzbrVar;
        this.zzz = zzekvVar;
        this.zzA = zzbhaVar;
        this.zzB = zzcdnVar;
        this.zzC = zzcgVar;
        this.zzD = zzcihVar;
        this.zzE = zzcfsVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzcih zzB() {
        return zza.zzD;
    }

    public static zzcfs zzC() {
        return zza.zzE;
    }

    public static zzcdn zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzcky zzd() {
        return zza.zze;
    }

    public static zzcfa zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzbez zzg() {
        return zza.zzh;
    }

    public static zzcer zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbgl zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbik zzm() {
        return zza.zzn;
    }

    public static zzbjd zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzcay zzp() {
        return zza.zzq;
    }

    public static zzcfl zzq() {
        return zza.zzr;
    }

    public static zzbtn zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzz zzt() {
        return zza.zzt;
    }

    public static zzekw zzu() {
        return zza.zzz;
    }

    public static zzae zzv() {
        return zza.zzv;
    }

    public static zzaf zzw() {
        return zza.zzw;
    }

    public static zzbul zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbha zzz() {
        return zza.zzA;
    }
}
