package com.bytedance.adsdk.ugeno.p093fi;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2261di extends C2320ri<C2262fi> {
    private int akr;

    /* JADX INFO: renamed from: de */
    private int f5639de;
    private int xlq;

    /* JADX INFO: renamed from: zv */
    private int f5640zv;
    private int zxp;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.di$ri */
    public static class ri extends C2320ri.ri {

        /* JADX INFO: renamed from: dw */
        public int f5641dw;
        public int dzy;
        public int hcw;
        public float igq;

        /* JADX INFO: renamed from: oh */
        public int f5642oh;
        public float ory;

        /* JADX INFO: renamed from: su */
        public int f5643su;

        /* JADX INFO: renamed from: xd */
        public int f5644xd;

        /* JADX INFO: renamed from: zf */
        public float f5645zf;

        public ri(C2320ri c2320ri) {
            super(c2320ri);
            this.f5643su = 1;
            this.igq = 0.0f;
            this.f5645zf = 0.0f;
            this.f5641dw = -1;
            this.ory = -1.0f;
            this.hcw = -1;
            this.f5642oh = -1;
            this.f5644xd = ViewCompat.MEASURED_SIZE_MASK;
            this.dzy = ViewCompat.MEASURED_SIZE_MASK;
        }

        /* JADX INFO: renamed from: fi */
        private int m7554fi(String str) {
            str.hashCode();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        /* JADX INFO: renamed from: ik */
        private float m7555ik(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: ka */
        private float m7556ka(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX INFO: renamed from: lr */
        private float m7557lr(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: ri */
        private int m7558ri(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public C2262fi.ri mo7560ri() {
            C2262fi.ri riVar = new C2262fi.ri((int) this.f5944ri, (int) this.f5940lr);
            riVar.leftMargin = (int) this.f5935di;
            riVar.rightMargin = (int) this.xha;
            riVar.topMargin = (int) this.f5941mj;
            riVar.bottomMargin = (int) this.jbs;
            riVar.m7595ik(this.f5643su);
            riVar.m7597ka(this.f5641dw);
            riVar.m7604ri(this.igq);
            riVar.m7599lr(this.f5645zf);
            riVar.m7594ik(this.ory);
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
                case "flexBasisPercent":
                    this.ory = m7556ka(str2);
                    break;
                case "order":
                    this.f5643su = m7558ri(str2);
                    break;
                case "flexShrink":
                    this.f5645zf = m7555ik(str2);
                    break;
                case "flexGrow":
                    this.igq = m7557lr(str2);
                    break;
                case "alignSelf":
                    this.f5641dw = m7554fi(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        public String toString() {
            return "LayoutParams{mWidth=" + this.f5944ri + ", mHeight=" + this.f5940lr + ", mMargin=" + this.f5936fi + ", mMarginLeft=" + this.f5935di + ", mMarginRight=" + this.xha + ", mMarginTop=" + this.f5941mj + ", mMarginBottom=" + this.jbs + ", mParams=" + this.f5932ay + ", mOrder=" + this.f5643su + ", mFlexGrow=" + this.igq + ", mFlexShrink=" + this.f5645zf + ", mAlignSelf=" + this.f5641dw + ", mFlexBasisPercent=" + this.ory + ", mMinWidth=" + this.hcw + ", mMinHeight=" + this.f5642oh + ", mMaxWidth=" + this.f5644xd + ", mMaxHeight=" + this.dzy + "} " + super.toString();
        }
    }

    public C2261di(Context context) {
        super(context);
    }

    private int bgr(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX INFO: renamed from: bu */
    private int m7546bu(String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 5;
                break;
            case "center":
                b = 2;
                break;
            case "space_around":
                b = 3;
                break;
            case "flex_start":
                b = 0;
                break;
            case "space_between":
                b = 4;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b != 3) {
            return b != 4 ? 5 : 3;
        }
        return 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private int slm(String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 4;
                break;
            case "baseline":
                b = 3;
                break;
            case "center":
                b = 2;
                break;
            case "flex_start":
                b = 0;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b != 2) {
            return b != 3 ? 4 : 3;
        }
        return 2;
    }

    /* JADX INFO: renamed from: vr */
    private int m7547vr(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: aw */
    int m7548aw(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C2262fi mo7552ri() {
        C2262fi c2262fi = new C2262fi(this.f5888lr);
        c2262fi.m7587ri(this);
        return c2262fi;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        ((C2262fi) this.f5875fi).setFlexDirection(this.akr);
        ((C2262fi) this.f5875fi).setFlexWrap(this.f5639de);
        ((C2262fi) this.f5875fi).setJustifyContent(this.f5640zv);
        ((C2262fi) this.f5875fi).setAlignItems(this.xlq);
        ((C2262fi) this.f5875fi).setAlignContent(this.zxp);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: qt */
    public C2320ri.ri mo7551qt() {
        return new ri(this);
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
            case "alignItems":
                this.xlq = slm(str2);
                break;
            case "flexDirection":
                this.akr = m7548aw(str2);
                break;
            case "alignContent":
                this.zxp = m7546bu(str2);
                break;
            case "flexWrap":
                this.f5639de = bgr(str2);
                break;
            case "justifyContent":
                this.f5640zv = m7547vr(str2);
                break;
        }
    }
}
