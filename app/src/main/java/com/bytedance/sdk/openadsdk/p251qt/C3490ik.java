package com.bytedance.sdk.openadsdk.p251qt;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.qt.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3490ik implements slm {

    /* JADX INFO: renamed from: ik */
    private slm f12634ik;

    /* JADX INFO: renamed from: lr */
    private final String f12635lr = "ImageLoaderToViewWrapper";

    /* JADX INFO: renamed from: ri */
    private final WeakReference<ImageView> f12636ri;

    private C3490ik(ImageView imageView) {
        this.f12636ri = new WeakReference<>(imageView);
    }

    private C3490ik(ImageView imageView, slm slmVar) {
        this.f12636ri = new WeakReference<>(imageView);
        this.f12634ik = slmVar;
    }

    /* JADX INFO: renamed from: ri */
    public static slm m15828ri(wjv wjvVar, String str, ImageView imageView) {
        return new C3492lr(wjvVar, str, new C3490ik(imageView));
    }

    /* JADX INFO: renamed from: ri */
    public static slm m15829ri(wjv wjvVar, String str, ImageView imageView, slm slmVar) {
        return new C3492lr(wjvVar, str, new C3490ik(imageView, slmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15831ri(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(obj)) {
            cc$$ExternalSyntheticApiModelOutline0.m17094m(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8254ri(int i, String str, Throwable th) {
        slm slmVar = this.f12634ik;
        if (slmVar != null) {
            slmVar.mo8254ri(i, str, th);
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
        final ImageView imageView = this.f12636ri.get();
        if (imageView != null) {
            final Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (!(objMo9673lr instanceof Bitmap)) {
                if (objMo9673lr instanceof Drawable) {
                    if (dzy.m16391di()) {
                        m15831ri(objMo9673lr, imageView);
                        return;
                    } else {
                        C3332vr.m14976ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qt.ik.2
                            @Override // java.lang.Runnable
                            public void run() {
                                C3490ik.this.m15831ri(objMo9673lr, imageView);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            if (dzy.m16391di()) {
                imageView.setImageBitmap((Bitmap) objMo9673lr);
            } else {
                C3332vr.m14976ik().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qt.ik.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap((Bitmap) objMo9673lr);
                    }
                });
            }
            slm slmVar = this.f12634ik;
            if (slmVar != null) {
                slmVar.mo8255ri(interfaceC2630sf);
            }
        }
    }
}
