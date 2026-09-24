package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.44 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C454144 {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC442224> SparseArray<T> A00(InterfaceC442123<T> interfaceC442123, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcelableSparseArray.put(sparseArray.keyAt(i), interfaceC442123.A6f(sparseArray.valueAt(i)));
        }
        return parcelableSparseArray;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC442224> AbstractC4978BP<T> A01(InterfaceC442123<T> interfaceC442123, List<Bundle> list) {
        C44382K c44382kA01 = AbstractC4978BP.A01();
        int i = 0;
        while (true) {
            int size = list.size();
            int i2 = A00[2].length();
            if (i2 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i < size) {
                c44382kA01.A04(interfaceC442123.A6f((Bundle) AbstractC45353y.A01(list.get(i))));
                i++;
            } else {
                return c44382kA01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC46115C.A0f(C454144.class.getClassLoader()));
        }
    }
}
