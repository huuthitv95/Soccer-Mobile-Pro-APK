package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzggn {
    private MessageDigest zza;
    private final zzgpu zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzggn(zzgpu zzgpuVar) {
        this.zzb = zzgpuVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgps zzgpsVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgpsVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance(SameMD5.TAG);
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgpsVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e) {
                zzgpsVarZza.zzb(e);
            }
            zzgpsVarZza.zzc();
        } catch (Throwable th2) {
            zzgpsVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        zzgsw.zza(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzggq[] zzggqVarArr = new zzghd().zzcK;
        int length2 = zzggqVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzggqVarArr[i3].zza(bArrArray, bArr3);
        }
        if (!zzgtn.zzc(str)) {
            new zzggp(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzayx zzf(byte[] bArr, String str) {
        zzayx zzayxVarZza = zzayy.zza();
        byte[] bArrZze = zze(bArr);
        zzicn zzicnVar = zzicn.zza;
        zzayxVarZza.zzb(zzicn.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzayxVarZza.zza(zzicn.zzt(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzayxVarZza;
    }

    public final String zzg(int i, String str) {
        zzaxf zzaxfVarZzj = zzayf.zzj();
        zzaxfVarZzj.zzl(i);
        return Base64.encodeToString(zzd(((zzayf) zzaxfVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}
