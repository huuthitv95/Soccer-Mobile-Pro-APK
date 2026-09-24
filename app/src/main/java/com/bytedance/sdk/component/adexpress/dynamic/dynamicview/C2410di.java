package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2476qt;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.utils.C2718fr;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2410di extends AbstractC2412fi {

    /* JADX INFO: renamed from: ac */
    private static String f6453ac = "";
    private volatile boolean ihz;

    /* JADX INFO: renamed from: lr */
    private Runnable f6454lr;

    /* JADX INFO: renamed from: ri */
    private Runnable f6455ri;
    protected com.bytedance.sdk.component.adexpress.dynamic.p117ik.jbs tan;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di$ik */
    private static class ik implements InterfaceC2622mj {

        /* JADX INFO: renamed from: lr */
        private final int f6463lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<Context> f6464ri;

        public ik(Context context, int i) {
            this.f6464ri = new WeakReference<>(context);
            this.f6463lr = i;
        }

        @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
        /* JADX INFO: renamed from: ri */
        public Bitmap mo8253ri(Bitmap bitmap) {
            Context context = this.f6464ri.get();
            if (context != null) {
                return C2498ri.m8826ri(context, bitmap, this.f6463lr);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di$lr */
    private static class lr implements com.bytedance.sdk.component.p145fi.slm {

        /* JADX INFO: renamed from: lr */
        private final WeakReference<AbstractC2412fi> f6465lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<View> f6466ri;

        public lr(View view, AbstractC2412fi abstractC2412fi) {
            this.f6466ri = new WeakReference<>(view);
            this.f6465lr = new WeakReference<>(abstractC2412fi);
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            Object objMo9673lr;
            AbstractC2412fi abstractC2412fi;
            View view = this.f6466ri.get();
            if (view == null || (objMo9673lr = interfaceC2630sf.mo9673lr()) == null || interfaceC2630sf.mo9671ik() == null || (abstractC2412fi = this.f6465lr.get()) == null || !(objMo9673lr instanceof Bitmap)) {
                return;
            }
            view.setBackground(abstractC2412fi.mo8333ri((Bitmap) objMo9673lr));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di$ri */
    private static class ri implements com.bytedance.sdk.component.p145fi.slm {

        /* JADX INFO: renamed from: ik */
        private final C2475mj f6467ik;

        /* JADX INFO: renamed from: lr */
        private final WeakReference<DynamicRootView> f6468lr;

        /* JADX INFO: renamed from: ri */
        private final WeakReference<View> f6469ri;

        public ri(View view, DynamicRootView dynamicRootView, C2475mj c2475mj) {
            this.f6469ri = new WeakReference<>(view);
            this.f6468lr = new WeakReference<>(dynamicRootView);
            this.f6467ik = c2475mj;
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            Drawable bitmapDrawable;
            View view = this.f6469ri.get();
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (objMo9673lr instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objMo9673lr);
            } else if (objMo9673lr instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                    cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                }
                bitmapDrawable = (Drawable) objMo9673lr;
            } else {
                bitmapDrawable = null;
            }
            if (!C2490ka.m8810lr()) {
                DynamicRootView dynamicRootView = this.f6468lr.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().m8884ka()) || "splash_ad".equals(dynamicRootView.getRenderRequest().m8884ka())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            C2475mj c2475mj = this.f6467ik;
            if (c2475mj == null || c2475mj.m8627qt() == null || 6 != this.f6467ik.m8627qt().m8599ri() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public C2410di(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.ihz = true;
        setTag(Integer.valueOf(getClickArea()));
        String strM8596lr = c2475mj.m8627qt().m8596lr();
        if ("logo-union".equals(strM8596lr)) {
            dynamicRootView.setLogoUnionHeight(this.f6481mj - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, this.f6475co.m8708lr() + this.f6475co.m8718ri())));
        } else if ("scoreCountWithIcon".equals(strM8596lr)) {
            dynamicRootView.setScoreCountWithIcon(this.f6481mj - ((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, this.f6475co.m8708lr() + this.f6475co.m8718ri())));
        }
    }

    private static String getBuildModel() {
        try {
            f6453ac = C2718fr.m10224ri();
        } catch (Throwable unused) {
            f6453ac = Build.MODEL;
        }
        if (TextUtils.isEmpty(f6453ac)) {
            f6453ac = Build.MODEL;
        }
        return f6453ac;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public Drawable m8313ik(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    string = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable gradientDrawableRi = mo8332ri(m8331ri(string), iArr);
            gradientDrawableRi.setShape(0);
            gradientDrawableRi.setCornerRadius(com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8727vr()));
            return gradientDrawableRi;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private String m8314lr(String str) {
        try {
            Map<String, String> mapM8890sf = this.bgr.getRenderRequest().m8890sf();
            if (mapM8890sf != null && mapM8890sf.size() > 0) {
                return mapM8890sf.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private String m8316ri(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return m8316ri(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return m8316ri((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m8317ri() {
        if (this.ihz) {
            int iM8723ta = this.f6475co.m8723ta();
            int iBnj = this.f6475co.bnj();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.4
                @Override // java.lang.Runnable
                public void run() {
                    if (C2410di.this.bgr == null || C2410di.this.bgr.getRenderRequest() == null) {
                        C2410di c2410di = C2410di.this;
                        Context context = C2410di.this.f6485sf;
                        C2410di c2410di2 = C2410di.this;
                        c2410di.tan = new com.bytedance.sdk.component.adexpress.dynamic.p117ik.jbs(context, c2410di2, c2410di2.f6475co);
                    } else {
                        C2500aw renderRequest = C2410di.this.bgr.getRenderRequest();
                        C2476qt c2476qt = new C2476qt();
                        c2476qt.m8654ri(renderRequest.m8893vr());
                        c2476qt.m8650lr(renderRequest.slm());
                        c2476qt.m8645ik(renderRequest.m8878bu());
                        c2476qt.m8655ri(renderRequest.m8887nr());
                        c2476qt.m8651lr(renderRequest.tan());
                        c2476qt.m8646ik(renderRequest.m8875ac());
                        c2476qt.m8648ka(renderRequest.ihz());
                        c2476qt.m8643fi(renderRequest.m8892uq());
                        C2410di c2410di3 = C2410di.this;
                        Context context2 = C2410di.this.f6485sf;
                        C2410di c2410di4 = C2410di.this;
                        c2410di3.tan = new com.bytedance.sdk.component.adexpress.dynamic.p117ik.jbs(context2, c2410di4, c2410di4.f6475co, c2476qt, renderRequest);
                    }
                    C2410di c2410di5 = C2410di.this;
                    c2410di5.m8328lr(c2410di5.tan);
                    if (C2410di.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) C2410di.this.getParent()).setClipChildren(false);
                    }
                    C2410di.this.setClipChildren(false);
                    C2410di.this.tan.setTag(2);
                    C2410di c2410di6 = C2410di.this;
                    c2410di6.m8319ri((ViewGroup) c2410di6);
                    C2410di c2410di7 = C2410di.this;
                    c2410di7.addView(c2410di7.tan, new FrameLayout.LayoutParams(-1, -1));
                    C2410di.this.tan.m8442ik();
                }
            };
            this.f6455ri = runnable;
            postDelayed(runnable, ((long) iM8723ta) * 1000);
            if (this.f6475co.siy() || iBnj >= Integer.MAX_VALUE || iM8723ta >= iBnj) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.5
                @Override // java.lang.Runnable
                public void run() {
                    if (C2410di.this.tan != null) {
                        C2410di.this.ihz = false;
                        C2410di.this.tan.m8443ka();
                        C2410di.this.tan.setVisibility(4);
                        C2410di c2410di = C2410di.this;
                        c2410di.removeView(c2410di.tan);
                    }
                }
            };
            this.f6454lr = runnable2;
            postDelayed(runnable2, ((long) iBnj) * 1000);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8318ri(double d, final View view) {
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.jbs.m10234lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C2410di.this.f6473aw.m8627qt().m8592fi().xlq() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    C2410di.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m8319ri(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.p117ik.jbs) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m8321ri(InterfaceC2624qt interfaceC2624qt) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            interfaceC2624qt.mo9661ri(Bitmap.Config.ARGB_8888);
        }
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xha, this.f6481mj);
    }

    public boolean jbs() {
        int iSlm;
        int iMo9145bu;
        Drawable backgroundDrawable;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.f6486vr == null ? this : this.f6486vr;
        setContentDescription(this.f6473aw.m8629ri(this.f6475co.igq()));
        String strQmx = this.f6475co.qmx();
        String strM8877ay = null;
        String strM8316ri = (TextUtils.isEmpty(strQmx) || this.bgr == null || this.bgr.getRenderRequest() == null || this.bgr.getRenderRequest().m8883ik() == null || (jSONObjectOptJSONObject = this.bgr.getRenderRequest().m8883ik().optJSONObject("creative")) == null) ? null : m8316ri(jSONObjectOptJSONObject.opt(strQmx));
        if (TextUtils.isEmpty(strM8316ri)) {
            strM8316ri = this.f6475co.ihz();
        }
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        if (interfaceC2528ikM9166ik != null) {
            iSlm = interfaceC2528ikM9166ik.slm();
            iMo9145bu = interfaceC2528ikM9166ik.mo9145bu();
        } else {
            iSlm = 0;
            iMo9145bu = 0;
        }
        if (this.f6475co.m8693ac()) {
            int iTan = this.f6475co.tan();
            String str = this.f6475co.f6816lr;
            C2531ri.m9163ri().m9165fi().mo9680ri(str).mo9660ri(this.xha).mo9655lr(this.f6481mj).mo9654ka(iSlm).mo9651fi(iMo9145bu).mo9665ri(m8314lr(str)).mo9652ik(2).mo9663ri(new ik(this.f6485sf, iTan)).mo9658ri(new lr(view, this));
        } else if (!TextUtils.isEmpty(strM8316ri)) {
            if (!strM8316ri.startsWith("http:") && !strM8316ri.startsWith("https:")) {
                if (this.bgr != null && this.bgr.getRenderRequest() != null) {
                    strM8877ay = this.bgr.getRenderRequest().m8877ay();
                }
                strM8316ri = com.bytedance.sdk.component.adexpress.dynamic.p116fi.jbs.m8373lr(strM8316ri, strM8877ay);
            }
            InterfaceC2624qt interfaceC2624qtMo9652ik = C2531ri.m9163ri().m9165fi().mo9680ri(strM8316ri).mo9660ri(this.xha).mo9655lr(this.f6481mj).mo9654ka(iSlm).mo9651fi(iMo9145bu).mo9665ri(m8314lr(strM8316ri)).mo9652ik(1);
            m8321ri(interfaceC2624qtMo9652ik);
            interfaceC2624qtMo9652ik.mo9658ri(new ri(view, this.bgr, this.f6473aw));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f6475co.m8699dw() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C2410di.this.f6475co.dzy() > 0) {
                            C2410di c2410di = C2410di.this;
                            Drawable drawableM8313ik = c2410di.m8313ik(c2410di.bgr.getBgMaterialCenterCalcColor().get(Integer.valueOf(C2410di.this.f6475co.dzy())));
                            if (drawableM8313ik == null) {
                                C2410di c2410di2 = C2410di.this;
                                drawableM8313ik = c2410di2.m8330ri(true, c2410di2.bgr.getBgMaterialCenterCalcColor().get(Integer.valueOf(C2410di.this.f6475co.dzy())));
                            }
                            if (drawableM8313ik != null) {
                                view.setBackground(drawableM8313ik);
                                return;
                            }
                            View view2 = view;
                            C2410di c2410di3 = C2410di.this;
                            view2.setBackground(c2410di3.m8330ri(true, c2410di3.bgr.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f6475co.m8699dw() * 1000.0d));
        }
        if (this.f6486vr != null) {
            this.f6486vr.setPadding((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8704ik()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8708lr()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8706ka()), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8718ri()));
        }
        if (this.slm || this.f6475co.bgr() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.f6486vr == null ? this : this.f6486vr;
        double dM8462ac = this.f6473aw.m8627qt().m8592fi().m8462ac();
        if (dM8462ac < 90.0d && dM8462ac > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            com.bytedance.sdk.component.utils.jbs.m10234lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di.2
                @Override // java.lang.Runnable
                public void run() {
                    C2410di.this.setVisibility(8);
                }
            }, (long) (dM8462ac * 1000.0d));
        }
        m8318ri(this.f6473aw.m8627qt().m8592fi().tan(), view);
        if (!TextUtils.isEmpty(this.f6475co.m8707kt())) {
            m8317ri();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.f6455ri);
            removeCallbacks(this.f6454lr);
        } catch (Exception unused) {
        }
    }
}
