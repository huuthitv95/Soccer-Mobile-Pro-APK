package com.bytedance.adsdk.ugeno.yoga.p111lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.InterfaceC2324ri;
import com.bytedance.adsdk.ugeno.core.InterfaceC2229di;
import com.bytedance.adsdk.ugeno.jbs.p098ka.C2277ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.yoga.AbstractC2360qt;
import com.bytedance.adsdk.ugeno.yoga.EnumC2349aw;
import com.bytedance.adsdk.ugeno.yoga.EnumC2351di;
import com.bytedance.adsdk.ugeno.yoga.EnumC2352fi;
import com.bytedance.adsdk.ugeno.yoga.EnumC2354ka;
import com.bytedance.adsdk.ugeno.yoga.EnumC2361ri;
import com.bytedance.adsdk.ugeno.yoga.bgr;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2358ri extends C2320ri<C2356ik> {
    private EnumC2352fi akr;

    /* JADX INFO: renamed from: de */
    private bgr f6173de;

    /* JADX INFO: renamed from: eu */
    private AbstractC2360qt f6174eu;
    private EnumC2361ri xlq;

    /* JADX INFO: renamed from: zv */
    private EnumC2351di f6175zv;
    private EnumC2361ri zxp;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ri$ri */
    public static class ri extends C2320ri.ri {

        /* JADX INFO: renamed from: dw */
        public int f6182dw;
        public int dzy;
        private boolean feb;
        public int hcw;

        /* JADX INFO: renamed from: ig */
        public float f6183ig;
        public float igq;

        /* JADX INFO: renamed from: jc */
        private boolean f6184jc;

        /* JADX INFO: renamed from: kt */
        private boolean f6185kt;

        /* JADX INFO: renamed from: oh */
        public int f6186oh;
        public float ory;

        /* JADX INFO: renamed from: pv */
        public int f6187pv;

        /* JADX INFO: renamed from: qd */
        private boolean f6188qd;
        private boolean srn;

        /* JADX INFO: renamed from: su */
        public int f6189su;

        /* JADX INFO: renamed from: xd */
        public int f6190xd;

        /* JADX INFO: renamed from: zf */
        public float f6191zf;
        private boolean zyn;

        public ri(C2320ri c2320ri) {
            super(c2320ri);
            this.f6189su = 1;
            this.igq = 0.0f;
            this.f6191zf = 1.0f;
            this.f6182dw = EnumC2361ri.AUTO.m8176ri();
            this.ory = -1.0f;
            this.hcw = EnumC2349aw.RELATIVE.m8103ri();
        }

        /* JADX INFO: renamed from: ka */
        private void m8168ka() {
            if (this.f5937fr instanceof C2358ri) {
                if (((C2358ri) this.f5937fr).m8167xm() == EnumC2352fi.ROW && this.f5937fr.m7857pv() == -2 && this.f5944ri == -1.0f && !this.f5937fr.zyn()) {
                    this.f5944ri = -2.0f;
                    this.f6191zf = 1.0f;
                    this.igq = 1.0f;
                    this.f6188qd = true;
                    this.ory = -1.0f;
                }
                if (((C2358ri) this.f5937fr).m8167xm() == EnumC2352fi.COLUMN && this.f5937fr.m7842ig() == -2 && this.f5940lr == -1.0f && !this.f5937fr.zyn()) {
                    this.f5940lr = -2.0f;
                    this.f6191zf = 1.0f;
                    this.igq = 1.0f;
                    this.f6188qd = true;
                    this.ory = -1.0f;
                }
            }
        }

        /* JADX INFO: renamed from: ik */
        public boolean m8169ik() {
            if (this.f5944ri == -1.0f && this.f5940lr == -1.0f) {
                return false;
            }
            return this.f5944ri == -2.0f || this.f5940lr == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public C2356ik.ri mo7560ri() {
            m8168ka();
            C2356ik.ri riVar = new C2356ik.ri((int) this.f5944ri, (int) this.f5940lr);
            riVar.m8138co((int) (this.f5930ac ? this.f5935di : this.f5936fi));
            riVar.bgr((int) (this.ihz ? this.xha : this.f5936fi));
            riVar.m8147sf((int) (this.f5946uq ? this.f5941mj : this.f5936fi));
            riVar.m8136aw((int) (this.wjv ? this.jbs : this.f5936fi));
            riVar.m8146ri(this.f6189su);
            riVar.m8140fi(this.f6182dw);
            riVar.m8143lr(this.igq);
            riVar.m8141ik(this.f6191zf);
            riVar.slm(this.f5938ik);
            riVar.m8137bu(this.f5939ka);
            if (this.f6188qd) {
                riVar.m8142ka(this.ory);
            }
            riVar.m8139di(this.hcw);
            if (this.srn) {
                riVar.xha(this.f6186oh);
            }
            if (this.f6184jc) {
                riVar.jbs(this.f6190xd);
            }
            if (this.f6185kt) {
                riVar.m8144mj(this.dzy);
            }
            if (this.feb) {
                riVar.m8145qt(this.f6187pv);
            }
            if (this.zyn && m8169ik()) {
                float f = this.f6183ig;
                if (f > 0.0f) {
                    riVar.m8148vr(f);
                    riVar.m8141ik(0.0f);
                    riVar.m8143lr(0.0f);
                }
            }
            return riVar;
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo7561ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.mo7561ri(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.f6188qd = true;
                    float fM8029ri = C2343ik.m8029ri(str2, -1.0f);
                    this.ory = fM8029ri;
                    this.ory = C2347mj.m8043ri(context, fM8029ri);
                    break;
                case "bottom":
                    this.f6184jc = true;
                    this.f6190xd = (int) C2347mj.m8043ri(context, C2343ik.m8030ri(str2, 0));
                    break;
                case "top":
                    this.srn = true;
                    this.f6186oh = (int) C2347mj.m8043ri(context, C2343ik.m8030ri(str2, 0));
                    break;
                case "left":
                    this.f6185kt = true;
                    this.dzy = (int) C2347mj.m8043ri(context, C2343ik.m8030ri(str2, 0));
                    break;
                case "order":
                    this.f6189su = C2343ik.m8030ri(str2, 1);
                    break;
                case "ratio":
                    this.zyn = true;
                    this.f6183ig = C2343ik.m8029ri(str2, 0.0f);
                    break;
                case "right":
                    this.feb = true;
                    this.f6187pv = (int) C2347mj.m8043ri(context, C2343ik.m8030ri(str2, 0));
                    break;
                case "position":
                    this.hcw = EnumC2349aw.m8102ri(str2).m8103ri();
                    break;
                case "flexShrink":
                    this.f6191zf = C2343ik.m8029ri(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.igq = C2343ik.m8029ri(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.f6182dw = EnumC2361ri.m8175ri(str2).m8176ri();
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        public String toString() {
            return "LayoutParams{mOrder=" + this.f6189su + ", mFlexGrow=" + this.igq + ", mFlexShrink=" + this.f6191zf + ", mAlignSelf=" + this.f6182dw + ", mFlexBasis=" + this.ory + ", mPosition=" + this.hcw + ", mTop=" + this.f6186oh + ", mBottom=" + this.f6190xd + ", mLeft=" + this.dzy + ", mRight=" + this.f6187pv + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public C2358ri(Context context) {
        super(context);
        this.akr = EnumC2352fi.ROW;
        this.f6173de = bgr.NO_WRAP;
        this.f6175zv = EnumC2351di.FLEX_START;
        this.xlq = EnumC2361ri.STRETCH;
        this.zxp = EnumC2361ri.STRETCH;
    }

    /* JADX INFO: renamed from: ri */
    private void m8162ri(final C2277ri c2277ri) {
        this.f5875fi.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AbstractC2360qt abstractC2360qtM8132ri;
                if (C2358ri.this.f5875fi == null || (abstractC2360qtM8132ri = ((C2356ik) C2358ri.this.f5875fi).m8132ri(c2277ri)) == null) {
                    return;
                }
                int width = C2358ri.this.f5875fi.getWidth();
                abstractC2360qtM8132ri.mo8072ka(width);
                int height = C2358ri.this.f5875fi.getHeight();
                abstractC2360qtM8132ri.mo8062di(height);
                c2277ri.setCornerRadius(C2358ri.this.zyn);
                C2358ri.this.f5875fi.requestLayout();
                if (width > 0 || height > 0) {
                    C2358ri.this.f5875fi.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    protected void bgr() {
        if (this.hcw) {
            this.f6174eu.mo8076lr(EnumC2354ka.ALL, this.f5902su);
        }
        if (this.f5893oh) {
            this.f6174eu.mo8076lr(EnumC2354ka.LEFT, this.igq);
        }
        if (this.f5913xd) {
            this.f6174eu.mo8076lr(EnumC2354ka.RIGHT, this.f5918zf);
        }
        if (this.dzy) {
            this.f6174eu.mo8076lr(EnumC2354ka.TOP, this.f5870dw);
        }
        if (this.f5896pv) {
            this.f6174eu.mo8076lr(EnumC2354ka.BOTTOM, this.ory);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C2356ik mo7552ri() {
        C2356ik c2356ik = new C2356ik(this.f5888lr);
        c2356ik.m8133ri(this);
        this.f6174eu = c2356ik.getYogaNode();
        return c2356ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public ri mo7551qt() {
        return new ri(this);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        this.f6174eu.mo8090ri(this.akr);
        this.f6174eu.mo8088ri(this.f6173de);
        this.f6174eu.mo8089ri(this.f6175zv);
        this.f6174eu.mo8094ri(this.xlq);
        this.f6174eu.mo8069ik(this.zxp);
        this.f6174eu.mo8097ri(true);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    protected void mo7862ri(Drawable drawable) {
        C2277ri c2277ri = new C2277ri(this.f5888lr);
        c2277ri.setImageDrawable(drawable);
        if (!this.feb || this.srn == ImageView.ScaleType.FIT_XY) {
            c2277ri.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            c2277ri.setScaleType(this.srn);
        }
        c2277ri.setCornerRadius(this.zyn);
        C2356ik.ri riVar = new C2356ik.ri(-1, -1);
        riVar.m8139di(EnumC2349aw.ABSOLUTE.m8103ri());
        riVar.xha(0.0f);
        riVar.m8144mj(0.0f);
        if (this.f5875fi instanceof C2356ik) {
            ((C2356ik) this.f5875fi).addView(c2277ri, 0, riVar);
            m8162ri(c2277ri);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7661ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        super.mo7661ri(abstractViewOnTouchListenerC2318ik);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7822ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, ViewGroup.LayoutParams layoutParams) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
        View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
        if (viewM7879sf != null) {
            ((C2356ik) this.f5875fi).addView(viewM7879sf, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.xlq = EnumC2361ri.m8175ri(str2);
                break;
            case "flexDirection":
                this.akr = EnumC2352fi.m8115ri(str2);
                break;
            case "alignContent":
                this.zxp = EnumC2361ri.m8175ri(str2);
                break;
            case "flexWrap":
                this.f6173de = bgr.m8106ri(str2);
                break;
            case "justifyContent":
                this.f6175zv = EnumC2351di.m8111ri(str2);
                break;
        }
    }

    /* JADX INFO: renamed from: xm */
    public EnumC2352fi m8167xm() {
        return this.akr;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: zf */
    protected void mo7886zf() {
        if (this.f5887kt) {
            C2260fi.m7537ri().m7541lr().mo7949ri(this.jbs, this.f5897qd, new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.1
                @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
                /* JADX INFO: renamed from: ri */
                public void mo7699ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (C2358ri.this.f5895pu != null) {
                            InterfaceC2229di unused = C2358ri.this.f5895pu;
                            String unused2 = C2358ri.this.f5897qd;
                            return;
                        }
                        return;
                    }
                    if (C2358ri.this.f5895pu != null) {
                        InterfaceC2229di unused3 = C2358ri.this.f5895pu;
                        String unused4 = C2358ri.this.f5897qd;
                    }
                    final Bitmap bitmapM8045ri = C2347mj.m8045ri(C2358ri.this.f5888lr, bitmap, (int) C2358ri.this.f5883jc);
                    if (bitmapM8045ri != null) {
                        C2347mj.m8047ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C2358ri.this.mo7862ri(new BitmapDrawable(bitmapM8045ri));
                            }
                        });
                    }
                }
            });
            return;
        }
        C2277ri c2277ri = new C2277ri(this.f5888lr);
        C2260fi.m7537ri().m7541lr().mo7948ri(this.jbs, this.f5897qd, c2277ri, this.f5875fi.getWidth(), this.f5875fi.getHeight(), new InterfaceC2324ri.ri() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.2
            @Override // com.bytedance.adsdk.ugeno.InterfaceC2324ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo7699ri(Bitmap bitmap) {
                if (bitmap == null) {
                    if (C2358ri.this.f5895pu != null) {
                        InterfaceC2229di unused = C2358ri.this.f5895pu;
                        String unused2 = C2358ri.this.f5897qd;
                        return;
                    }
                    return;
                }
                if (C2358ri.this.f5895pu != null) {
                    InterfaceC2229di unused3 = C2358ri.this.f5895pu;
                    String unused4 = C2358ri.this.f5897qd;
                }
            }
        });
        if (!this.feb || this.srn == ImageView.ScaleType.FIT_XY) {
            c2277ri.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            c2277ri.setScaleType(this.srn);
        }
        c2277ri.setCornerRadius(this.zyn);
        C2356ik.ri riVar = new C2356ik.ri(-1, -1);
        riVar.m8139di(EnumC2349aw.ABSOLUTE.m8103ri());
        riVar.xha(0.0f);
        riVar.m8144mj(0.0f);
        if (this.f5875fi instanceof C2356ik) {
            ((C2356ik) this.f5875fi).addView(c2277ri, 0, riVar);
            m8162ri(c2277ri);
        }
    }
}
