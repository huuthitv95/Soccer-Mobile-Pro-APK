package com.bytedance.adsdk.ugeno.jbs.p098ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.core.InterfaceC2229di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2275ik extends AbstractViewOnTouchListenerC2318ik<C2277ri> {
    protected ImageView.ScaleType akr;

    /* JADX INFO: renamed from: de */
    protected boolean f5723de;

    /* JADX INFO: renamed from: eu */
    private float f5724eu;

    /* JADX INFO: renamed from: ri */
    protected String f5725ri;
    private int xlq;

    /* JADX INFO: renamed from: zv */
    protected String f5726zv;
    private float zxp;

    public C2275ik(Context context) {
        super(context);
        this.akr = ImageView.ScaleType.FIT_XY;
        this.xlq = -1;
        this.zxp = -1.0f;
        this.f5724eu = -1.0f;
    }

    /* JADX INFO: renamed from: aw */
    private ImageView.ScaleType m7681aw(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }

    private void jbs() {
        if (TextUtils.isEmpty(this.f5725ri)) {
            return;
        }
        ((C2277ri) this.f5875fi).setImageDrawable(null);
        if (!this.f5725ri.startsWith("local://")) {
            if (!this.f5725ri.startsWith("@")) {
                m7693qt();
                return;
            } else {
                ((C2277ri) this.f5875fi).setImageResource(Integer.parseInt(this.f5725ri.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.f5725ri.replace("local://", "");
            if (TextUtils.equals(mo7680ik(), "raw")) {
                ((C2277ri) this.f5875fi).setImageResource(C2345ka.m8034ri(this.f5888lr, strReplace));
            } else {
                ((C2277ri) this.f5875fi).setImageResource(C2345ka.m8033lr(this.f5888lr, strReplace));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: qt */
    private void m7693qt() {
        if (this.zxp > 0.0f) {
            C2260fi.m7537ri().m7541lr().mo7949ri(this.jbs, this.f5725ri, new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1
                @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo7699ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (C2275ik.this.f5895pu != null) {
                            InterfaceC2229di unused = C2275ik.this.f5895pu;
                            return;
                        }
                        return;
                    }
                    if (C2275ik.this.f5895pu != null) {
                        InterfaceC2229di unused2 = C2275ik.this.f5895pu;
                    }
                    final Bitmap bitmapM8045ri = C2347mj.m8045ri(C2275ik.this.f5888lr, bitmap, (int) C2275ik.this.zxp);
                    if (bitmapM8045ri != null) {
                        C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((C2277ri) C2275ik.this.f5875fi).setImageBitmap(bitmapM8045ri);
                            }
                        });
                    }
                    if (C2275ik.this.f5723de || C2275ik.this.f5724eu > 0.0f) {
                        Bitmap bitmapM8045ri2 = C2347mj.m8045ri(C2275ik.this.f5888lr, bitmap, C2275ik.this.f5724eu > 0.0f ? (int) C2275ik.this.f5724eu : 10);
                        if (bitmapM8045ri2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(C2275ik.this.f5888lr.getResources(), bitmapM8045ri2);
                            C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((C2277ri) C2275ik.this.f5875fi).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        C2260fi.m7537ri().m7541lr().mo7948ri(this.jbs, this.f5725ri, (ImageView) this.f5875fi, ((C2277ri) this.f5875fi).getWidth(), ((C2277ri) this.f5875fi).getHeight(), new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.2
            @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo7699ri(Bitmap bitmap) {
                if (bitmap == null) {
                    if (C2275ik.this.f5895pu != null) {
                        InterfaceC2229di unused = C2275ik.this.f5895pu;
                    }
                } else if (C2275ik.this.f5895pu != null) {
                    InterfaceC2229di unused2 = C2275ik.this.f5895pu;
                }
            }
        });
        if (this.f5723de || this.f5724eu > 0.0f) {
            C2260fi.m7537ri().m7541lr().mo7949ri(this.jbs, this.f5725ri, new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.3
                @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo7699ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapM8045ri = C2347mj.m8045ri(C2275ik.this.f5888lr, bitmap, C2275ik.this.f5724eu > 0.0f ? (int) C2275ik.this.f5724eu : 10);
                    C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapM8045ri != null) {
                                ((C2277ri) C2275ik.this.f5875fi).setBackground(new BitmapDrawable(C2275ik.this.f5888lr.getResources(), bitmapM8045ri));
                            }
                        }
                    });
                }
            });
        }
    }

    public void bgr(String str) {
        this.f5725ri = str;
    }

    /* JADX INFO: renamed from: ik */
    protected String mo7680ik() {
        return this.f5726zv;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C2277ri mo7552ri() {
        C2277ri c2277ri = new C2277ri(this.f5888lr);
        c2277ri.m7722ri(this);
        return c2277ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        jbs();
        ((C2277ri) this.f5875fi).setScaleType(this.akr);
        ((C2277ri) this.f5875fi).setBorderColor(this.gcp);
        ((C2277ri) this.f5875fi).setCornerRadius(this.zyn);
        ((C2277ri) this.f5875fi).setBorderWidth(this.f5898qh);
        if (this.xlq != -1) {
            ((C2277ri) this.f5875fi).setColorFilter(this.xlq);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik, com.bytedance.adsdk.ugeno.InterfaceC2282ka
    /* JADX INFO: renamed from: mj */
    public void mo7698mj() {
        super.mo7698mj();
        Drawable drawable = ((C2277ri) this.f5875fi).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
            return;
        }
        cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.akr = m7681aw(str2);
                break;
            case "imageBlur":
                this.zxp = C2343ik.m8029ri(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.f5723de = C2343ik.m8032ri(str2, false);
                break;
            case "src":
                this.f5725ri = str2;
                break;
            case "tintColor":
                this.xlq = C2348ri.m8053ri(str2);
                break;
            case "imageBgBlur":
                this.f5724eu = C2343ik.m8029ri(str2, -1.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik, com.bytedance.adsdk.ugeno.InterfaceC2282ka
    public void xha() {
        super.xha();
        ((C2277ri) this.f5875fi).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ka.ik.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((C2277ri) C2275ik.this.f5875fi).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
                    return;
                }
                cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).start();
            }
        });
    }
}
