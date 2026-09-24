package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2401lr;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p113di.C2367ay;
import com.bytedance.sdk.component.adexpress.p113di.C2382qt;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.InterfaceC2631vr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf */
/* JADX INFO: loaded from: classes9.dex */
public class C2425sf extends C2410di {

    /* JADX INFO: renamed from: ri */
    private String f6534ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf$lr */
    private static class lr implements com.bytedance.sdk.component.p145fi.slm {

        /* JADX INFO: renamed from: lr */
        private Resources f6535lr;

        /* JADX INFO: renamed from: ri */
        private WeakReference<View> f6536ri;

        public lr(View view, Resources resources) {
            this.f6536ri = new WeakReference<>(view);
            this.f6535lr = resources;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            Object objMo9673lr;
            View view = this.f6536ri.get();
            if (view == null || (objMo9673lr = interfaceC2630sf.mo9673lr()) == null || interfaceC2630sf.mo9671ik() == null) {
                return;
            }
            if (objMo9673lr instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.f6535lr, (Bitmap) objMo9673lr));
            } else if (objMo9673lr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                    cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                }
                view.setBackground((Drawable) objMo9673lr);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf$ri */
    /* JADX INFO: loaded from: classes3.dex */
    private static class ri implements InterfaceC2622mj {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<Context> f6537ri;

        public ri(Context context) {
            this.f6537ri = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
        /* JADX INFO: renamed from: ri */
        public Bitmap mo8253ri(Bitmap bitmap) {
            Context context = this.f6537ri.get();
            if (context != null) {
                return C2498ri.m8826ri(context, bitmap, 25);
            }
            return null;
        }
    }

