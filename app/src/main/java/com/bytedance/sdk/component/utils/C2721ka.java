package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2721ka {
    /* JADX INFO: renamed from: ri */
    public static Bitmap m10236ri(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (i > 0 && i2 > 0) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (i < width && i2 < height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(i / width, i2 / height);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                }
            } catch (Throwable th) {
                th.getMessage();
                return null;
            }
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: ri */
    public static byte[] m10237ri(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
