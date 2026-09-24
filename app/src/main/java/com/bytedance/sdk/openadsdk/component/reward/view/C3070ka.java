package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.component.reward.C2993lr;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractC3217fi;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.facebook.internal.security.CertificateUtil;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3070ka extends C3191fi {

    /* JADX INFO: renamed from: di */
    private TextView f9607di;

    /* JADX INFO: renamed from: fi */
    private TextView f9608fi;

    /* JADX INFO: renamed from: ik */
    private TextView f9609ik;

    /* JADX INFO: renamed from: ka */
    private C3335bu f9610ka;

    /* JADX INFO: renamed from: lr */
    private TextView f9611lr;

    /* JADX INFO: renamed from: mj */
    private C3022ri f9612mj;

    /* JADX INFO: renamed from: ri */
    private slm f9613ri;
    private boolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.view.ka$ri */
    private static class ri implements com.bytedance.sdk.component.p145fi.slm {

        /* JADX INFO: renamed from: ik */
        private final String f9621ik;

        /* JADX INFO: renamed from: ka */
        private final WeakReference<ImageView> f9622ka;

        /* JADX INFO: renamed from: lr */
        private final String f9623lr;

        /* JADX INFO: renamed from: ri */
        private final wjv f9624ri;

        public ri(ImageView imageView, wjv wjvVar, String str, String str2) {
            this.f9622ka = new WeakReference<>(imageView);
            this.f9624ri = wjvVar;
            this.f9623lr = str;
            this.f9621ik = str2;
        }

        /* JADX INFO: renamed from: ri */
        private void m12291ri(final int i, final String str, final String str2) {
            C3414ik.m15533ri(new AbstractRunnableC2676ik("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i);
                        jSONObject.put("description", i + CertificateUtil.DELIMITER + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    C3414ik.m15522lr(ri.this.f9624ri, ri.this.f9621ik, "load_vast_icon_fail", jSONObject);
                }
            });
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8254ri(int i, String str, Throwable th) {
            m12291ri(i, str, this.f9623lr);
        }

        @Override // com.bytedance.sdk.component.p145fi.slm
        /* JADX INFO: renamed from: ri */
        public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            Object objMo9673lr = interfaceC2630sf.mo9673lr();
            if (objMo9673lr != null) {
                ImageView imageView = this.f9622ka.get();
                if (objMo9673lr instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objMo9673lr);
                    }
                } else if (objMo9673lr instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m(objMo9673lr)) {
                        cc$$ExternalSyntheticApiModelOutline0.m17094m(objMo9673lr).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objMo9673lr);
                    }
                }
                C3414ik.m15522lr(this.f9624ri, this.f9621ik, "load_vast_icon_success", (JSONObject) null);
            }
        }
    }

    public C3070ka(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    /* JADX INFO: renamed from: di */
    private void m12276di() {
        Context context = getContext();
        setPadding(C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 24.0f));
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(0);
        c3191fi.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C3583qd.m16589lr(context, 12.0f);
        addView(c3191fi, layoutParams);
        C3335bu c3335bu = new C3335bu(context);
        this.f9610ka = c3335bu;
        c3335bu.setBackgroundColor(0);
        this.f9610ka.setId(com.bytedance.sdk.openadsdk.utils.slm.f13282ka);
        c3191fi.addView(this.f9610ka, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 48.0f), C3583qd.m16589lr(context, 48.0f)));
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(c3191fi2, layoutParams2);
        C3195mj c3195mj = new C3195mj(context);
        this.f9608fi = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.f9608fi.setGravity(16);
        this.f9608fi.setSingleLine(true);
        this.f9608fi.setTextSize(2, 17.0f);
        this.f9608fi.setId(com.bytedance.sdk.openadsdk.utils.slm.f13268fi);
        this.f9608fi.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3191fi2.addView(this.f9608fi, new LinearLayout.LayoutParams(-1, -2));
        slm slmVar = new slm(context);
        this.f9613ri = slmVar;
        slmVar.setId(com.bytedance.sdk.openadsdk.utils.slm.xha);
        c3191fi2.addView(this.f9613ri, new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f)));
        C3195mj c3195mj2 = new C3195mj(context);
        this.f9611lr = c3195mj2;
        c3195mj2.setGravity(17);
        this.f9611lr.setEllipsize(TextUtils.TruncateAt.END);
        this.f9611lr.setSingleLine(true);
        this.f9611lr.setTextColor(-1);
        this.f9611lr.setTextSize(2, 16.0f);
        this.f9611lr.setId(520093705);
        this.f9611lr.setBackground(m12282ri(context));
        this.f9611lr.setText(this.f9612mj.f9389lr.skk());
        addView(this.f9611lr, new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(context, 36.0f)));
    }

    /* JADX INFO: renamed from: fi */
    private void m12277fi() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 12.0f), C3583qd.m16589lr(context, 16.0f), C3583qd.m16589lr(context, 12.0f));
        C3335bu c3335bu = new C3335bu(context);
        this.f9610ka = c3335bu;
        c3335bu.setBackgroundColor(0);
        this.f9610ka.setId(com.bytedance.sdk.openadsdk.utils.slm.f13282ka);
        addView(this.f9610ka, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 48.0f), C3583qd.m16589lr(context, 48.0f)));
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = C3583qd.m16589lr(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(c3191fi, layoutParams);
        C3195mj c3195mj = new C3195mj(context);
        this.f9608fi = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.f9608fi.setGravity(16);
        this.f9608fi.setSingleLine(true);
        this.f9608fi.setTextSize(2, 17.0f);
        this.f9608fi.setId(com.bytedance.sdk.openadsdk.utils.slm.f13268fi);
        this.f9608fi.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3191fi.addView(this.f9608fi, new LinearLayout.LayoutParams(-1, -2));
        slm slmVar = new slm(context);
        this.f9613ri = slmVar;
        slmVar.setId(com.bytedance.sdk.openadsdk.utils.slm.xha);
        c3191fi.addView(this.f9613ri, new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(context, 14.0f)));
        C3195mj c3195mj2 = new C3195mj(context);
        this.f9611lr = c3195mj2;
        c3195mj2.setGravity(17);
        this.f9611lr.setEllipsize(TextUtils.TruncateAt.END);
        this.f9611lr.setSingleLine(true);
        this.f9611lr.setTextColor(-1);
        this.f9611lr.setTextSize(2, 16.0f);
        this.f9611lr.setId(520093705);
        this.f9611lr.setBackground(m12282ri(context));
        this.f9611lr.setText(this.f9612mj.f9389lr.skk());
        addView(this.f9611lr, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 164.0f), C3583qd.m16589lr(context, 36.0f)));
    }

    private String getCnOrEnBtnText() {
        return this.f9612mj.f9389lr.adz() != 4 ? "View" : "Install";
    }

    /* JADX INFO: renamed from: ik */
    private static Drawable m12278ik(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(context, 8.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ka */
    private void m12279ka() {
        this.xha = true;
        wjv wjvVar = this.f9612mj.f9389lr;
        int iM14453nd = wjvVar.m14453nd();
        if ((iM14453nd == 43 || iM14453nd == 44) && C3279dw.m14092lr(wjvVar)) {
            m12285ik();
        } else if (this.f9612mj.bnj == 1) {
            m12276di();
        } else {
            m12277fi();
        }
        if (this.f9611lr == null) {
            this.f9611lr = (TextView) this.f9612mj.f9396pv.findViewById(520093705);
        }
        TextView textView = this.f9611lr;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int width = ((ViewGroup) C3070ka.this.f9611lr.getParent()).getWidth();
                    if (width > 0) {
                        C3070ka.this.f9611lr.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!wjvVar.m14576zz()) {
                this.f9611lr.setText(wjvVar.jxw() == 3 ? getButtonTextForNewStyleBar() : wjvVar.skk());
            } else if (wjvVar.m14525sr() != null && TextUtils.isEmpty(wjvVar.m14525sr().m12533di())) {
                C3583qd.m16612ri((View) this.f9611lr, 8);
            }
        }
        if (this.f9610ka != null && wjvVar.m14391fb() != null && !TextUtils.isEmpty(wjvVar.m14391fb().m14220ri())) {
            String strM14220ri = wjvVar.m14391fb().m14220ri();
            if (wjvVar.m14576zz()) {
                C3491ka.m15833ri(wjvVar.m14391fb()).mo9652ik(1).mo9658ri(new C3492lr(wjvVar, wjvVar.m14391fb().m14220ri(), new ri(this.f9610ka, wjvVar, strM14220ri, this.f9612mj.f9381fi)));
                if (wjvVar.m14525sr() != null && wjvVar.m14525sr().m12541lr() != null) {
                    wjvVar.m14525sr().m12541lr().m12425lr(0L);
                }
            } else {
                C2751lr.m10463lr().m10470ri(wjvVar.m14391fb(), this.f9610ka, wjvVar);
            }
        }
        TextView textView2 = this.f9608fi;
        if (textView2 != null) {
            textView2.setText(wjvVar.m14559xh());
        }
        TextView textView3 = this.f9607di;
        if (textView3 != null) {
            textView3.setText(m12284ri(wjvVar));
        }
        if (this.f9609ik != null) {
            String strWjv = C3279dw.wjv(this.f9612mj.f9389lr);
            if (TextUtils.isEmpty(strWjv)) {
                strWjv = "Play now";
            }
            this.f9609ik.setText(strWjv);
            this.f9609ik.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C3070ka.this.f9612mj != null) {
                        C2993lr.m11712ri(C3070ka.this.f9612mj);
                    }
                }
            });
        }
        slm slmVar = this.f9613ri;
        if (slmVar != null) {
            C3583qd.m16618ri((TextView) null, slmVar, wjvVar);
        }
        if (this.f9612mj.bnj == 2 && wjvVar.jxw() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9611lr.getLayoutParams();
            layoutParams.height = C3583qd.m16589lr(this.f9612mj.srn, 55.0f);
            layoutParams.topMargin = C3583qd.m16589lr(this.f9612mj.srn, 20.0f);
            this.f9611lr.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = C3583qd.m16589lr(this.f9612mj.srn, 12.0f);
            setLayoutParams(layoutParams2);
        }
        m12286lr();
    }

    /* JADX INFO: renamed from: lr */
    private static Drawable m12280lr(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(context, 8.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    private static Drawable m12282ri(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(context, 18.0f));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ri */
    private String m12284ri(wjv wjvVar) {
        if (TextUtils.isEmpty(wjvVar.m14559xh())) {
            return !TextUtils.isEmpty(wjvVar.m14535tq()) ? wjvVar.m14535tq() : "";
        }
        return wjvVar.m14559xh();
    }

    protected String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strSkk;
        String strM16445ik = C3571ig.m16445ik(this.f9612mj.srn);
        if (strM16445ik == null) {
            strM16445ik = "";
        }
        try {
            zEquals = strM16445ik.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.f9612mj.f9389lr.skk())) {
            strSkk = this.f9612mj.f9389lr.adz() != 4 ? "View" : "Install";
        } else {
            strSkk = this.f9612mj.f9389lr.skk();
            if (strSkk == null || !C3571ig.xha(strSkk) || strSkk.length() <= 2) {
                if (strSkk != null && !C3571ig.xha(strSkk) && strSkk.length() > 7 && zEquals) {
                    strSkk = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strSkk = getCnOrEnBtnText();
            }
        }
        if (zEquals && !C3571ig.xha(strSkk)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9611lr.getLayoutParams();
            layoutParams.bottomMargin = C3583qd.m16589lr(this.f9612mj.srn, 4.0f);
            this.f9611lr.setLayoutParams(layoutParams);
        }
        return strSkk;
    }

    /* JADX INFO: renamed from: ik */
    public void m12285ik() {
        Context context = getContext();
        int iM16589lr = C3583qd.m16589lr(context, 12.0f);
        setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        C3191fi c3191fi = new C3191fi(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c3191fi.setOrientation(0);
        c3191fi.setGravity(16);
        addView(c3191fi, layoutParams);
        C3335bu c3335bu = new C3335bu(context);
        this.f9610ka = c3335bu;
        c3335bu.setBackgroundColor(0);
        this.f9610ka.setId(com.bytedance.sdk.openadsdk.utils.slm.f13282ka);
        c3191fi.addView(this.f9610ka, new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 54.0f), C3583qd.m16589lr(context, 54.0f)));
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi.addView(c3191fi2, layoutParams2);
        C3195mj c3195mj = new C3195mj(context);
        this.f9608fi = c3195mj;
        c3195mj.setEllipsize(TextUtils.TruncateAt.END);
        this.f9608fi.setGravity(16);
        this.f9608fi.setSingleLine(true);
        this.f9608fi.setTextSize(2, 17.0f);
        this.f9608fi.setId(com.bytedance.sdk.openadsdk.utils.slm.f13268fi);
        this.f9608fi.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3191fi2.addView(this.f9608fi, new LinearLayout.LayoutParams(-1, -2));
        C3195mj c3195mj2 = new C3195mj(context);
        this.f9607di = c3195mj2;
        c3195mj2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f9607di.setTextSize(2, 13.0f);
        this.f9607di.setMaxLines(2);
        this.f9607di.setAlpha(0.8f);
        this.f9607di.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 4.0f);
        c3191fi2.addView(this.f9607di, layoutParams3);
        C3191fi c3191fi3 = new C3191fi(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = C3583qd.m16589lr(context, 12.0f);
        c3191fi3.setOrientation(0);
        addView(c3191fi3, layoutParams4);
        C3195mj c3195mj3 = new C3195mj(context);
        this.f9609ik = c3195mj3;
        c3195mj3.setGravity(17);
        this.f9609ik.setEllipsize(TextUtils.TruncateAt.END);
        this.f9609ik.setSingleLine(true);
        this.f9609ik.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f9609ik.setTextSize(2, 16.0f);
        this.f9609ik.setBackground(m12280lr(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, C3583qd.m16589lr(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = C3583qd.m16589lr(context, 3.0f);
        c3191fi3.addView(this.f9609ik, layoutParams5);
        C3195mj c3195mj4 = new C3195mj(context);
        this.f9611lr = c3195mj4;
        c3195mj4.setGravity(17);
        this.f9611lr.setEllipsize(TextUtils.TruncateAt.END);
        this.f9611lr.setSingleLine(true);
        this.f9611lr.setTextColor(-1);
        this.f9611lr.setTextSize(2, 16.0f);
        this.f9611lr.setId(520093705);
        this.f9611lr.setBackground(m12278ik(context));
        this.f9611lr.setText(this.f9612mj.f9389lr.skk());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, C3583qd.m16589lr(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = C3583qd.m16589lr(context, 3.0f);
        c3191fi3.addView(this.f9611lr, layoutParams6);
    }

    /* JADX INFO: renamed from: lr */
    public void m12286lr() {
        AbstractC3217fi abstractC3217fiM11986fi = this.f9612mj.f9402su.m11986fi();
        final C3220lr c3220lrM11989ka = this.f9612mj.f9402su.m11989ka();
        final wjv wjvVar = this.f9612mj.f9389lr;
        if (wjvVar.m14455nh() == null) {
            return;
        }
        if (wjvVar.jxw() != 5 && this.f9611lr != null) {
            if (wjvVar.m14455nh().f11340fi) {
                this.f9611lr.setOnClickListener(abstractC3217fiM11986fi);
                this.f9611lr.setOnTouchListener(abstractC3217fiM11986fi);
            } else {
                this.f9611lr.setOnClickListener(c3220lrM11989ka);
            }
        }
        if (wjvVar.jxw() == 1) {
            if (!wjvVar.m14455nh().f11344ri) {
                C3583qd.m16614ri((View) this, (View.OnClickListener) c3220lrM11989ka, "TTBaseVideoActivity#mRlDownloadBar");
                this.f9608fi.setOnClickListener(c3220lrM11989ka);
                this.f9613ri.setOnClickListener(c3220lrM11989ka);
                this.f9610ka.setOnClickListener(c3220lrM11989ka);
                return;
            }
            C3583qd.m16614ri((View) this, (View.OnClickListener) abstractC3217fiM11986fi, "TTBaseVideoActivity#mRlDownloadBar");
            C3583qd.m16615ri((View) this, (View.OnTouchListener) abstractC3217fiM11986fi, "TTBaseVideoActivity#mRlDownloadBar");
            this.f9608fi.setOnClickListener(abstractC3217fiM11986fi);
            this.f9608fi.setOnTouchListener(abstractC3217fiM11986fi);
            this.f9613ri.setOnClickListener(abstractC3217fiM11986fi);
            this.f9613ri.setOnTouchListener(abstractC3217fiM11986fi);
            this.f9610ka.setOnClickListener(abstractC3217fiM11986fi);
            this.f9610ka.setOnTouchListener(abstractC3217fiM11986fi);
            return;
        }
        if (wjvVar.jxw() != 5) {
            if (!wjvVar.m14455nh().f11341ik) {
                C3583qd.m16614ri((View) this, (View.OnClickListener) c3220lrM11989ka, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                C3583qd.m16614ri((View) this, (View.OnClickListener) abstractC3217fiM11986fi, "TTBaseVideoActivity#mRlDownloadBar");
                C3583qd.m16615ri((View) this, (View.OnTouchListener) abstractC3217fiM11986fi, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!wjvVar.m14455nh().f11340fi) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = c3220lrM11989ka;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (wjvVar.m14525sr() != null) {
                            wjvVar.m14525sr().m12546ri().xha(C3070ka.this.f9612mj.ihz.m12122aw());
                        }
                    } else {
                        if (wjvVar.m14525sr() == null || wjvVar.m14525sr().m12541lr() == null) {
                            return;
                        }
                        wjvVar.m14525sr().m12541lr().m12427ri(C3070ka.this.f9612mj.ihz.m12122aw());
                    }
                }
            };
            TextView textView = this.f9611lr;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.f9608fi;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.f9608fi.setOnClickListener(onClickListener);
            }
            C3335bu c3335bu = this.f9610ka;
            if (c3335bu != null) {
                c3335bu.setTag(570425345, "VAST_ICON");
                this.f9610ka.setOnClickListener(c3220lrM11989ka);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.p219ik.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p219ik.xha("VAST_ACTION_BUTTON", wjvVar.m14525sr(), abstractC3217fiM11986fi) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.3
        };
        com.bytedance.sdk.openadsdk.core.p219ik.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.p219ik.xha(str, wjvVar.m14525sr(), abstractC3217fiM11986fi) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ka.4
        };
        TextView textView3 = this.f9611lr;
        if (textView3 != null) {
            textView3.setOnClickListener(xhaVar);
            this.f9611lr.setOnTouchListener(xhaVar);
        }
        C3335bu c3335bu2 = this.f9610ka;
        if (c3335bu2 != null) {
            c3335bu2.setOnClickListener(xhaVar2);
            this.f9610ka.setOnTouchListener(xhaVar2);
        }
        TextView textView4 = this.f9608fi;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.f9608fi.setOnClickListener(xhaVar);
        this.f9608fi.setOnTouchListener(xhaVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m12287ri() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    /* JADX INFO: renamed from: ri */
    public void m12288ri(C3022ri c3022ri) {
        this.f9612mj = c3022ri;
        if (c3022ri.f9389lr.jxw() == 1) {
            m12279ka();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0 || this.xha) {
            return;
        }
        m12279ka();
    }
}
