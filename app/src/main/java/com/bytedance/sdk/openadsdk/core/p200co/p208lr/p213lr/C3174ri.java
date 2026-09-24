package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p213lr;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.InterfaceC2114ka;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.sdk.openadsdk.core.p200co.C3155ka;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3174ri extends AbstractViewOnTouchListenerC2318ik<C3173lr> {
    private boolean adz;
    protected HashMap<String, Bitmap> akr;

    /* JADX INFO: renamed from: de */
    protected ImageView.ScaleType f10442de;

    /* JADX INFO: renamed from: eu */
    private boolean f10443eu;
    private float evm;
    private float ezp;

    /* JADX INFO: renamed from: jm */
    private boolean f10444jm;

    /* JADX INFO: renamed from: ri */
    protected String f10445ri;
    private int tpb;
    private String xlq;

    /* JADX INFO: renamed from: zv */
    protected ImageView.ScaleType f10446zv;
    private boolean zxp;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri$1, reason: invalid class name */
    class AnonymousClass1 implements InterfaceC2114ka {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.p065lr.InterfaceC2114ka
        /* JADX INFO: renamed from: ri */
        public Bitmap mo6993ri(final C2127qt c2127qt) {
            final String strM7663ri;
            if (c2127qt == null) {
                return null;
            }
            String strM7063qt = c2127qt.m7063qt();
            String strJbs = c2127qt.jbs();
            if (!TextUtils.isEmpty(strM7063qt) && TextUtils.isEmpty(strJbs)) {
                strM7663ri = C2268lr.m7663ri(strM7063qt, C3174ri.this.f5886ka);
            } else if (!TextUtils.isEmpty(strJbs) && TextUtils.isEmpty(strM7063qt)) {
                strM7663ri = C2268lr.m7663ri(strJbs, C3174ri.this.f5886ka);
            } else if (TextUtils.isEmpty(strJbs) || TextUtils.isEmpty(strM7063qt)) {
                strM7663ri = null;
            } else {
                strM7663ri = C2268lr.m7663ri(strM7063qt, C3174ri.this.f5886ka) + C2268lr.m7663ri(strJbs, C3174ri.this.f5886ka);
            }
            if (TextUtils.isEmpty(strM7663ri)) {
                return null;
            }
            Bitmap bitmap = C3174ri.this.akr.get(strM7663ri);
            if (bitmap != null) {
                return bitmap;
            }
            C2260fi.m7537ri().m7541lr().mo7949ri(C3174ri.this.jbs, strM7663ri, new InterfaceC2324ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri.1.1
                @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo7699ri(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, c2127qt.m7064ri(), c2127qt.m7061lr(), false);
                        C3174ri.this.akr.put(strM7663ri, bitmapCreateScaledBitmap);
                        C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.lr.ri.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((C3173lr) C3174ri.this.f5875fi).m6526ri(c2127qt.m7062mj(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return C3174ri.this.akr.get(strM7663ri);
        }
    }

    public C3174ri(Context context) {
        super(context);
        this.xlq = "images";
        this.adz = true;
        this.evm = 1.0f;
        this.f10442de = ImageView.ScaleType.FIT_CENTER;
        this.f10446zv = ImageView.ScaleType.FIT_XY;
        this.akr = new HashMap<>();
    }

    /* JADX INFO: renamed from: aw */
    private String m13226aw(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    private ImageView.ScaleType bgr(String str) {
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
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    /* JADX INFO: renamed from: vr */
    private ImageView.ScaleType m13233vr(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
                return ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C3173lr mo7552ri() {
        C3173lr c3173lr = new C3173lr(this.f5888lr);
        c3173lr.m13225ri(this);
        return c3173lr;
    }

    /* JADX INFO: renamed from: ka */
    public void m13235ka() {
        if (this.f5875fi != 0) {
            ((C3173lr) this.f5875fi).m6527ri();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        ((C3173lr) this.f5875fi).setProgress(this.ezp);
        if (this.evm <= 0.0f) {
            this.evm = 1.0f;
        }
        ((C3173lr) this.f5875fi).setSpeed(this.evm);
        if (this.f10445ri.startsWith("local")) {
            ((C3173lr) this.f5875fi).setAnimation(m13226aw(this.f10445ri));
            ((C3173lr) this.f5875fi).setImageAssetsFolder(this.xlq);
        } else {
            ((C3173lr) this.f5875fi).setAnimationFromUrl(this.f10445ri);
        }
        ((C3173lr) this.f5875fi).setImageAssetDelegate(new AnonymousClass1());
        if (hcw()) {
            ((C3173lr) this.f5875fi).setScaleType(this.f10446zv);
        } else {
            ((C3173lr) this.f5875fi).setScaleType(this.f10442de);
        }
        if (hcw()) {
            ((C3173lr) this.f5875fi).setRepeatCount(this.tpb);
        } else {
            ((C3173lr) this.f5875fi).m6532ri(this.f10443eu);
        }
        if (!hcw()) {
            if (this.f5875fi != 0) {
                ((C3173lr) this.f5875fi).m6527ri();
            }
        } else {
            if (this.f5875fi == 0 || !this.adz) {
                return;
            }
            ((C3173lr) this.f5875fi).m6527ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13236ri(AnimatorListenerAdapter animatorListenerAdapter) {
        ((C3173lr) this.f5875fi).m6528ri(animatorListenerAdapter);
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
                this.f10446zv = m13233vr(str2);
                break;
            case "scaleType":
                this.f10442de = bgr(str2);
                break;
            case "progress":
                this.ezp = C2343ik.m8029ri(str2, 0.0f);
                break;
            case "imagePath":
                this.xlq = str2;
                break;
            case "autoReverse":
                this.zxp = C2343ik.m8032ri(str2, false);
                break;
            case "src":
                this.f10445ri = C3155ka.m13170ri(str2);
                break;
            case "loop":
                if (!hcw()) {
                    this.f10443eu = C2343ik.m8032ri(str2, false);
                    break;
                } else {
                    this.tpb = C2343ik.m8030ri(str2, 0);
                    break;
                }
                break;
            case "speed":
                this.evm = C2343ik.m8029ri(str2, 1.0f);
                break;
            case "autoPlay":
                this.f10444jm = C2343ik.m8032ri(str2, false);
                break;
            case "autoplay":
                this.adz = C2343ik.m8032ri(str2, true);
                break;
        }
    }
}
