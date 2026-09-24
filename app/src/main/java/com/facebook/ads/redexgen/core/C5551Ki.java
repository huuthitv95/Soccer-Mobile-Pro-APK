package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ki */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C5551Ki {
    public static String[] A02 = {"qTeBguUhuyM1MFes5Wth7HwI8JVW0esL", "wy2OEDVCsbs7Li1HpnMScgVTk8nNd5Di", "4", "CU9fduzhq9VQNbJmZcJcyCUxTgO6nbWs", CampaignEx.CLICKMODE_ON, CmcdData.Factory.STREAMING_FORMAT_SS, "JcGduWYdz", "iAKvMVZDfF33p8y0i7fbnjg8iQoR6jrx"};
    public static final Comparator<C5551Ki> A03 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Kh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C5551Ki) obj).A01.A00, ((C5551Ki) obj2).A01.A00);
        }
    };
    public final int A00;
    public final C5552Kj A01;

    public C5551Ki(C5552Kj c5552Kj, int i) {
        this.A01 = c5552Kj;
        this.A00 = i;
    }

    public static /* synthetic */ Comparator A03() {
        Comparator<C5551Ki> comparator = A03;
        if (A02[1].charAt(25) != '8') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = CmcdData.Factory.STREAMING_FORMAT_HLS;
        strArr[5] = "u";
        return comparator;
    }
}
