package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzsx {
    private boolean zzA;
    private long zzB;
    private final zzsw zza;
    private final zzdo zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzry zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsx(zzsw zzswVar, zzdo zzdoVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zzswVar;
        this.zzb = zzdoVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzry(audioTrack, zzswVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzC = zzfk.zzC(i);
        this.zzg = zZzC;
        this.zzf = zZzC ? zzfk.zzt(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jZzy = zzfk.zzy(j - j2, this.zzi);
        zzdo zzdoVar = this.zzb;
        long jZza = zzdoVar.zza() - zzfk.zzr(jZzy);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j) {
        long jZzx;
        if (this.zzt == 0) {
            jZzx = this.zzu != -9223372036854775807L ? zzfk.zzt(zzl(), this.zze) : zzj();
        } else {
            jZzx = zzfk.zzx(j + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzx - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfk.zzt(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfk.zzt(zzk(), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = -9223372036854775807L;
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (this.zzv == -9223372036854775807L) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfk.zzu(zzfk.zzx(zzfk.zzs(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    public final long zza() {
        long j;
        long j2;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j3 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfk.zzy(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / ((long) i3);
                        i2++;
                        j3 = j3;
                    }
                } else {
                    j = 1000;
                }
            }
            j = j3;
            long j4 = this.zzn;
            if (!this.zzg || (method = this.zzm) == null || jZzc - this.zzo < 500000) {
                j2 = j4;
            } else {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = zzfk.zza;
                    j2 = j4;
                    try {
                        long jIntValue = (((long) num.intValue()) * j) - this.zzf;
                        this.zzn = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        this.zzn = jMax;
                        if (jMax > 10000000) {
                            this.zza.zza(jMax);
                            this.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        this.zzm = null;
                    }
                } catch (Exception unused2) {
                    j2 = j4;
                }
                this.zzo = jZzc;
            }
            this.zzh.zza(jZzc, this.zzi, zzh(jZzc), j2 != this.zzn);
        } else {
            j = 1000;
        }
        long jZzc2 = this.zzb.zzc() / j;
        zzry zzryVar = this.zzh;
        boolean zZzb = zzryVar.zzb();
        long jZze = zZzb ? zzryVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzryVar.zzc()) {
                zzg(jZze);
            }
            long j5 = this.zzz;
            if (j5 != -9223372036854775807L) {
                long j6 = jZze - this.zzy;
                long jZzx = zzfk.zzx(jZzc2 - j5, this.zzi);
                long j7 = this.zzy + jZzx;
                long jAbs = Math.abs(j7 - jZze);
                if (j6 != 0 && jAbs < 1000000) {
                    long j8 = (jZzx * 10) / 100;
                    jZze = Math.max(j7 - j8, Math.min(jZze, j7 + j8));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfk.zzs(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfk.zzs(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
