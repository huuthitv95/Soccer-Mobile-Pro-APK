package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.adexpress.dynamic.animation.p114ri.C2394lr;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2400ik;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2471fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.dynamic.p120lr.C2479ri;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.utils.C2709ay;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2412fi extends FrameLayout implements IAnimation, dzy, InterfaceC2429xd {

    /* JADX INFO: renamed from: uq */
    private static final View.OnTouchListener f6471uq = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener wjv = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    /* JADX INFO: renamed from: ac */
    private float f6472ac;

    /* JADX INFO: renamed from: aw */
    protected C2475mj f6473aw;
    protected DynamicRootView bgr;

    /* JADX INFO: renamed from: bu */
    protected C2394lr f6474bu;

    /* JADX INFO: renamed from: co */
    protected com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha f6475co;

    /* JADX INFO: renamed from: di */
    protected float f6476di;

    /* JADX INFO: renamed from: fi */
    protected float f6477fi;
    private C2709ay ihz;

    /* JADX INFO: renamed from: ik */
    protected float f6478ik;
    protected int jbs;

    /* JADX INFO: renamed from: ka */
    protected float f6479ka;

    /* JADX INFO: renamed from: lr */
    private float f6480lr;

    /* JADX INFO: renamed from: mj */
    protected int f6481mj;

    /* JADX INFO: renamed from: nr */
    C2400ik f6482nr;

    /* JADX INFO: renamed from: qt */
    protected int f6483qt;

    /* JADX INFO: renamed from: ri */
    private float f6484ri;

    /* JADX INFO: renamed from: sf */
    protected Context f6485sf;
    protected boolean slm;
    private float tan;

    /* JADX INFO: renamed from: vr */
    protected View f6486vr;
    protected int xha;

    public AbstractC2412fi(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context);
        this.f6485sf = context;
        this.bgr = dynamicRootView;
        this.f6473aw = c2475mj;
        this.f6478ik = c2475mj.m8612di();
        this.f6479ka = c2475mj.xha();
        this.f6477fi = c2475mj.m8625mj();
        this.f6476di = c2475mj.jbs();
        this.jbs = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6478ik);
        this.f6483qt = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6479ka);
        this.xha = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6477fi);
        this.f6481mj = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6476di);
        com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha xhaVar = new com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha(c2475mj.m8627qt());
        this.f6475co = xhaVar;
        if (xhaVar.m8711nr() > 0) {
            this.xha += this.f6475co.m8711nr() * 2;
            this.f6481mj += this.f6475co.m8711nr() * 2;
            this.jbs -= this.f6475co.m8711nr();
            this.f6483qt -= this.f6475co.m8711nr();
            List<C2475mj> listM8638sf = c2475mj.m8638sf();
            if (listM8638sf != null) {
                for (C2475mj c2475mj2 : listM8638sf) {
                    c2475mj2.m8617ik(c2475mj2.m8612di() + com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(this.f6485sf, this.f6475co.m8711nr()));
                    c2475mj2.m8620ka(c2475mj2.xha() + com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(this.f6485sf, this.f6475co.m8711nr()));
                    c2475mj2.m8630ri(com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(this.f6485sf, this.f6475co.m8711nr()));
                    c2475mj2.m8622lr(com.bytedance.sdk.component.adexpress.p124ka.xha.m8832lr(this.f6485sf, this.f6475co.m8711nr()));
                }
            }
        }
        this.slm = this.f6475co.bgr() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f6482nr = new C2400ik();
    }

    /* JADX INFO: renamed from: lr */
    private List<String> m8323lr(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && (i = i - 1) == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private void m8324ri() {
        if (isShown()) {
            int iM8734ri = C2479ri.m8734ri(this.f6475co);
            if (iM8734ri == 2) {
                if (this.ihz == null) {
                    this.ihz = new C2709ay(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.4
                };
                C2500aw renderRequest = this.bgr.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.m8893vr();
                    renderRequest.ihz();
                    renderRequest.tan();
                    return;
                }
                return;
            }
            if (iM8734ri == 3) {
                if (this.ihz == null) {
                    this.ihz = new C2709ay(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.5
                };
                C2500aw renderRequest2 = this.bgr.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.m8878bu();
                    renderRequest2.m8892uq();
                    renderRequest2.m8887nr();
                    renderRequest2.m8875ac();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private Drawable[] m8325ri(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(strArrSplit[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable gradientDrawableMo8332ri = mo8332ri(m8331ri(strArrSplit[0]), iArr);
                gradientDrawableMo8332ri.setShape(0);
                gradientDrawableMo8332ri.setCornerRadius(com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8727vr()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableMo8332ri;
            }
        }
        return drawableArr;
    }

    /* JADX INFO: renamed from: di */
    public void mo8309di() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.f6481mj);
        layoutParams.topMargin = this.f6483qt;
        layoutParams.leftMargin = this.jbs;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: fi */
    public boolean mo8326fi() {
        com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha xhaVar = this.f6475co;
        return (xhaVar == null || xhaVar.igq() == 0) ? false : true;
    }

    protected Drawable getBackgroundDrawable() {
        return m8330ri(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.slm;
    }

    public int getClickArea() {
        return this.f6475co.igq();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public InterfaceC2404ri getDynamicClickListener() {
        return this.bgr.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.f6481mj;
    }

    public C2470di getDynamicLayoutBrickValue() {
        C2471fi c2471fiM8627qt;
        C2475mj c2475mj = this.f6473aw;
        if (c2475mj == null || (c2471fiM8627qt = c2475mj.m8627qt()) == null) {
            return null;
        }
        return c2471fiM8627qt.m8592fi();
    }

    public int getDynamicWidth() {
        return this.xha;
    }

    public String getImageObjectFit() {
        return this.f6475co.m8730xm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.tan;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(m8325ri(m8323lr(this.f6475co.m8714pv().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.f6484ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f6480lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.f6472ac;
    }

    /* JADX INFO: renamed from: ik */
    public boolean m8327ik() {
        jbs();
        mo8309di();
        mo8312ka();
        return true;
    }

    /* JADX INFO: renamed from: ka */
    protected boolean mo8312ka() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.f6486vr;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (mo8326fi()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = f6471uq;
            onClickListener = wjv;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iM8734ri = C2479ri.m8734ri(this.f6475co);
            if (iM8734ri == 2 || iM8734ri == 3) {
                view2.setOnClickListener(wjv);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        m8335ri(view2);
        m8328lr(view2);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    /* JADX INFO: renamed from: lr */
    public void mo8296lr() {
        C2394lr c2394lr = this.f6474bu;
        if (c2394lr != null) {
            c2394lr.mo8296lr();
        }
    }

    /* JADX INFO: renamed from: lr */
    protected void m8328lr(View view) {
        C2470di c2470diM8592fi;
        C2475mj c2475mj = this.f6473aw;
        if (c2475mj == null || (c2470diM8592fi = c2475mj.m8627qt().m8592fi()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(c2470diM8592fi.smj()));
    }

    /* JADX INFO: renamed from: mj */
    protected boolean m8329mj() {
        C2475mj c2475mj = this.f6473aw;
        return c2475mj == null || c2475mj.m8627qt() == null || this.f6473aw.m8627qt().m8592fi() == null || this.f6473aw.m8627qt().m8592fi().xlq() == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xha();
        m8324ri();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        mo8296lr();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6482nr.m8303ri(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C2400ik c2400ik = this.f6482nr;
        View view = this.f6486vr;
        if (view == null) {
            view = this;
        }
        c2400ik.m8305ri(view, i, i2);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    protected Drawable m8330ri(boolean z, String str) {
        String[] strArrSplit;
        int[] iArr;
        if (!TextUtils.isEmpty(this.f6475co.m8714pv())) {
            try {
                String strM8714pv = this.f6475co.m8714pv();
                String strSubstring = strM8714pv.substring(strM8714pv.indexOf("(") + 1, strM8714pv.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha.m8692ri(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d > 225.0d && d < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableMo8332ri = mo8332ri(m8331ri(strArrSplit[0]), iArr);
                gradientDrawableMo8332ri.setShape(0);
                gradientDrawableMo8332ri.setCornerRadius(com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8727vr()));
                return gradientDrawableMo8332ri;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fM8833ri = com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8727vr());
        drawable.setCornerRadius(fM8833ri);
        if (fM8833ri < 1.0f) {
            float fM8833ri2 = com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.ory());
            float fM8833ri3 = com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.hcw());
            float fM8833ri4 = com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8712oh());
            float fM8833ri5 = com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8728xd());
            float[] fArr = new float[8];
            if (fM8833ri2 > 0.0f) {
                fArr[0] = fM8833ri2;
                fArr[1] = fM8833ri2;
            }
            if (fM8833ri3 > 0.0f) {
                fArr[2] = fM8833ri3;
                fArr[3] = fM8833ri3;
            }
            if (fM8833ri4 > 0.0f) {
                fArr[4] = fM8833ri4;
                fArr[5] = fM8833ri4;
            }
            if (fM8833ri5 > 0.0f) {
                fArr[6] = fM8833ri5;
                fArr[7] = fM8833ri5;
            }
            drawable.setCornerRadii(fArr);
        }
        drawable.setColor(z ? Color.parseColor(str) : this.f6475co.m8732zf());
        if (this.f6475co.m8696bu() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(this.f6485sf, this.f6475co.m8696bu()), this.f6475co.slm());
        } else if (this.f6475co.m8711nr() > 0) {
            drawable.setStroke(this.f6475co.m8711nr(), this.f6475co.slm());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.f6473aw.m8627qt().m8596lr(), "video-vd")) {
                setLayerType(1, null);
                return new tan((int) fM8833ri, this.f6475co.m8711nr());
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ri */
    protected GradientDrawable.Orientation m8331ri(String str) {
        try {
            int i = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            return i <= 270 ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* JADX INFO: renamed from: ri */
    protected GradientDrawable mo8332ri(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length != 1) {
            return new GradientDrawable(orientation, iArr);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iArr[0]);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    protected C2419lr mo8333ri(Bitmap bitmap) {
        return new C2424ri(bitmap, null);
    }

    /* JADX INFO: renamed from: ri */
    public void m8334ri(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha xhaVar = this.f6475co;
        if (xhaVar != null && xhaVar.m8720ri(i)) {
            jbs();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof AbstractC2412fi)) {
                    ((AbstractC2412fi) childAt).m8334ri(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m8335ri(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f6473aw.m8625mj());
            jSONObject.put("height", this.f6473aw.jbs());
            if (C2490ka.m8810lr()) {
                view.setTag(C2480ri.f6818ac, this.f6475co.m8703ig());
                view.setTag(C2480ri.ihz, this.f6473aw.m8627qt().m8596lr());
                view.setTag(C2480ri.f6832uq, this.f6473aw.m8616ik());
                view.setTag(C2480ri.wjv, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f6475co.m8703ig());
            view.setTag(2097610715, this.f6473aw.m8627qt().m8596lr());
            view.setTag(2097610714, this.f6473aw.m8616ik());
            view.setTag(2097610713, jSONObject.toString());
            int iM8734ri = C2479ri.m8734ri(this.f6475co);
            if (iM8734ri == 1) {
                view.setTag(2097610707, new Pair(this.f6475co.m8702fr(), Long.valueOf(this.f6475co.m8722su())));
                view.setTag(2097610708, Integer.valueOf(iM8734ri));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.tan = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.f6484ri = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.f6480lr = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.slm = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.f6472ac = f;
        this.f6482nr.m8304ri(this, f);
    }

    public void xha() {
        if (m8329mj()) {
            return;
        }
        View view = this.f6486vr;
        if (view == null) {
            view = this;
        }
        this.f6474bu = new C2394lr(view, this.f6473aw.m8627qt().m8592fi().xlq());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi.1
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC2412fi.this.f6474bu != null) {
                    AbstractC2412fi.this.f6474bu.m8299ri();
                }
            }
        });
    }
}
