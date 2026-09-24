package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlb extends zzf implements zzjp {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfb zzC;
    private final zzla zzD;
    private final zzjr zzE;
    private final zzjr zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznb zzJ;
    private zznc zzK;
    private zzjo zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzet zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzmm zzaa;
    private int zzab;
    private long zzac;
    private zzyx zzad;
    final zzaba zzb;
    final zzax zzc;
    private final zzdr zze = new zzdr(zzdo.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzmu[] zzh;
    private final zzmu[] zzi;
    private final zzaaz zzj;
    private final zzdy zzk;
    private final zzlm zzl;
    private final zzlo zzm;
    private final zzee zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzng zzs;
    private final Looper zzt;
    private final zzabi zzu;
    private final zzdo zzv;
    private final zzjx zzw;
    private final zzkw zzx;
    private final zzfq zzy;
    private final zzfr zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlb(zzjn zzjnVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfk.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 39 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0-alpha01] [");
            sb.append(str);
            sb.append(C11744X3.j.f26440e);
            zzef.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjnVar.zza.getApplicationContext();
            this.zzs = (zzng) zzjnVar.zzh.apply(zzjnVar.zzb);
            this.zzX = zzjnVar.zzj;
            this.zzS = zzjnVar.zzk;
            this.zzQ = zzjnVar.zzl;
            this.zzU = false;
            this.zzA = zzjnVar.zzq;
            zzjx zzjxVar = new zzjx(this, null);
            this.zzw = zzjxVar;
            this.zzx = new zzkw(null);
            zzmu[] zzmuVarArrZza = ((zzmz) zzjnVar.zzc.zza()).zza(new Handler(zzjnVar.zzi), zzjxVar, zzjxVar, zzjxVar, zzjxVar);
            this.zzh = zzmuVarArrZza;
            int length = zzmuVarArrZza.length;
            this.zzi = new zzmu[2];
            int i = 0;
            while (true) {
                zzmu[] zzmuVarArr = this.zzi;
                int length2 = zzmuVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzmu zzmuVar = this.zzh[i];
                zzmuVarArr[i] = null;
                i++;
            }
            zzaaz zzaazVar = (zzaaz) zzjnVar.zze.zza();
            this.zzj = zzaazVar;
            zzabi zzabiVar = (zzabi) zzjnVar.zzg.zza();
            this.zzu = zzabiVar;
            this.zzr = zzjnVar.zzm;
            this.zzK = zzjnVar.zzn;
            this.zzJ = zzjnVar.zzo;
            Looper looper = zzjnVar.zzi;
            this.zzt = looper;
            zzdo zzdoVar = zzjnVar.zzb;
            this.zzv = zzdoVar;
            this.zzg = zzbbVar;
            this.zzn = new zzee(looper, zzdoVar, new zzea() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyx(0);
            this.zzL = zzjo.zza;
            int length3 = this.zzh.length;
            zzaba zzabaVar = new zzaba(new zzmx[2], new zzaas[2], zzbn.zza, null);
            this.zzb = zzabaVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaazVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzM = zzawVar2.zze();
            this.zzk = zzdoVar.zzd(looper, null);
            zzlm zzlmVar = new zzlm() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // com.google.android.gms.internal.ads.zzlm
                public final /* synthetic */ void zza(zzll zzllVar) {
                    this.zza.zzK(zzllVar);
                }
            };
            this.zzl = zzlmVar;
            this.zzaa = zzmm.zza(zzabaVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpz zzpzVar = new zzpz(zzjnVar.zzx);
            zzlo zzloVar = new zzlo(this.zzf, this.zzh, this.zzi, zzaazVar, zzabaVar, (zzls) zzjnVar.zzf.zza(), zzabiVar, 0, false, this.zzs, this.zzK, zzjnVar.zzz, zzjnVar.zzp, false, false, looper, zzdoVar, zzlmVar, zzpzVar, null, this.zzL, this.zzx, zzjnVar.zzy);
            this.zzm = zzloVar;
            Looper looperZzn = zzloVar.zzn();
            this.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzN = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i2 = zzcz.zza;
            this.zzV = true;
            zze(this.zzs);
            zzabiVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zzjnVar.zzv;
                zzdoVar.zzd(zzloVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpv zzpvVarZza = zzpv.zza(context);
                        if (zzpvVarZza == null) {
                            zzef.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzD(zzpvVarZza);
                        }
                        zzpzVar.zzb(zzpvVarZza.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdoVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjnVar.zza, looperZzn, zzjnVar.zzi, this.zzw, zzdoVar);
            boolean z2 = (zzjnVar.zzs == Integer.MAX_VALUE || zzjnVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfq zzfqVar = new zzfq(zzjnVar.zza, looperZzn, zzdoVar);
            this.zzy = zzfqVar;
            zzfqVar.zza(z2);
            this.zzz = new zzfr(zzjnVar.zza, looperZzn, zzdoVar);
            int i3 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzR = zzet.zza;
            this.zzD = Build.VERSION.SDK_INT >= 34 ? new zzla(this, zzjnVar.zza, null) : null;
            this.zzE = new zzjr(this, 1, null);
            this.zzF = new zzjr(this, 2, null);
            this.zzC = new zzfb(this, this.zzw, zzdoVar, zzjnVar.zzr, zzjnVar.zzs, zzjnVar.zzt, zzjnVar.zzu);
            zzloVar.zzg(this.zzJ);
            zzloVar.zzi(this.zzS, false);
            zzau(1, 3, this.zzS);
            zzau(2, 4, Integer.valueOf(this.zzQ));
            zzau(2, 5, 0);
            zzau(1, 9, Boolean.valueOf(this.zzU));
            zzau(6, 8, this.zzx);
            zzau(-1, 16, Integer.valueOf(this.zzX));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzje zzjeVar) {
        zzmm zzmmVar = this.zzaa;
        zzmm zzmmVarZzh = zzmmVar.zzh(zzmmVar.zzb);
        zzmmVarZzh.zzq = zzmmVarZzh.zzs;
        zzmmVarZzh.zzr = 0L;
        zzmm zzmmVarZzam = zzam(zzmmVarZzh, 1);
        if (zzjeVar != null) {
            zzmmVarZzam = zzmmVarZzam.zzf(zzjeVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzmmVarZzam, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzag(zzmm zzmmVar) {
        zzbf zzbfVar = zzmmVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmmVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzmm zzmmVar) {
        zzxc zzxcVar = zzmmVar.zzb;
        if (!zzxcVar.zzb()) {
            return zzfk.zzr(zzai(zzmmVar));
        }
        zzbf zzbfVar = zzmmVar.zza;
        zzbfVar.zzo(zzxcVar.zza, this.zzp);
        long j = zzmmVar.zzc;
        if (j != -9223372036854775807L) {
            return zzfk.zzr(0L) + zzfk.zzr(j);
        }
        long j2 = zzbfVar.zzb(zzag(zzmmVar), this.zza, 0L).zzl;
        return zzfk.zzr(0L);
    }

    private final long zzai(zzmm zzmmVar) {
        zzbf zzbfVar = zzmmVar.zza;
        if (zzbfVar.zzg()) {
            return zzfk.zzs(this.zzac);
        }
        boolean z = zzmmVar.zzp;
        long j = zzmmVar.zzs;
        zzxc zzxcVar = zzmmVar.zzb;
        if (zzxcVar.zzb()) {
            return j;
        }
        zzao(zzbfVar, zzxcVar, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02da  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:116:0x0309  */
    /* JADX WARN: Code duplicated, block: B:118:0x031d  */
    /* JADX WARN: Code duplicated, block: B:120:0x032d  */
    /* JADX WARN: Code duplicated, block: B:123:0x033d  */
    /* JADX WARN: Code duplicated, block: B:126:0x034b  */
    /* JADX WARN: Code duplicated, block: B:131:0x035e  */
    /* JADX WARN: Code duplicated, block: B:134:0x036f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0384  */
    /* JADX WARN: Code duplicated, block: B:140:0x039a  */
    /* JADX WARN: Code duplicated, block: B:143:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x03de  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x0404  */
    /* JADX WARN: Code duplicated, block: B:158:0x0406  */
    /* JADX WARN: Code duplicated, block: B:160:0x0416  */
    /* JADX WARN: Code duplicated, block: B:163:0x0421  */
    /* JADX WARN: Code duplicated, block: B:165:0x0435  */
    /* JADX WARN: Code duplicated, block: B:166:0x0437  */
    /* JADX WARN: Code duplicated, block: B:170:0x0446  */
    /* JADX WARN: Code duplicated, block: B:173:0x0456  */
    /* JADX WARN: Code duplicated, block: B:176:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0472  */
    /* JADX WARN: Code duplicated, block: B:181:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x047c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x048d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x0498  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:217:0x04df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0138 A[LOOP:1: B:52:0x0132->B:54:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x020e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0225  */
    /* JADX WARN: Code duplicated, block: B:94:0x022c  */
    /* JADX WARN: Code duplicated, block: B:98:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final void zzaj(final zzmm zzmmVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        zzmm zzmmVar2;
        zzbf zzbfVar;
        final int i5;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i6;
        boolean zBooleanValue;
        final int iIntValue;
        final zzak zzakVar;
        zzam zzamVarZza;
        List list;
        int i7;
        zzap zzapVar;
        int i8;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        boolean zEquals;
        int i9;
        int i10;
        int i11;
        zzje zzjeVar;
        zzje zzjeVar2;
        zzaba zzabaVar;
        zzaba zzabaVar2;
        zzax zzaxVar;
        zzbb zzbbVar;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        zzax zzaxVar2;
        boolean z6;
        zzbf zzbfVarZzq3;
        ?? r15;
        int iZzi;
        int i12;
        boolean z7;
        ?? Zzq;
        int iZzs;
        ?? r5;
        zzbf zzbfVarZzq4;
        zzbb zzbbVar2;
        long j2;
        zzbf zzbfVarZzq5;
        boolean z8;
        boolean zZzg;
        boolean z9;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        zzax zzaxVarZze;
        zzee zzeeVar;
        zzbd zzbdVar;
        int i16;
        int i17;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long jZzak;
        long jZzak2;
        int iZzs2;
        int iZzr;
        int i18;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        long jZzr;
        long jZzr2;
        zzxc zzxcVar;
        int i19 = i2;
        zzmm zzmmVar3 = this.zzaa;
        this.zzaa = zzmmVar;
        zzbf zzbfVar2 = zzmmVar3.zza;
        zzbf zzbfVar3 = zzmmVar.zza;
        boolean zEquals2 = zzbfVar2.equals(zzbfVar3);
        if (!zzbfVar3.zzg() || !zzbfVar2.zzg()) {
            if (zzbfVar3.zzg() != zzbfVar2.zzg()) {
                pair = new Pair(true, 3);
            } else {
                zzxc zzxcVar2 = zzmmVar3.zzb;
                Object obj5 = zzxcVar2.zza;
                i4 = 0;
                zzbd zzbdVar2 = this.zzp;
                int i20 = zzbfVar2.zzo(obj5, zzbdVar2).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = zzbfVar2.zzb(i20, zzbeVar, 0L).zzb;
                zzxc zzxcVar3 = zzmmVar.zzb;
                zzmmVar2 = zzmmVar3;
                zzbfVar = zzbfVar2;
                if (obj6.equals(zzbfVar3.zzb(zzbfVar3.zzo(zzxcVar3.zza, zzbdVar2).zzc, zzbeVar, 0L).zzb)) {
                    if (z) {
                        if (i19 != 0) {
                            i5 = i19;
                        } else if (zzxcVar2.zzd < zzxcVar3.zzd) {
                            pair = new Pair(true, 0);
                            i5 = 0;
                            z3 = true;
                        } else {
                            i5 = 0;
                        }
                        z3 = true;
                    } else {
                        i5 = i19;
                        z3 = false;
                    }
                    pair = new Pair(false, -1);
                } else {
                    if (z) {
                        if (i19 == 0) {
                            i19 = 0;
                            i6 = 1;
                            z5 = true;
                        } else {
                            z4 = true;
                            z5 = true;
                        }
                        pair = new Pair(true, Integer.valueOf(i6));
                        i5 = i19;
                        z3 = z5;
                    } else {
                        z4 = false;
                        z5 = false;
                    }
                    if (z4 && i19 == 1) {
                        i6 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                    i5 = i19;
                    z3 = z5;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbfVar3.zzg()) {
                    zzakVar = null;
                } else {
                    zzakVar = zzbfVar3.zzb(zzbfVar3.zzo(zzmmVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
                }
                this.zzZ = zzan.zza;
            } else {
                zzakVar = null;
            }
            if (zBooleanValue || !zzmmVar2.zzj.equals(zzmmVar.zzj)) {
                zzamVarZza = this.zzZ.zza();
                list = zzmmVar.zzj;
                for (i7 = i4; i7 < list.size(); i7++) {
                    zzapVar = (zzap) list.get(i7);
                    for (i8 = i4; i8 < zzapVar.zza(); i8++) {
                        zzapVar.zzb(i8).zza(zzamVarZza);
                    }
                }
                this.zzZ = zzamVarZza.zzw();
            }
            zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                zzanVarZzw = this.zzZ;
            } else {
                zzak zzakVar4 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
                zzam zzamVarZza2 = this.zzZ.zza();
                zzamVarZza2.zzv(zzakVar4.zzd);
                zzanVarZzw = zzamVarZza2.zzw();
            }
            zEquals = zzanVarZzw.equals(this.zzN);
            this.zzN = zzanVarZzw;
            if (zzmmVar2.zzl != zzmmVar.zzl) {
                i9 = 1;
            } else {
                i9 = i4;
            }
            if (zzmmVar2.zze != zzmmVar.zze) {
                i10 = 1;
            } else {
                i10 = i4;
            }
            if (i10 == 0 || i9 != 0) {
                zzas();
            }
            if (zzmmVar2.zzg != zzmmVar.zzg) {
                i11 = 1;
            } else {
                i11 = i4;
            }
            if (!zEquals2) {
                this.zzn.zze(i4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkr
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj7) {
                        int i21 = zzlb.zzd;
                        ((zzaz) obj7).zzb(zzmmVar.zza, i);
                    }
                });
            }
            if (z3) {
                zzbdVar = new zzbd();
                if (zzbfVar.zzg()) {
                    i16 = i3;
                    i17 = i16;
                    obj = null;
                    zzakVar2 = null;
                    obj2 = null;
                } else {
                    Object obj7 = zzmmVar2.zzb.zza;
                    zzbf zzbfVar4 = zzbfVar;
                    zzbfVar4.zzo(obj7, zzbdVar);
                    int i21 = zzbdVar.zzc;
                    int iZze = zzbfVar4.zze(obj7);
                    zzbe zzbeVar2 = this.zza;
                    Object obj8 = zzbfVar4.zzb(i21, zzbeVar2, 0L).zzb;
                    zzakVar2 = zzbeVar2.zzd;
                    i16 = i21;
                    obj = obj8;
                    obj2 = obj7;
                    i17 = iZze;
                }
                if (i5 == 0) {
                    zzxcVar = zzmmVar2.zzb;
                    if (zzxcVar.zzb()) {
                        jZzak = zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc);
                        jZzak2 = zzak(zzmmVar2);
                    } else {
                        if (zzxcVar.zze != -1) {
                            jZzak = zzak(this.zzaa);
                        } else {
                            jZzak = zzbdVar.zzd;
                        }
                        jZzak2 = jZzak;
                    }
                } else if (zzmmVar2.zzb.zzb()) {
                    jZzak = zzmmVar2.zzs;
                    jZzak2 = zzak(zzmmVar2);
                } else {
                    jZzak = zzmmVar2.zzs;
                    jZzak2 = jZzak;
                }
                String str = zzfk.zza;
                zzxc zzxcVar4 = zzmmVar2.zzb;
                final zzba zzbaVar = new zzba(obj, i16, zzakVar2, obj2, i17, zzfk.zzr(jZzak), zzfk.zzr(jZzak2), zzxcVar4.zzb, zzxcVar4.zzc);
                iZzs2 = zzs();
                iZzr = zzr();
                if (this.zzaa.zza.zzg()) {
                    i18 = iZzr;
                    obj3 = null;
                    zzakVar3 = null;
                    obj4 = null;
                } else {
                    zzmm zzmmVar4 = this.zzaa;
                    Object obj9 = zzmmVar4.zzb.zza;
                    zzmmVar4.zza.zzo(obj9, this.zzp);
                    int iZze2 = this.zzaa.zza.zze(obj9);
                    zzbf zzbfVar5 = this.zzaa.zza;
                    zzbe zzbeVar3 = this.zza;
                    i18 = iZze2;
                    obj3 = zzbfVar5.zzb(iZzs2, zzbeVar3, 0L).zzb;
                    zzakVar3 = zzbeVar3.zzd;
                    obj4 = obj9;
                }
                jZzr = zzfk.zzr(j);
                if (this.zzaa.zzb.zzb()) {
                    jZzr2 = zzfk.zzr(zzak(this.zzaa));
                } else {
                    jZzr2 = jZzr;
                }
                zzxc zzxcVar5 = this.zzaa.zzb;
                final zzba zzbaVar2 = new zzba(obj3, iZzs2, zzakVar3, obj4, i18, jZzr, jZzr2, zzxcVar5.zzb, zzxcVar5.zzc);
                this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i5);
                    }
                });
            } else {
                i9 = i9;
                zEquals = zEquals;
            }
            if (zBooleanValue) {
                this.zzn.zze(1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkt
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzc(zzakVar, iIntValue);
                    }
                });
            }
            zzjeVar = zzmmVar2.zzf;
            zzjeVar2 = zzmmVar.zzf;
            if (zzjeVar != zzjeVar2) {
                zzeeVar = this.zzn;
                zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzku
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzn(zzmmVar.zzf);
                    }
                });
                if (zzjeVar2 != null) {
                    zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzjz
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i22 = zzlb.zzd;
                            ((zzaz) obj10).zzm(zzmmVar.zzf);
                        }
                    });
                }
            }
            zzabaVar = zzmmVar2.zzi;
            zzabaVar2 = zzmmVar.zzi;
            if (zzabaVar != zzabaVar2) {
                this.zzj.zzq(zzabaVar2.zze);
                this.zzn.zze(2, new zzdz() { // from class: com.google.android.gms.internal.ads.zzka
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzd(zzmmVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzan zzanVar = this.zzN;
                this.zzn.zze(14, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkb
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zze(zzanVar);
                    }
                });
            }
            if (i11 != 0) {
                this.zzn.zze(3, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkc
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzf(zzmmVar.zzg);
                    }
                });
            }
            if (i10 == 0 || i9 != 0) {
                this.zzn.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkd
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        zzmm zzmmVar5 = zzmmVar;
                        ((zzaz) obj10).zzh(zzmmVar5.zzl, zzmmVar5.zze);
                    }
                });
            }
            if (i10 != 0) {
                this.zzn.zze(4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzke
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzi(zzmmVar.zze);
                    }
                });
            }
            if (i9 == 0 || zzmmVar2.zzm != zzmmVar.zzm) {
                this.zzn.zze(5, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkf
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        zzmm zzmmVar5 = zzmmVar;
                        ((zzaz) obj10).zzj(zzmmVar5.zzl, zzmmVar5.zzm);
                    }
                });
            }
            if (zzmmVar2.zzn != zzmmVar.zzn) {
                this.zzn.zze(6, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkg
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzk(zzmmVar.zzn);
                    }
                });
            }
            if (zzmmVar2.zzj() != zzmmVar.zzj()) {
                this.zzn.zze(7, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzl(zzmmVar.zzj());
                    }
                });
            }
            if (!zzmmVar2.zzo.equals(zzmmVar.zzo)) {
                this.zzn.zze(12, new zzdz() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzlb.zzd;
                        ((zzaz) obj10).zzp(zzmmVar.zzo);
                    }
                });
            }
            zzaxVar = this.zzM;
            zzbbVar = this.zzg;
            zzax zzaxVar3 = this.zzc;
            String str2 = zzfk.zza;
            boolean zZzx = zzbbVar.zzx();
            zzfVar = (zzf) zzbbVar;
            zzbfVarZzq2 = zzfVar.zzq();
            if (!zzbfVarZzq2.zzg()) {
                zzaxVar2 = zzaxVar;
                z6 = zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh;
                zzbfVarZzq3 = zzfVar.zzq();
                if (zzbfVarZzq3.zzg()) {
                    i12 = -1;
                    r15 = 0;
                    z7 = false;
                } else {
                    int iZzs3 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    r15 = 0;
                    r15 = 0;
                    iZzi = zzbfVarZzq3.zzi(iZzs3, 0, false);
                    i12 = -1;
                    if (iZzi != -1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                Zzq = zzfVar.zzq();
                if (Zzq.zzg()) {
                    r5 = r15;
                } else {
                    iZzs = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    if (Zzq.zzh(iZzs, r15, r15) != i12) {
                        r5 = 1;
                    } else {
                        r5 = r15;
                    }
                }
                zzbfVarZzq4 = zzfVar.zzq();
                if (!zzbfVarZzq4.zzg()) {
                    zzbbVar2 = zzbbVar;
                    j2 = 0;
                    boolean z16 = zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb();
                    zzbfVarZzq5 = zzfVar.zzq();
                    if (zzbfVarZzq5.zzg() && zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zZzg = zzbbVar2.zzq().zzg();
                    zzaw zzawVar = new zzaw();
                    zzawVar.zzd(zzaxVar3);
                    boolean z17 = !zZzx;
                    zzawVar.zzb(4, z17);
                    if (z6 || zZzx) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    zzawVar.zzb(5, z9);
                    if (z7 || zZzx) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zzawVar.zzb(6, z10);
                    if (!zZzg || (!(z7 || !z16 || z6) || zZzx)) {
                        i13 = 7;
                        z11 = false;
                    } else {
                        i13 = 7;
                        z11 = true;
                    }
                    zzawVar.zzb(i13, z11);
                    if (r5 != 0 || zZzx) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    zzawVar.zzb(8, z12);
                    if (!zZzg || ((r5 == 0 && !(z16 && z8)) || zZzx)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    zzawVar.zzb(9, z13);
                    zzawVar.zzb(10, z17);
                    if (z6 || zZzx) {
                        i14 = 11;
                        z14 = false;
                    } else {
                        i14 = 11;
                        z14 = true;
                    }
                    zzawVar.zzb(i14, z14);
                    if (z6 || zZzx) {
                        i15 = 12;
                        z15 = false;
                    } else {
                        i15 = 12;
                        z15 = true;
                    }
                    zzawVar.zzb(i15, z15);
                    zzaxVarZze = zzawVar.zze();
                    this.zzM = zzaxVarZze;
                    if (!zzaxVarZze.equals(zzaxVar2)) {
                        this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                            @Override // com.google.android.gms.internal.ads.zzdz
                            public final /* synthetic */ void zza(Object obj10) {
                                this.zza.zzN((zzaz) obj10);
                            }
                        });
                    }
                    this.zzn.zzf();
                    boolean z18 = zzmmVar2.zzp;
                    boolean z19 = zzmmVar.zzp;
                }
                zzbbVar2 = zzbbVar;
                j2 = 0;
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar2 = new zzaw();
                zzawVar2.zzd(zzaxVar3);
                boolean z110 = !zZzx;
                zzawVar2.zzb(4, z110);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar2.zzb(5, z9);
                if (z7) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar2.zzb(6, z10);
                if (zZzg) {
                    i13 = 7;
                    z11 = false;
                } else {
                    i13 = 7;
                    z11 = false;
                }
                zzawVar2.zzb(i13, z11);
                if (r5 != 0) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar2.zzb(8, z12);
                if (zZzg) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar2.zzb(9, z13);
                zzawVar2.zzb(10, z110);
                if (z6) {
                    i14 = 11;
                    z14 = false;
                } else {
                    i14 = 11;
                    z14 = false;
                }
                zzawVar2.zzb(i14, z14);
                if (z6) {
                    i15 = 12;
                    z15 = false;
                } else {
                    i15 = 12;
                    z15 = false;
                }
                zzawVar2.zzb(i15, z15);
                zzaxVarZze = zzawVar2.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzN((zzaz) obj10);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z111 = zzmmVar2.zzp;
                boolean z112 = zzmmVar.zzp;
            }
            zzaxVar2 = zzaxVar;
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i12 = -1;
                r15 = 0;
                z7 = false;
            } else {
                int iZzs4 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs4, 0, false);
                i12 = -1;
                if (iZzi != -1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r5 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i12) {
                    r5 = 1;
                } else {
                    r5 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                zzbbVar2 = zzbbVar;
                j2 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar3 = new zzaw();
                zzawVar3.zzd(zzaxVar3);
                boolean z113 = !zZzx;
                zzawVar3.zzb(4, z113);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar3.zzb(5, z9);
                if (z7) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar3.zzb(6, z10);
                if (zZzg) {
                    i13 = 7;
                    z11 = false;
                } else {
                    i13 = 7;
                    z11 = false;
                }
                zzawVar3.zzb(i13, z11);
                if (r5 != 0) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar3.zzb(8, z12);
                if (zZzg) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar3.zzb(9, z13);
                zzawVar3.zzb(10, z113);
                if (z6) {
                    i14 = 11;
                    z14 = false;
                } else {
                    i14 = 11;
                    z14 = false;
                }
                zzawVar3.zzb(i14, z14);
                if (z6) {
                    i15 = 12;
                    z15 = false;
                } else {
                    i15 = 12;
                    z15 = false;
                }
                zzawVar3.zzb(i15, z15);
                zzaxVarZze = zzawVar3.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzN((zzaz) obj10);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z114 = zzmmVar2.zzp;
                boolean z115 = zzmmVar.zzp;
            }
            zzbbVar2 = zzbbVar;
            j2 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z8 = false;
            } else {
                z8 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar4 = new zzaw();
            zzawVar4.zzd(zzaxVar3);
            boolean z116 = !zZzx;
            zzawVar4.zzb(4, z116);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar4.zzb(5, z9);
            if (z7) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar4.zzb(6, z10);
            if (zZzg) {
                i13 = 7;
                z11 = false;
            } else {
                i13 = 7;
                z11 = false;
            }
            zzawVar4.zzb(i13, z11);
            if (r5 != 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar4.zzb(8, z12);
            if (zZzg) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar4.zzb(9, z13);
            zzawVar4.zzb(10, z116);
            if (z6) {
                i14 = 11;
                z14 = false;
            } else {
                i14 = 11;
                z14 = false;
            }
            zzawVar4.zzb(i14, z14);
            if (z6) {
                i15 = 12;
                z15 = false;
            } else {
                i15 = 12;
                z15 = false;
            }
            zzawVar4.zzb(i15, z15);
            zzaxVarZze = zzawVar4.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj10) {
                        this.zza.zzN((zzaz) obj10);
                    }
                });
            }
            this.zzn.zzf();
            boolean z117 = zzmmVar2.zzp;
            boolean z118 = zzmmVar.zzp;
        }
        pair = new Pair(false, -1);
        zzmmVar2 = zzmmVar3;
        zzbfVar = zzbfVar2;
        i4 = 0;
        i5 = i19;
        z3 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbfVar3.zzg()) {
                zzakVar = zzbfVar3.zzb(zzbfVar3.zzo(zzmmVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
            } else {
                zzakVar = null;
            }
            this.zzZ = zzan.zza;
        } else {
            zzakVar = null;
        }
        if (zBooleanValue) {
            zzamVarZza = this.zzZ.zza();
            list = zzmmVar.zzj;
            while (i7 < list.size()) {
                zzapVar = (zzap) list.get(i7);
                while (i8 < zzapVar.zza()) {
                    zzapVar.zzb(i8).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        } else {
            zzamVarZza = this.zzZ.zza();
            list = zzmmVar.zzj;
            while (i7 < list.size()) {
                zzapVar = (zzap) list.get(i7);
                while (i8 < zzapVar.zza()) {
                    zzapVar.zzb(i8).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        }
        zzbfVarZzq = zzq();
        if (zzbfVarZzq.zzg()) {
            zzanVarZzw = this.zzZ;
        } else {
            zzak zzakVar5 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
            zzam zzamVarZza3 = this.zzZ.zza();
            zzamVarZza3.zzv(zzakVar5.zzd);
            zzanVarZzw = zzamVarZza3.zzw();
        }
        zEquals = zzanVarZzw.equals(this.zzN);
        this.zzN = zzanVarZzw;
        if (zzmmVar2.zzl != zzmmVar.zzl) {
            i9 = 1;
        } else {
            i9 = i4;
        }
        if (zzmmVar2.zze != zzmmVar.zze) {
            i10 = 1;
        } else {
            i10 = i4;
        }
        if (i10 == 0) {
            zzas();
        } else {
            zzas();
        }
        if (zzmmVar2.zzg != zzmmVar.zzg) {
            i11 = 1;
        } else {
            i11 = i4;
        }
        if (!zEquals2) {
            this.zzn.zze(i4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj10) {
                    int i22 = zzlb.zzd;
                    ((zzaz) obj10).zzb(zzmmVar.zza, i);
                }
            });
        }
        if (z3) {
            zzbdVar = new zzbd();
            if (zzbfVar.zzg()) {
                Object obj10 = zzmmVar2.zzb.zza;
                zzbf zzbfVar6 = zzbfVar;
                zzbfVar6.zzo(obj10, zzbdVar);
                int i22 = zzbdVar.zzc;
                int iZze3 = zzbfVar6.zze(obj10);
                zzbe zzbeVar4 = this.zza;
                Object obj11 = zzbfVar6.zzb(i22, zzbeVar4, 0L).zzb;
                zzakVar2 = zzbeVar4.zzd;
                i16 = i22;
                obj = obj11;
                obj2 = obj10;
                i17 = iZze3;
            } else {
                i16 = i3;
                i17 = i16;
                obj = null;
                zzakVar2 = null;
                obj2 = null;
            }
            if (i5 == 0) {
                zzxcVar = zzmmVar2.zzb;
                if (zzxcVar.zzb()) {
                    jZzak = zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc);
                    jZzak2 = zzak(zzmmVar2);
                } else {
                    if (zzxcVar.zze != -1) {
                        jZzak = zzak(this.zzaa);
                    } else {
                        jZzak = zzbdVar.zzd;
                    }
                    jZzak2 = jZzak;
                }
            } else if (zzmmVar2.zzb.zzb()) {
                jZzak = zzmmVar2.zzs;
                jZzak2 = zzak(zzmmVar2);
            } else {
                jZzak = zzmmVar2.zzs;
                jZzak2 = jZzak;
            }
            String str3 = zzfk.zza;
            zzxc zzxcVar6 = zzmmVar2.zzb;
            final zzba zzbaVar3 = new zzba(obj, i16, zzakVar2, obj2, i17, zzfk.zzr(jZzak), zzfk.zzr(jZzak2), zzxcVar6.zzb, zzxcVar6.zzc);
            iZzs2 = zzs();
            iZzr = zzr();
            if (this.zzaa.zza.zzg()) {
                zzmm zzmmVar5 = this.zzaa;
                Object obj12 = zzmmVar5.zzb.zza;
                zzmmVar5.zza.zzo(obj12, this.zzp);
                int iZze4 = this.zzaa.zza.zze(obj12);
                zzbf zzbfVar7 = this.zzaa.zza;
                zzbe zzbeVar5 = this.zza;
                i18 = iZze4;
                obj3 = zzbfVar7.zzb(iZzs2, zzbeVar5, 0L).zzb;
                zzakVar3 = zzbeVar5.zzd;
                obj4 = obj12;
            } else {
                i18 = iZzr;
                obj3 = null;
                zzakVar3 = null;
                obj4 = null;
            }
            jZzr = zzfk.zzr(j);
            if (this.zzaa.zzb.zzb()) {
                jZzr2 = zzfk.zzr(zzak(this.zzaa));
            } else {
                jZzr2 = jZzr;
            }
            zzxc zzxcVar7 = this.zzaa.zzb;
            final zzba zzbaVar4 = new zzba(obj3, iZzs2, zzakVar3, obj4, i18, jZzr, jZzr2, zzxcVar7.zzb, zzxcVar7.zzc);
            this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzo(zzbaVar3, zzbaVar4, i5);
                }
            });
        } else {
            i9 = i9;
            zEquals = zEquals;
        }
        if (zBooleanValue) {
            this.zzn.zze(1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzc(zzakVar, iIntValue);
                }
            });
        }
        zzjeVar = zzmmVar2.zzf;
        zzjeVar2 = zzmmVar.zzf;
        if (zzjeVar != zzjeVar2) {
            zzeeVar = this.zzn;
            zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzn(zzmmVar.zzf);
                }
            });
            if (zzjeVar2 != null) {
                zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzjz
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj13) {
                        int i23 = zzlb.zzd;
                        ((zzaz) obj13).zzm(zzmmVar.zzf);
                    }
                });
            }
        }
        zzabaVar = zzmmVar2.zzi;
        zzabaVar2 = zzmmVar.zzi;
        if (zzabaVar != zzabaVar2) {
            this.zzj.zzq(zzabaVar2.zze);
            this.zzn.zze(2, new zzdz() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzd(zzmmVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzan zzanVar2 = this.zzN;
            this.zzn.zze(14, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkb
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zze(zzanVar2);
                }
            });
        }
        if (i11 != 0) {
            this.zzn.zze(3, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzf(zzmmVar.zzg);
                }
            });
        }
        if (i10 == 0) {
            this.zzn.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkd
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    zzmm zzmmVar6 = zzmmVar;
                    ((zzaz) obj13).zzh(zzmmVar6.zzl, zzmmVar6.zze);
                }
            });
        } else {
            this.zzn.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkd
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    zzmm zzmmVar6 = zzmmVar;
                    ((zzaz) obj13).zzh(zzmmVar6.zzl, zzmmVar6.zze);
                }
            });
        }
        if (i10 != 0) {
            this.zzn.zze(4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzi(zzmmVar.zze);
                }
            });
        }
        if (i9 == 0) {
            this.zzn.zze(5, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    zzmm zzmmVar6 = zzmmVar;
                    ((zzaz) obj13).zzj(zzmmVar6.zzl, zzmmVar6.zzm);
                }
            });
        } else {
            this.zzn.zze(5, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    zzmm zzmmVar6 = zzmmVar;
                    ((zzaz) obj13).zzj(zzmmVar6.zzl, zzmmVar6.zzm);
                }
            });
        }
        if (zzmmVar2.zzn != zzmmVar.zzn) {
            this.zzn.zze(6, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzk(zzmmVar.zzn);
                }
            });
        }
        if (zzmmVar2.zzj() != zzmmVar.zzj()) {
            this.zzn.zze(7, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzl(zzmmVar.zzj());
                }
            });
        }
        if (!zzmmVar2.zzo.equals(zzmmVar.zzo)) {
            this.zzn.zze(12, new zzdz() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzlb.zzd;
                    ((zzaz) obj13).zzp(zzmmVar.zzo);
                }
            });
        }
        zzaxVar = this.zzM;
        zzbbVar = this.zzg;
        zzax zzaxVar4 = this.zzc;
        String str4 = zzfk.zza;
        boolean zZzx2 = zzbbVar.zzx();
        zzfVar = (zzf) zzbbVar;
        zzbfVarZzq2 = zzfVar.zzq();
        if (!zzbfVarZzq2.zzg()) {
            zzaxVar2 = zzaxVar;
            if (zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
            }
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i12 = -1;
                r15 = 0;
                z7 = false;
            } else {
                int iZzs5 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs5, 0, false);
                i12 = -1;
                if (iZzi != -1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r5 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i12) {
                    r5 = 1;
                } else {
                    r5 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                zzbbVar2 = zzbbVar;
                j2 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar5 = new zzaw();
                zzawVar5.zzd(zzaxVar4);
                boolean z119 = !zZzx2;
                zzawVar5.zzb(4, z119);
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                zzawVar5.zzb(5, z9);
                if (z7) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                zzawVar5.zzb(6, z10);
                if (zZzg) {
                    i13 = 7;
                    z11 = false;
                } else {
                    i13 = 7;
                    z11 = false;
                }
                zzawVar5.zzb(i13, z11);
                if (r5 != 0) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                zzawVar5.zzb(8, z12);
                if (zZzg) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zzawVar5.zzb(9, z13);
                zzawVar5.zzb(10, z119);
                if (z6) {
                    i14 = 11;
                    z14 = false;
                } else {
                    i14 = 11;
                    z14 = false;
                }
                zzawVar5.zzb(i14, z14);
                if (z6) {
                    i15 = 12;
                    z15 = false;
                } else {
                    i15 = 12;
                    z15 = false;
                }
                zzawVar5.zzb(i15, z15);
                zzaxVarZze = zzawVar5.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar2)) {
                    this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj13) {
                            this.zza.zzN((zzaz) obj13);
                        }
                    });
                }
                this.zzn.zzf();
                boolean z1110 = zzmmVar2.zzp;
                boolean z1111 = zzmmVar.zzp;
            }
            zzbbVar2 = zzbbVar;
            j2 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z8 = false;
            } else {
                z8 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar6 = new zzaw();
            zzawVar6.zzd(zzaxVar4);
            boolean z1112 = !zZzx2;
            zzawVar6.zzb(4, z1112);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar6.zzb(5, z9);
            if (z7) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar6.zzb(6, z10);
            if (zZzg) {
                i13 = 7;
                z11 = false;
            } else {
                i13 = 7;
                z11 = false;
            }
            zzawVar6.zzb(i13, z11);
            if (r5 != 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar6.zzb(8, z12);
            if (zZzg) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar6.zzb(9, z13);
            zzawVar6.zzb(10, z1112);
            if (z6) {
                i14 = 11;
                z14 = false;
            } else {
                i14 = 11;
                z14 = false;
            }
            zzawVar6.zzb(i14, z14);
            if (z6) {
                i15 = 12;
                z15 = false;
            } else {
                i15 = 12;
                z15 = false;
            }
            zzawVar6.zzb(i15, z15);
            zzaxVarZze = zzawVar6.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj13) {
                        this.zza.zzN((zzaz) obj13);
                    }
                });
            }
            this.zzn.zzf();
            boolean z1113 = zzmmVar2.zzp;
            boolean z1114 = zzmmVar.zzp;
        }
        zzaxVar2 = zzaxVar;
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
            i12 = -1;
            r15 = 0;
            z7 = false;
        } else {
            int iZzs6 = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            r15 = 0;
            r15 = 0;
            iZzi = zzbfVarZzq3.zzi(iZzs6, 0, false);
            i12 = -1;
            if (iZzi != -1) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
            r5 = r15;
        } else {
            iZzs = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            if (Zzq.zzh(iZzs, r15, r15) != i12) {
                r5 = 1;
            } else {
                r5 = r15;
            }
        }
        zzbfVarZzq4 = zzfVar.zzq();
        if (!zzbfVarZzq4.zzg()) {
            zzbbVar2 = zzbbVar;
            j2 = 0;
            if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
            }
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z8 = false;
            } else {
                z8 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar7 = new zzaw();
            zzawVar7.zzd(zzaxVar4);
            boolean z1115 = !zZzx2;
            zzawVar7.zzb(4, z1115);
            if (z6) {
                z9 = false;
            } else {
                z9 = false;
            }
            zzawVar7.zzb(5, z9);
            if (z7) {
                z10 = false;
            } else {
                z10 = false;
            }
            zzawVar7.zzb(6, z10);
            if (zZzg) {
                i13 = 7;
                z11 = false;
            } else {
                i13 = 7;
                z11 = false;
            }
            zzawVar7.zzb(i13, z11);
            if (r5 != 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            zzawVar7.zzb(8, z12);
            if (zZzg) {
                z13 = false;
            } else {
                z13 = false;
            }
            zzawVar7.zzb(9, z13);
            zzawVar7.zzb(10, z1115);
            if (z6) {
                i14 = 11;
                z14 = false;
            } else {
                i14 = 11;
                z14 = false;
            }
            zzawVar7.zzb(i14, z14);
            if (z6) {
                i15 = 12;
                z15 = false;
            } else {
                i15 = 12;
                z15 = false;
            }
            zzawVar7.zzb(i15, z15);
            zzaxVarZze = zzawVar7.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar2)) {
                this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzdz
                    public final /* synthetic */ void zza(Object obj13) {
                        this.zza.zzN((zzaz) obj13);
                    }
                });
            }
            this.zzn.zzf();
            boolean z1116 = zzmmVar2.zzp;
            boolean z1117 = zzmmVar.zzp;
        }
        zzbbVar2 = zzbbVar;
        j2 = 0;
        zzbfVarZzq5 = zzfVar.zzq();
        if (zzbfVarZzq5.zzg()) {
            z8 = false;
        } else {
            z8 = false;
        }
        zZzg = zzbbVar2.zzq().zzg();
        zzaw zzawVar8 = new zzaw();
        zzawVar8.zzd(zzaxVar4);
        boolean z1118 = !zZzx2;
        zzawVar8.zzb(4, z1118);
        if (z6) {
            z9 = false;
        } else {
            z9 = false;
        }
        zzawVar8.zzb(5, z9);
        if (z7) {
            z10 = false;
        } else {
            z10 = false;
        }
        zzawVar8.zzb(6, z10);
        if (zZzg) {
            i13 = 7;
            z11 = false;
        } else {
            i13 = 7;
            z11 = false;
        }
        zzawVar8.zzb(i13, z11);
        if (r5 != 0) {
            z12 = false;
        } else {
            z12 = false;
        }
        zzawVar8.zzb(8, z12);
        if (zZzg) {
            z13 = false;
        } else {
            z13 = false;
        }
        zzawVar8.zzb(9, z13);
        zzawVar8.zzb(10, z1118);
        if (z6) {
            i14 = 11;
            z14 = false;
        } else {
            i14 = 11;
            z14 = false;
        }
        zzawVar8.zzb(i14, z14);
        if (z6) {
            i15 = 12;
            z15 = false;
        } else {
            i15 = 12;
            z15 = false;
        }
        zzawVar8.zzb(i15, z15);
        zzaxVarZze = zzawVar8.zze();
        this.zzM = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar2)) {
            this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj13) {
                    this.zza.zzN((zzaz) obj13);
                }
            });
        }
        this.zzn.zzf();
        boolean z1119 = zzmmVar2.zzp;
        boolean z11110 = zzmmVar.zzp;
    }

    private static long zzak(zzmm zzmmVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmmVar.zza;
        zzbfVar.zzo(zzmmVar.zzb.zza, zzbdVar);
        long j = zzmmVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    private final zzmm zzal(zzmm zzmmVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        zzgsw.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmmVar.zza;
        long jZzah = zzah(zzmmVar);
        zzmm zzmmVarZzd = zzmmVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxc zzxcVarZzb = zzmm.zzb();
            long jZzs = zzfk.zzs(this.zzac);
            zzmm zzmmVarZzh = zzmmVarZzd.zzc(zzxcVarZzb, jZzs, jZzs, jZzs, 0L, zzzf.zza, this.zzb, zzgvz.zzi()).zzh(zzxcVarZzb);
            zzmmVarZzh.zzq = zzmmVarZzh.zzs;
            return zzmmVarZzh;
        }
        zzxc zzxcVar = zzmmVarZzd.zzb;
        Object obj = zzxcVar.zza;
        String str = zzfk.zza;
        boolean zEquals = obj.equals(pair.first);
        zzxc zzxcVar2 = !zEquals ? new zzxc(pair.first, -1L) : zzxcVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzfk.zzs(jZzah);
        if (zzbfVar2.zzg()) {
            z = true;
        } else {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (zEquals && jZzs2 - jLongValue == 1) {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                z = true;
                if (jZzs2 == zzbdVarZzo.zzd) {
                    jZzs2--;
                }
            } else {
                z = true;
            }
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzgsw.zzi(zzxcVar2.zzb() ^ z);
            zzxc zzxcVar3 = zzxcVar2;
            zzmm zzmmVarZzh2 = zzmmVarZzd.zzc(zzxcVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzzf.zza : zzmmVarZzd.zzh, !zEquals ? this.zzb : zzmmVarZzd.zzi, !zEquals ? zzgvz.zzi() : zzmmVarZzd.zzj).zzh(zzxcVar3);
            zzmmVarZzh2.zzq = jLongValue;
            return zzmmVarZzh2;
        }
        if (jLongValue != jZzs2) {
            zzgsw.zzi(zzxcVar2.zzb() ^ z);
            long jMax = Math.max(0L, zzmmVarZzd.zzr - (jLongValue - jZzs2));
            long j = zzmmVarZzd.zzq;
            if (zzmmVarZzd.zzk.equals(zzxcVar)) {
                j = jLongValue + jMax;
            }
            zzmm zzmmVarZzc = zzmmVarZzd.zzc(zzxcVar2, jLongValue, jLongValue, jLongValue, jMax, zzmmVarZzd.zzh, zzmmVarZzd.zzi, zzmmVarZzd.zzj);
            zzmmVarZzc.zzq = j;
            return zzmmVarZzc;
        }
        int iZze = zzbfVar.zze(zzmmVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxcVar2.zza, zzbdVar2).zzc) {
                return zzmmVarZzd;
            }
        }
        Object obj2 = zzxcVar2.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzxcVar2.zzb() ? zzbdVar3.zzh(zzxcVar2.zzb, zzxcVar2.zzc) : zzbdVar3.zzd;
        zzxc zzxcVar4 = zzxcVar2;
        zzmm zzmmVarZzh3 = zzmmVarZzd.zzc(zzxcVar4, zzmmVarZzd.zzs, zzmmVarZzd.zzs, zzmmVarZzd.zzd, jZzh - zzmmVarZzd.zzs, zzmmVarZzd.zzh, zzmmVarZzd.zzi, zzmmVarZzd.zzj).zzh(zzxcVar4);
        zzmmVarZzh3.zzq = jZzh;
        return zzmmVarZzh3;
    }

    private static zzmm zzam(zzmm zzmmVar, int i) {
        zzmm zzmmVarZze = zzmmVar.zze(i);
        return (i == 1 || i == 4) ? zzmmVarZze.zzg(false) : zzmmVarZze;
    }

    private final Pair zzan(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfk.zzr(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfk.zzs(j));
    }

    private final long zzao(zzbf zzbfVar, zzxc zzxcVar, long j) {
        zzbfVar.zzo(zzxcVar.zza, this.zzp);
        return j;
    }

    private final zzmq zzap(zzmp zzmpVar) {
        int iZzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzag == -1) {
            iZzag = 0;
        }
        zzdo zzdoVar = this.zzv;
        zzlo zzloVar = this.zzm;
        return new zzmq(zzloVar, zzmpVar, zzbfVar, iZzag, zzdoVar, zzloVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z ? this.zzA : -9223372036854775807L);
        if (z) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zZzl) {
            return;
        }
        zzP(zzje.zzc(new zzlp(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzR.zza() && i2 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzet(i, i2);
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(24, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlb.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzeeVar.zzf();
        zzau(2, 14, new zzet(i, i2));
    }

    private final void zzas() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfk.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(str2);
            }
            zzef.zzd("ExoPlayerImpl", str2, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i, int i2, Object obj) {
        zzmu[] zzmuVarArr = this.zzh;
        int length = zzmuVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmu zzmuVar = zzmuVarArr[i3];
            if (i == -1 || zzmuVar.zza() == i) {
                zzmq zzmqVarZzap = zzap(zzmuVar);
                zzmqVarZzap.zzb(i2);
                zzmqVarZzap.zzd(obj);
                zzmqVarZzap.zzg();
            }
        }
        zzmu[] zzmuVarArr2 = this.zzi;
        int length2 = zzmuVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzmu zzmuVar2 = zzmuVarArr2[i4];
            if (zzmuVar2 != null && (i == -1 || zzmuVar2.zza() == i)) {
                zzmq zzmqVarZzap2 = zzap(zzmuVar2);
                zzmqVarZzap2.zzb(i2);
                zzmqVarZzap2.zzd(obj);
                zzmqVarZzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzat();
        String str = zzfk.zza;
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzT == fMax) {
            return;
        }
        this.zzT = fMax;
        this.zzm.zzj(fMax);
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(22, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i = zzlb.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzeeVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzD(zznj zznjVar) {
        this.zzs.zzv(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzE(zznj zznjVar) {
        zzat();
        this.zzs.zzw(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzG(zzxe zzxeVar) {
        zzat();
        List listSingletonList = Collections.singletonList(zzxeVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            zzmi zzmiVar = new zzmi((zzxe) listSingletonList.get(i), this.zzr);
            arrayList.add(zzmiVar);
            list.add(i, new zzkx(zzmiVar.zzb, zzmiVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzms zzmsVar = new zzms(list, this.zzad);
        if (!zzmsVar.zzg() && zzmsVar.zza() < 0) {
            throw new zzw(zzmsVar, -1, -9223372036854775807L);
        }
        int iZzk = zzmsVar.zzk(false);
        zzmm zzmmVarZzal = zzal(this.zzaa, zzmsVar, zzan(zzmsVar, iZzk, -9223372036854775807L));
        int i2 = zzmmVarZzal.zze;
        if (i2 == 1) {
            i2 = 1;
        } else if (zzmsVar.zzg()) {
            i2 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zzmsVar.zza()) {
                i2 = 4;
            } else {
                i2 = 2;
            }
        }
        zzmm zzmmVarZzam = zzam(zzmmVarZzal, i2);
        this.zzm.zzy(arrayList, iZzk, zzfk.zzs(-9223372036854775807L), this.zzad);
        zzaj(zzmmVarZzam, 0, (this.zzaa.zzb.zza.equals(zzmmVarZzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzmmVarZzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfk.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.10.0-alpha01] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strZza);
        sb.append(C11744X3.j.f26440e);
        zzef.zzb("ExoPlayerImpl", sb.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzla zzlaVar = this.zzD;
        if (zzlaVar != null && Build.VERSION.SDK_INT >= 34) {
            zzlaVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzee zzeeVar = this.zzn;
            zzeeVar.zze(10, zzkp.zza);
            zzeeVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabi zzabiVar = this.zzu;
        zzng zzngVar = this.zzs;
        zzabiVar.zzg(zzngVar);
        boolean z = this.zzaa.zzp;
        zzmm zzmmVarZzam = zzam(this.zzaa, 1);
        this.zzaa = zzmmVarZzam;
        zzmm zzmmVarZzh = zzmmVarZzam.zzh(zzmmVarZzam.zzb);
        this.zzaa = zzmmVarZzh;
        zzmmVarZzh.zzq = zzmmVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zzngVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i = zzcz.zza;
        this.zzY = true;
    }

    public final zzje zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzll zzllVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzllVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzat();
        Integer numValueOf = Integer.valueOf(i2);
        zzau(1, 10, numValueOf);
        zzau(2, 10, numValueOf);
        zzdz zzdzVar = new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlb.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(21, zzdzVar);
        zzeeVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfk.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzll zzllVar) {
        int i;
        long j;
        boolean z;
        int i2 = this.zzG - zzllVar.zzb;
        this.zzG = i2;
        boolean z2 = true;
        if (zzllVar.zzc) {
            this.zzH = zzllVar.zzd;
            this.zzI = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzllVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzms) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgsw.zzi(size == list.size());
                for (int i3 = 0; i3 < listZzw.size(); i3++) {
                    ((zzkx) list.get(i3)).zzc((zzbf) listZzw.get(i3));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzI) {
                boolean z3 = zzllVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzllVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzllVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z3 || (zEquals && j3 == j4)) {
                    z2 = false;
                }
                if (z2) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzllVar.zza.zzb.zzb()) {
                        j2 = zzllVar.zza.zzd;
                    } else {
                        zzmm zzmmVar = zzllVar.zza;
                        zzxc zzxcVar = zzmmVar.zzb;
                        long j5 = zzmmVar.zzd;
                        zzao(zzbfVar, zzxcVar, j5);
                        j2 = j5;
                    }
                }
                z = z2;
                long j6 = j2;
                i = iZzs;
                j = j6;
            } else {
                i = -1;
                j = -9223372036854775807L;
                z = false;
            }
            this.zzI = false;
            zzaj(zzllVar.zza, 1, z, this.zzH, j, i, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzee zzU() {
        return this.zzn;
    }

    final /* synthetic */ zzng zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdo zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzjr zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzjr zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzU = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzat();
        if (i == -1) {
            return;
        }
        zzgsw.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzef.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzll zzllVar = new zzll(this.zzaa);
                zzllVar.zza(1);
                this.zzl.zza(zzllVar);
                return;
            }
            zzmm zzmmVarZzam = this.zzaa;
            int i3 = zzmmVarZzam.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmmVarZzam = zzam(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmm zzmmVarZzal = zzal(zzmmVarZzam, zzbfVar, zzan(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfk.zzs(j));
            zzaj(zzmmVarZzal, 0, true, 1, zzai(zzmmVarZzal), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzmm zzmmVar = this.zzaa;
        if (zzmmVar.zze != 1) {
            return;
        }
        zzmm zzmmVarZzf = zzmmVar.zzf(null);
        zzmm zzmmVarZzam = zzam(zzmmVarZzf, true != zzmmVarZzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzmmVarZzam, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzat();
        zzmm zzmmVar = this.zzaa;
        int i = zzmmVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmmVar.zzl == z && i == i2 && zzmmVar.zzm == 1) {
            return;
        }
        this.zzG++;
        boolean z2 = zzmmVar.zzp;
        zzmm zzmmVarZzi = zzmmVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzaj(zzmmVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzcz(zzgvz.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzmm zzmmVar = this.zzaa;
            return zzmmVar.zza.zze(zzmmVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int iZzag = zzag(this.zzaa);
        if (iZzag == -1) {
            return 0;
        }
        return iZzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfk.zzr(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmm zzmmVar = this.zzaa;
        zzxc zzxcVar = zzmmVar.zzb;
        zzbf zzbfVar = zzmmVar.zza;
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfk.zzr(zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfk.zzr(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzmm zzmmVar = this.zzaa;
            return zzmmVar.zzk.equals(zzmmVar.zzb) ? zzfk.zzr(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmm zzmmVar2 = this.zzaa;
        long j = 0;
        if (zzmmVar2.zzk.zzd != zzmmVar2.zzb.zzd) {
            return zzfk.zzr(zzmmVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmmVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmm zzmmVar3 = this.zzaa;
            zzmmVar3.zza.zzo(zzmmVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        zzmm zzmmVar4 = this.zzaa;
        zzao(zzmmVar4.zza, zzmmVar4.zzk, j);
        return zzfk.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfk.zzr(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }
}
