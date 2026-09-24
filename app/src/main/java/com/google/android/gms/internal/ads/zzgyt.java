package com.google.android.gms.internal.ads;

import com.ironsource.C11341A5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class zzgyt extends zzgyu {
    private volatile zzgyu zza;
    final zzgyp zzb;
    final Character zzc;

    zzgyt(zzgyp zzgypVar, Character ch) {
        this.zzb = zzgypVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzgypVar.zze(C11341A5.f23808U)) {
                z = false;
            }
        }
        zzgsw.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgyt) {
            zzgyt zzgytVar = (zzgyt) obj;
            if (this.zzb.equals(zzgytVar.zzb) && Objects.equals(this.zzc, zzgytVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgyp zzgypVar = this.zzb;
        sb.append(zzgypVar);
        if (8 % zzgypVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzgsw.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgys {
        int i;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgyp zzgypVar = this.zzb;
        if (!zzgypVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgys(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgypVar.zzc;
                if (i4 >= i) {
                    break;
                }
                jZzc <<= zzgypVar.zzb;
                if (i2 + i4 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgypVar.zzc(charSequenceZzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgypVar.zzd;
            int i7 = i5 * zzgypVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jZzc >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    zzgyu zzc(zzgyp zzgypVar, Character ch) {
        return new zzgyt(zzgypVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    final int zzd(int i) {
        zzgyp zzgypVar = this.zzb;
        return zzgypVar.zzc * zzgzm.zzb(i, zzgypVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgsw.zzo(i, i + i2, bArr.length);
        zzgyp zzgypVar = this.zzb;
        int i3 = zzgypVar.zzd;
        int i4 = 0;
        zzgsw.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgypVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgypVar.zza(zzgypVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append(C11341A5.f23808U);
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    final int zzf(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final zzgyu zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final zzgyu zzi() {
        zzgyu zzgyuVarZzc = this.zza;
        if (zzgyuVarZzc == null) {
            zzgyp zzgypVar = this.zzb;
            zzgyp zzgypVarZzd = zzgypVar.zzd();
            zzgyuVarZzc = zzgypVarZzd == zzgypVar ? this : zzc(zzgypVarZzd, this.zzc);
            this.zza = zzgyuVarZzc;
        }
        return zzgyuVarZzc;
    }

    zzgyt(String str, String str2, Character ch) {
        this(new zzgyp(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
