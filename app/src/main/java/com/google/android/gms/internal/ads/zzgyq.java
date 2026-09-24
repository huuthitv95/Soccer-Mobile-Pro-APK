package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgyq extends zzgyt {
    final char[] zza;

    private zzgyq(zzgyp zzgypVar) {
        super(zzgypVar, null);
        this.zza = new char[512];
        zzgsw.zza(zzgypVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgypVar.zza(i >>> 4);
            this.zza[i | 256] = zzgypVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgsw.zzo(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyt, com.google.android.gms.internal.ads.zzgyu
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgys {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new zzgys(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zzgyp zzgypVar = this.zzb;
            bArr[i2] = (byte) (zzgypVar.zzc(charSequence.charAt(i + 1)) | (zzgypVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    final zzgyu zzc(zzgyp zzgypVar, Character ch) {
        return new zzgyq(zzgypVar);
    }

    zzgyq(String str, String str2) {
        this(new zzgyp("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
