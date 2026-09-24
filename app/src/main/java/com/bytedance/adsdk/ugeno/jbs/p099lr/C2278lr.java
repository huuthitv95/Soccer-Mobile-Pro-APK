package com.bytedance.adsdk.ugeno.jbs.p099lr;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2278lr extends C2320ri<C2279ri> {
    private C2279ri akr;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jbs.lr.lr$ri */
    public static class ri extends C2320ri.ri {

        /* JADX INFO: renamed from: su */
        protected int f5769su;

        public ri(C2320ri c2320ri) {
            super(c2320ri);
            this.f5769su = -1;
        }

        /* JADX INFO: renamed from: lr */
        private int m7724lr(String str) {
            str.hashCode();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        /* JADX INFO: renamed from: ri */
        private int m7725ri(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iM7724lr = 0;
            for (String str2 : strArrSplit) {
                iM7724lr |= m7724lr(str2);
            }
            return iM7724lr;
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams mo7560ri() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.f5944ri, (int) this.f5940lr);
            layoutParams.leftMargin = (int) this.f5935di;
            layoutParams.rightMargin = (int) this.xha;
            layoutParams.topMargin = (int) this.f5941mj;
            layoutParams.bottomMargin = (int) this.jbs;
            layoutParams.gravity = this.f5769su;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo7561ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.mo7561ri(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.f5769su = m7725ri(str2);
            }
        }
    }

    public C2278lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public C2279ri mo7552ri() {
        C2279ri c2279ri = new C2279ri(this.f5888lr);
        this.akr = c2279ri;
        c2279ri.m7727ri(this);
        return this.akr;
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        this.akr.setEventMap(this.che);
        super.mo7550lr();
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: qt */
    public C2320ri.ri mo7551qt() {
        return new ri(this);
    }
}
