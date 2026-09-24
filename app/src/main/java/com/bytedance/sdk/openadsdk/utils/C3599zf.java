package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.zf */
/* JADX INFO: loaded from: classes3.dex */
public class C3599zf implements com.bytedance.sdk.component.p145fi.slm {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<ImageView> f13351ri;

    public C3599zf(ImageView imageView) {
        this.f13351ri = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8254ri(int i, String str, Throwable th) {
        ImageView imageView = this.f13351ri.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.p145fi.slm
    /* JADX INFO: renamed from: ri */
    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
        ImageView imageView = this.f13351ri.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (objMo9673lr instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objMo9673lr);
                return;
            }
            if (!(objMo9673lr instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
            }
            imageView.setImageDrawable((Drawable) objMo9673lr);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }
}
