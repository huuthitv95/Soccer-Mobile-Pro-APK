package com.bytedance.sdk.component.utils;

import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2715di {
    /* JADX INFO: renamed from: lr */
    public static boolean m10215lr(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m10216ri(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return options.outWidth > 0;
    }
}
