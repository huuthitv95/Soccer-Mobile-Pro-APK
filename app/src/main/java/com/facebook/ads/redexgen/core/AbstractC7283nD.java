package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7283nD extends AbstractC5195Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C5187Eo A00;

    public abstract Pair<C47777s[], InterfaceC7284nE[]> A0d(C5187Eo c5187Eo, int[][][] iArr, int[] iArr2, C7320no c7320no, Timeline timeline) throws C4904AD;

    public static int A0Y(InterfaceC47747p[] interfaceC47747pArr, C7435pg c7435pg, int[] iArr, boolean z) throws C4904AD {
        int length = interfaceC47747pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC47747p interfaceC47747p = interfaceC47747pArr[i2];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC47747p.AKM(c7435pg.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC47677i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = iMax;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC47747p interfaceC47747p, C7435pg c7435pg) throws C4904AD {
        int[] iArr = new int[c7435pg.A01];
        for (int i = 0; i < c7435pg.A01; i++) {
            iArr[i] = interfaceC47747p.AKM(c7435pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC47747p[] interfaceC47747pArr) throws C4904AD {
        int[] iArr = new int[interfaceC47747pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int iAKO = interfaceC47747pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = iAKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5195Ew
    public final C5196Ex A0b(InterfaceC47747p[] interfaceC47747pArr, C7302nW c7302nW, C7320no c7320no, Timeline timeline) throws C4904AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC47747pArr.length + 1];
        C7435pg[][] c7435pgArr = new C7435pg[interfaceC47747pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC47747pArr.length + 1][][];
        for (int i = 0; i < c7435pgArr.length; i++) {
            c7435pgArr[i] = new C7435pg[c7302nW.A01];
            iArr2[i] = new int[c7302nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC47747pArr);
        for (int i2 = 0; i2 < c7302nW.A01; i2++) {
            C7435pg c7435pgA05 = c7302nW.A05(i2);
            int groupIndex = A0Y(interfaceC47747pArr, c7435pgA05, iArr, c7435pgA05.A02 == 5);
            if (groupIndex == interfaceC47747pArr.length) {
                rendererTrackGroupCounts = new int[c7435pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC47747pArr[groupIndex], c7435pgA05);
            }
            int i3 = iArr[groupIndex];
            c7435pgArr[groupIndex][i3] = c7435pgA05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C7302nW[] c7302nWArr = new C7302nW[interfaceC47747pArr.length];
        String[] strArr = new String[interfaceC47747pArr.length];
        int[] iArr3 = new int[interfaceC47747pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC47747pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c7302nWArr[i4] = new C7302nW((C7435pg[]) AbstractC46115C.A1I(c7435pgArr[i4], i5));
                iArr2[i4] = (int[][]) AbstractC46115C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC47747pArr[i4].getName();
                iArr3[i4] = interfaceC47747pArr[i4].A9N();
                i4++;
            } else {
                C5187Eo c5187Eo = new C5187Eo(strArr, iArr3, c7302nWArr, iArrA0a, iArr2, new C7302nW((C7435pg[]) AbstractC46115C.A1I(c7435pgArr[interfaceC47747pArr.length], iArr[interfaceC47747pArr.length])));
                Pair<C47777s[], InterfaceC7284nE[]> pairA0d = A0d(c5187Eo, iArr2, iArrA0a, c7320no, timeline);
                return new C5196Ex((C47777s[]) pairA0d.first, (InterfaceC7284nE[]) pairA0d.second, AbstractC5192Et.A00(c5187Eo, (InterfaceC5189Eq[]) pairA0d.second), c5187Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5195Ew
    public final void A0c(Object obj) {
        this.A00 = (C5187Eo) obj;
    }
}
