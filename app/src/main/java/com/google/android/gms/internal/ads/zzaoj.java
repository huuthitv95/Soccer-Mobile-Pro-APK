package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaoj implements zzane {
    private final zzes zza = new zzes();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaoj(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfk.zzk(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * Ascii.DC4;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        String strZzK;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i + i2);
        zzesVar.zzh(i);
        int i8 = 1;
        int i9 = 0;
        int i10 = 2;
        zzgsw.zza(zzesVar.zzd() >= 2);
        int iZzt = zzesVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzesVar.zzg();
            Charset charsetZzR = zzesVar.zzR();
            int iZzg2 = zzesVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzesVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdsVar.zza(new zzamw(zzgvz.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i11 = this.zzc;
        zzb(spannableStringBuilder, i11, 0, 0, spannableStringBuilder.length(), 16711680);
        int i12 = i11;
        int i13 = this.zzd;
        zzc(spannableStringBuilder, i13, -1, 0, spannableStringBuilder.length(), 16711680);
        int i14 = i13;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzesVar.zzd() >= 8) {
            int iZzg3 = zzesVar.zzg();
            int iZzB = zzesVar.zzB();
            int iZzB2 = zzesVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgsw.zza(zzesVar.zzd() >= i10 ? i8 : i9);
                int iZzt2 = zzesVar.zzt();
                int i15 = i9;
                while (i15 < iZzt2) {
                    zzgsw.zza(zzesVar.zzd() >= 12 ? i8 : i9);
                    int iZzt3 = zzesVar.zzt();
                    int iZzt4 = zzesVar.zzt();
                    zzesVar.zzk(i10);
                    int i16 = iZzt2;
                    int iZzs = zzesVar.zzs();
                    zzesVar.zzk(i8);
                    int iZzB3 = zzesVar.zzB();
                    int i17 = i10;
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzef.zzc("Tx3gParser", sb.toString());
                        iZzt4 = spannableStringBuilder.length();
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt3).length() + 36 + String.valueOf(iZzt4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(iZzt4);
                        sb2.append(").");
                        zzef.zzc("Tx3gParser", sb2.toString());
                        i6 = i12;
                        i7 = i14;
                    } else {
                        int i18 = i12;
                        zzb(spannableStringBuilder, iZzs, i18, iZzt3, iZzt4, 0);
                        i6 = i18;
                        i7 = i14;
                        zzc(spannableStringBuilder, iZzB3, i7, iZzt3, iZzt4, 0);
                    }
                    i10 = i17;
                    iZzt2 = i16;
                    i12 = i6;
                    i14 = i7;
                    i8 = 1;
                    i15++;
                    i9 = 0;
                }
                i3 = i12;
                i4 = i14;
                i5 = i10;
            } else {
                i3 = i12;
                int i19 = i10;
                i4 = i14;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i5 = i19;
                    zzgsw.zza(zzesVar.zzd() >= i5);
                    float fZzt = zzesVar.zzt();
                    int i20 = this.zzg;
                    String str2 = zzfk.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i20, 0.95f));
                } else {
                    i5 = i19;
                }
            }
            zzesVar.zzh(iZzg3 + iZzB);
            i12 = i3;
            i10 = i5;
            i14 = i4;
            i8 = 1;
            i9 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdsVar.zza(new zzamw(zzgvz.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
