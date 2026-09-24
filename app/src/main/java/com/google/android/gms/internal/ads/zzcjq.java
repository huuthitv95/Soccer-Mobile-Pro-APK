package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcjq extends zzcgs implements zzih, zznj {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcja zzc;
    private final zzaaq zzd;
    private final zzcha zze;
    private final WeakReference zzf;
    private final zzyl zzg;
    private zzjp zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcgr zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcjd zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    public zzcjq(Context context, zzcha zzchaVar, zzchb zzchbVar, Integer num) {
        final boolean z;
        final zzhi zzhiVar;
        this.zzb = context;
        this.zze = zzchaVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzchbVar);
        zzcja zzcjaVar = new zzcja();
        this.zzc = zzcjaVar;
        zzaaq zzaaqVar = new zzaaq(context);
        this.zzd = zzaaqVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzf().incrementAndGet();
        zznd zzndVar = new zznd(context, new zzmz() { // from class: com.google.android.gms.internal.ads.zzcjl
            @Override // com.google.android.gms.internal.ads.zzmz
            public final /* synthetic */ zzmu[] zza(Handler handler, zzaeh zzaehVar, zzrp zzrpVar, zzzi zzziVar, zzwa zzwaVar) {
                return this.zza.zzW(handler, zzaehVar, zzrpVar, zzziVar, zzwaVar);
            }
        });
        zzndVar.zza(zzaaqVar);
        zzndVar.zzb(zzcjaVar);
        zzne zzneVarZzc = zzndVar.zzc();
        this.zzh = zzneVarZzc;
        zzneVarZzc.zzD(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzgsu.zzd(zzchbVar != null ? zzchbVar.zzn() : null).zza("");
        this.zzp = zzchbVar != null ? zzchbVar.zzp() : 0;
        final String strZze = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzchbVar.zzs().afmaVersion);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcJ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue()) {
                    z = zzchaVar.zzi ? false : true;
                }
            } else if (zzchaVar.zzi) {
            }
            final zzhi zzhiVar2 = zzchaVar.zzl ? new zzhi() { // from class: com.google.android.gms.internal.ads.zzcjg
                @Override // com.google.android.gms.internal.ads.zzhi
                public final /* synthetic */ zzhj zza() {
                    return this.zza.zzS(strZze, z);
                }
            } : zzchaVar.zzh > 0 ? new zzhi() { // from class: com.google.android.gms.internal.ads.zzcji
                @Override // com.google.android.gms.internal.ads.zzhi
                public final /* synthetic */ zzhj zza() {
                    return this.zza.zzU(strZze, z);
                }
            } : new zzhi() { // from class: com.google.android.gms.internal.ads.zzcjh
                @Override // com.google.android.gms.internal.ads.zzhi
                public final /* synthetic */ zzhj zza() {
                    return this.zza.zzT(strZze, z);
                }
            };
            zzhiVar = zzchaVar.zzi ? new zzhi() { // from class: com.google.android.gms.internal.ads.zzcjj
                @Override // com.google.android.gms.internal.ads.zzhi
                public final /* synthetic */ zzhj zza() {
                    return this.zza.zzV(zzhiVar2);
                }
            } : zzhiVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzhiVar = new zzhi() { // from class: com.google.android.gms.internal.ads.zzcjk
                    @Override // com.google.android.gms.internal.ads.zzhi
                    public final /* synthetic */ zzhj zza() {
                        int i = zzcjq.zza;
                        zzhj zzhjVarZza = zzhiVar.zza();
                        byte[] bArr2 = bArr;
                        return new zzcje(new zzhe(bArr2), bArr2.length, zzhjVarZza);
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzhiVar = new zzhi() { // from class: com.google.android.gms.internal.ads.zzcjf
                @Override // com.google.android.gms.internal.ads.zzhi
                public final /* synthetic */ zzhj zza() {
                    int i = zzcjq.zza;
                    return new zzhe(bArr2);
                }
            };
        }
        this.zzg = new zzyl(zzhiVar, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzp)).booleanValue() ? zzcjn.zza : zzcjm.zza);
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzf().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzciz zzcizVar = (zzciz) ((WeakReference) it.next()).get();
            if (zzcizVar != null) {
                zzcizVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final boolean zzB() {
        return this.zzh != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final int zzC() {
        return this.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzD() {
        return this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzH() {
        return this.zzh.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map mapZzj = ((zzic) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (mapZzj != null) {
                        for (Map.Entry entry : mapZzj.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgsf.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final int zzL() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            zzaaq zzaaqVar = this.zzd;
            zzaad zzaadVarZzd = zzaaqVar.zzc().zzd();
            zzaadVarZzd.zzy(i, !z);
            zzaaqVar.zzf(zzaadVarZzd);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzN() {
        return this.zzh.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final long zzO() {
        return this.zzl;
    }

    final zzxe zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzakVarZzc = zzzVar.zzc();
        zzyl zzylVar = this.zzg;
        zzylVar.zza(this.zze.zzf);
        return zzylVar.zzb(zzakVarZzc);
    }

    final /* synthetic */ zzhj zzS(String str, boolean z) {
        zzcjq zzcjqVar = true != z ? null : this;
        zzcha zzchaVar = this.zze;
        return new zzcjt(str, zzcjqVar, zzchaVar.zzd, zzchaVar.zze, zzchaVar.zzm, zzchaVar.zzn);
    }

    final /* synthetic */ zzhj zzT(String str, boolean z) {
        zzhq zzhqVar = new zzhq();
        zzhqVar.zzb(str);
        zzhqVar.zzf(true != z ? null : this);
        zzcha zzchaVar = this.zze;
        zzhqVar.zzc(zzchaVar.zzd);
        zzhqVar.zzd(zzchaVar.zze);
        zzhqVar.zze(true);
        return zzhqVar.zza();
    }

    final /* synthetic */ zzhj zzU(String str, boolean z) {
        zzcjq zzcjqVar = true != z ? null : this;
        zzcha zzchaVar = this.zze;
        zzciz zzcizVar = new zzciz(str, zzcjqVar, zzchaVar.zzd, zzchaVar.zze, zzchaVar.zzh);
        this.zzu.add(new WeakReference(zzcizVar));
        return zzcizVar;
    }

    final /* synthetic */ zzhj zzV(zzhi zzhiVar) {
        zzhj zzhjVarZza = zzhiVar.zza();
        zzcjb zzcjbVar = new zzcjb() { // from class: com.google.android.gms.internal.ads.zzcjo
            @Override // com.google.android.gms.internal.ads.zzcjb
            public final /* synthetic */ void zza(boolean z, long j) {
                this.zza.zzX(z, j);
            }
        };
        return new zzcjd(this.zzb, zzhjVarZza, this.zzo, this.zzp, this, zzcjbVar);
    }

    final /* synthetic */ zzmu[] zzW(Handler handler, zzaeh zzaehVar, zzrp zzrpVar, zzzi zzziVar, zzwa zzwaVar) {
        zzvn zzvnVar = zzvn.zzb;
        Context context = this.zzb;
        zztp zztpVar = new zztp(context, new zzut(context, null, null), zzvnVar, false, handler, zzrpVar, new zztc(context).zza());
        zzacu zzacuVar = new zzacu(context);
        zzacuVar.zza(zzvnVar);
        zzacuVar.zzb(handler);
        zzacuVar.zzc(zzaehVar);
        return new zzmu[]{zztpVar, zzacuVar.zzd()};
    }

    final /* synthetic */ void zzX(boolean z, long j) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            zzcgrVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zza(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzb(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
        if (zzhjVar instanceof zzic) {
            synchronized (this.zzq) {
                this.zzs.add((zzic) zzhjVar);
            }
        } else if (zzhjVar instanceof zzcjd) {
            this.zzt = (zzcjd) zzhjVar;
            final zzchb zzchbVar = (zzchb) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue() && zzchbVar != null && this.zzt.zzk()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        int i = zzcjq.zza;
                        zzchbVar.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzc(zzhj zzhjVar, zzhn zzhnVar, boolean z, int i) {
        this.zzl += i;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzd(zzhj zzhjVar, zzhn zzhnVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzde(zznh zznhVar, zzba zzbaVar, zzba zzbaVar2, int i) {
        zznj.CC.$default$zzde(this, zznhVar, zzbaVar, zzbaVar2, i);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzdf(zznh zznhVar, zzwy zzwyVar) {
        zznj.CC.$default$zzdf(this, zznhVar, zzwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzdg(zznh zznhVar, int i, long j, long j2) {
        zznj.CC.$default$zzdg(this, zznhVar, i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzdh(zznh zznhVar, zziv zzivVar) {
        zznj.CC.$default$zzdh(this, zznhVar, zzivVar);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzdi(zzbb zzbbVar, zzni zzniVar) {
        zznj.CC.$default$zzdi(this, zzbbVar, zzniVar);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zze(zznh zznhVar, int i) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            zzcgrVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzg(zznh zznhVar, zzau zzauVar) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            zzcgrVar.zzu("onPlayerError", zzauVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzh(zznh zznhVar, zzwt zzwtVar, zzwy zzwyVar, IOException iOException, boolean z) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            if (this.zze.zzj) {
                zzcgrVar.zzv("onLoadException", iOException);
            } else {
                zzcgrVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final Integer zzj() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzk(zznh zznhVar, zzv zzvVar, zziw zziwVar) {
        zzchb zzchbVar = (zzchb) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue() || zzchbVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzchbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzl(zznh zznhVar, zzv zzvVar, zziw zziwVar) {
        zzchb zzchbVar = (zzchb) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue() || zzchbVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzvVar.zzA));
        map.put("bitRate", String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        String str = zzvVar.zzo;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzvVar.zzp;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzchbVar.zze("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzm(zznh zznhVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzn(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzo(zznh zznhVar, Object obj, long j) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            zzcgrVar.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzp(zznh zznhVar, zzbv zzbvVar) {
        zzcgr zzcgrVar = this.zzk;
        if (zzcgrVar != null) {
            zzcgrVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzs(zzcgr zzcgrVar) {
        this.zzk = zzcgrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzt() {
        zzjp zzjpVar = this.zzh;
        if (zzjpVar != null) {
            zzjpVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzi().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzu(Surface surface, boolean z) {
        zzjp zzjpVar = this.zzh;
        if (zzjpVar != null) {
            zzjpVar.zzC(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzv(float f, boolean z) {
        zzjp zzjpVar = this.zzh;
        if (zzjpVar != null) {
            zzjpVar.zzB(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzw() {
        this.zzh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzz(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzxe zzxtVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzxtVar = zzR(uriArr[0]);
            } else {
                zzxe[] zzxeVarArr = new zzxe[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzxeVarArr[i] = zzR(uriArr[i]);
                }
                zzxtVar = new zzxt(false, false, new zzwn(), zzxeVarArr);
            }
            this.zzh.zzG(zzxtVar);
            this.zzh.zzg();
            zzi().incrementAndGet();
        }
    }
}
