package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzasx implements Comparable {
    private final zzati zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzatb zzf;
    private Integer zzg;
    private zzata zzh;
    private boolean zzi;
    private zzasg zzj;
    private zzasw zzk;
    private final zzasl zzl;

    public zzasx(int i, String str, zzatb zzatbVar) {
        Uri uri;
        String host;
        this.zza = zzati.zza ? new zzati() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzatbVar;
        this.zzl = new zzasl();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzasx) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        String.valueOf(hexString);
        String strValueOf = String.valueOf(hexString);
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzati.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzata zzataVar = this.zzh;
        if (zzataVar != null) {
            zzataVar.zzc(this);
        }
        if (zzati.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzasv(this, str, id));
                return;
            }
            zzati zzatiVar = this.zza;
            zzatiVar.zza(str, id);
            zzatiVar.zzb(toString());
        }
    }

    final void zze(int i) {
        zzata zzataVar = this.zzh;
        if (zzataVar != null) {
            zzataVar.zzd(this, i);
        }
    }

    public final zzasx zzf(zzata zzataVar) {
        this.zzh = zzataVar;
        return this;
    }

    public final zzasx zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final zzasx zzj(zzasg zzasgVar) {
        this.zzj = zzasgVar;
        return this;
    }

    public final zzasg zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzasf {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzasf {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract zzatd zzr(zzast zzastVar);

    protected abstract void zzs(Object obj);

    public final void zzt(zzatg zzatgVar) {
        zzatb zzatbVar;
        synchronized (this.zze) {
            zzatbVar = this.zzf;
        }
        zzatbVar.zza(zzatgVar);
    }

    final void zzu(zzasw zzaswVar) {
        synchronized (this.zze) {
            this.zzk = zzaswVar;
        }
    }

    final void zzv(zzatd zzatdVar) {
        zzasw zzaswVar;
        synchronized (this.zze) {
            zzaswVar = this.zzk;
        }
        if (zzaswVar != null) {
            zzaswVar.zza(this, zzatdVar);
        }
    }

    final void zzw() {
        zzasw zzaswVar;
        synchronized (this.zze) {
            zzaswVar = this.zzk;
        }
        if (zzaswVar != null) {
            zzaswVar.zzb(this);
        }
    }

    final /* synthetic */ zzati zzx() {
        return this.zza;
    }

    public final zzasl zzy() {
        return this.zzl;
    }
}
