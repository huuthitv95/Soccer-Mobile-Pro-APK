package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zztp extends zzvl implements zzlv {
    private final Context zzb;
    private final zzro zzc;
    private final zzrw zzd;
    private final zzux zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzv zzi;
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zztp(Context context, zzuz zzuzVar, zzvn zzvnVar, boolean z, Handler handler, zzrp zzrpVar, zzrw zzrwVar) {
        super(context.getApplicationContext(), 1, zzuzVar, zzvnVar, false, 44100.0f);
        zzux zzuxVar = Build.VERSION.SDK_INT >= 35 ? new zzux(zzuw.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrwVar;
        this.zze = zzuxVar;
        this.zzp = -1000;
        this.zzc = new zzro(handler, zzrpVar);
        this.zzr = -9223372036854775807L;
        zzrwVar.zza(new zzto(this, null));
    }

    private static List zzbm(zzvn zzvnVar, zzv zzvVar, boolean z, zzrw zzrwVar) throws zzvp {
        zzve zzveVarZza;
        if (zzvVar.zzp == null) {
            return zzgvz.zzi();
        }
        return (!zzrwVar.zzd(zzvVar) || (zzveVarZza = zzvx.zza()) == null) ? zzvx.zzc(zzvnVar, zzvVar, false, false) : zzgvz.zzj(zzveVarZza);
    }

    private final int zzbn(zzve zzveVar, zzv zzvVar) {
        if ("OMX.google.raw.decoder".equals(zzveVar.zza) && Build.VERSION.SDK_INT == 23 && !zzfk.zzO(this.zzb)) {
            return -1;
        }
        return zzvVar.zzq;
    }

    private final void zzbo() {
        long jZzg = this.zzd.zzg(zzab());
        if (jZzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                jZzg = Math.max(this.zzk, jZzg);
            }
            this.zzk = jZzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzA(long j, boolean z, boolean z2) throws zzje {
        super.zzA(j, z, z2);
        this.zzd.zzB();
        this.zzk = j;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzC() {
        zzbo();
        this.zzq = false;
        this.zzd.zzA();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzB();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
            }
        } finally {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzC();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected final void zzF() {
        zzux zzuxVar;
        this.zzd.zzD();
        if (Build.VERSION.SDK_INT < 35 || (zzuxVar = this.zze) == null) {
            return;
        }
        zzuxVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzmu, com.google.android.gms.internal.ads.zzmw
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    final /* synthetic */ zzux zzaA() {
        return this.zze;
    }

    final /* synthetic */ void zzaB(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzaC(boolean z) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzaa() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzmu
    public final boolean zzab() {
        return super.zzab() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final int zzae(zzvn zzvnVar, zzv zzvVar) throws zzvp {
        int i;
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i2 = zzvVar.zzO;
        boolean zZzbj = zzbj(zzvVar);
        int i3 = 1;
        if (!zZzbj || (i2 != 0 && zzvx.zza() == null)) {
            i = 0;
        } else {
            zzrw zzrwVar = this.zzd;
            zzqm zzqmVarZzf = zzrwVar.zzf(zzvVar);
            if (zzqmVarZzf.zzb) {
                i = true != zzqmVarZzf.zzc ? 512 : 1536;
                if (zzqmVarZzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzrwVar.zzd(zzvVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrw zzrwVar2 = this.zzd;
            if (zzrwVar2.zzd(zzfk.zzA(2, zzvVar.zzH, zzvVar.zzI))) {
                List listZzbm = zzbm(zzvnVar, zzvVar, false, zzrwVar2);
                if (!listZzbm.isEmpty()) {
                    if (zZzbj) {
                        zzve zzveVar = (zzve) listZzbm.get(0);
                        Context context = this.zzb;
                        boolean zZzc = zzveVar.zzc(context, zzvVar);
                        if (!zZzc) {
                            int i4 = 1;
                            while (true) {
                                if (i4 >= listZzbm.size()) {
                                    z = true;
                                    break;
                                }
                                zzve zzveVar2 = (zzve) listZzbm.get(i4);
                                if (zzveVar2.zzc(context, zzvVar)) {
                                    z = false;
                                    zZzc = true;
                                    zzveVar = zzveVar2;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            z = true;
                            break;
                        }
                        int i5 = true != zZzc ? 3 : 4;
                        int i6 = 8;
                        if (zZzc && zzveVar.zze(zzvVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzveVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final List zzaf(zzvn zzvnVar, zzv zzvVar, boolean z) throws zzvp {
        return zzvx.zze(this.zzb, zzbm(zzvnVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzag(zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zzuy zzah(zzve zzveVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbn = zzbn(zzveVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArrZzJ) {
                if (zzveVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    iZzbn = Math.max(iZzbn, zzbn(zzveVar, zzvVar2));
                }
            }
        }
        this.zzf = iZzbn;
        String str = zzveVar.zza;
        this.zzg = Build.VERSION.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) && (Build.DEVICE.startsWith("zeroflte") || Build.DEVICE.startsWith("herolte") || Build.DEVICE.startsWith("heroqlte"));
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzveVar.zzc;
        int i = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = zzvVar.zzH;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = zzvVar.zzI;
        mediaFormat.setInteger("sample-rate", i3);
        zzei.zza(mediaFormat, zzvVar.zzs);
        zzei.zzb(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f && (Build.VERSION.SDK_INT != 23 || (!"ZTE B2017G".equals(Build.MODEL) && !"AXON 7 mini".equals(Build.MODEL)))) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.zzp;
        if ("audio/ac4".equals(str3)) {
            Pair pairZze = zzdp.zze(zzvVar);
            if (pairZze != null) {
                zzei.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
                zzei.zzb(mediaFormat, "level", ((Integer) pairZze.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (Build.VERSION.SDK_INT >= 24 && this.zzd.zze(zzfk.zzA(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzp));
        }
        if (Objects.equals(str3, "audio/iamf")) {
            zzqb zzqbVarZzs = this.zzd.zzs();
            if (zzqbVarZzs == null) {
                zzef.zzc("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iZza = zztn.zza(zzqbVarZzs);
                int iBitCount = Integer.bitCount(iZza);
                mediaFormat.setInteger("channel-mask", iZza);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        zzbi(mediaFormat);
        this.zzj = (!"audio/raw".equals(zzveVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzuy.zza(zzveVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzai(zzve zzveVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zziw zziwVarZzf = zzveVar.zzf(zzvVar, zzvVar2);
        int i3 = zziwVarZzf.zze;
        if (zzaF(zzvVar2)) {
            i3 |= 32768;
        }
        if (zzbn(zzveVar, zzvVar2) > this.zzf) {
            i3 |= 64;
        }
        String str = zzveVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zziwVarZzf.zzd;
        }
        return new zziw(str, zzvVar, zzvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final long zzaj(long j, long j2, boolean z) {
        zzrw zzrwVar = this.zzd;
        boolean z2 = false;
        if (zzrwVar.zzn() && this.zzr != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.zzq) {
            return (z2 || super.zzab()) ? 1000000L : 10000L;
        }
        long jZzx = zzrwVar.zzx();
        if (this.zzo && z2 && jZzx != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(jZzx, this.zzr - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final float zzak(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i = zzvVar2.zzI;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzal(String str, zzuy zzuyVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzam(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzan(Exception exc) {
        zzef.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    protected final void zzaq() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzar() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzat(zzit zzitVar) {
        this.zzc.zzn(zzitVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzau() throws zzje {
        try {
            this.zzd.zzl();
            if (zzbe() != -9223372036854775807L) {
                this.zzr = zzbe();
            }
        } catch (zzrv e) {
            throw zzP(e, e.zzc, e.zzb, true != zzaH() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzav(zzip zzipVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzipVar.zza) == null || !Objects.equals(zzvVar.zzp, "audio/opus") || !zzaH()) {
            return;
        }
        ByteBuffer byteBuffer = zzipVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzipVar.zza;
        zzvVar2.getClass();
        int i = zzvVar2.zzK;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzy(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    final /* synthetic */ zzro zzaz() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmu
    public final zzlv zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final long zzg() {
        if (zze() == 2) {
            zzbo();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir
    protected final void zzy(boolean z, boolean z2) throws zzje {
        super.zzy(z, z2);
        this.zzc.zza(this.zza);
        zzK();
        zzrw zzrwVar = this.zzd;
        zzrwVar.zzb(zzL());
        zzrwVar.zzc(zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final zziw zzao(zzlq zzlqVar) throws zzje {
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zziw zziwVarZzao = super.zzao(zzlqVar);
        this.zzc.zzc(zzvVar, zziwVarZzao);
        return zziwVarZzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final boolean zzas(long j, long j2, zzvb zzvbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzje {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzvbVar.getClass();
            zzvbVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzvbVar != null) {
                zzvbVar.zzc(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzr = j3;
                return false;
            }
            if (zzvbVar != null) {
                zzvbVar.zzc(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzrs e) {
            zzv zzvVar2 = this.zzi;
            if (zzaH()) {
                zzK();
            }
            throw zzP(e, zzvVar2, false, 5001);
        } catch (zzrv e2) {
            if (zzaH()) {
                zzK();
            }
            throw zzP(e2, zzvVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl, com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmp
    public final void zzx(int i, Object obj) throws zzje {
        zzux zzuxVar;
        if (i == 2) {
            zzrw zzrwVar = this.zzd;
            obj.getClass();
            zzrwVar.zzz(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzd zzdVar = (zzd) obj;
            zzrw zzrwVar2 = this.zzd;
            zzdVar.getClass();
            zzrwVar2.zzr(zzdVar);
            return;
        }
        if (i == 6) {
            zze zzeVar = (zze) obj;
            zzrw zzrwVar3 = this.zzd;
            zzeVar.getClass();
            zzrwVar3.zzu(zzeVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzp = ((Integer) obj).intValue();
            zzvb zzvbVarZzaI = zzaI();
            if (zzvbVarZzaI == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzp));
            zzvbVarZzaI.zzp(bundle);
            return;
        }
        if (i == 19) {
            zzrw zzrwVar4 = this.zzd;
            obj.getClass();
            zzrwVar4.zzw(((Integer) obj).intValue());
            return;
        }
        if (i == 9) {
            zzrw zzrwVar5 = this.zzd;
            obj.getClass();
            zzrwVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.zzd.zzt(iIntValue);
            if (Build.VERSION.SDK_INT < 35 || (zzuxVar = this.zze) == null) {
                return;
            }
            zzuxVar.zza(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) throws zzje {
        int iZzB;
        int[] iArr;
        int i;
        zzv zzvVar2 = this.zzj;
        int[] iArr2 = null;
        boolean z = true;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaI() != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.zzp)) {
                iZzB = zzvVar.zzJ;
            } else if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzB = mediaFormat.containsKey("v-bits-per-sample") ? zzfk.zzB(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            } else {
                iZzB = mediaFormat.getInteger("pcm-encoding");
            }
            zzt zztVar = new zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzI(iZzB);
            zztVar.zzJ(zzvVar.zzK);
            zztVar.zzK(zzvVar.zzL);
            zztVar.zzl(zzvVar.zzl);
            Object obj = zzvVar.zzm;
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzG(mediaFormat.getInteger("channel-count"));
            zztVar.zzH(mediaFormat.getInteger("sample-rate"));
            zzv zzvVarZzO = zztVar.zzO();
            if (this.zzg && zzvVarZzO.zzH == 6 && (i = zzvVar.zzH) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzh) {
                int i3 = zzvVarZzO.zzH;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzvVar = zzvVarZzO;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (zzaH()) {
                    zzK();
                }
                if (Build.VERSION.SDK_INT < 29) {
                    z = false;
                }
                zzgsw.zzi(z);
            }
            this.zzd.zzh(zzvVar, 0, iArr2);
        } catch (zzrr e) {
            throw zzP(e, e.zza, false, 5001);
        }
    }
}
