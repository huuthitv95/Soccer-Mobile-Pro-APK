package com.fyber.inneractive.sdk.util;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.InputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.u */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9192u {
    /* JADX INFO: renamed from: a */
    public static Float m22019a(Uri uri) {
        int i;
        try {
            InputStream inputStreamOpenInputStream = IAConfigManager.f17654M.f17689u.f17785a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                int i2 = options.outHeight;
                if (i2 <= 0 || (i = options.outWidth) <= 0) {
                    inputStreamOpenInputStream.close();
                    return null;
                }
                Float fValueOf = Float.valueOf(i / i2);
                inputStreamOpenInputStream.close();
                return fValueOf;
                return null;
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            IAlog.m21946b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.m21942a(AbstractC9192u.class), e.getMessage());
        } catch (Exception e) {
            IAlog.m21946b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.m21942a(AbstractC9192u.class), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22020b(Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = IAConfigManager.f17654M.f17689u.f17785a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                String str = options.outMimeType;
                inputStreamOpenInputStream.close();
                return str;
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            IAlog.m21946b("%sFailed to retrieve image mime type. Reason: %s", IAlog.m21942a(AbstractC9192u.class), e.getMessage());
            return null;
        }
    }
}
