package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfzs extends zzfzg {
    private zzgto<Integer> zza;
    private zzgto<Integer> zzb;
    private zzfzi zzc;
    private HttpURLConnection zzd;

    zzfzs() {
        this(zzfzr.zza, zzfzj.zza, null);
    }

    zzfzs(zzgto<Integer> zzgtoVar, zzgto<Integer> zzgtoVar2, zzfzi zzfziVar) {
        this.zza = zzgtoVar;
        this.zzb = zzgtoVar2;
        this.zzc = zzfziVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzfzh.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i = zzfzb.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzk
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfzi() { // from class: com.google.android.gms.internal.ads.zzfzl
            @Override // com.google.android.gms.internal.ads.zzfzi
            public final /* synthetic */ URLConnection zza() {
                return zzfzs.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzm
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzn
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfzi() { // from class: com.google.android.gms.internal.ads.zzfzo
            @Override // com.google.android.gms.internal.ads.zzfzi
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfzi zzfziVar, final int i, final int i2) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzp
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzq
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzfziVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfzh.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfzi zzfziVar = this.zzc;
        zzfziVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfziVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
