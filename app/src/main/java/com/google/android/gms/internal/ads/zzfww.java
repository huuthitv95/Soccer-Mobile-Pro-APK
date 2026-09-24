package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfww implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfxs zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfww(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfxs zzfxsVar = new zzfxs(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfxsVar;
        this.zzd = new LinkedBlockingQueue();
        zzfxsVar.checkAvailabilityAndConnect();
    }

    static zzayf zzc() {
        zzaxf zzaxfVarZzj = zzayf.zzj();
        zzaxfVarZzj.zzl(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (zzayf) zzaxfVarZzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfxx zzfxxVarZzd = zzd();
        if (zzfxxVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfxxVarZzd.zze(new zzfxt(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } finally {
                zzb();
                this.zze.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzayf zza(int i) {
        zzayf zzayfVar;
        try {
            zzayfVar = (zzayf) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzayfVar = null;
        }
        return zzayfVar == null ? zzc() : zzayfVar;
    }

    public final void zzb() {
        zzfxs zzfxsVar = this.zza;
        if (zzfxsVar != null) {
            if (zzfxsVar.isConnected() || zzfxsVar.isConnecting()) {
                zzfxsVar.disconnect();
            }
        }
    }

    protected final zzfxx zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
