package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzicl extends zzick {
    private final byte[] zzb;

    zzicl(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int iZzD = zzD(i, i2, bArr.length);
        return iZzD == 0 ? zzicn.zza : new zzich(bArr, i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int iZzD = zzD(i, i2, bArr.length);
        return iZzD == 0 ? zzicn.zza : new zzich(bArr, i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final void zzg(zzice zziceVar) throws IOException {
        byte[] bArr = this.zzb;
        zziceVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        return zzigt.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final boolean zzj(zzicn zzicnVar) {
        if (zzicnVar instanceof zzicl) {
            return Arrays.equals(this.zzb, ((zzicl) zzicnVar).zzb);
        }
        return zzicnVar instanceof zzich ? zzk(zzicnVar, 0, this.zzb.length) : zzicnVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzick
    final boolean zzk(zzicn zzicnVar, int i, int i2) {
        if (i2 > zzicnVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= zzicnVar.zzb()) {
            if (zzicnVar instanceof zzicl) {
                return zzicn.zzE(this.zzb, 0, ((zzicl) zzicnVar).zzb, i, i2);
            }
            if (!(zzicnVar instanceof zzich)) {
                return zzicnVar.zzd(i, i3).equals(zzd(0, i2));
            }
            zzich zzichVar = (zzich) zzicnVar;
            return zzicn.zzE(this.zzb, 0, zzichVar.zzn(), zzichVar.zzo() + i, i2);
        }
        int iZzb = zzicnVar.zzb();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iZzb).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(iZzb);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final int zzl(int i, int i2, int i3) {
        return zziee.zzc(i, this.zzb, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        byte[] bArr = this.zzb;
        return zzicr.zzI(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
