package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadt {
    private final Context zzb;
    private zzadp zzc;
    private boolean zzd;
    private Surface zze;
    private float zzg;
    private float zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private final zzacp zza = new zzacp();
    private float zzf = -1.0f;
    private float zzi = 1.0f;
    private int zzj = 0;

    public zzadt(Context context) {
        this.zzb = context;
    }

    private final void zzj() {
        this.zzm = 0L;
        this.zzq = -1L;
        this.zzn = -1L;
        this.zzk = 0L;
        this.zzl = 0L;
    }

    private final void zzk() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzacp zzacpVar = this.zza;
        float fZzg = zzacpVar.zzc() ? zzacpVar.zzg() : this.zzf;
        float f = this.zzg;
        if (fZzg != f) {
            if (fZzg != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (zzacpVar.zzc() && zzacpVar.zze() >= 5000000000L) {
                    f2 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f2) {
                    return;
                }
            } else if (fZzg == -1.0f && zzacpVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzl(false);
        }
    }

    private final void zzl(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzado.zza(this.zze, f);
        }
    }

    private final void zzm() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzh = 0.0f;
        zzado.zza(this.zze, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzl(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzj();
        int i = zzadp.zze;
        DisplayManager displayManager = (DisplayManager) this.zzb.getSystemService("display");
        zzadp zzadsVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzadsVar = Build.VERSION.SDK_INT >= 33 ? new zzads(choreographer, displayManager, null) : new zzadq(choreographer, displayManager, null);
            } catch (RuntimeException e) {
                zzef.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        this.zzc = zzadsVar;
        if (zzadsVar != null) {
            zzadsVar.zza();
        }
        zzl(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzm();
        this.zze = surface;
        zzl(true);
    }

    public final void zzd() {
        zzj();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl(false);
    }

    public final void zzf(float f) {
        this.zzf = f;
        this.zza.zza();
        zzk();
    }

    public final void zzg(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzq = j2;
            this.zzr = this.zzo;
            this.zzs = this.zzp;
            this.zzk = this.zzl;
        }
        this.zzm++;
        this.zza.zzb(j * 1000);
        zzk();
    }

    public final void zzh() {
        this.zzd = false;
        zzadp zzadpVar = this.zzc;
        if (zzadpVar != null) {
            zzadpVar.zzb();
        }
        zzm();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    public final long zzi(long j, long j2) {
        long j3;
        long j4;
        long j5;
        float f;
        long jZzf;
        if (this.zzq != -1) {
            zzacp zzacpVar = this.zza;
            if (zzacpVar.zzc()) {
                jZzf = zzacpVar.zzf() * (this.zzm - this.zzq);
                f = this.zzi;
            } else {
                long j6 = j2 - this.zzs;
                f = this.zzi;
                jZzf = j6 * 1000;
            }
            j3 = this.zzr + ((long) (jZzf / f));
            if (Math.abs(j - j3) > 20000000) {
                zzj();
                j3 = j;
            }
        } else {
            j3 = j;
        }
        this.zzn = this.zzm;
        this.zzo = j3;
        this.zzp = j2;
        zzadp zzadpVar = this.zzc;
        if (zzadpVar != null) {
            long j7 = zzadpVar.zzc;
            long j8 = this.zzc.zzd;
            if (j7 != -9223372036854775807L && j8 != -9223372036854775807L) {
                long j9 = j7 + (((j3 - j7) / j8) * j8);
                if (j3 <= j9) {
                    j4 = j9 - j8;
                } else {
                    j4 = j9;
                    j9 += j8;
                }
                long j10 = j8 / 2;
                long j11 = j9 - j3;
                long j12 = j3 - j4;
                long jAbs = Math.abs(j11 - j12);
                if (jAbs < j10) {
                    long j13 = j8 / 4;
                    if (jAbs < j13) {
                        j5 = this.zzk;
                        if (j5 == 0) {
                            if (j11 < j12) {
                                j13 = -j13;
                            }
                        }
                        if (j11 + j5 >= j12) {
                            j9 = j4;
                        }
                        return j9 - ((j8 * 80) / 100);
                    }
                    j13 = 0;
                    this.zzl = j13;
                    j5 = j13;
                    if (j11 + j5 >= j12) {
                        j9 = j4;
                    }
                    return j9 - ((j8 * 80) / 100);
                }
                j5 = this.zzk;
                this.zzl = j5;
                if (j11 + j5 >= j12) {
                    j9 = j4;
                }
                return j9 - ((j8 * 80) / 100);
            }
        }
        return j3;
    }
}
