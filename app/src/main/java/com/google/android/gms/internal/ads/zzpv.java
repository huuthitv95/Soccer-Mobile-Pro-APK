package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpv implements zznj, zzpw {
    private boolean zzA;
    private final Context zza;
    private final zzpx zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzpu zzp;
    private zzpu zzq;
    private zzpu zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpv(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpo zzpoVar = new zzpo(zzpo.zza);
        this.zzc = zzpoVar;
        zzpoVar.zza(this);
    }

    private final void zzA(int i, long j, zzv zzvVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m456m(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzvVar.zzo;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzp;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzvVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzvVar.zzw;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzvVar.zzx;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzvVar.zzH;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzvVar.zzI;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfk.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzB(zzbf zzbfVar, zzxc zzxcVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzxcVar == null || (iZze = zzbfVar.zze(zzxcVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzH = zzfk.zzH(zzagVar.zza);
            if (iZzH == 0) {
                i = 3;
            } else if (iZzH != 1) {
                i = iZzH != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        long j = zzbeVar.zzm;
        if (j != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfk.zzr(j));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzps
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i) {
        switch (zzfk.zzG(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzpv zza(Context context) {
        MediaMetricsManager mediaMetricsManagerM435m = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m435m(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM435m == null) {
            return null;
        }
        return new zzpv(context, mediaMetricsManagerM435m.createPlaybackSession());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzw(zzpu zzpuVar) {
        if (zzpuVar != null) {
            return zzpuVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j, zzvVar, i2);
    }

    private final void zzy(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j, zzvVar, i2);
    }

    private final void zzz(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j, zzvVar, i2);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpw
    public final void zzc(zznh zznhVar, String str) {
        zzxc zzxcVar = zznhVar.zzd;
        if (zzxcVar == null || !zzxcVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m445m().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion("1.10.0-alpha01");
            zzB(zznhVar.zzb, zzxcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpw
    public final void zzd(zznh zznhVar, String str, boolean z) {
        zzxc zzxcVar = zznhVar.zzd;
        if ((zzxcVar == null || !zzxcVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzde(zznh zznhVar, zzba zzbaVar, zzba zzbaVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzdf(zznh zznhVar, zzwy zzwyVar) {
        zzxc zzxcVar = zznhVar.zzd;
        if (zzxcVar == null) {
            return;
        }
        zzv zzvVar = zzwyVar.zzb;
        zzvVar.getClass();
        zzpu zzpuVar = new zzpu(zzvVar, 0, this.zzc.zzb(zznhVar.zzb, zzxcVar));
        int i = zzwyVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzpuVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzpuVar;
                return;
            }
        }
        this.zzp = zzpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzdg(zznh zznhVar, int i, long j, long j2) {
        zzxc zzxcVar = zznhVar.zzd;
        if (zzxcVar != null) {
            String strZzb = this.zzc.zzb(zznhVar.zzb, zzxcVar);
            HashMap map = this.zzi;
            Long l = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l2 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strZzb, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzdh(zznh zznhVar, zziv zzivVar) {
        this.zzx += zzivVar.zzg;
        this.zzy += zzivVar.zze;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:145:0x0207  */
    /* JADX WARN: Code duplicated, block: B:146:0x0213  */
    /* JADX WARN: Code duplicated, block: B:148:0x0219  */
    /* JADX WARN: Code duplicated, block: B:150:0x0223  */
    /* JADX WARN: Code duplicated, block: B:152:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x022a  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0234  */
    /* JADX WARN: Code duplicated, block: B:158:0x0238  */
    /* JADX WARN: Code duplicated, block: B:159:0x023f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0243  */
    /* JADX WARN: Code duplicated, block: B:162:0x024e  */
    /* JADX WARN: Code duplicated, block: B:172:0x029b  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5  */
    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzdi(zzbb zzbbVar, zzni zzniVar) {
        int i;
        int i2;
        int iZzD;
        int i3;
        int errorCode;
        int iZzS;
        zzq zzqVar;
        int i4;
        int i5;
        if (zzniVar.zzc() == 0) {
            return;
        }
        for (int i6 = 0; i6 < zzniVar.zzc(); i6++) {
            int iZzd = zzniVar.zzd(i6);
            zznh zznhVarZza = zzniVar.zza(iZzd);
            if (iZzd == 0) {
                this.zzc.zzd(zznhVarZza);
            } else if (iZzd == 11) {
                this.zzc.zze(zznhVarZza, this.zzl);
            } else {
                this.zzc.zzc(zznhVarZza);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzniVar.zzb(0)) {
            zznh zznhVarZza2 = zzniVar.zza(0);
            if (this.zzk != null) {
                zzB(zznhVarZza2.zzb, zznhVarZza2.zzd);
            }
        }
        if (zzniVar.zzb(2) && this.zzk != null) {
            zzgvz zzgvzVarZza = zzbbVar.zzp().zza();
            int size = zzgvzVarZza.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgvzVarZza.get(i7);
                int i8 = 0;
                while (true) {
                    i5 = i7 + 1;
                    if (i8 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i8) && (zzqVar = zzbmVar.zza(i8).zzt) != null) {
                            break loop1;
                        } else {
                            i8++;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfk.zza;
                PlaybackMetrics.Builder builderM449m = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m449m((Object) builder);
                int i9 = 0;
                while (true) {
                    if (i9 >= zzqVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i9).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i4 = 6;
                            break;
                        }
                        i9++;
                    }
                }
                builderM449m.setDrmType(i4);
            }
        }
        if (zzniVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i10 = zzauVar.zza;
            if (i10 == 1001) {
                i3 = 20;
            } else {
                zzje zzjeVar = (zzje) zzauVar;
                boolean z = zzjeVar.zzc == 1;
                int i11 = zzjeVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzia) {
                        iZzS = ((zzia) cause).zzc;
                        i3 = 5;
                    } else if ((cause instanceof zzhz) || (cause instanceof zzat)) {
                        iZzS = 0;
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof zzhy;
                        if (z2 || (cause instanceof zzii)) {
                            if (zzeq.zza(context).zzc() == 1) {
                                iZzS = 0;
                                i3 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzS = 0;
                                    i3 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzS = 0;
                                    i3 = 7;
                                } else if (z2 && ((zzhy) cause).zzb == 1) {
                                    iZzS = 0;
                                    i3 = 4;
                                } else {
                                    iZzS = 0;
                                    i3 = 8;
                                }
                            }
                        } else if (i10 == 1002) {
                            i3 = 21;
                        } else if (cause instanceof zztx) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfk.zzS(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzD = zzD(errorCode);
                                int i12 = iZzD;
                                iZzS = errorCode;
                                i3 = i12;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i3 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i3 = 29;
                            } else if (cause3 instanceof zzuh) {
                                iZzS = 0;
                                i3 = 23;
                            } else {
                                i3 = cause3 instanceof zztw ? 28 : 30;
                            }
                        } else if ((cause instanceof zzhv) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i3 = 32;
                            } else {
                                iZzS = 0;
                                i3 = 31;
                            }
                        } else {
                            iZzS = 0;
                            i3 = 9;
                        }
                    }
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (!z && i11 == 3) {
                            i3 = 15;
                        } else if (!z && i11 == 2) {
                            iZzS = 0;
                            i3 = 23;
                        } else if (cause instanceof zzvh) {
                            iZzS = zzfk.zzS(((zzvh) cause).zzd);
                            i3 = 13;
                        } else {
                            iZzD = 14;
                            if (cause instanceof zzvd) {
                                errorCode = ((zzvd) cause).zza;
                            } else if (cause instanceof OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof zzrs) {
                                i3 = 17;
                            } else if (cause instanceof zzrv) {
                                errorCode = ((zzrv) cause).zza;
                                iZzD = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzD = zzD(errorCode);
                            } else {
                                i3 = 22;
                            }
                            int i13 = iZzD;
                            iZzS = errorCode;
                            i3 = i13;
                        }
                    }
                } else if (!z) {
                    if (!z) {
                    }
                    if (cause instanceof zzvh) {
                        iZzS = zzfk.zzS(((zzvh) cause).zzd);
                        i3 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzvd) {
                            errorCode = ((zzvd) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzrs) {
                            i3 = 17;
                        } else if (cause instanceof zzrv) {
                            errorCode = ((zzrv) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i3 = 22;
                        }
                        int i14 = iZzD;
                        iZzS = errorCode;
                        i3 = i14;
                    }
                } else {
                    if (!z) {
                    }
                    if (cause instanceof zzvh) {
                        iZzS = zzfk.zzS(((zzvh) cause).zzd);
                        i3 = 13;
                    } else {
                        iZzD = 14;
                        if (cause instanceof zzvd) {
                            errorCode = ((zzvd) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzrs) {
                            i3 = 17;
                        } else if (cause instanceof zzrv) {
                            errorCode = ((zzrv) cause).zza;
                            iZzD = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzD = zzD(errorCode);
                        } else {
                            i3 = 22;
                        }
                        int i15 = iZzD;
                        iZzS = errorCode;
                        i3 = i15;
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m440m().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(iZzS).setException(zzauVar).build();
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzr(playbackErrorEventBuild);
                    }
                });
                this.zzA = true;
                this.zzo = null;
            }
            iZzS = 0;
            final PlaybackErrorEvent playbackErrorEventBuild2 = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m440m().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(iZzS).setException(zzauVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(playbackErrorEventBuild2);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzniVar.zzb(2)) {
            zzbn zzbnVarZzp = zzbbVar.zzp();
            boolean zZzb = zzbnVarZzp.zzb(2);
            boolean zZzb2 = zzbnVarZzp.zzb(1);
            boolean zZzb3 = zzbnVarZzp.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzw(this.zzp)) {
            zzpu zzpuVar = this.zzp;
            zzv zzvVar = zzpuVar.zza;
            if (zzvVar.zzx != -1) {
                int i16 = zzpuVar.zzb;
                zzx(jElapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzpu zzpuVar2 = this.zzq;
            zzv zzvVar2 = zzpuVar2.zza;
            int i17 = zzpuVar2.zzb;
            zzy(jElapsedRealtime, zzvVar2, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzpu zzpuVar3 = this.zzr;
            zzv zzvVar3 = zzpuVar3.zza;
            int i18 = zzpuVar3.zzb;
            zzz(jElapsedRealtime, zzvVar3, 0);
            this.zzr = null;
        }
        switch (zzeq.zza(this.zza).zzc()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzn) {
            this.zzn = i;
            final NetworkEvent networkEventBuild = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m436m().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(networkEventBuild);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzne) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zzniVar.zzb(10)) {
            this.zzw = true;
        }
        int iZzh = zzbbVar.zzh();
        if (this.zzv) {
            i2 = 5;
        } else if (this.zzw) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzh == 4) {
                i2 = 11;
            } else if (iZzh == 2) {
                int i19 = this.zzm;
                if (i19 == 0 || i19 == 2 || i19 == 12) {
                    i2 = 2;
                } else if (zzbbVar.zzk()) {
                    i2 = zzbbVar.zzi() != 0 ? 10 : 6;
                } else {
                    i2 = 7;
                }
            } else if (iZzh != 3) {
                i2 = (iZzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i2 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i2) {
            this.zzm = i2;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m452m().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(playbackStateEventBuild);
                }
            });
        }
        if (zzniVar.zzb(1028)) {
            this.zzc.zzg(zzniVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zze(zznh zznhVar, int i) {
        zznj.CC.$default$zze(this, zznhVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzg(zznh zznhVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzh(zznh zznhVar, zzwt zzwtVar, zzwy zzwyVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzk(zznh zznhVar, zzv zzvVar, zziw zziwVar) {
        zznj.CC.$default$zzk(this, zznhVar, zzvVar, zziwVar);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzl(zznh zznhVar, zzv zzvVar, zziw zziwVar) {
        zznj.CC.$default$zzl(this, zznhVar, zzvVar, zziwVar);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzm(zznh zznhVar, int i, long j) {
        zznj.CC.$default$zzm(this, zznhVar, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public /* synthetic */ void zzo(zznh zznhVar, Object obj, long j) {
        zznj.CC.$default$zzo(this, zznhVar, obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzp(zznh zznhVar, zzbv zzbvVar) {
        zzpu zzpuVar = this.zzp;
        if (zzpuVar != null) {
            zzv zzvVar = zzpuVar.zza;
            if (zzvVar.zzx == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzv(zzbvVar.zzb);
                zztVarZza.zzw(zzbvVar.zzc);
                this.zzp = new zzpu(zztVarZza.zzO(), 0, zzpuVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
