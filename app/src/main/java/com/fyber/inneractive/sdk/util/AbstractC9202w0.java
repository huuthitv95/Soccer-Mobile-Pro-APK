package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.w0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9202w0 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m22037a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            IAlog.m21945a("IAimageLoaderUtil failed stringToBitMap with %s", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m22038a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
