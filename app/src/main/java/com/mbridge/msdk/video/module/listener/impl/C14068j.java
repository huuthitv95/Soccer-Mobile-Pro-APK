package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13217p0;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.j */
/* JADX INFO: compiled from: RoundedImageLoaderListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14068j extends C14063e {

    /* JADX INFO: renamed from: d */
    private int f40542d;

    public C14068j(ImageView imageView, int i) {
        super(imageView);
        this.f40542d = i;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14063e, com.mbridge.msdk.foundation.same.image.InterfaceC13101c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        Bitmap bitmapM37810a;
        if (bitmap == null) {
            return;
        }
        try {
            if (this.f40535a == null || bitmap.isRecycled() || (bitmapM37810a = C13217p0.m37810a(bitmap, 1, this.f40542d)) == null) {
                return;
            }
            this.f40535a.setImageBitmap(bitmapM37810a);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
