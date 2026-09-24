package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzich extends zzick {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzich(byte[] bArr, int i, int i2) {
        super(null);
        zzD(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i, int i2) {
        int iZzD = zzD(i, i2, this.zzd);
        return iZzD == 0 ? zzicn.zza : new zzich(this.zzb, this.zzc + i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i, int i2) {
        int iZzD = zzD(i, i2, this.zzd);
        return iZzD == 0 ? zzicn.zza : new zzich(this.zzb, this.zzc + i, iZzD);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, this.zzc + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final void zzg(zzice zziceVar) throws IOException {
        zziceVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return zzigt.zzb(bArr, i, this.zzd + i);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final boolean zzj(zzicn zzicnVar) {
        return ((zzicnVar instanceof zzicl) || (zzicnVar instanceof zzich)) ? zzk(zzicnVar, 0, this.zzd) : zzicnVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzick
    final boolean zzk(zzicn zzicnVar, int i, int i2) {
        if (i2 > zzicnVar.zzb()) {
            int i3 = this.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 <= zzicnVar.zzb()) {
            if (zzicnVar instanceof zzicl) {
                return zzicn.zzE(this.zzb, this.zzc, ((zzicl) zzicnVar).zzn(), i, i2);
            }
            if (zzicnVar instanceof zzich) {
                zzich zzichVar = (zzich) zzicnVar;
                return zzicn.zzE(this.zzb, this.zzc, zzichVar.zzb, zzichVar.zzc + i, i2);
            }
            zzicn zzicnVarZzd = zzicnVar.zzd(i, i4);
            int i5 = this.zzc;
            return zzicnVarZzd.equals(zzd(i5, i2 + i5));
        }
        int iZzb = zzicnVar.zzb();
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iZzb).length());
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
        return zziee.zzc(i, this.zzb, this.zzc + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        return zzicr.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
