package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6386YN {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC6385YM enumC6385YM) {
        byte[] bArrDecode = Base64.decode(enumC6385YM.A01(AbstractC6334XX.A02), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(EnumC6385YM enumC6385YM) {
        byte[] bArrDecode = Base64.decode(enumC6385YM.A01(AbstractC6334XX.A02), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C6902gi c6902gi, EnumC6385YM enumC6385YM) {
        return new BitmapDrawable(c6902gi.getResources(), A01(enumC6385YM));
    }
}
