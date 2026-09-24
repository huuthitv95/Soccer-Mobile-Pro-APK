package com.bytedance.adsdk.ugeno.jbs.p100ri;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2271ri;
import com.bytedance.adsdk.ugeno.xha.C2345ka;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2280ri extends C2270lr {
    private boolean adz;

    /* JADX INFO: renamed from: de */
    private String f5772de;

    /* JADX INFO: renamed from: eu */
    private int f5773eu;
    private boolean ezp;

    /* JADX INFO: renamed from: jm */
    private int f5774jm;
    private C2348ri.ri tpb;
    private String xlq;

    /* JADX INFO: renamed from: zv */
    private String f5775zv;
    private String zxp;

    public C2280ri(Context context) {
        super(context);
        this.f5775zv = "row";
    }

    /* JADX INFO: renamed from: ka */
    private void m7728ka() {
        if (TextUtils.isEmpty(this.f5772de)) {
            return;
        }
        ((C2271ri) this.f5875fi).setCompoundDrawables(null, null, null, null);
        if (!this.f5772de.startsWith("local://")) {
            C2260fi.m7537ri().m7541lr().mo7949ri(this.jbs, this.f5772de, new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.jbs.ri.ri.1
                @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo7699ri(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jbs.ri.ri.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C2280ri.this.m7729lr(new BitmapDrawable(C2280ri.this.f5888lr.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            m7729lr(C2347mj.m8046ri(this.f5888lr, C2345ka.m8033lr(this.f5888lr, this.f5772de.replace("local://", ""))));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX INFO: renamed from: lr */
    public void m7729lr(Drawable drawable) {
        byte b;
        if (drawable == null) {
            return;
        }
        switch (this.f5775zv) {
            case "column_reverse":
                b = 2;
                break;
            case "column":
                b = 1;
                break;
            case "row_reverse":
                b = 0;
                break;
            case "row":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            ((C2271ri) this.f5875fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (b == 1) {
            ((C2271ri) this.f5875fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (b != 2) {
            ((C2271ri) this.f5875fi).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((C2271ri) this.f5875fi).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    protected void feb() {
        super.feb();
        if (this.adz) {
            ((C2271ri) this.f5875fi).setTextColor(this.akr);
        }
        if (this.ezp) {
            if (this.f5878hd) {
                m7875ri(this.sez);
            } else {
                m7848ka(this.f5881ig);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: kt */
    protected void mo7732kt() {
        super.mo7732kt();
        if (this.adz) {
            ((C2271ri) this.f5875fi).setTextColor(this.f5774jm);
        }
        if (this.ezp) {
            if (this.f5878hd) {
                m7875ri(this.tpb);
            } else {
                m7848ka(this.f5773eu);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        m7728ka();
        ((C2271ri) this.f5875fi).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "direction":
                this.f5775zv = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.f5774jm = C2348ri.m8053ri(str2);
                this.adz = true;
                break;
            case "image":
                this.f5772de = str2;
                break;
            case "highlightImage":
                this.xlq = str2;
                break;
            case "highlightBackgroundColor":
                if (C2348ri.m8049ik(str2)) {
                    this.f5878hd = true;
                    this.tpb = C2348ri.m8051lr(str2);
                } else {
                    this.f5773eu = C2348ri.m8053ri(str2);
                    this.f5878hd = false;
                }
                this.ezp = true;
                break;
            case "highlightBackgroundImage":
                this.zxp = str2;
                break;
        }
    }
}
