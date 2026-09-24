package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzut implements zzuz {
    private final Context zza;

    @Deprecated
    public zzut() {
        this.zza = null;
    }

    public zzut(Context context, zzgto zzgtoVar, zzgto zzgtoVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final zzvb zzc(zzuy zzuyVar) throws Throwable {
        Context context;
        if (Build.VERSION.SDK_INT >= 31 || ((context = this.zza) != null && Build.VERSION.SDK_INT >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int iZzf = zzas.zzf(zzuyVar.zzc.zzp);
            zzef.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfk.zzR(iZzf)));
            zzul zzulVar = new zzul(iZzf);
            zzulVar.zza(true);
            return zzulVar.zzb(zzuyVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzve zzveVar = zzuyVar.zza;
            String str = zzveVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzuyVar.zzd;
                int i = 0;
                if (surface == null && zzveVar.zzh && Build.VERSION.SDK_INT >= 35) {
                    i = 8;
                }
                mediaCodecCreateByCodecName.configure(zzuyVar.zzb, surface, (MediaCrypto) null, i);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zzvy(mediaCodecCreateByCodecName, zzuyVar.zzf, null);
            } catch (IOException | RuntimeException e) {
                e = e;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }
}
