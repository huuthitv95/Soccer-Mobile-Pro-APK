package com.bytedance.adsdk.ugeno.p106lr;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2320ri<E extends ViewGroup> extends AbstractViewOnTouchListenerC2318ik {

    /* JADX INFO: renamed from: ri */
    protected List<AbstractViewOnTouchListenerC2318ik<View>> f5929ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lr.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: ac */
        protected boolean f5930ac;

        /* JADX INFO: renamed from: aw */
        protected float f5931aw;

        /* JADX INFO: renamed from: ay */
        protected ViewGroup.LayoutParams f5932ay;
        protected float bgr;

        /* JADX INFO: renamed from: bu */
        protected boolean f5933bu;

        /* JADX INFO: renamed from: co */
        protected float f5934co;

        /* JADX INFO: renamed from: di */
        protected float f5935di;

        /* JADX INFO: renamed from: fi */
        protected float f5936fi;

        /* JADX INFO: renamed from: fr */
        protected C2320ri f5937fr;
        protected boolean ihz;
        protected float jbs;

        /* JADX INFO: renamed from: mj */
        protected float f5941mj;

        /* JADX INFO: renamed from: nr */
        protected boolean f5942nr;

        /* JADX INFO: renamed from: qt */
        protected float f5943qt;

        /* JADX INFO: renamed from: sf */
        protected float f5945sf;
        protected boolean slm;
        protected boolean tan;

        /* JADX INFO: renamed from: uq */
        protected boolean f5946uq;

        /* JADX INFO: renamed from: vr */
        protected boolean f5947vr;
        protected boolean wjv;
        protected float xha;

        /* JADX INFO: renamed from: ri */
        protected float f5944ri = -2.0f;

        /* JADX INFO: renamed from: lr */
        protected float f5940lr = -2.0f;

        /* JADX INFO: renamed from: ik */
        protected float f5938ik = 0.0f;

        /* JADX INFO: renamed from: ka */
        protected float f5939ka = 0.0f;

        public ri(C2320ri c2320ri) {
            this.f5937fr = c2320ri;
        }

        /* JADX INFO: renamed from: ri */
        public ViewGroup.LayoutParams mo7560ri() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.f5944ri, (int) this.f5940lr);
            marginLayoutParams.leftMargin = (int) (this.f5930ac ? this.f5935di : this.f5936fi);
            marginLayoutParams.rightMargin = (int) (this.ihz ? this.xha : this.f5936fi);
            marginLayoutParams.topMargin = (int) (this.f5946uq ? this.f5941mj : this.f5936fi);
            marginLayoutParams.bottomMargin = (int) (this.wjv ? this.jbs : this.f5936fi);
            return marginLayoutParams;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: ri */
        public void mo7561ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.hashCode();
            byte b = -1;
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        b = 0;
                    }
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        b = 1;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        b = 2;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        b = 3;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        b = 4;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        b = 5;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        b = 6;
                    }
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        b = 7;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        b = 8;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        b = 9;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        b = 10;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        b = Ascii.f22492FF;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        b = Ascii.f22490CR;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    this.f5945sf = C2347mj.m8044ri(context, str2);
                    this.slm = true;
                    break;
                case 1:
                    this.f5938ik = C2347mj.m8044ri(context, str2);
                    break;
                case 2:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f5940lr = -1.0f;
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.f5940lr = C2347mj.m8044ri(context, str2);
                    } else {
                        this.f5940lr = -2.0f;
                    }
                    break;
                case 3:
                    this.f5936fi = C2347mj.m8044ri(context, str2);
                    break;
                case 4:
                    this.f5941mj = C2347mj.m8044ri(context, str2);
                    this.f5946uq = true;
                    break;
                case 5:
                    this.f5943qt = C2347mj.m8044ri(context, str2);
                    this.f5947vr = true;
                    break;
                case 6:
                    this.jbs = C2347mj.m8044ri(context, str2);
                    this.wjv = true;
                    break;
                case 7:
                    this.f5939ka = C2347mj.m8044ri(context, str2);
                    break;
                case 8:
                    this.f5934co = C2347mj.m8044ri(context, str2);
                    this.f5942nr = true;
                    break;
                case 9:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.f5944ri = -1.0f;
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.f5944ri = C2347mj.m8044ri(context, str2);
                    } else {
                        this.f5944ri = -2.0f;
                    }
                    break;
                case 10:
                    this.bgr = C2347mj.m8044ri(context, str2);
                    this.tan = true;
                    break;
                case 11:
                    this.f5931aw = C2347mj.m8044ri(context, str2);
                    this.f5933bu = true;
                    break;
                case 12:
                    this.xha = C2347mj.m8044ri(context, str2);
                    this.ihz = true;
                    break;
                case 13:
                    this.f5935di = C2347mj.m8044ri(context, str2);
                    this.f5930ac = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.f5944ri + ", mHeight=" + this.f5940lr + ", mMargin=" + this.f5936fi + ", mMarginLeft=" + this.f5935di + ", mMarginRight=" + this.xha + ", mMarginTop=" + this.f5941mj + ", mMarginBottom=" + this.jbs + ", mParams=" + this.f5932ay + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public C2320ri(Context context) {
        this(context, null);
    }

    public C2320ri(Context context, C2320ri c2320ri) {
        super(context, c2320ri);
        this.f5929ri = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik */
    protected AbstractViewOnTouchListenerC2318ik mo7843ik(String str) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikXha;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f5867co) && this.f5890nd == 0) {
            return this;
        }
        if (this.f5890nd != 0) {
            return null;
        }
        for (AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik : this.f5929ri) {
            if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ikXha = abstractViewOnTouchListenerC2318ik.xha(str)) != 0) {
                return abstractViewOnTouchListenerC2318ikXha;
            }
        }
        return null;
    }

    public List<AbstractViewOnTouchListenerC2318ik<View>> jbs() {
        return this.f5929ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ka */
    protected AbstractViewOnTouchListenerC2318ik mo7847ka(String str) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7854mj;
        if (!TextUtils.isEmpty(str) && m7833co(str) != null) {
            return this;
        }
        for (AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik : this.f5929ri) {
            if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ikM7854mj = abstractViewOnTouchListenerC2318ik.m7854mj(str)) != 0) {
                return abstractViewOnTouchListenerC2318ikM7854mj;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public AbstractViewOnTouchListenerC2318ik mo7850lr(String str) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7835di;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f5867co)) {
            return this;
        }
        for (AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik : this.f5929ri) {
            if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ikM7835di = abstractViewOnTouchListenerC2318ik.m7835di(str)) != 0) {
                return abstractViewOnTouchListenerC2318ikM7835di;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
    }

    /* JADX INFO: renamed from: qt */
    public ri mo7551qt() {
        return new ri(this);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik mo7860ri(String str) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f5901sf)) {
            return this;
        }
        for (AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik : this.f5929ri) {
            if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7839fi(str)) != 0) {
                return abstractViewOnTouchListenerC2318ikM7839fi;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void mo7661ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
        View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
        if (viewM7879sf != null) {
            ((ViewGroup) this.f5875fi).addView(viewM7879sf);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo7822ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, ViewGroup.LayoutParams layoutParams) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
        View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
        if (viewM7879sf != null) {
            ((ViewGroup) this.f5875fi).addView(viewM7879sf, layoutParams);
        }
    }
}