    public C2425sf(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        if (!TextUtils.isEmpty(this.f6475co.m8713pc()) && c2475mj.tan()) {
            C2382qt c2382qt = new C2382qt(context);
            c2382qt.setAnimationsLoop(this.f6475co.ajz());
            c2382qt.setImageLottieTosPath(this.f6475co.m8713pc());
            c2382qt.setLottieAppNameMaxLength(this.f6475co.m8725ud());
            c2382qt.setLottieAdTitleMaxLength(this.f6475co.luy());
            c2382qt.setLottieAdDescMaxLength(this.f6475co.m8733zk());
            c2382qt.setData(c2475mj.m8607ac());
            this.f6486vr = c2382qt;
        } else if (this.f6475co.m8727vr() > 0.0f) {
            this.f6486vr = new C2367ay(context);
            ((C2367ay) this.f6486vr).setXRound((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, this.f6475co.m8727vr()));
            ((C2367ay) this.f6486vr).setYRound((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, this.f6475co.m8727vr()));
        } else if (m8329mj() || !"arrowButton".equals(c2475mj.m8627qt().m8596lr())) {
            this.f6486vr = new ImageView(context);
        } else {
            C2401lr c2401lr = new C2401lr(context);
            c2401lr.setBrickNativeValue(this.f6475co);
            this.f6486vr = c2401lr;
        }
        this.f6534ri = getImageKey();
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(c2475mj.m8627qt().m8596lr())) {
            if (this.f6475co.m8708lr() > 0 || this.f6475co.m8718ri() > 0) {
                this.xha = Math.min(this.xha, this.f6481mj);
                this.f6481mj = Math.min(this.xha, this.f6481mj);
                this.jbs = (int) (this.jbs + com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, this.f6475co.m8708lr() + (this.f6475co.m8718ri() / 2) + 0.5f));
            } else {
                this.xha = Math.max(this.xha, this.f6481mj);
                this.f6481mj = Math.max(this.xha, this.f6481mj);
            }
            this.f6475co.m8719ri(this.xha / 2);
        }
        addView(this.f6486vr, new FrameLayout.LayoutParams(this.xha, this.f6481mj));
    }

    private String getImageKey() {
        Map<String, String> mapM8890sf = this.bgr.getRenderRequest().m8890sf();
        if (mapM8890sf == null || mapM8890sf.size() <= 0) {
            return null;
        }
        return mapM8890sf.get(this.f6475co.m8721sf());
    }

    /* JADX INFO: renamed from: ri */
    private boolean m8352ri() {
        String strM8697co = this.f6475co.m8697co();
        if (this.f6475co.m8693ac()) {
            return true;
        }
        if (TextUtils.isEmpty(strM8697co)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM8697co);
            return Math.abs((((float) this.xha) / (((float) this.f6481mj) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        int iMo9145bu;
        super.jbs();
        if (!TextUtils.isEmpty(this.f6475co.m8713pc())) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iSlm = 0;
        if ("arrowButton".equals(this.f6473aw.m8627qt().m8596lr())) {
            ((ImageView) this.f6486vr).setImageResource(C2729uq.m10305ka(this.f6485sf, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.f6486vr).getDrawable() != null) {
                ((ImageView) this.f6486vr).getDrawable().setAutoMirrored(true);
            }
            this.f6486vr.setPadding(0, 0, 0, 0);
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f6486vr.setBackgroundColor(this.f6475co.m8732zf());
        String strM8593ik = this.f6473aw.m8627qt().m8593ik();
        if ("user".equals(strM8593ik)) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f6486vr).setColorFilter(this.f6475co.xha());
            ((ImageView) this.f6486vr).setImageDrawable(C2729uq.m10303ik(getContext(), "tt_user"));
            ((ImageView) this.f6486vr).setPadding(this.xha / 10, this.f6481mj / 5, this.xha / 10, 0);
        } else if (strM8593ik != null && strM8593ik.startsWith("@")) {
            try {
                ((ImageView) this.f6486vr).setImageResource(Integer.parseInt(strM8593ik.substring(1)));
            } catch (Exception unused) {
            }
        }
        InterfaceC2631vr interfaceC2631vrM9165fi = C2531ri.m9163ri().m9165fi();
        String strM8721sf = this.f6475co.m8721sf();
        if (!TextUtils.isEmpty(strM8721sf) && !strM8721sf.startsWith("http:") && !strM8721sf.startsWith("https:")) {
            strM8721sf = com.bytedance.sdk.component.adexpress.dynamic.p116fi.jbs.m8373lr(strM8721sf, (this.bgr == null || this.bgr.getRenderRequest() == null) ? null : this.bgr.getRenderRequest().m8877ay());
        }
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        if (interfaceC2528ikM9166ik != null) {
            iSlm = interfaceC2528ikM9166ik.slm();
            iMo9145bu = interfaceC2528ikM9166ik.mo9145bu();
        } else {
            iMo9145bu = 0;
        }
        InterfaceC2624qt interfaceC2624qtMo9651fi = interfaceC2631vrM9165fi.mo9680ri(strM8721sf).mo9665ri(this.f6534ri).mo9660ri(this.xha).mo9655lr(this.f6481mj).mo9654ka(iSlm).mo9651fi(iMo9145bu);
        String strBgr = this.bgr.getRenderRequest().bgr();
        if (!TextUtils.isEmpty(strBgr)) {
            interfaceC2624qtMo9651fi.mo9656lr(strBgr);
        }
        if (m8352ri()) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.FIT_CENTER);
            interfaceC2624qtMo9651fi.mo9661ri(Bitmap.Config.ARGB_4444).mo9652ik(2).mo9663ri(new ri(this.f6485sf)).mo9658ri(new lr(this.f6486vr, getResources()));
        } else {
            if (C2490ka.m8810lr()) {
                interfaceC2624qtMo9651fi.mo9652ik(1).mo9657ri((ImageView) this.f6486vr);
            }
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.f6486vr instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.f6486vr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.f6486vr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
            return;
        }
        cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.f6486vr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawable)) {
            return;
        }
        cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawable).stop();
    }
}
