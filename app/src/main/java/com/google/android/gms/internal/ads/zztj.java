package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zztj implements zzrw {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private ByteBuffer zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzte zzZ;
    private final Context zzb;
    private final zzsy zzc;
    private final zztv zzd;
    private final zzcv zze;
    private final zztu zzf;
    private final zzgvz zzg;
    private final ArrayDeque zzh;
    private zzta zzi;
    private final zzti zzj;
    private final zzti zzk;
    private zzpz zzl;
    private zzrt zzm;
    private zztd zzn;
    private zztd zzo;
    private zzck zzp;
    private final zzqz zzq;
    private zzqw zzr;
    private zzqp zzs;
    private zzd zzt;
    private zzth zzu;
    private zzth zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzH() {
        return zza.get() > 0;
    }

    private final void zzQ() {
        zzck zzckVarZzk = this.zzo.zzk();
        this.zzp = zzckVarZzk;
        zzckVarZzk.zzb(zzcm.zza);
    }

    private final zzqp zzR(zzqy zzqyVar) throws zzrs {
        try {
            return ((zzsv) this.zzq).zzf(zzqyVar);
        } catch (zzqv e) {
            zzrs zzrsVar = new zzrs(0, zzqyVar.zzb, zzqyVar.zzc, zzqyVar.zza, zzqyVar.zze, this.zzo.zzf(), false, e);
            zzrt zzrtVar = this.zzm;
            if (zzrtVar == null) {
                throw zzrsVar;
            }
            zzrtVar.zza(zzrsVar);
            throw zzrsVar;
        }
    }

    private final void zzS(long j) throws Exception {
        zzV(j);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzU(byteBuffer);
                zzV(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer byteBufferZze = this.zzp.zze();
                if (byteBufferZze.hasRemaining()) {
                    zzU(byteBufferZze);
                    zzV(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzT() throws Exception {
        if (!this.zzp.zzc()) {
            zzV(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzS(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0183  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0210  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:85:0x024c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0059 A[SYNTHETIC] */
    private final void zzU(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        zzgsw.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zze()) {
                int iZzu = (int) zzfk.zzu(zzfk.zzs(20L), this.zzo.zzj().zzb);
                long jZzad = zzad();
                long j = iZzu;
                if (jZzad < j) {
                    int i10 = this.zzo.zzj().zza;
                    int iZzi = this.zzo.zzi();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i11 = (int) jZzad;
                    while (byteBuffer.hasRemaining() && i11 < iZzu) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i10 != 4) {
                                if (i10 != 21) {
                                    if (i10 == 22) {
                                        int i12 = byteBuffer.get() & 255;
                                        int i13 = (byteBuffer.get() & 255) << 8;
                                        int i14 = (byteBuffer.get() & 255) << 16;
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = i12 | i13 | i14;
                                    } else if (i10 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i10 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else if (i10 == 1610612736) {
                                        int i15 = (byteBuffer.get() & 255) << 24;
                                        int i16 = (byteBuffer.get() & 255) << 16;
                                        int i17 = (byteBuffer.get() & 255) << 8;
                                        i8 = byteBuffer.get() & 255;
                                        i9 = i17 | i15 | i16;
                                    } else {
                                        if (i10 != 1879048192) {
                                            throw new IllegalStateException();
                                        }
                                        double dZzm = zzfk.zzm(byteBuffer.getDouble(), -1.0d, 1.0d);
                                        i3 = (int) (dZzm < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? (-dZzm) * (-2.147483648E9d) : dZzm * 2.147483647E9d);
                                    }
                                    i3 = i9 | i8;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i3 = (int) (fMax < 0.0f ? (-fMax) * (-2.1474836E9f) : fMax * 2.1474836E9f);
                            }
                            i4 = (int) ((((long) i3) * ((long) i11)) / j);
                            if (i10 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i10 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i10 != 4) {
                                if (i10 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i10 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i10 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i10 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i10 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else {
                                    if (i10 == 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    if (i4 < 0) {
                                        byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                    } else {
                                        byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                    }
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + iZzi) {
                                i11++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i2 | i;
                        i4 = (int) ((((long) i3) * ((long) i11)) / j);
                        if (i10 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i10 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i10 != 4) {
                            if (i10 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i10 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i10 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i10 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i10 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else {
                                if (i10 == 1879048192) {
                                    throw new IllegalStateException();
                                }
                                if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + iZzi) {
                            i11++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    private final void zzV(long j) throws Exception {
        zzrt zzrtVar;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int iRemaining = this.zzJ.remaining();
        boolean z = true;
        try {
            boolean zZzc = this.zzs.zzc(this.zzJ, this.zzI, j);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrtVar = this.zzm) != null && !zZzc) {
                }
            }
            if (this.zzo.zze()) {
                this.zzA += (long) (iRemaining - this.zzJ.remaining());
            }
            if (zZzc) {
                if (!this.zzo.zze()) {
                    zzgsw.zzi(this.zzJ == this.zzH);
                    this.zzB += ((long) this.zzC) * ((long) this.zzI);
                }
                this.zzJ = null;
            }
        } catch (zzqo e) {
            boolean z2 = e.zzb;
            if (!z2) {
                z = false;
            } else if (zzad() <= 0) {
                if (this.zzs.zzg()) {
                    zzW();
                } else {
                    z = false;
                }
            }
            zzrv zzrvVar = new zzrv(e.zza, this.zzo.zzf(), z);
            zzrt zzrtVar2 = this.zzm;
            if (zzrtVar2 != null) {
                zzrtVar2.zza(zzrvVar);
            }
            if (z2) {
                throw zzrvVar;
            }
            this.zzk.zza(zzrvVar);
        }
    }

    private final void zzW() {
        this.zzo.zzj();
    }

    private final void zzX() {
        if (zzac()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzY() {
        if (this.zzo != null) {
            zztd zztdVar = this.zzn;
            if (zztdVar != null) {
                this.zzo = zztdVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zztd(this.zzo.zzf(), this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzq.zzb(zzae(this.zzo.zzg(), -1)), this.zzo.zzk(), null);
            } catch (zzqq e) {
                throw new IllegalStateException(new zzrr(e, this.zzo.zzf()));
            }
        }
        zzB();
    }

    private final void zzZ(zzav zzavVar) {
        zzth zzthVar = new zzth(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzac()) {
            this.zzu = zzthVar;
        } else {
            this.zzv = zzthVar;
        }
    }

    private final void zzaa(long j) {
        zzav zzavVar;
        boolean z;
        if (zzab()) {
            zzte zzteVar = this.zzZ;
            zzavVar = this.zzw;
            zzteVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzab()) {
            zzte zzteVar2 = this.zzZ;
            z = this.zzx;
            zzteVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new zzth(zzavVar2, Math.max(0L, j), this.zzo.zzc(zzad()), null));
        zzQ();
        zzrt zzrtVar = this.zzm;
        if (zzrtVar != null) {
            ((zzto) zzrtVar).zza.zzaz().zzh(this.zzx);
        }
    }

    private final boolean zzab() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i = this.zzo.zzf().zzJ;
        return true;
    }

    private final boolean zzac() {
        return this.zzs != null;
    }

    private final long zzad() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j = this.zzA;
        long jZzi = this.zzo.zzi();
        String str = zzfk.zza;
        return ((j + jZzi) - 1) / jZzi;
    }

    private final zzqs zzae(zzv zzvVar, int i) {
        zzqr zzqrVar = new zzqr(zzvVar);
        zzqrVar.zza(this.zzt);
        zzqrVar.zzb(this.zzR);
        zzqrVar.zzc(this.zzO);
        zzqrVar.zze(-1);
        zzqrVar.zzd(this.zzS);
        return new zzqs(zzqrVar, null);
    }

    private final void zzaf() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzag(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzA() {
        this.zzN = false;
        if (zzac()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzB() {
        if (zzac()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzth(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzQ();
            this.zzi = null;
            zztd zztdVar = this.zzn;
            if (zztdVar != null) {
                this.zzo = zztdVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzC() {
        zzB();
        zzgvz zzgvzVar = this.zzg;
        int size = zzgvzVar.size();
        for (int i = 0; i < size; i++) {
            ((zzco) zzgvzVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzD() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzF() {
        if (this.zzX >= 300000) {
            ((zzto) this.zzm).zza.zzaB(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzG() {
        zzrt zzrtVar = this.zzm;
        if (zzrtVar != null) {
            ((zzto) zzrtVar).zza.zzT();
        }
    }

    final /* synthetic */ zzta zzJ() {
        return this.zzi;
    }

    final /* synthetic */ zzrt zzK() {
        return this.zzm;
    }

    final /* synthetic */ zztd zzL() {
        return this.zzo;
    }

    final /* synthetic */ zzqp zzM() {
        return this.zzs;
    }

    final /* synthetic */ void zzN(boolean z) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzO() {
        return this.zzN;
    }

    final /* synthetic */ long zzP() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zza(zzrt zzrtVar) {
        this.zzm = zzrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzb(zzpz zzpzVar) {
        this.zzl = zzpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzc(zzdo zzdoVar) {
        this.zzq.zzd(zzdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zze(zzv zzvVar) {
        boolean z;
        int i = zzvVar.zzJ;
        if (!zzfk.zzC(i) || i == 2) {
            z = false;
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzI(2);
            zzvVar = zztVarZza.zzO();
            z = true;
        }
        int i2 = this.zzq.zza(zzae(zzvVar, -1)).zzd;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzqm zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzqm.zza;
        }
        zzqu zzquVarZza = this.zzq.zza(zzae(zzvVar, -1));
        zzql zzqlVar = new zzql();
        zzqlVar.zza(zzquVarZza.zza);
        zzqlVar.zzb(zzquVarZza.zzb);
        zzqlVar.zzc(zzquVarZza.zzc);
        return zzqlVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzac() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzs.zzk(), this.zzo.zzc(zzad()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || jMin < ((zzth) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzth) arrayDeque.remove();
        }
        zzth zzthVar = this.zzv;
        long j2 = jMin - zzthVar.zzc;
        long jZzx = zzfk.zzx(j2, zzthVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long jZzd = this.zzZ.zzd(j2);
            zzth zzthVar2 = this.zzv;
            j = zzthVar2.zzb + jZzd;
            zzthVar2.zzd = jZzd - jZzx;
        } else {
            zzth zzthVar3 = this.zzv;
            j = zzthVar3.zzb + jZzx + zzthVar3.zzd;
        }
        long jZze = this.zzZ.zze();
        long jZzc = j + this.zzo.zzc(jZze);
        long j3 = this.zzW;
        if (jZze > j3) {
            long jZzc2 = this.zzo.zzc(jZze - j3);
            this.zzW = jZze;
            this.zzX += jZzc2;
            if (this.zzY == null) {
                this.zzY = new Handler(Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzF();
                }
            }, 100L);
        }
        return jZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzh(zzv zzvVar, int i, int[] iArr) throws zzrr {
        zzck zzckVar;
        zzv zzvVarZzO;
        int iZzF;
        int iZzF2;
        if (this.zzr == null && this.zzb != null) {
            zzqw zzqwVar = new zzqw() { // from class: com.google.android.gms.internal.ads.zztf
                @Override // com.google.android.gms.internal.ads.zzqw
                public final /* synthetic */ void zza() {
                    this.zza.zzG();
                }
            };
            this.zzr = zzqwVar;
            this.zzq.zzc(zzqwVar);
        }
        if ("audio/raw".equals(zzvVar.zzp)) {
            int i2 = zzvVar.zzJ;
            zzgsw.zza(zzfk.zzC(i2));
            int i3 = zzvVar.zzH;
            iZzF = zzfk.zzF(i2) * i3;
            zzgvw zzgvwVar = new zzgvw();
            zzgvwVar.zzh(this.zzg);
            zzgvwVar.zzf(this.zze);
            zzgvwVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgvwVar.zzi());
            if (zzckVar.equals(this.zzp)) {
                zzckVar = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzK, zzvVar.zzL);
            this.zzc.zzq(iArr);
            try {
                zzcl zzclVarZza = zzckVar.zza(new zzcl(zzvVar.zzI, i3, i2));
                zzt zztVarZza = zzvVar.zza();
                int i4 = zzclVarZza.zzd;
                zztVarZza.zzI(i4);
                zztVarZza.zzH(zzclVarZza.zzb);
                int i5 = zzclVarZza.zzc;
                zztVarZza.zzG(i5);
                zzvVarZzO = zztVarZza.zzO();
                iZzF2 = zzfk.zzF(i4) * i5;
            } catch (zzcn e) {
                throw new zzrr(e, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzgvz.zzi());
            zzvVarZzO = zzvVar;
            iZzF = -1;
            iZzF2 = -1;
        }
        zzck zzckVar2 = zzckVar;
        zzqs zzqsVarZzae = zzae(zzvVarZzO, -1);
        try {
            zzqy zzqyVarZzb = this.zzq.zzb(zzqsVarZzae);
            if (zzqyVarZzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzrr(sb.toString(), zzqsVarZzae.zza);
            }
            if (zzqyVarZzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzrr(sb2.toString(), zzqsVarZzae.zza);
            }
            this.zzU = false;
            zztd zztdVar = new zztd(zzvVar, zzvVarZzO, iZzF, iZzF2, zzqyVarZzb, zzckVar2, null);
            if (zzac()) {
                this.zzn = zztdVar;
            } else {
                this.zzo = zztdVar;
            }
        } catch (zzqq e2) {
            throw new zzrr(e2, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzi() {
        this.zzN = true;
        if (zzac()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzj() {
        this.zzD = true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws Exception {
        zzqp zzqpVarZzR;
        zzqp zzqpVar;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgsw.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzT()) {
                return false;
            }
            if (this.zzs != null) {
                zzqy zzqyVarZzj = this.zzo.zzj();
                zzae(this.zzn.zzg(), -1);
                if (this.zzn.zzj().equals(zzqyVarZzj)) {
                    this.zzo = this.zzn;
                    this.zzn = null;
                    zzqpVar = this.zzs;
                    if (zzqpVar != null && zzqpVar.zzg()) {
                        this.zzo.zzj();
                    }
                } else {
                    zzaf();
                    if (zzn()) {
                        return false;
                    }
                    zzB();
                }
            } else {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqpVar = this.zzs;
                if (zzqpVar != null) {
                    this.zzo.zzj();
                }
            }
            zzaa(j);
        }
        if (!zzac()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqpVarZzR = zzR(this.zzo.zzj());
                } catch (zzrs e) {
                    int i2 = this.zzo.zzj().zze;
                    while (true) {
                        if (i2 <= 1000000) {
                            zzW();
                            throw e;
                        }
                        int i3 = i2 >> 1;
                        int iZzi = this.zzo.zzi() != -1 ? this.zzo.zzi() : 1;
                        int i4 = i3 % iZzi;
                        if (i4 != 0) {
                            i3 += iZzi - i4;
                        }
                        int i5 = i3;
                        zzqx zzqxVar = new zzqx(this.zzo.zzj(), null);
                        zzqxVar.zze(i5);
                        zzqy zzqyVar = new zzqy(zzqxVar, null);
                        try {
                            zzqp zzqpVarZzR2 = zzR(zzqyVar);
                            this.zzo = this.zzo.zza(zzqyVar);
                            zzqpVarZzR = zzqpVarZzR2;
                            break;
                        } catch (zzrs e2) {
                            e.addSuppressed(e2);
                            i2 = i5;
                        }
                    }
                }
                this.zzs = zzqpVarZzR;
                zzta zztaVar = new zzta(this, this.zzo.zzj(), bArr);
                this.zzi = zztaVar;
                this.zzs.zzm(zztaVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzj();
                }
                zzpz zzpzVar = this.zzl;
                if (zzpzVar != null) {
                    this.zzs.zzn(zzpzVar);
                }
                zzX();
                int i6 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i7 = this.zzO;
                this.zzO = iZzh;
                zzrt zzrtVar = this.zzm;
                if (zzrtVar != null) {
                    ((zzto) zzrtVar).zza.zzaz().zzk(this.zzo.zzd());
                    if (iZzh != i7) {
                        this.zzP = true;
                        zztd zztdVar = this.zzo;
                        zzqx zzqxVar2 = new zzqx(zztdVar.zzj(), null);
                        zzqxVar2.zzg(this.zzO);
                        this.zzo = zztdVar.zza(new zzqy(zzqxVar2, null));
                        zztd zztdVar2 = this.zzn;
                        if (zztdVar2 != null) {
                            zzqx zzqxVar3 = new zzqx(zztdVar2.zzj(), null);
                            zzqxVar3.zzg(this.zzO);
                            this.zzn = zztdVar2.zza(new zzqy(zzqxVar3, null));
                        }
                        zzrt zzrtVar2 = this.zzm;
                        int i8 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zztp zztpVar = ((zzto) zzrtVar2).zza;
                            if (zztpVar.zzaA() != null) {
                                zztpVar.zzaA().zza(i8);
                            }
                        }
                        ((zzto) zzrtVar2).zza.zzaz().zzm(i8);
                    }
                }
            } catch (zzrs e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzaa(j);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgsw.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zze() && this.zzC == 0) {
                int iZzE = zzE(this.zzo.zzj().zza, byteBuffer);
                this.zzC = iZzE;
                if (iZzE == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzT()) {
                    return false;
                }
                zzaa(j);
                this.zzu = null;
            }
            long j2 = this.zzF;
            zztd zztdVar3 = this.zzo;
            long jZzb = j2 + zztdVar3.zzb((zztdVar3.zze() ? this.zzy / ((long) this.zzo.zzh()) : this.zzz) - this.zzd.zzs());
            if (!this.zzD && Math.abs(jZzb - j) > 200000) {
                zzrt zzrtVar3 = this.zzm;
                if (zzrtVar3 != null) {
                    zzrtVar3.zza(new zzru(j, jZzb));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzT()) {
                    return false;
                }
                long j3 = j - jZzb;
                this.zzF += j3;
                this.zzD = false;
                zzaa(j);
                zzrt zzrtVar4 = this.zzm;
                if (zzrtVar4 != null && j3 != 0) {
                    ((zzto) zzrtVar4).zza.zzaq();
                }
            }
            if (this.zzo.zze()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz += ((long) this.zzC) * ((long) i);
            }
            this.zzH = byteBuffer;
            this.zzI = i;
        }
        zzS(j);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzef.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzB();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzl() throws zzrv {
        if (!this.zzK && zzac() && zzT()) {
            zzaf();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzm() {
        if (zzac()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzn() {
        if (!zzac()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long jZzad = zzad();
        long jZzk = this.zzs.zzk();
        zzqp zzqpVar = this.zzs;
        zzqpVar.getClass();
        return jZzad > zzfk.zzu(jZzk, zzqpVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfk.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzZ(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzq(boolean z) {
        this.zzx = z;
        zzZ(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzqb zzs() {
        zzqz zzqzVar = this.zzq;
        if (zzqzVar instanceof zzsv) {
            return ((zzsv) zzqzVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzt(int i) {
        if (this.zzP) {
            if (this.zzO != i) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i) {
            this.zzO = i;
            zzY();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzu(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqp zzqpVar = this.zzs;
        if (zzqpVar != null) {
            zzqpVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzw(int i) {
        int i2 = this.zzS;
        int iZzag = zzag(i);
        if (i2 == iZzag) {
            return;
        }
        this.zzS = iZzag;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final long zzx() {
        if (!zzac()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzaft.zzf(this.zzo.zzj().zza);
        zzgsw.zzi(iZzf != -2147483647);
        return zzfk.zzv(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzy(int i, int i2) {
        zzqp zzqpVar = this.zzs;
        if (zzqpVar != null) {
            zzqpVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzz(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzX();
        }
    }

    /* synthetic */ zztj(zztc zztcVar, byte[] bArr) {
        this.zzb = zztcVar.zzb() == null ? null : zztcVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzZ = zztcVar.zzd();
        this.zzq = zztcVar.zzc();
        zzsy zzsyVar = new zzsy();
        this.zzc = zzsyVar;
        zztv zztvVar = new zztv();
        this.zzd = zztvVar;
        this.zze = new zzcv();
        this.zzf = new zztu();
        this.zzg = zzgvz.zzk(zztvVar, zzsyVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzth(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzti();
        this.zzk = new zzti();
        int iZzag = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztcVar.zzb() != null) {
            iZzag = zzag(zztcVar.zzb().getDeviceId());
        }
        this.zzS = iZzag;
    }

    static int zzE(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return zzgu.zzb(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzagn.zzb(zzfk.zzL(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = zzaeq.zza;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i7 = iPosition;
                            while (true) {
                                if (i7 > iLimit) {
                                    i5 = -1;
                                } else if ((zzfk.zzL(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i5 = i7 - iPosition;
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i8 = zzaet.zza;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzaet.zzb(new zzer(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
                    break;
            }
            return zzaeq.zze(byteBuffer);
        }
        int i9 = zzafo.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b2 = byteBuffer.get(iPosition3);
        if (b2 != -2) {
            if (b2 != -1) {
                if (b2 != 31) {
                    i3 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i4 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i3 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b = byteBuffer.get(iPosition3 + 6);
                }
                i2 = (i4 >> 2) | i3;
            } else {
                i3 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b = byteBuffer.get(iPosition3 + 7);
            }
            i4 = b & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            i2 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i2 + 1) * 32;
    }
}
