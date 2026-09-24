package com.bytedance.sdk.openadsdk.core.p200co;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.core.C2246sf;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2599fi;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr.C2603lr;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2727sf;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3181ri implements InterfaceC2324ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri$lr */
    private static class lr implements slm {

        /* JADX INFO: renamed from: ik */
        private final int f10523ik;

        /* JADX INFO: renamed from: ka */
        private final int f10524ka;

        /* JADX INFO: renamed from: lr */
        private final C3181ri f10525lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<ImageView> f10526ri;

        public lr(ImageView imageView, C3181ri c3181ri, int i, int i2) {
            this.f10526ri = new WeakReference<>(imageView);
            this.f10525lr = c3181ri;
            this.f10523ik = i;
            this.f10524ka = i2;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            try {
                final ImageView imageView = this.f10526ri.get();
                if (imageView == null) {
                    return;
                }
                final Object objMo9673lr = interfaceC2630sf.mo9673lr();
                if (objMo9673lr instanceof Drawable) {
                    dzy.m16411ri((Runnable) new AbstractRunnableC2676ik("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                                cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                            }
                            imageView.setImageDrawable((Drawable) objMo9673lr);
                        }
                    });
                    return;
                }
                if (!(objMo9673lr instanceof byte[])) {
                    if (objMo9673lr instanceof Bitmap) {
                        dzy.m16411ri((Runnable) new AbstractRunnableC2676ik("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objMo9673lr);
                            }
                        });
                    }
                } else {
                    if (interfaceC2630sf.mo9670fi()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.f10525lr.m13284ri((byte[]) objMo9673lr, imageView);
                            return;
                        } else {
                            this.f10525lr.m13280ri(imageView, (byte[]) objMo9673lr, this.f10523ik, this.f10524ka);
                            return;
                        }
                    }
                    if (this.f10525lr.m13287ri((byte[]) objMo9673lr)) {
                        this.f10525lr.m13280ri(imageView, (byte[]) objMo9673lr, this.f10523ik, this.f10524ka);
                        return;
                    }
                    final Bitmap bitmapM9687ri = new C2603lr(this.f10523ik, this.f10524ka, imageView.getScaleType(), Bitmap.Config.RGB_565, this.f10523ik, this.f10524ka).m9687ri((byte[]) objMo9673lr, new C2598di(C3299nr.m14642ri(), new C2599fi.ri().m9608ri(C3491ka.m15832lr()).m9609ri()));
                    if (bitmapM9687ri != null) {
                        dzy.m16411ri((Runnable) new AbstractRunnableC2676ik("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapM9687ri);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo13288ri(Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public Drawable m13277lr(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileM10332ri = xha.m10332ri(C3299nr.m14642ri(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileM10332ri);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileM10332ri));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(C3299nr.m14642ri().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th) {
                th = th;
                try {
                    C2707ac.m10206ri("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13278lr(final ImageView imageView, byte[] bArr, int i, int i2) {
        final Bitmap bitmapM9687ri = new C2603lr(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).m9687ri(bArr, new C2598di(C3299nr.m14642ri(), new C2599fi.ri().m9608ri(C3491ka.m15832lr()).m9609ri()));
        if (bitmapM9687ri != null) {
            dzy.m16411ri((Runnable) new AbstractRunnableC2676ik("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapM9687ri);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13280ri(final ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            m13278lr(imageView, bArr, i, i2);
            return;
        }
        try {
            final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (drawableDecodeDrawable != null) {
                dzy.m16411ri((Runnable) new AbstractRunnableC2676ik("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawableDecodeDrawable)) {
                            cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawableDecodeDrawable).start();
                        }
                        imageView.setImageDrawable(drawableDecodeDrawable);
                    }
                });
            }
        } catch (IOException e) {
            C2707ac.m10196ik("ImageLoaderProvider", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13281ri(C2246sf c2246sf, InterfaceC2624qt interfaceC2624qt, String str) {
        Map<String, Object> mapM7429lr;
        if (c2246sf == null || (mapM7429lr = c2246sf.m7429lr()) == null) {
            return;
        }
        Object obj = mapM7429lr.get("image_info");
        if (obj instanceof Map) {
            interfaceC2624qt.mo9665ri((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapM7429lr.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        interfaceC2624qt.mo9656lr(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13284ri(byte[] bArr, final ImageView imageView) {
        try {
            m13285ri(bArr, new ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.p200co.C3181ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo13288ri(final Drawable drawable) {
                    dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
                                cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e) {
            C2707ac.m10196ik("ImageLoaderProvider", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13285ri(final byte[] bArr, final ri riVar) {
        dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableM13277lr = C3181ri.this.m13277lr(bArr);
                ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.mo13288ri(drawableM13277lr);
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public void m13286lr(C2246sf c2246sf, String str, final InterfaceC2324ri.ri riVar) {
        InterfaceC2624qt interfaceC2624qtMo9652ik = C3491ka.m15834ri(str).mo9652ik(2);
        m13281ri(c2246sf, interfaceC2624qtMo9652ik, str);
        interfaceC2624qtMo9652ik.mo9659ri(new slm() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.5
            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8254ri(int i, String str2, Throwable th) {
                InterfaceC2324ri.ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.mo7699ri(null);
                }
            }

            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                if (interfaceC2630sf == null) {
                    riVar.mo7699ri(null);
                    return;
                }
                if (riVar != null) {
                    Object objMo9673lr = interfaceC2630sf.mo9673lr();
                    if (objMo9673lr instanceof Bitmap) {
                        riVar.mo7699ri((Bitmap) objMo9673lr);
                        return;
                    }
                    if (interfaceC2630sf.mo9673lr() instanceof byte[]) {
                        try {
                            riVar.mo7699ri(BitmapFactory.decodeByteArray((byte[]) interfaceC2630sf.mo9673lr(), 0, ((byte[]) interfaceC2630sf.mo9673lr()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    riVar.mo7699ri(null);
                }
            }
        }, 4);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri
    /* JADX INFO: renamed from: ri */
    public void mo7948ri(C2246sf c2246sf, String str, ImageView imageView, int i, int i2, InterfaceC2324ri.ri riVar) {
        String strM13170ri = C3155ka.m13170ri(str);
        InterfaceC2624qt interfaceC2624qtMo9652ik = C3491ka.m15834ri(strM13170ri).mo9652ik(1);
        m13281ri(c2246sf, interfaceC2624qtMo9652ik, strM13170ri);
        interfaceC2624qtMo9652ik.mo9659ri(new lr(imageView, this, i, i2), 4);
    }

    @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri
    /* JADX INFO: renamed from: ri */
    public void mo7949ri(C2246sf c2246sf, String str, InterfaceC2324ri.ri riVar) {
        m13286lr(c2246sf, C3155ka.m13170ri(str), riVar);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13287ri(byte[] bArr) {
        return C2727sf.m10279ri(bArr, 0);
    }
}
