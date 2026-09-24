package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsv implements zzqz {
    private final Context zza;
    private final zzsu zzb;
    private final float zzc;
    private zzee zzd;
    private zzdo zze;
    private zzqb zzf;
    private zzqh zzg;
    private Looper zzh;
    private Context zzi;
    private final zzsz zzj;

    /* synthetic */ zzsv(zzst zzstVar, byte[] bArr) {
        this.zza = zzstVar.zzd();
        zzsz zzszVarZzg = zzstVar.zzg();
        zzszVarZzg.getClass();
        this.zzj = zzszVarZzg;
        this.zzf = zzstVar.zze();
        this.zzb = zzstVar.zzd() != null ? new zzsu(this, null) : null;
        this.zzc = 8.0f;
        this.zze = zzdo.zza;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzk(zzqs zzqsVar) {
        Context context;
        zzl();
        zzqh zzqhVar = this.zzg;
        if (zzqhVar == null && (context = this.zza) != null) {
            zzqh zzqhVar2 = new zzqh(context, new zzqg() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqg
                public final /* synthetic */ void zza(zzqb zzqbVar) {
                    this.zza.zzh(zzqbVar);
                }
            }, zzqsVar.zzb, zzqsVar.zzc);
            this.zzg = zzqhVar2;
            this.zzf = zzqhVar2.zzd();
        } else if (zzqhVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqsVar.zzc;
            if (audioDeviceInfo != null) {
                zzqhVar.zzc(audioDeviceInfo);
            }
            this.zzg.zzb(zzqsVar.zzb);
        }
        this.zzf.getClass();
    }

    private final void zzl() {
        if (this.zza == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzh;
        boolean z = looper == null || looper == looperMyLooper;
        String strZzm = zzm(looper);
        String strZzm2 = zzm(looperMyLooper);
        if (!z) {
            throw new IllegalStateException(zzgtn.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strZzm, strZzm2));
        }
        this.zzh = looperMyLooper;
    }

    private static String zzm(Looper looper) {
        return looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final zzqu zza(zzqs zzqsVar) {
        zzk(zzqsVar);
        zzsz zzszVar = this.zzj;
        zzv zzvVar = zzqsVar.zza;
        zzd zzdVar = zzqsVar.zzb;
        zzqm zzqmVarZza = zzszVar.zza(zzvVar, zzdVar);
        zzqt zzqtVar = new zzqt();
        int i = 0;
        if (!Objects.equals(zzvVar.zzp, "audio/raw") ? this.zzf.zzf(zzvVar, zzdVar) != null : zzvVar.zzJ == 2) {
            i = 2;
        }
        zzqtVar.zzd(i);
        zzqtVar.zza(zzqmVarZza.zzb);
        zzqtVar.zzb(zzqmVarZza.zzc);
        zzqtVar.zzc(zzqmVarZza.zzd);
        return zzqtVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final zzqy zzb(zzqs zzqsVar) throws zzqq {
        int i;
        int iIntValue;
        int i2;
        int iZzF;
        int i3;
        zzk(zzqsVar);
        zzv zzvVar = zzqsVar.zza;
        String str = zzvVar.zzp;
        if (Objects.equals(str, "audio/raw")) {
            int i4 = zzvVar.zzJ;
            zzgsw.zza(zzfk.zzC(i4));
            i = zzvVar.zzI;
            int i5 = zzvVar.zzH;
            iIntValue = zzfk.zzD(i5);
            iZzF = zzfk.zzF(i4) * i5;
            i3 = i4;
            i2 = 0;
        } else {
            i = zzvVar.zzI;
            zzqm zzqmVar = zzqm.zza;
            Pair pairZzf = this.zzf.zzf(zzvVar, zzqsVar.zzb);
            if (pairZzf == null) {
                String strValueOf = String.valueOf(zzvVar);
                String.valueOf(strValueOf);
                throw new zzqq("Unable to configure passthrough for: ".concat(String.valueOf(strValueOf)));
            }
            int iIntValue2 = ((Integer) pairZzf.first).intValue();
            iIntValue = ((Integer) pairZzf.second).intValue();
            i2 = 2;
            iZzF = -1;
            i3 = iIntValue2;
        }
        int i6 = i;
        int i7 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i7 == -1) {
            i7 = 768000;
        }
        int i8 = i7;
        int iMax = zzqsVar.zzf;
        if (iMax == -1) {
            int i9 = iZzF;
            int minBufferSize = AudioTrack.getMinBufferSize(i6, iIntValue, i3);
            zzgsw.zzi(minBufferSize != -2);
            int i10 = i9 == -1 ? 1 : i9;
            int i11 = i10;
            iMax = (((Math.max(minBufferSize, zztl.zzb(minBufferSize, i3, i2, i10, i6, i8)) + i11) - 1) / i11) * i11;
        }
        zzqx zzqxVar = new zzqx();
        zzqxVar.zzb(i6);
        zzqxVar.zzc(iIntValue);
        zzqxVar.zza(i3);
        zzqxVar.zze(iMax);
        zzqxVar.zzg(zzqsVar.zzd);
        zzqxVar.zzf(zzqsVar.zzb);
        zzqxVar.zzd(false);
        zzqxVar.zzh(zzqsVar.zze);
        return new zzqy(zzqxVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzc(zzqw zzqwVar) {
        zzl();
        if (this.zzd == null) {
            this.zzd = new zzee(Thread.currentThread());
        }
        this.zzd.zzc(zzqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zzd(zzdo zzdoVar) {
        this.zze = zzdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqz
    public final void zze() {
        zzee zzeeVar = this.zzd;
        if (zzeeVar != null) {
            zzeeVar.zzg();
        }
        zzqh zzqhVar = this.zzg;
        if (zzqhVar != null) {
            zzqhVar.zze();
        }
    }

    public final zzsq zzf(zzqy zzqyVar) throws zzqv {
        Context context;
        try {
            int i = zzqyVar.zzg;
            int i2 = zzqyVar.zzh;
            Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzi;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.zzi = context.createDeviceContext(i2);
                }
                context2 = this.zzi;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqyVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqyVar.zzb).setChannelMask(zzqyVar.zzc).setEncoding(zzqyVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqyVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zzsq(audioTrackBuild, zzqyVar, this.zzb, this.zzc, this.zze);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqv();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzqv(e);
        }
    }

    public final zzqb zzg() {
        return this.zzf;
    }

    final void zzh(zzqb zzqbVar) {
        zzl();
        zzqb zzqbVar2 = this.zzf;
        if (zzqbVar2 == null || zzqbVar.equals(zzqbVar2)) {
            return;
        }
        this.zzf = zzqbVar;
        zzee zzeeVar = this.zzd;
        if (zzeeVar != null) {
            zzeeVar.zze(-1, zzsr.zza);
            zzeeVar.zzf();
        }
    }

    final /* synthetic */ void zzi(zzqb zzqbVar) {
        this.zzf = zzqbVar;
    }

    final /* synthetic */ zzqh zzj() {
        return this.zzg;
    }
}
