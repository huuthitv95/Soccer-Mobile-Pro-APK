package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes7.dex */
public class MBImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private Bitmap f41174a;

    /* JADX INFO: renamed from: b */
    private String f41175b;

    /* JADX INFO: renamed from: com.mbridge.msdk.widget.MBImageView$a */
    class C14226a implements InterfaceC13101c {
        C14226a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            C13219q0.m37816b("mb-widget-imageview", str2 + " load failed:" + str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBImageView.this.setImageBitmap(bitmap);
        }
    }

    public MBImageView(Context context) {
        super(context);
        this.f41174a = null;
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41174a = null;
    }

    public MBImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41174a = null;
    }

    /* JADX INFO: renamed from: a */
    private void m42775a() {
        if (getContext() != null) {
            C13100b.m37152a(getContext()).m37155a(this.f41175b, new C14226a());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f41174a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else {
            C13219q0.m37816b("mb-widget-imageview", "onDraw bitmap recycled");
            m42775a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f41174a = bitmap;
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            if (!bitmap.isRecycled()) {
                super.setImageBitmap(bitmap);
                return;
            }
            this.f41174a = null;
            super.setImageBitmap(null);
            C13219q0.m37816b("mb-widget-imageview", "setImageBitmap recycled");
        }
    }

    public void setImageUrl(String str) {
        this.f41175b = str;
    }
}
