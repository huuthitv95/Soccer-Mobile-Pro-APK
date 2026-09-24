package com.mbridge.msdk.config.dynamic.utils.image;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.dynview.shape.C13973a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.image.b */
/* JADX INFO: compiled from: ImageOperateUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12906b {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.image.b$a */
    /* JADX INFO: compiled from: ImageOperateUtil.java */
    class a implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ImageView f34881a;

        a(ImageView imageView) {
            this.f34881a = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b("ImageOperateUtil", "图片下载失败: " + str + " URL: " + str2);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                ImageView imageView = this.f34881a;
                if (imageView instanceof ComponentImageView) {
                    ((ComponentImageView) imageView).setBitmap(bitmap);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th) {
                C13219q0.m37816b("ImageOperateUtil", "设置图片异常: " + th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m36176a(ImageView imageView, Bitmap bitmap) {
        m36177a(imageView, bitmap, 25.0f, Shader.TileMode.MIRROR);
    }

    /* JADX INFO: renamed from: b */
    public static void m36185b(final ImageView imageView, final Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        C13167a.m37542a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C12906b.m36186c(bitmap, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m36186c(Bitmap bitmap, final ImageView imageView) {
        final Bitmap bitmapM36183b = m36183b(bitmap);
        C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12906b.m36184b(bitmapM36183b, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m36187d(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: a */
    public static void m36177a(final ImageView imageView, final Bitmap bitmap, final float f, final Shader.TileMode tileMode) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            C13167a.m37542a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C12906b.m36172a(bitmap, f, tileMode, imageView);
                }
            });
        } else {
            imageView.setImageBitmap(bitmap);
            m36175a(imageView, f, tileMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36184b(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m36183b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    float f = iMin;
                    canvas.drawCircle(f, f, f, paint);
                    return bitmapCreateBitmap;
                }
            } catch (Throwable th) {
                C13219q0.m37816b("ImageOperateUtil", th.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36172a(Bitmap bitmap, float f, Shader.TileMode tileMode, final ImageView imageView) {
        final Bitmap bitmapM36171a = m36171a(bitmap, f, tileMode);
        C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C12906b.m36174a(bitmapM36171a, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36174a(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: a */
    public static void m36178a(final ImageView imageView, final Bitmap bitmap, final int i, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        final int iM36167a = m36167a(str);
        C13167a.m37542a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12906b.m36173a(bitmap, i, iM36167a, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36173a(Bitmap bitmap, int i, int i2, final ImageView imageView) {
        final Bitmap bitmapM36170a = m36170a(bitmap, i, i2);
        C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C12906b.m36187d(bitmapM36170a, imageView);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m36180a(final ImageView imageView, final Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            imageView.setImageBitmap(m36168a());
        } else if (bitmapArr.length == 1) {
            m36176a(imageView, bitmapArr[0]);
        } else {
            C13167a.m37542a().execute(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    C12906b.m36182a(bitmapArr, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36182a(Bitmap[] bitmapArr, final ImageView imageView) {
        final C13973a c13973aBuild;
        ArrayList arrayList = new ArrayList();
        for (Bitmap bitmap : bitmapArr) {
            arrayList.add(m36171a(bitmap, 25.0f, Shader.TileMode.MIRROR));
        }
        if (arrayList.size() <= 1 || (c13973aBuild = C13973a.m41819a().mo41838b((Bitmap) arrayList.get(0)).mo41835a((Bitmap) arrayList.get(1)).mo41834a(5).orientation(C13211m0.m37728G(C13008c.m36588n().m36542d())).build()) == null) {
            return;
        }
        C13167a.m37544c().post(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.utils.image.b$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageDrawable(c13973aBuild);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m36175a(View view, float f, Shader.TileMode tileMode) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (f <= 0.0f) {
                    f = 25.0f;
                }
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                view.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            }
        } catch (Throwable th) {
            C13219q0.m37816b("ImageOperateUtil", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m36171a(Bitmap bitmap, float f, Shader.TileMode tileMode) {
        if (f <= 0.0f) {
            f = 25.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (tileMode == null) {
                    tileMode = Shader.TileMode.MIRROR;
                }
                RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                cc$$ExternalSyntheticApiModelOutline0.m17133m();
                RenderNode renderNodeM17092m = cc$$ExternalSyntheticApiModelOutline0.m17092m("BlurEffect");
                cc$$ExternalSyntheticApiModelOutline0.m43984m$1();
                HardwareRenderer hardwareRendererM17087m = cc$$ExternalSyntheticApiModelOutline0.m17087m();
                hardwareRendererM17087m.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererM17087m.setContentRoot(renderNodeM17092m);
                renderNodeM17092m.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                renderNodeM17092m.setRenderEffect(renderEffectCreateBlurEffect);
                renderNodeM17092m.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNodeM17092m.endRecording();
                hardwareRendererM17087m.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                if (hardwareBuffer != null) {
                    Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                    imageAcquireNextImage.close();
                    hardwareBuffer.close();
                    return bitmapWrapHardwareBuffer;
                }
                return m36168a();
            }
            return m36169a(bitmap);
        } catch (Throwable th) {
            C13219q0.m37816b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m36169a(Bitmap bitmap) {
        try {
            Bitmap bitmapM36165a = C12905a.m36165a(bitmap, 10);
            if (bitmapM36165a != null && !bitmapM36165a.isRecycled()) {
                return bitmapM36165a;
            }
            return m36168a();
        } catch (Throwable th) {
            C13219q0.m37816b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m36168a() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor("#FF0000"));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            C13219q0.m37816b("ImageOperateUtil", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m36170a(Bitmap bitmap, float f, int i) {
        Bitmap bitmap2;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            bitmap2 = null;
            try {
                switch (i) {
                    case 0:
                        path.addRoundRect(rectF, f, f, Path.Direction.CW);
                        break;
                    case 1:
                        path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 2:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 3:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                        break;
                    case 4:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 5:
                        path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 6:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Path.Direction.CW);
                        break;
                    case 7:
                        path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                        break;
                    case 8:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 9:
                        path.addRoundRect(rectF, new float[]{f, f, 0.0f, 0.0f, f, f, 0.0f, 0.0f}, Path.Direction.CW);
                        break;
                    case 10:
                        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, f, f, 0.0f, 0.0f, f, f}, Path.Direction.CW);
                        break;
                }
                canvas.clipPath(path);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                th = th;
                C13219q0.m37816b("ImageOperateUtil", th.getMessage());
                return bitmap2;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m36167a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("corner")) {
            return 0;
        }
        String strReplace = str.replace("corner", "");
        if (TextUtils.isEmpty(strReplace)) {
            return 0;
        }
        String upperCase = strReplace.toUpperCase();
        upperCase.hashCode();
        upperCase.hashCode();
        switch (upperCase) {
            case "BA":
                return 6;
            case "BL":
                return 3;
            case "BR":
                return 4;
            case "LA":
                return 7;
            case "RA":
                return 8;
            case "TA":
                return 5;
            case "TL":
                return 1;
            case "TR":
                return 2;
            case "BLTR":
                return 10;
            case "TLBR":
                return 9;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m36181a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new a(imageView));
    }
}
