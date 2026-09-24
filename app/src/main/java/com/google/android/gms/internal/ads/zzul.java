package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzul implements zzuz {
    private final zzgto zza;
    private final zzgto zzb;
    private boolean zzc;

    public zzul(final int i) {
        zzgto zzgtoVar = new zzgto() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzum.zzw(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        zzgto zzgtoVar2 = new zzgto() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return new HandlerThread(zzum.zzw(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.zza = zzgtoVar;
        this.zzb = zzgtoVar2;
        this.zzc = true;
    }

    public final void zza(boolean z) {
        this.zzc = true;
    }

    public final zzum zzb(zzuy zzuyVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzvc zzvzVar;
        int i;
        zzve zzveVar = zzuyVar.zza;
        String str = zzveVar.zza;
        zzum zzumVar = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (this.zzc && Build.VERSION.SDK_INT >= 36) {
                    zzvzVar = new zzvz(mediaCodecCreateByCodecName);
                    i = 4;
                } else {
                    zzvzVar = new zzup(mediaCodecCreateByCodecName, (HandlerThread) this.zzb.zza());
                    i = 0;
                }
                zzum zzumVar2 = new zzum(mediaCodecCreateByCodecName, (HandlerThread) this.zza.zza(), zzvzVar, zzuyVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zzuyVar.zzd;
                    if (surface == null && zzveVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    zzumVar2.zzt(zzuyVar.zzb, surface, null, i);
                    return zzumVar2;
                } catch (Exception e) {
                    exc = e;
                    zzumVar = zzumVar2;
                    if (zzumVar != null) {
                        zzumVar.zzl();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final /* bridge */ /* synthetic */ zzvb zzc(zzuy zzuyVar) throws IOException {
        throw null;
    }
}
