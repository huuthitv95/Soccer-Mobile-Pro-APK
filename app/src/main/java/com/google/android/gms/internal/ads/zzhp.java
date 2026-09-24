package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhp implements zzhj {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhj zzc;
    private zzhj zzd;
    private zzhj zze;
    private zzhj zzf;
    private zzhj zzg;
    private zzhj zzh;
    private zzhj zzi;
    private zzhj zzj;
    private zzhj zzk;

    public zzhp(Context context, zzhj zzhjVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhjVar;
    }

    private final zzhj zzf() {
        if (this.zze == null) {
            zzha zzhaVar = new zzha(this.zza);
            this.zze = zzhaVar;
            zzg(zzhaVar);
        }
        return this.zze;
    }

    private final void zzg(zzhj zzhjVar) {
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            zzhjVar.zze((zzih) list.get(i));
            i++;
        }
    }

    private static final void zzh(zzhj zzhjVar, zzih zzihVar) {
        if (zzhjVar != null) {
            zzhjVar.zze(zzihVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        zzhj zzhjVar;
        zzgsw.zzi(this.zzk == null);
        Uri uri = zzhnVar.zza;
        String scheme = uri.getScheme();
        String str = zzfk.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, C11744X3.i.f26356b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzhw zzhwVar = new zzhw();
                    this.zzd = zzhwVar;
                    zzg(zzhwVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzhg zzhgVar = new zzhg(this.zza);
                this.zzf = zzhgVar;
                zzg(zzhgVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhj zzhjVar2 = (zzhj) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.zzg = zzhjVar2;
                    zzg(zzhjVar2);
                } catch (ClassNotFoundException unused) {
                    zzef.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzij zzijVar = new zzij(2000);
                this.zzh = zzijVar;
                zzg(zzijVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzhh zzhhVar = new zzhh();
                this.zzi = zzhhVar;
                zzg(zzhhVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzif zzifVar = new zzif(this.zza);
                    this.zzj = zzifVar;
                    zzg(zzifVar);
                }
                zzhjVar = this.zzj;
            } else {
                zzhjVar = this.zzc;
            }
            this.zzk = zzhjVar;
        }
        return this.zzk.zzb(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        zzhj zzhjVar = this.zzk;
        if (zzhjVar == null) {
            return null;
        }
        return zzhjVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws IOException {
        zzhj zzhjVar = this.zzk;
        if (zzhjVar != null) {
            try {
                zzhjVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Map zzj() {
        zzhj zzhjVar = this.zzk;
        return zzhjVar == null ? Collections.EMPTY_MAP : zzhjVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzhj zzhjVar = this.zzk;
        zzhjVar.getClass();
        return zzhjVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zze(zzih zzihVar) {
        zzihVar.getClass();
        this.zzc.zze(zzihVar);
        this.zzb.add(zzihVar);
        zzh(this.zzd, zzihVar);
        zzh(this.zze, zzihVar);
        zzh(this.zzf, zzihVar);
        zzh(this.zzg, zzihVar);
        zzh(this.zzh, zzihVar);
        zzh(this.zzi, zzihVar);
        zzh(this.zzj, zzihVar);
    }
}
