package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzvl extends zzir {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.f22503VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.f22499SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.f22490CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.f22493FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvh zzD;
    private zzve zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected zziv zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvk zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zzit zzan;
    private zzit zzao;
    private zzgwj zzap;
    private final Context zzc;
    private final zzuz zzd;
    private final zzvn zze;
    private final float zzf;
    private final zzip zzg;
    private final zzip zzh;
    private final zzip zzi;
    private final zzus zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zztq zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzty zzq;
    private zzty zzr;
    private zzmt zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvb zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvl(Context context, int i, zzuz zzuzVar, zzvn zzvnVar, boolean z, float f) {
        super(i);
        this.zzc = context.getApplicationContext();
        this.zzd = zzuzVar;
        zzvnVar.getClass();
        this.zze = zzvnVar;
        this.zzf = f;
        this.zzn = new AtomicInteger();
        this.zzg = new zzip(0, 0);
        this.zzh = new zzip(0, 0);
        this.zzi = new zzip(2, 0);
        zzus zzusVar = new zzus();
        this.zzj = zzusVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = -9223372036854775807L;
        this.zzl = new ArrayDeque();
        this.zzah = zzvk.zza;
        zzusVar.zzj(0);
        zzusVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zztq();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = -9223372036854775807L;
        this.zzad = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzY = 0;
        this.zzZ = 0;
        this.zza = new zziv();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgwj.zzh();
        zzit zzitVar = zzit.zza;
        this.zzan = zzitVar;
        this.zzao = zzitVar;
    }

    private final boolean zzaA(int i) throws zzje {
        zzlq zzlqVarZzI = zzI();
        zzip zzipVar = this.zzg;
        zzipVar.zza();
        int iZzQ = zzQ(zzlqVarZzI, zzipVar, i | 4);
        if (iZzQ == -5) {
            zzao(zzlqVarZzI);
            return true;
        }
        if (iZzQ != -4 || !zzipVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbr();
        return false;
    }

    private final boolean zzaB(long j) {
        return this.zzu == -9223372036854775807L || zzM().zzb() - j < this.zzu;
    }

    private final boolean zzaC() {
        return this.zzP >= 0;
    }

    private final void zzaq() {
        this.zzT = false;
        zzaw();
    }

    private final void zzaw() {
        zzaz();
        this.zzV = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzU = false;
        this.zzm.zzb();
    }

    private final boolean zzax() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaO()) {
            zzaM();
            return true;
        }
        if (zzaP()) {
            zzay();
            return false;
        }
        this.zzal = true;
        return false;
    }

    private final void zzay() {
        try {
            zzvb zzvbVar = this.zzx;
            if (zzvbVar == null) {
                throw null;
            }
            zzvbVar.zzk();
            zzaR();
        } catch (Throwable th) {
            zzaR();
            throw th;
        }
    }

    private final void zzaz() {
        this.zzad = -9223372036854775807L;
        zzbt().zzf = -9223372036854775807L;
        this.zzai = -9223372036854775807L;
    }

    protected static boolean zzbj(zzv zzvVar) {
        return zzvVar.zzO == 0;
    }

    private final void zzbm() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbn() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbo(zzv zzvVar) throws zzje {
        if (this.zzx != null && this.zzZ != 3 && zze() != 0) {
            float f = this.zzw;
            zzvVar.getClass();
            float fZzak = zzak(f, zzvVar, zzJ());
            float f2 = this.zzB;
            if (f2 != fZzak) {
                if (fZzak == -1.0f) {
                    zzbq();
                    return false;
                }
                if (f2 != -1.0f || fZzak > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzak);
                    zzvb zzvbVar = this.zzx;
                    zzvbVar.getClass();
                    zzvbVar.zzp(bundle);
                    this.zzB = fZzak;
                }
            }
        }
        return true;
    }

    private final boolean zzbp() throws zzje {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzH) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzbu();
        }
        return true;
    }

    private final void zzbq() throws zzje {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbs(zzvk zzvkVar) {
        this.zzah = zzvkVar;
        if (zzvkVar.zzd != -9223372036854775807L) {
            this.zzaj = true;
        }
    }

    private final zzvk zzbt() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvk) arrayDeque.getLast() : this.zzah;
    }

    private final boolean zzbv(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzp;
        return (zzvVar != null && Objects.equals(zzvVar.zzp, "audio/opus") && zzgu.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzA(long j, boolean z, boolean z2) throws zzje {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvk) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzT) {
                zzaw();
            } else {
                zzaN();
            }
            zzfg zzfgVar = this.zzah.zze;
            if (zzfgVar.zzc() > 0) {
                this.zzag = true;
            }
            zzfgVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzD() {
        this.zzo = null;
        zzbs(zzvk.zza);
        this.zzl.clear();
        if (this.zzT) {
            zzaq();
        } else {
            zzax();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzE() {
        try {
            zzaq();
            zzaM();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public final long zzV(long j, long j2) {
        return zzaj(j, j2, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public void zzX(float f, float f2) throws zzje {
        this.zzv = f;
        this.zzw = f2;
        zzbo(this.zzy);
    }

    /* JADX WARN: Code duplicated, block: B:246:0x03ed A[LOOP:0: B:118:0x01f2->B:246:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:386:0x0627  */
    /* JADX WARN: Code duplicated, block: B:388:0x062e  */
    /* JADX WARN: Code duplicated, block: B:392:0x0641  */
    /* JADX WARN: Code duplicated, block: B:395:0x064c  */
    /* JADX WARN: Code duplicated, block: B:397:0x064f  */
    /* JADX WARN: Code duplicated, block: B:400:0x065e  */
    /* JADX WARN: Code duplicated, block: B:401:0x0661  */
    /* JADX WARN: Code duplicated, block: B:428:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:? A[LOOP:5: B:51:0x00c1->B:480:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, EDGE_INSN: B:57:0x00d4->B:97:0x01af BREAK  A[LOOP:5: B:51:0x00c1->B:480:?], TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0108 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0116 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TRY_ENTER, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x011a A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x017f A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:90:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b5 A[Catch: IllegalStateException -> 0x0618, CryptoException -> 0x061c, TryCatch #6 {IllegalStateException -> 0x0618, blocks: (B:107:0x01c7, B:40:0x0093, B:42:0x0097, B:44:0x009b, B:47:0x00a4, B:50:0x00b2, B:51:0x00c1, B:55:0x00ce, B:57:0x00d4, B:97:0x01af, B:99:0x01b5, B:100:0x01b8, B:102:0x01be, B:104:0x01c2, B:58:0x00de, B:60:0x00e4, B:61:0x00f0, B:63:0x0100, B:66:0x0110, B:69:0x0116, B:71:0x011a, B:73:0x0127, B:75:0x0131, B:76:0x014e, B:77:0x0156, B:78:0x0157, B:80:0x015e, B:82:0x0166, B:84:0x016c, B:85:0x0173, B:87:0x017f, B:88:0x0188, B:93:0x01a3, B:95:0x01a9, B:91:0x018f, B:65:0x0108, B:96:0x01ac, B:115:0x01dd, B:117:0x01e4, B:118:0x01f2, B:120:0x01f6, B:127:0x0210, B:129:0x0216, B:131:0x0221, B:133:0x022b, B:135:0x0233, B:136:0x0237, B:138:0x023d, B:141:0x0247, B:142:0x0254, B:144:0x025a, B:146:0x0266, B:155:0x0277, B:156:0x027f, B:157:0x0287, B:158:0x028f, B:159:0x0297, B:160:0x029f, B:162:0x02ab, B:163:0x02b0, B:165:0x02b7, B:166:0x02b8, B:168:0x02bc, B:170:0x02c0, B:172:0x02c4, B:173:0x02c7, B:175:0x02cd, B:177:0x02dc), top: B:411:0x001f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzvl] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.google.android.gms.internal.ads.zzmu
    public void zzZ(long j, long j2) throws Throwable {
        boolean z;
        ?? r10;
        ?? r11;
        boolean z2;
        ?? r2;
        zzvd zzvdVarZzaT;
        int i;
        StackTraceElement[] stackTrace;
        ?? r3;
        boolean z3;
        zzlq zzlqVarZzI;
        zzip zzipVar;
        int iZzQ;
        byte b;
        zzv zzvVar;
        long jZzH;
        zzv zzvVar2;
        Throwable th;
        long j3;
        boolean z4 = true;
        try {
            try {
                if (this.zzaf) {
                    zzau();
                    return;
                }
                int i2 = 2;
                if (this.zzo == null && !zzaA(2)) {
                    return;
                }
                zzaE();
                byte b2 = -5;
                ?? r6 = 0;
                try {
                    try {
                        try {
                            try {
                                if (this.zzT) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgsw.zzi(this.zzaf ^ z4);
                                                zzus zzusVar = this.zzj;
                                                try {
                                                    if (zzusVar.zzp()) {
                                                        ByteBuffer byteBuffer = zzusVar.zzc;
                                                        int i3 = this.zzP;
                                                        int iZzo = zzusVar.zzo();
                                                        long j4 = zzusVar.zze;
                                                        boolean zZzbv = zzbv(zzH(), zzusVar.zzn());
                                                        boolean zZzb = zzusVar.zzb();
                                                        zzv zzvVar3 = this.zzp;
                                                        if (zzvVar3 == null) {
                                                            throw r6;
                                                        }
                                                        if (zzas(j, j2, null, byteBuffer, i3, 0, iZzo, j4, zZzbv, zZzb, zzvVar3)) {
                                                            zzaZ(zzusVar.zzn());
                                                            zzusVar.zza();
                                                            r3 = 0;
                                                        } else {
                                                            z4 = true;
                                                        }
                                                        z3 = false;
                                                        break;
                                                    }
                                                    r3 = r6;
                                                    if (this.zzae) {
                                                        z4 = true;
                                                        this.zzaf = true;
                                                        z3 = false;
                                                        break;
                                                    }
                                                    z4 = true;
                                                    if (this.zzU) {
                                                        zzgsw.zzi(zzusVar.zzq(this.zzi));
                                                        z3 = false;
                                                        this.zzU = false;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (this.zzV) {
                                                        if (!zzusVar.zzp()) {
                                                            zzaq();
                                                            this.zzV = z3;
                                                            zzaE();
                                                            if (!this.zzT) {
                                                                break;
                                                            }
                                                            zzgsw.zzi(!this.zzae);
                                                            zzlqVarZzI = zzI();
                                                            zzipVar = this.zzi;
                                                            zzipVar.zza();
                                                            while (true) {
                                                                zzipVar.zza();
                                                                iZzQ = zzQ(zzlqVarZzI, zzipVar, z3 ? 1 : 0);
                                                                b = -5;
                                                                if (iZzQ != -5) {
                                                                    zzao(zzlqVarZzI);
                                                                    break;
                                                                }
                                                                if (iZzQ != -4) {
                                                                    if (zzcW()) {
                                                                        break;
                                                                    }
                                                                    zzbt().zzf = this.zzad;
                                                                    break;
                                                                }
                                                                if (zzipVar.zzb()) {
                                                                    this.zzae = true;
                                                                    zzbt().zzf = this.zzad;
                                                                    break;
                                                                }
                                                                this.zzad = Math.max(this.zzad, zzipVar.zze);
                                                                if (zzcW()) {
                                                                    zzbt().zzf = this.zzad;
                                                                } else {
                                                                    zzbt().zzf = this.zzad;
                                                                }
                                                                if (this.zzag) {
                                                                    zzvVar2 = this.zzo;
                                                                    if (zzvVar2 != null) {
                                                                        throw r3;
                                                                    }
                                                                    this.zzp = zzvVar2;
                                                                    if (Objects.equals(zzvVar2.zzp, "audio/opus")) {
                                                                        int iZze = zzgu.zze((byte[]) this.zzp.zzs.get(z3 ? 1 : 0));
                                                                        zzt zztVarZza = this.zzp.zza();
                                                                        zztVarZza.zzJ(iZze);
                                                                        this.zzp = zztVarZza.zzO();
                                                                    }
                                                                    zzap(this.zzp, r3);
                                                                    this.zzag = z3;
                                                                }
                                                                zzipVar.zzl();
                                                                zzvVar = this.zzp;
                                                                if (zzvVar != null) {
                                                                    if (zzipVar.zze()) {
                                                                        zzipVar.zza = this.zzp;
                                                                        zzav(zzipVar);
                                                                    }
                                                                    if (zzgu.zzf(zzH(), zzipVar.zze)) {
                                                                        this.zzm.zza(zzipVar, this.zzp.zzs);
                                                                    }
                                                                }
                                                                if (!zzusVar.zzp()) {
                                                                    jZzH = zzH();
                                                                    if (zzbv(jZzH, zzusVar.zzn()) == zzbv(jZzH, zzipVar.zze)) {
                                                                    }
                                                                    this.zzU = true;
                                                                    break;
                                                                }
                                                                if (!zzusVar.zzq(zzipVar)) {
                                                                    this.zzU = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (zzusVar.zzp()) {
                                                                zzusVar.zzl();
                                                            }
                                                            if (!zzusVar.zzp()) {
                                                                break;
                                                                break;
                                                            }
                                                            continue;
                                                        } else {
                                                            b = -5;
                                                        }
                                                        r6 = r3;
                                                    } else {
                                                        zzgsw.zzi(!this.zzae);
                                                        zzlqVarZzI = zzI();
                                                        zzipVar = this.zzi;
                                                        zzipVar.zza();
                                                        while (true) {
                                                            zzipVar.zza();
                                                            iZzQ = zzQ(zzlqVarZzI, zzipVar, z3 ? 1 : 0);
                                                            b = -5;
                                                            if (iZzQ != -5) {
                                                                zzao(zzlqVarZzI);
                                                                break;
                                                            }
                                                            if (iZzQ != -4) {
                                                                if (zzcW()) {
                                                                    break;
                                                                }
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            if (zzipVar.zzb()) {
                                                                this.zzae = true;
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            this.zzad = Math.max(this.zzad, zzipVar.zze);
                                                            if (zzcW() || this.zzh.zzd()) {
                                                                zzbt().zzf = this.zzad;
                                                            }
                                                            if (this.zzag) {
                                                                zzvVar2 = this.zzo;
                                                                if (zzvVar2 != null) {
                                                                    throw r3;
                                                                }
                                                                this.zzp = zzvVar2;
                                                                if (Objects.equals(zzvVar2.zzp, "audio/opus") && !this.zzp.zzs.isEmpty()) {
                                                                    int iZze2 = zzgu.zze((byte[]) this.zzp.zzs.get(z3 ? 1 : 0));
                                                                    zzt zztVarZza2 = this.zzp.zza();
                                                                    zztVarZza2.zzJ(iZze2);
                                                                    this.zzp = zztVarZza2.zzO();
                                                                }
                                                                zzap(this.zzp, r3);
                                                                this.zzag = z3;
                                                            }
                                                            zzipVar.zzl();
                                                            zzvVar = this.zzp;
                                                            if (zzvVar != null && Objects.equals(zzvVar.zzp, "audio/opus")) {
                                                                if (zzipVar.zze()) {
                                                                    zzipVar.zza = this.zzp;
                                                                    zzav(zzipVar);
                                                                }
                                                                if (zzgu.zzf(zzH(), zzipVar.zze)) {
                                                                    this.zzm.zza(zzipVar, this.zzp.zzs);
                                                                }
                                                            }
                                                            if (!zzusVar.zzp()) {
                                                                jZzH = zzH();
                                                                if (zzbv(jZzH, zzusVar.zzn()) == zzbv(jZzH, zzipVar.zze)) {
                                                                }
                                                                this.zzU = true;
                                                                break;
                                                            }
                                                            if (!zzusVar.zzq(zzipVar)) {
                                                                this.zzU = true;
                                                                break;
                                                            }
                                                        }
                                                        if (zzusVar.zzp()) {
                                                            zzusVar.zzl();
                                                        }
                                                        if (!zzusVar.zzp() && !this.zzae && !this.zzV) {
                                                            break;
                                                        }
                                                        r6 = r3;
                                                    }
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z4 = true;
                                                    b2 = 0;
                                                    z = z4;
                                                    r11 = b2;
                                                    z2 = e instanceof MediaCodec.CodecException;
                                                    if (!z2) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzan(e);
                                                    if (z2) {
                                                        r2 = r11;
                                                    } else {
                                                        r2 = r11;
                                                    }
                                                    if (r2 != 0) {
                                                        zzaM();
                                                    }
                                                    zzvdVarZzaT = zzaT(e, this.zzE);
                                                    if (zzvdVarZzaT.zza == 1101) {
                                                        i = PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED;
                                                    } else {
                                                        i = 4003;
                                                    }
                                                    throw zzP(zzvdVarZzaT, this.zzo, r2, i);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                        }
                                    } catch (MediaCodec.CryptoException e3) {
                                        e = e3;
                                        b2 = 0;
                                        r10 = b2;
                                        throw zzP(e, this.zzo, r10, zzfk.zzG(e.getErrorCode()));
                                    }
                                } else {
                                    byte b3 = -5;
                                    Throwable th2 = null;
                                    boolean z5 = false;
                                    if (this.zzx != null) {
                                        long jZzb = zzM().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j5 = jZzb;
                                        while (true) {
                                            zzvb zzvbVar = this.zzx;
                                            if (zzvbVar == null) {
                                                throw th2;
                                            }
                                            if (!zzaC()) {
                                                try {
                                                    MediaCodec.BufferInfo bufferInfo = this.zzk;
                                                    int iZzf = zzvbVar.zzf(bufferInfo);
                                                    if (iZzf >= 0) {
                                                        th = th2;
                                                        bufferInfo.presentationTimeUs -= this.zzam;
                                                        if (!this.zzJ) {
                                                            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                zzbr();
                                                                j3 = j5;
                                                                break;
                                                            }
                                                            this.zzP = iZzf;
                                                            ByteBuffer byteBufferZzj = zzvbVar.zzj(iZzf);
                                                            this.zzQ = byteBufferZzj;
                                                            if (byteBufferZzj != null) {
                                                                byteBufferZzj.position(bufferInfo.offset);
                                                                this.zzQ.limit(bufferInfo.offset + bufferInfo.size);
                                                            }
                                                            zzv zzvVar4 = (zzv) this.zzah.zze.zze(bufferInfo.presentationTimeUs);
                                                            if (zzvVar4 == null && this.zzaj && this.zzz != null) {
                                                                zzvVar4 = (zzv) this.zzah.zze.zzd();
                                                            }
                                                            if (zzvVar4 != null) {
                                                                this.zzp = zzvVar4;
                                                            } else if (this.zzA && this.zzp != null) {
                                                            }
                                                            zzv zzvVar5 = this.zzp;
                                                            if (zzvVar5 == null) {
                                                                throw th;
                                                            }
                                                            zzap(zzvVar5, this.zzz);
                                                            this.zzA = z5;
                                                            this.zzaj = z5;
                                                        } else {
                                                            this.zzJ = z5;
                                                            zzvbVar.zzc(iZzf, z5);
                                                            j3 = j5;
                                                            if (!zzaB(j3)) {
                                                                break;
                                                                break;
                                                            }
                                                            j5 = j3;
                                                            th2 = th;
                                                            z4 = true;
                                                            i2 = 2;
                                                            z5 = false;
                                                            b3 = -5;
                                                        }
                                                    } else {
                                                        if (iZzf != -2) {
                                                            if (this.zzK && (this.zzae || this.zzY == i2)) {
                                                                zzbr();
                                                            }
                                                            long j6 = this.zzL;
                                                            if (j6 != -9223372036854775807L && j6 + 100 < zzM().zza()) {
                                                                zzbr();
                                                            }
                                                            th = th2;
                                                            j3 = j5;
                                                            break;
                                                        }
                                                        this.zzac = z4;
                                                        zzvb zzvbVar2 = this.zzx;
                                                        if (zzvbVar2 == null) {
                                                            throw th2;
                                                        }
                                                        MediaFormat mediaFormatZzg = zzvbVar2.zzg();
                                                        if (this.zzF != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                                            this.zzJ = z4;
                                                        } else {
                                                            if (Build.VERSION.SDK_INT >= 29 && !this.zzap.isEmpty()) {
                                                                zzgwj<String> zzgwjVar = this.zzap;
                                                                zzit zzitVar = zzit.zza;
                                                                zzis zzisVar = new zzis();
                                                                for (String str : zzgwjVar) {
                                                                    if (mediaFormatZzg.containsKey(str)) {
                                                                        int valueTypeForKey = mediaFormatZzg.getValueTypeForKey(str);
                                                                        if (valueTypeForKey == z4) {
                                                                            zzisVar.zza(str, mediaFormatZzg.getInteger(str));
                                                                        } else if (valueTypeForKey == i2) {
                                                                            zzisVar.zzb(str, mediaFormatZzg.getLong(str));
                                                                        } else if (valueTypeForKey == 3) {
                                                                            zzisVar.zzc(str, mediaFormatZzg.getFloat(str));
                                                                        } else if (valueTypeForKey == 4) {
                                                                            zzisVar.zzd(str, mediaFormatZzg.getString(str));
                                                                        } else if (valueTypeForKey == 5) {
                                                                            zzisVar.zze(str, mediaFormatZzg.getByteBuffer(str));
                                                                        }
                                                                    }
                                                                }
                                                                zzit zzitVarZzg = zzisVar.zzg();
                                                                if (!zzitVarZzg.equals(this.zzao)) {
                                                                    this.zzao = zzitVarZzg;
                                                                    zzat(zzitVarZzg);
                                                                }
                                                            }
                                                            this.zzz = mediaFormatZzg;
                                                            this.zzA = z4;
                                                        }
                                                        th = th2;
                                                        j3 = j5;
                                                        if (!zzaB(j3)) {
                                                            break;
                                                        }
                                                        j5 = j3;
                                                        th2 = th;
                                                        z4 = true;
                                                        i2 = 2;
                                                        z5 = false;
                                                        b3 = -5;
                                                    }
                                                } catch (IllegalStateException e4) {
                                                    e = e4;
                                                    r11 = z5;
                                                    z = true;
                                                    z2 = e instanceof MediaCodec.CodecException;
                                                    if (!z2) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzan(e);
                                                    if (z2) {
                                                        r2 = r11;
                                                    } else {
                                                        r2 = r11;
                                                    }
                                                    if (r2 != 0) {
                                                        zzaM();
                                                    }
                                                    zzvdVarZzaT = zzaT(e, this.zzE);
                                                    if (zzvdVarZzaT.zza == 1101) {
                                                        i = PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED;
                                                    } else {
                                                        i = 4003;
                                                    }
                                                    throw zzP(zzvdVarZzaT, this.zzo, r2, i);
                                                }
                                                z2 = e instanceof MediaCodec.CodecException;
                                                if (!z2) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0 || !stackTrace[r11].getClassName().equals("android.media.MediaCodec")) {
                                                        throw e;
                                                    }
                                                }
                                                zzan(e);
                                                if (z2 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                    r2 = r11;
                                                } else {
                                                    r2 = z;
                                                }
                                                if (r2 != 0) {
                                                    zzaM();
                                                }
                                                zzvdVarZzaT = zzaT(e, this.zzE);
                                                if (zzvdVarZzaT.zza == 1101) {
                                                    i = PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED;
                                                } else {
                                                    i = 4003;
                                                }
                                                throw zzP(zzvdVarZzaT, this.zzo, r2, i);
                                            }
                                            th = th2;
                                            this.zzR = (this.zzal || this.zzk.presentationTimeUs < zzH()) ? true : z5;
                                            long j7 = this.zzah.zzf;
                                            this.zzS = (j7 == -9223372036854775807L || j7 > this.zzk.presentationTimeUs) ? z5 : true;
                                            ByteBuffer byteBuffer2 = this.zzQ;
                                            int i4 = this.zzP;
                                            MediaCodec.BufferInfo bufferInfo2 = this.zzk;
                                            long j8 = j5;
                                            int i5 = bufferInfo2.flags;
                                            long j9 = bufferInfo2.presentationTimeUs;
                                            boolean z6 = this.zzR;
                                            boolean z7 = this.zzS;
                                            zzv zzvVar6 = this.zzp;
                                            if (zzvVar6 == null) {
                                                throw th;
                                            }
                                            if (zzas(j, j2, zzvbVar, byteBuffer2, i4, i5, 1, j9, z6, z7, zzvVar6)) {
                                                zzaZ(bufferInfo2.presentationTimeUs);
                                                boolean z8 = (bufferInfo2.flags & 4) != 0;
                                                if (!z8 && this.zzab && this.zzS) {
                                                    this.zzL = zzM().zza();
                                                }
                                                zzbn();
                                                if (z8) {
                                                    zzbr();
                                                } else {
                                                    j3 = j8;
                                                    if (!zzaB(j3)) {
                                                        break;
                                                        break;
                                                    }
                                                    j5 = j3;
                                                    th2 = th;
                                                    z4 = true;
                                                    i2 = 2;
                                                    z5 = false;
                                                    b3 = -5;
                                                }
                                            }
                                            j3 = j8;
                                            break;
                                        }
                                        do {
                                            zzvb zzvbVar3 = this.zzx;
                                            if (zzvbVar3 == null || this.zzY == 2 || this.zzae) {
                                                break;
                                            }
                                            if (this.zzO < 0) {
                                                int iZze3 = zzvbVar3.zze();
                                                this.zzO = iZze3;
                                                if (iZze3 < 0) {
                                                    break;
                                                    break;
                                                } else {
                                                    zzip zzipVar2 = this.zzh;
                                                    zzipVar2.zzc = zzvbVar3.zzh(iZze3);
                                                    zzipVar2.zza();
                                                }
                                            }
                                            z = true;
                                            if (this.zzY == 1) {
                                                if (!this.zzK) {
                                                    this.zzab = true;
                                                    zzvbVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                    zzbm();
                                                }
                                                this.zzY = 2;
                                                break;
                                            }
                                            try {
                                                if (this.zzI) {
                                                    this.zzI = false;
                                                    ByteBuffer byteBuffer3 = this.zzh.zzc;
                                                    if (byteBuffer3 == null) {
                                                        throw th;
                                                    }
                                                    byteBuffer3.put(zzb);
                                                    zzvbVar3.zza(this.zzO, 0, 38, 0L, 0);
                                                    zzbm();
                                                    this.zzaa = true;
                                                } else {
                                                    r10 = 0;
                                                    r11 = 0;
                                                    if (this.zzX == 1) {
                                                        int i6 = 0;
                                                        while (true) {
                                                            zzv zzvVar7 = this.zzy;
                                                            if (zzvVar7 == null) {
                                                                throw th;
                                                            }
                                                            if (i6 >= zzvVar7.zzs.size()) {
                                                                this.zzX = 2;
                                                                break;
                                                            }
                                                            byte[] bArr = (byte[]) this.zzy.zzs.get(i6);
                                                            ByteBuffer byteBuffer4 = this.zzh.zzc;
                                                            if (byteBuffer4 == null) {
                                                                throw th;
                                                            }
                                                            byteBuffer4.put(bArr);
                                                            i6++;
                                                        }
                                                    }
                                                    ByteBuffer byteBuffer5 = this.zzh.zzc;
                                                    if (byteBuffer5 == null) {
                                                        throw th;
                                                    }
                                                    int iPosition = byteBuffer5.position();
                                                    final zzlq zzlqVarZzI2 = zzI();
                                                    try {
                                                        zzvbVar3.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvi
                                                            @Override // java.lang.Runnable
                                                            public final /* synthetic */ void run() {
                                                                this.zza.zzbk(zzlqVarZzI2);
                                                            }
                                                        });
                                                        int i7 = this.zzn.get();
                                                        if (i7 == -3) {
                                                            if (!zzcW()) {
                                                                break;
                                                            }
                                                            zzbt().zzf = this.zzad;
                                                            break;
                                                        }
                                                        if (i7 == -5) {
                                                            if (this.zzX == 2) {
                                                                this.zzh.zza();
                                                                this.zzX = 1;
                                                            }
                                                            zzao(zzlqVarZzI2);
                                                        } else {
                                                            zzip zzipVar3 = this.zzh;
                                                            if (zzipVar3.zzb()) {
                                                                zzbt().zzf = this.zzad;
                                                                if (this.zzX == 2) {
                                                                    zzipVar3.zza();
                                                                    this.zzX = 1;
                                                                }
                                                                this.zzae = true;
                                                                if (this.zzaa) {
                                                                    if (!this.zzK) {
                                                                        this.zzab = true;
                                                                        zzvbVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                                        zzbm();
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                zzbr();
                                                                break;
                                                            }
                                                            if (this.zzaa || zzipVar3.zzc()) {
                                                                long j10 = zzipVar3.zze;
                                                                if (!zzaX(zzipVar3)) {
                                                                    boolean zZzk = zzipVar3.zzk();
                                                                    if (zZzk) {
                                                                        zzipVar3.zzb.zzc(iPosition);
                                                                    }
                                                                    if (this.zzag) {
                                                                        zzfg zzfgVar = zzbt().zze;
                                                                        zzv zzvVar8 = this.zzo;
                                                                        if (zzvVar8 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzfgVar.zza(j10, zzvVar8);
                                                                        this.zzag = false;
                                                                    }
                                                                    this.zzad = Math.max(this.zzad, j10);
                                                                    if (zzcW() || zzipVar3.zzd()) {
                                                                        zzbt().zzf = this.zzad;
                                                                    }
                                                                    zzipVar3.zzl();
                                                                    if (zzipVar3.zze()) {
                                                                        zzav(zzipVar3);
                                                                    }
                                                                    if (this.zzal) {
                                                                        long j11 = this.zzad;
                                                                        if (j10 <= j11) {
                                                                            this.zzam += (j11 - j10) + 1;
                                                                        }
                                                                        this.zzad = j10;
                                                                        this.zzal = false;
                                                                    }
                                                                    zzaV(zzipVar3);
                                                                    int iZzaW = zzaW(zzipVar3);
                                                                    long j12 = j10 + this.zzam;
                                                                    if (zZzk) {
                                                                        zzvbVar3.zzb(this.zzO, 0, zzipVar3.zzb, j12, iZzaW);
                                                                    } else {
                                                                        int i8 = this.zzO;
                                                                        ByteBuffer byteBuffer6 = zzipVar3.zzc;
                                                                        if (byteBuffer6 == null) {
                                                                            throw th;
                                                                        }
                                                                        zzvbVar3.zza(i8, 0, byteBuffer6.limit(), j12, iZzaW);
                                                                    }
                                                                    zzbm();
                                                                    this.zzaa = true;
                                                                    this.zzX = 0;
                                                                    this.zza.zzc++;
                                                                }
                                                            } else {
                                                                zzipVar3.zza();
                                                                if (this.zzX == 2) {
                                                                    this.zzX = 1;
                                                                }
                                                            }
                                                        }
                                                    } catch (zzio e5) {
                                                        zzan(e5);
                                                        zzaA(0);
                                                        zzay();
                                                    }
                                                }
                                            } catch (IllegalStateException e6) {
                                                e = e6;
                                                r11 = 0;
                                                z2 = e instanceof MediaCodec.CodecException;
                                                if (!z2) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0) {
                                                    }
                                                    throw e;
                                                }
                                                zzan(e);
                                                if (z2) {
                                                    r2 = r11;
                                                } else {
                                                    r2 = r11;
                                                }
                                                if (r2 != 0) {
                                                    zzaM();
                                                }
                                                zzvdVarZzaT = zzaT(e, this.zzE);
                                                if (zzvdVarZzaT.zza == 1101) {
                                                    i = PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED;
                                                } else {
                                                    i = 4003;
                                                }
                                                throw zzP(zzvdVarZzaT, this.zzo, r2, i);
                                            }
                                        } while (zzaB(j3));
                                        Trace.endSection();
                                    } else {
                                        this.zza.zzd += zzR(j);
                                        zzaA(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e7) {
                                e = e7;
                                r11 = 0;
                            }
                        } catch (IllegalStateException e8) {
                            e = e8;
                        }
                    } catch (MediaCodec.CryptoException e9) {
                        e = e9;
                    }
                } catch (MediaCodec.CryptoException e10) {
                    e = e10;
                    throw zzP(e, this.zzo, r10, zzfk.zzG(e.getErrorCode()));
                } catch (IllegalStateException e11) {
                    e = e11;
                }
            } catch (MediaCodec.CryptoException e12) {
                e = e12;
                r10 = 0;
            }
        } catch (IllegalStateException e13) {
            e = e13;
            z = true;
        }
    }

    public final void zzaD() {
        this.zzak = true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:172:0x0309 A[Catch: zzvh -> 0x0337, TryCatch #6 {zzvh -> 0x0337, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0063, B:31:0x0079, B:32:0x0084, B:37:0x0091, B:39:0x0099, B:41:0x009d, B:42:0x00a0, B:44:0x00a4, B:46:0x00ad, B:170:0x02ef, B:172:0x0309, B:174:0x0312, B:178:0x031e, B:179:0x0320, B:173:0x030c, B:181:0x0322, B:182:0x0323, B:184:0x0328, B:185:0x0329, B:186:0x0333, B:35:0x0088, B:36:0x0090, B:188:0x0336), top: B:204:0x0055, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x030c A[Catch: zzvh -> 0x0337, TryCatch #6 {zzvh -> 0x0337, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0063, B:31:0x0079, B:32:0x0084, B:37:0x0091, B:39:0x0099, B:41:0x009d, B:42:0x00a0, B:44:0x00a4, B:46:0x00ad, B:170:0x02ef, B:172:0x0309, B:174:0x0312, B:178:0x031e, B:179:0x0320, B:173:0x030c, B:181:0x0322, B:182:0x0323, B:184:0x0328, B:185:0x0329, B:186:0x0333, B:35:0x0088, B:36:0x0090, B:188:0x0336), top: B:204:0x0055, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0318  */
    /* JADX WARN: Code duplicated, block: B:211:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.android.gms.internal.ads.zzuz] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzve] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.ads.zzuy] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzvl] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final void zzaE() throws zzje {
        zzv zzvVar;
        int i;
        int i2;
        ?? Zzah;
        zzvh zzvhVar;
        zzvh zzvhVar2;
        int i3;
        ?? r0;
        if (this.zzx != null || this.zzT || (zzvVar = this.zzo) == null) {
            return;
        }
        int i4 = 1;
        if (zzaF(zzvVar)) {
            zzaq();
            String str = zzvVar.zzp;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzT = true;
            return;
        }
        zzty zztyVar = this.zzr;
        this.zzq = zztyVar;
        if (zztyVar != null) {
            zzgsw.zzi(true);
            this.zzq.zza();
        }
        int i5 = 0;
        try {
            zzv zzvVar2 = this.zzo;
            MediaCrypto mediaCrypto = null;
            if (zzvVar2 == null) {
                throw null;
            }
            if (this.zzC == null) {
                try {
                    List listZzaf = zzaf(this.zze, zzvVar2, false);
                    listZzaf.isEmpty();
                    this.zzC = new ArrayDeque();
                    if (!listZzaf.isEmpty()) {
                        this.zzC.add((zzve) listZzaf.get(0));
                    }
                    this.zzD = null;
                } catch (zzvp e) {
                    throw new zzvh(zzvVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzC.isEmpty()) {
                throw new zzvh(zzvVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzC;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzx == null) {
                zzve zzveVar = (zzve) arrayDeque.peekFirst();
                if (zzveVar == null) {
                    throw mediaCrypto;
                }
                zzaU(zzvVar2);
                if (!zzaG(zzveVar)) {
                    return;
                }
                try {
                    this.zzE = zzveVar;
                    zzv zzvVar3 = this.zzo;
                    if (zzvVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str2 = zzveVar.zza;
                    float fZzak = zzak(this.zzw, zzvVar3, zzJ());
                    if (fZzak <= this.zzf) {
                        fZzak = -1.0f;
                    }
                    long jZzb = zzM().zzb();
                    i = i4;
                    try {
                        Zzah = zzah(zzveVar, zzvVar3, mediaCrypto, fZzak);
                        i2 = i5;
                        try {
                            if (Build.VERSION.SDK_INT >= 31) {
                                LogSessionId logSessionIdZza = zzL().zza();
                                if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                    Zzah.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                                }
                            }
                            try {
                                StringBuilder sb = new StringBuilder(str2.length() + 12);
                                sb.append("createCodec:");
                                sb.append(str2);
                                Trace.beginSection(sb.toString());
                                zzvb zzvbVarZzc = this.zzd.zzc(Zzah);
                                this.zzx = zzvbVarZzc;
                                this.zzM = zzvbVarZzc.zzm(new zzvj(this, null));
                                Trace.endSection();
                                long jZzb2 = zzM().zzb();
                                if (!zzveVar.zzc(this.zzc, zzvVar3)) {
                                    Object[] objArr = new Object[2];
                                    objArr[i2] = zzv.zze(zzvVar3);
                                    objArr[i] = str2;
                                    String str3 = zzfk.zza;
                                    zzef.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                }
                                this.zzB = fZzak;
                                this.zzy = zzvVar3;
                                if (Build.VERSION.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) {
                                    i3 = 2;
                                } else {
                                    i3 = (Build.VERSION.SDK_INT >= 24 || !(("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(Build.DEVICE) || "flounder_lte".equals(Build.DEVICE) || "grouper".equals(Build.DEVICE) || "tilapia".equals(Build.DEVICE)))) ? i2 : i;
                                }
                                this.zzF = i3;
                                this.zzG = (Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str2)) ? i : i2;
                                this.zzH = (Build.VERSION.SDK_INT == 23 && "OMX.google.vorbis.decoder".equals(str2)) ? i : i2;
                                String str4 = zzveVar.zza;
                                if (Build.VERSION.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) {
                                    r0 = i;
                                } else if ((Build.VERSION.SDK_INT > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzveVar.zzf)) {
                                    r0 = i2;
                                } else {
                                    r0 = i;
                                }
                                this.zzK = r0;
                                zzvb zzvbVar = this.zzx;
                                if (zzvbVar == null) {
                                    throw null;
                                }
                                if (zze() == 2) {
                                    this.zzN = zzM().zzb() + 1000;
                                }
                                this.zza.zza++;
                                long j = jZzb2 - jZzb;
                                if (Build.VERSION.SDK_INT >= 31 && !this.zzap.isEmpty()) {
                                    zzvb zzvbVar2 = this.zzx;
                                    if (zzvbVar2 == null) {
                                        throw null;
                                    }
                                    zzvbVar2.zzr(new ArrayList(this.zzap));
                                }
                                Zzah = zzveVar;
                                try {
                                    zzal(str2, Zzah, jZzb2, j);
                                    i4 = i;
                                    i5 = i2;
                                } catch (Exception e2) {
                                    e = e2;
                                    zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzah.zza), e);
                                    arrayDeque.removeFirst();
                                    zzvhVar = new zzvh(zzvVar2, (Throwable) e, (boolean) i2, (zzve) Zzah);
                                    zzan(zzvhVar);
                                    zzvhVar2 = this.zzD;
                                    if (zzvhVar2 == null) {
                                        this.zzD = zzvhVar;
                                    } else {
                                        this.zzD = zzvhVar2.zza(zzvhVar);
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                        throw this.zzD;
                                    }
                                    i4 = i;
                                    i5 = 0;
                                }
                                mediaCrypto = null;
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            Zzah = zzveVar;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        Zzah = zzveVar;
                        i2 = i5;
                    }
                } catch (Exception e5) {
                    e = e5;
                    i = i4;
                    i2 = i5;
                }
                Zzah = zzveVar;
                zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(Zzah.zza), e);
                arrayDeque.removeFirst();
                zzvhVar = new zzvh(zzvVar2, (Throwable) e, (boolean) i2, (zzve) Zzah);
                zzan(zzvhVar);
                zzvhVar2 = this.zzD;
                if (zzvhVar2 == null) {
                    this.zzD = zzvhVar;
                } else {
                    this.zzD = zzvhVar2.zza(zzvhVar);
                }
                if (!arrayDeque.isEmpty()) {
                    throw this.zzD;
                }
                i4 = i;
                i5 = 0;
                mediaCrypto = null;
            }
            this.zzC = mediaCrypto;
        } catch (zzvh e6) {
            throw zzP(e6, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaF(zzv zzvVar) {
        return this.zzr == null && zzag(zzvVar);
    }

    protected boolean zzaG(zzve zzveVar) {
        return true;
    }

    protected final boolean zzaH() {
        return this.zzT;
    }

    protected final zzvb zzaI() {
        return this.zzx;
    }

    protected final zzv zzaJ() {
        return this.zzy;
    }

    protected final MediaFormat zzaK() {
        return this.zzz;
    }

    protected final zzve zzaL() {
        return this.zzE;
    }

    protected final void zzaM() {
        try {
            zzvb zzvbVar = this.zzx;
            if (zzvbVar != null) {
                zzvbVar.zzl();
                this.zza.zzb++;
                zzve zzveVar = this.zzE;
                if (zzveVar == null) {
                    throw null;
                }
                zzam(zzveVar.zza);
            }
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
        } catch (Throwable th) {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
            throw th;
        }
    }

    protected final boolean zzaN() throws zzje {
        boolean zZzax = zzax();
        if (zZzax) {
            zzaE();
        }
        return zZzax;
    }

    protected boolean zzaO() {
        int i = this.zzZ;
        if (i == 3 || ((this.zzG && !this.zzac) || (this.zzH && this.zzab))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbu();
            return false;
        } catch (zzje e) {
            zzef.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaP() {
        return true;
    }

    protected final long zzaQ() {
        return this.zzam;
    }

    protected void zzaR() {
        zzbm();
        zzbn();
        zzaz();
        this.zzN = -9223372036854775807L;
        this.zzab = false;
        this.zzL = -9223372036854775807L;
        this.zzaa = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaS() {
        zzaR();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzac = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzW = false;
        this.zzX = 0;
    }

    protected zzvd zzaT(Throwable th, zzve zzveVar) {
        return new zzvd(th, zzveVar);
    }

    protected boolean zzaU(zzv zzvVar) throws zzje {
        return true;
    }

    protected void zzaV(zzip zzipVar) throws zzje {
    }

    protected int zzaW(zzip zzipVar) {
        return 0;
    }

    protected boolean zzaX(zzip zzipVar) {
        return false;
    }

    protected final long zzaY() {
        return this.zzai;
    }

    protected void zzaZ(long j) {
        this.zzai = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j < ((zzvk) arrayDeque.peek()).zzb) {
                return;
            }
            zzvk zzvkVar = (zzvk) arrayDeque.poll();
            zzvkVar.getClass();
            zzbs(zzvkVar);
            zzar();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public boolean zzab() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final int zzad(zzv zzvVar) throws zzje {
        try {
            return zzae(this.zze, zzvVar);
        } catch (zzvp e) {
            throw zzP(e, zzvVar, false, 4002);
        }
    }

    protected abstract int zzae(zzvn zzvnVar, zzv zzvVar) throws zzvp;

    protected abstract List zzaf(zzvn zzvnVar, zzv zzvVar, boolean z) throws zzvp;

    protected boolean zzag(zzv zzvVar) {
        return false;
    }

    protected abstract zzuy zzah(zzve zzveVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    protected zziw zzai(zzve zzveVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzaj(long j, long j2, boolean z) {
        return super.zzV(j, j2);
    }

    protected float zzak(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzal(String str, zzuy zzuyVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    protected zziw zzao(zzlq zzlqVar) throws zzje {
        int i;
        boolean z = true;
        this.zzag = true;
        zzv zzvVarZzO = zzlqVar.zzb;
        zzvVarZzO.getClass();
        String str = zzvVarZzO.zzp;
        if (str == null) {
            throw zzP(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzO, false, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(str, "video/x-vnd.on2.vp9") || (Objects.equals(str, "video/dolby-vision") && Objects.equals(zzvx.zzg(zzvVarZzO), "video/av01"))) && !zzvVarZzO.zzs.isEmpty()) {
            zzt zztVarZza = zzvVarZzO.zza();
            zztVarZza.zzr(null);
            zzvVarZzO = zztVarZza.zzO();
        }
        zzv zzvVar = zzvVarZzO;
        this.zzr = zzlqVar.zza;
        this.zzo = zzvVar;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        zzvb zzvbVar = this.zzx;
        if (zzvbVar == null) {
            this.zzC = null;
            zzaE();
            return null;
        }
        zzve zzveVar = this.zzE;
        zzveVar.getClass();
        zzv zzvVar2 = this.zzy;
        zzvVar2.getClass();
        zzty zztyVar = this.zzq;
        zzty zztyVar2 = this.zzr;
        if (zztyVar != zztyVar2) {
            zzbq();
            return new zziw(zzveVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zziw zziwVarZzai = zzai(zzveVar, zzvVar2, zzvVar);
        int i2 = zziwVarZzai.zzd;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zzbo(zzvVar)) {
                        this.zzy = zzvVar;
                        if (zztyVar2 != zztyVar && !zzbp()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzbo(zzvVar)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i3 = this.zzF;
                    if (i3 != 2 && (i3 != 1 || zzvVar.zzw != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzy = zzvVar;
                    if (zztyVar2 != zztyVar && !zzbp()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (zzbo(zzvVar)) {
                this.zzy = zzvVar;
                if (zztyVar2 != zztyVar) {
                    if (!zzbp()) {
                        i = 2;
                    }
                } else if (this.zzaa) {
                    this.zzY = 1;
                    if (this.zzH) {
                        this.zzZ = 3;
                        i = 2;
                    } else {
                        this.zzZ = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (i2 != 0 || (this.zzx == zzvbVar && this.zzZ != 3)) ? zziwVarZzai : new zziw(zzveVar.zza, zzvVar2, zzvVar, 0, i);
        }
        zzbq();
        i = 0;
        if (i2 != 0) {
        }
    }

    protected void zzap(zzv zzvVar, MediaFormat mediaFormat) throws zzje {
        throw null;
    }

    protected void zzar() {
    }

    protected abstract boolean zzas(long j, long j2, zzvb zzvbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzje;

    protected abstract void zzat(zzit zzitVar);

    protected void zzau() throws zzje {
        throw null;
    }

    protected void zzav(zzip zzipVar) throws zzje {
        throw null;
    }

    protected final boolean zzba() {
        if (this.zzo == null) {
            return false;
        }
        if (zzS() || zzaC()) {
            return true;
        }
        return this.zzN != -9223372036854775807L && zzM().zzb() < this.zzN;
    }

    protected final float zzbb() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmt zzbc() {
        return this.zzs;
    }

    protected final boolean zzbd() throws zzje {
        return zzbo(this.zzy);
    }

    protected final long zzbe() {
        return this.zzah.zzf;
    }

    protected final long zzbf() {
        return this.zzad;
    }

    protected final long zzbg() {
        return this.zzah.zzd;
    }

    protected final long zzbh() {
        return this.zzah.zzc;
    }

    protected final void zzbi(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbk(zzlq zzlqVar) {
        this.zzn.set(zzQ(zzlqVar, this.zzh, 0));
    }

    final /* synthetic */ zzmt zzbl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmw
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmp
    public void zzx(int i, Object obj) throws zzje {
        if (i != 11) {
            return;
        }
        zzmt zzmtVar = (zzmt) obj;
        zzmtVar.getClass();
        this.zzs = zzmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzy(boolean z, boolean z2) throws zzje {
        this.zza = new zziv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzxc r17) throws com.google.android.gms.internal.ads.zzje {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzvk r12 = r11.zzah
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzvk r4 = new com.google.android.gms.internal.ads.zzvk
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbs(r4)
            boolean r12 = r11.zzak
            if (r12 == 0) goto L56
            r11.zzar()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzl
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzad
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzai
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzvk r4 = new com.google.android.gms.internal.ads.zzvk
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbs(r4)
            com.google.android.gms.internal.ads.zzvk r12 = r11.zzah
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzar()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzvk r0 = new com.google.android.gms.internal.ads.zzvk
            long r1 = r11.zzad
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvl.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxc):void");
    }

    private final void zzbu() throws zzje {
        zzty zztyVar = this.zzr;
        zztyVar.getClass();
        this.zzq = zztyVar;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final void zzbr() throws zzje {
        int i = this.zzZ;
        if (i == 1) {
            zzay();
            return;
        }
        if (i == 2) {
            zzay();
            zzbu();
        } else if (i != 3) {
            this.zzaf = true;
            zzau();
        } else {
            zzaM();
            zzaE();
        }
    }
}
