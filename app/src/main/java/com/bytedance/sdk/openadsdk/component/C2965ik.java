package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.jbs.AbstractC2970ik;
import com.bytedance.sdk.openadsdk.component.jbs.C2968di;
import com.bytedance.sdk.openadsdk.component.jbs.C2969fi;
import com.bytedance.sdk.openadsdk.component.jbs.C2971ka;
import com.bytedance.sdk.openadsdk.component.jbs.C2973mj;
import com.bytedance.sdk.openadsdk.component.p186mj.C2979ik;
import com.bytedance.sdk.openadsdk.component.p186mj.C2981ri;
import com.bytedance.sdk.openadsdk.component.p189ri.C3079lr;
import com.bytedance.sdk.openadsdk.component.p189ri.C3080ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p172ac.C2752ri;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2754lr;
import com.bytedance.sdk.openadsdk.utils.C3563bu;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.chartboost.sdk.impl.cc$$ExternalSyntheticApiModelOutline0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2965ik {

    /* JADX INFO: renamed from: ac */
    private C3195mj f8967ac;

    /* JADX INFO: renamed from: aw */
    private RelativeLayout f8968aw;

    /* JADX INFO: renamed from: ay */
    private C2979ik f8969ay;
    private ImageView bgr;

    /* JADX INFO: renamed from: bu */
    private ImageView f8970bu;

    /* JADX INFO: renamed from: co */
    protected final C2981ri f8971co;

    /* JADX INFO: renamed from: di */
    protected final int f8972di;

    /* JADX INFO: renamed from: fi */
    protected final C3078ri f8973fi;

    /* JADX INFO: renamed from: fr */
    private C3195mj f8974fr;
    private slm igq;
    private float ihz;

    /* JADX INFO: renamed from: ik */
    protected final boolean f8975ik;
    protected View jbs;

    /* JADX INFO: renamed from: ka */
    protected final FrameLayout f8976ka;

    /* JADX INFO: renamed from: lr */
    protected final wjv f8977lr;

    /* JADX INFO: renamed from: mj */
    protected FrameLayout f8978mj;

    /* JADX INFO: renamed from: nr */
    private C3335bu f8979nr;

    /* JADX INFO: renamed from: qt */
    protected C3193ka f8980qt;

    /* JADX INFO: renamed from: ri */
    protected final Activity f8981ri;

    /* JADX INFO: renamed from: sf */
    protected C3195mj f8982sf;
    private C3195mj slm;

    /* JADX INFO: renamed from: su */
    private C3193ka f8983su;
    private C3195mj tan;

    /* JADX INFO: renamed from: uq */
    private float f8984uq;

    /* JADX INFO: renamed from: vr */
    private PAGLogoView f8985vr;
    private final C2973mj wjv = new C2973mj();
    protected int xha;

    /* JADX INFO: renamed from: zf */
    private View f8986zf;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ik$lr */
    public static class lr implements C3563bu.ri {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<C2965ik> f8992ri;

        public lr(C2965ik c2965ik) {
            this.f8992ri = new WeakReference<>(c2965ik);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.C3563bu.ri
        /* JADX INFO: renamed from: ri */
        public void mo11471ri() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.C3563bu.ri
        /* JADX INFO: renamed from: ri */
        public void mo11472ri(C2754lr c2754lr) {
            C2965ik c2965ik;
            if (!c2754lr.m10475fi() || (c2965ik = this.f8992ri.get()) == null) {
                return;
            }
            c2965ik.m11525ri(c2754lr);
            if (c2754lr.m10478lr() != null) {
                c2965ik.m11513ri(c2754lr.m10479ri());
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ik$ri */
    public static class ri implements C2958di.ik {

        /* JADX INFO: renamed from: lr */
        private final WeakReference<C2965ik> f8993lr;

        /* JADX INFO: renamed from: ri */
        WeakReference<Activity> f8994ri;

        ri(Activity activity, C2965ik c2965ik) {
            this.f8994ri = new WeakReference<>(activity);
            this.f8993lr = new WeakReference<>(c2965ik);
        }

        @Override // com.bytedance.sdk.openadsdk.component.C2958di.ik
        /* JADX INFO: renamed from: ri */
        public void mo11477ri(Object obj) {
            C2965ik c2965ik;
            if (this.f8994ri.get() == null || this.f8994ri.get().isFinishing() || (c2965ik = this.f8993lr.get()) == null) {
                return;
            }
            c2965ik.m11513ri(obj);
        }
    }

    public C2965ik(Activity activity, wjv wjvVar, FrameLayout frameLayout, C3078ri c3078ri, int i, boolean z, C2981ri c2981ri) {
        this.f8981ri = activity;
        this.f8977lr = wjvVar;
        this.f8976ka = frameLayout;
        this.xha = i;
        this.f8975ik = z;
        this.f8973fi = c3078ri;
        this.f8972di = wjvVar.m14545ur();
        this.f8971co = c2981ri;
    }

    private void jbs() {
        if (this.tan != null) {
            if (this.f8977lr.tyz() != null && !TextUtils.isEmpty(this.f8977lr.tyz().m14073lr())) {
                this.tan.setText(this.f8977lr.tyz().m14073lr());
            } else if (TextUtils.isEmpty(this.f8977lr.tpb())) {
                this.tan.setVisibility(8);
            } else {
                this.tan.setText(this.f8977lr.tpb());
            }
        }
        if (this.f8967ac != null) {
            if (TextUtils.isEmpty(this.f8977lr.m14559xh())) {
                this.f8967ac.setVisibility(8);
            } else {
                this.f8967ac.setText(this.f8977lr.m14559xh());
            }
        }
        if (this.f8979nr != null && this.f8977lr.m14391fb() != null && !TextUtils.isEmpty(this.f8977lr.m14391fb().m14220ri())) {
            C2751lr.m10463lr().m10472ri(this.f8977lr.m14391fb().m14220ri(), this.f8977lr.m14391fb().m14217lr(), this.f8977lr.m14391fb().m14215ik(), this.f8979nr, this.f8977lr);
        }
        this.f8973fi.mo10540ik();
    }

    /* JADX INFO: renamed from: lr */
    private void m11509lr(int i) {
        C3583qd.m16612ri((View) this.f8978mj, i);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX INFO: renamed from: mj */
    private void m11510mj() {
        boolean z;
        this.wjv.m11554ri();
        this.slm.setText(this.f8977lr.skk());
        if (this.f8977lr.ory()) {
            jbs();
            return;
        }
        if (this.f8975ik) {
            m11509lr(0);
            m11522ri(8);
            if (m11526ri(this.f8978mj)) {
                this.f8973fi.mo10540ik();
            } else {
                this.f8973fi.mo10541ka();
            }
            C2958di.m11454ri(this.f8977lr, new ri(this.f8981ri, this), 25);
        } else {
            m11509lr(8);
            m11522ri(0);
            m11511qt();
            this.f8973fi.mo10540ik();
        }
        boolean z2 = true;
        if (this.f8974fr == null) {
            z = false;
        } else {
            if (!TextUtils.isEmpty(this.f8977lr.tpb())) {
                this.f8974fr.setText(this.f8977lr.tpb());
            } else if (this.f8977lr.tyz() != null) {
                this.f8974fr.setText(this.f8977lr.tyz().m14073lr());
            } else {
                z = false;
            }
            z = true;
        }
        if (this.f8983su != null) {
            C2751lr.m10463lr().m10470ri(this.f8977lr.m14391fb(), this.f8983su, this.f8977lr);
        }
        slm slmVar = this.igq;
        if (slmVar != null) {
            C3583qd.m16618ri((TextView) null, slmVar, this.f8977lr);
            if (this.f8977lr.tyz() == null || this.f8977lr.tyz().m14071ka() < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.igq.setVisibility(8);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        View view = this.f8986zf;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: qt */
    private void m11511qt() {
        C3286nr c3286nr = this.f8977lr.rbz().get(0);
        C3563bu.m16376ri(new C2752ri(c3286nr.m14220ri(), c3286nr.xha()), c3286nr.m14217lr(), c3286nr.m14215ik(), new lr(this), C3087ri.m12354lr(TextUtils.isEmpty(c3286nr.xha()) ? C2717fi.m10220ri(c3286nr.m14220ri()) : c3286nr.xha()).getParent(), 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11513ri(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.f8970bu.setImageDrawable(new BitmapDrawable(C3299nr.m14642ri().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            C2707ac.m10197ik("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    /* JADX INFO: renamed from: di */
    protected void m11514di() {
        View view = this.jbs;
        if (view == null || this.f8980qt == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (C2965ik.this.f8973fi != null) {
                    C2965ik.this.f8973fi.mo10543lr(view2);
                }
            }
        });
        this.f8980qt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (C2965ik.this.f8973fi != null) {
                    C2965ik.this.f8973fi.mo10545ri(view2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: fi */
    public void mo11515fi() {
    }

    /* JADX INFO: renamed from: ik */
    public void mo11516ik() {
        C2979ik c2979ik = this.f8969ay;
        if (c2979ik != null) {
            c2979ik.m11587co();
        }
    }

    /* JADX INFO: renamed from: ka */
    public int mo11517ka() {
        return -1;
    }

    /* JADX INFO: renamed from: lr */
    public void mo11518lr() {
        Window window;
        if (this.f8977lr.zyu()) {
            this.f8973fi.mo10540ik();
        } else {
            m11510mj();
        }
        Activity activity = this.f8981ri;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject mo11519ri(JSONObject jSONObject) {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void mo11520ri() {
        this.f8985vr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ik.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m10758ri(C2965ik.this.f8981ri, C2965ik.this.f8977lr, "open_ad");
                } catch (Throwable th) {
                    C2707ac.m10196ik("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        m11514di();
        if (this.f8977lr.zyu()) {
            return;
        }
        C3080ri c3080riM12325ri = C3079lr.m12325ri(this.f8977lr, this.f8981ri, this.f8971co);
        c3080riM12325ri.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.ik.3
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                C2965ik.this.f8973fi.mo10539fi();
            }
        });
        c3080riM12325ri.m13546ri(this.f8969ay);
        if (this.f8977lr.rzk() == 1) {
            this.f8968aw.setOnClickListener(c3080riM12325ri);
            this.f8968aw.setOnTouchListener(c3080riM12325ri);
        }
        this.slm.setOnClickListener(c3080riM12325ri);
        this.slm.setOnTouchListener(c3080riM12325ri);
    }

    /* JADX INFO: renamed from: ri */
    public void m11521ri(float f, float f2) {
        this.f8984uq = f;
        this.ihz = f2;
    }

    /* JADX INFO: renamed from: ri */
    void m11522ri(int i) {
        C3583qd.m16612ri((View) this.bgr, i);
    }

    /* JADX INFO: renamed from: ri */
    public void mo11523ri(int i, boolean z) {
        C3195mj c3195mj;
        if (this.f8980qt == null || (c3195mj = this.f8982sf) == null) {
            return;
        }
        if (z) {
            if (c3195mj.getVisibility() != 8) {
                this.f8982sf.setVisibility(8);
            }
            if (this.f8980qt.getVisibility() != 0) {
                this.f8980qt.setVisibility(0);
                return;
            }
            return;
        }
        this.f8982sf.setText(i + CmcdData.Factory.STREAMING_FORMAT_SS);
        if (this.f8982sf.getVisibility() != 0) {
            this.f8982sf.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void mo11524ri(ViewGroup viewGroup) {
        AbstractC2970ik c2971ka = new C2971ka(this.f8981ri, this.f8977lr);
        int iM14477qh = this.f8977lr.m14477qh();
        if (iM14477qh == 5) {
            c2971ka = new C2968di(this.f8981ri, this.f8977lr);
        } else if (iM14477qh == 4) {
            c2971ka = new C2969fi(this.f8981ri, this.f8977lr);
        }
        AbstractC2970ik abstractC2970ik = c2971ka;
        this.f8968aw = abstractC2970ik;
        viewGroup.addView(abstractC2970ik);
        this.f8970bu = abstractC2970ik.getBackImage();
        this.f8978mj = abstractC2970ik.getVideoContainer();
        this.bgr = abstractC2970ik.getImageView();
        this.slm = abstractC2970ik.getClickButton();
        this.f8985vr = abstractC2970ik.getAdLogo();
        this.f8974fr = abstractC2970ik.getAdTitleTextView();
        this.f8983su = abstractC2970ik.getAdIconView();
        this.igq = abstractC2970ik.getScoreBar();
        this.f8986zf = abstractC2970ik.getOverlayLayout();
        if (this.f8977lr.ory()) {
            this.f8979nr = abstractC2970ik.getIconOnlyView();
            this.tan = abstractC2970ik.getTitle();
            this.f8967ac = abstractC2970ik.getContent();
        }
        if (abstractC2970ik.getDspAdChoice() != null) {
            abstractC2970ik.getDspAdChoice().m15003ri(14, this.f8977lr);
        }
        if (!this.f8977lr.zyu()) {
            this.wjv.m11555ri(abstractC2970ik, this.f8977lr, this.f8984uq, this.ihz, this.f8975ik);
        }
        this.jbs = abstractC2970ik.getTopDisLike();
        this.f8980qt = abstractC2970ik.getTopSkip();
        this.f8982sf = abstractC2970ik.getTopCountDown();
        if (abstractC2970ik instanceof C2969fi) {
            ((C2969fi) abstractC2970ik).setRenderListener(new C2969fi.ri() { // from class: com.bytedance.sdk.openadsdk.component.ik.1
                @Override // com.bytedance.sdk.openadsdk.component.jbs.C2969fi.ri
                /* JADX INFO: renamed from: ri */
                public void mo11527ri(View view, int i) {
                    C2965ik.this.f8973fi.mo10539fi();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    void m11525ri(C2754lr c2754lr) {
        if (this.bgr == null) {
            return;
        }
        if (c2754lr.m10478lr() != null) {
            this.bgr.setImageBitmap(c2754lr.m10478lr());
            return;
        }
        Drawable drawableM10477ka = c2754lr.m10477ka();
        if (drawableM10477ka != null) {
            this.bgr.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && cc$$ExternalSyntheticApiModelOutline0.m17156m((Object) drawableM10477ka)) {
                cc$$ExternalSyntheticApiModelOutline0.m17094m((Object) drawableM10477ka).start();
            }
            this.bgr.setImageDrawable(drawableM10477ka);
            return;
        }
        if (this.f8977lr.rbz() == null || this.f8977lr.rbz().get(0) == null) {
            return;
        }
        Drawable drawableM16374ri = C3563bu.m16374ri(c2754lr.m10476ik(), this.f8977lr.rbz().get(0).m14217lr());
        this.bgr.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.bgr.setImageDrawable(drawableM16374ri);
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m11526ri(FrameLayout frameLayout) {
        C2979ik c2979ik = new C2979ik(this.f8981ri);
        this.f8969ay = c2979ik;
        return c2979ik.m11601ri(frameLayout, this.f8973fi, this.f8977lr);
    }

    public C2979ik xha() {
        return this.f8969ay;
    }
}
