package com.fyber.inneractive.sdk.rtb.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.rtb.watermark.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C9111b {

    /* JADX INFO: renamed from: a */
    public ImageView f21362a;

    public C9111b(Context context, String str) {
        ImageView imageView = null;
        try {
            ImageView imageView2 = new ImageView(context);
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray == null) {
                IAlog.m21945a("Failed to decode watermark: Invalid image data", new Object[0]);
            } else {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
                imageView2.setBackground(bitmapDrawable);
                imageView2.setId(C7809R.id.ia_ext_watermark);
                imageView = imageView2;
            }
        } catch (Throwable th) {
            IAlog.m21944a("%s Error occurred when trying to create external watermark", th, "InneractiveWatermark");
        }
        this.f21362a = imageView;
    }
}
