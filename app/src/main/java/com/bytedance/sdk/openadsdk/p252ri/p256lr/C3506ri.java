package com.bytedance.sdk.openadsdk.p252ri.p256lr;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p251qt.C3490ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3507ik;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3508lr;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3506ri {

    /* JADX INFO: renamed from: aw */
    private boolean f12708aw = false;
    private WeakReference<C3090di> bgr;

    /* JADX INFO: renamed from: co */
    private C3220lr f12709co;

    /* JADX INFO: renamed from: di */
    private C3504lr f12710di;

    /* JADX INFO: renamed from: fi */
    private WeakReference<C3120di> f12711fi;

    /* JADX INFO: renamed from: ik */
    private final String f12712ik;
    private C3222ac jbs;

    /* JADX INFO: renamed from: ka */
    private boolean f12713ka;

    /* JADX INFO: renamed from: lr */
    private final Context f12714lr;

    /* JADX INFO: renamed from: mj */
    private PAGMediaView f12715mj;

    /* JADX INFO: renamed from: qt */
    private PAGMediaView f12716qt;

    /* JADX INFO: renamed from: ri */
    protected final wjv f12717ri;

    /* JADX INFO: renamed from: sf */
    private C3221ri f12718sf;
    private C3507ik xha;

    public C3506ri(Context context, wjv wjvVar, String str) {
        this.f12714lr = context;
        this.f12717ri = wjvVar;
        this.f12712ik = str;
    }

    private PAGMediaView bgr() {
        if (!wjv.m14332fi(this.f12717ri)) {
            C3507ik c3507ik = this.xha;
            if (c3507ik == null) {
                return null;
            }
            C3222ac c3222acM15912ka = c3507ik.m15912ka();
            c3222acM15912ka.setTag(520093762, Boolean.TRUE);
            if (!this.f12708aw) {
                this.xha.m15910fi();
            }
            this.f12708aw = true;
            return m15878ri(c3222acM15912ka);
        }
        C3507ik c3507ik2 = this.xha;
        if (c3507ik2 == null || !(c3507ik2 instanceof C3508lr)) {
            return null;
        }
        tan tanVar = (tan) c3507ik2.m15912ka();
        tanVar.setTag(520093762, Boolean.TRUE);
        if (!this.f12708aw) {
            this.xha.m15910fi();
        }
        this.f12708aw = true;
        return m15878ri(tanVar);
    }

    /* JADX INFO: renamed from: lr */
    private InterfaceC3502ik m15876lr(final PAGVideoAdListener pAGVideoAdListener) {
        return new InterfaceC3502ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.6
            @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
            /* JADX INFO: renamed from: ik */
            public void mo13804ik(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
            /* JADX INFO: renamed from: lr */
            public void mo13805lr(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
            /* JADX INFO: renamed from: ri */
            public void mo13806ri(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3502ik
            /* JADX INFO: renamed from: ri */
            public void mo13807ri(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    /* JADX INFO: renamed from: lr */
    private String m15877lr(wjv wjvVar) {
        if (TextUtils.isEmpty(wjvVar.m14559xh())) {
            return !TextUtils.isEmpty(wjvVar.m14535tq()) ? wjvVar.m14535tq() : "";
        }
        return wjvVar.m14559xh();
    }

    /* JADX INFO: renamed from: ri */
    private PAGMediaView m15878ri(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        C3222ac c3222ac = this.jbs;
        if (c3222ac != null) {
            c3222ac.setClickListener(null);
            this.jbs.setClickCreativeListener(null);
        }
        C3220lr c3220lr = this.f12709co;
        if (c3220lr != null && (c3220lr instanceof jbs) && (view instanceof C3222ac)) {
            ((C3222ac) view).setClickListener((jbs) c3220lr);
        }
        C3221ri c3221ri = this.f12718sf;
        if (c3221ri != null && (c3221ri instanceof C3235mj) && (view instanceof C3222ac)) {
            ((C3222ac) view).setClickCreativeListener((C3235mj) c3221ri);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.f12714lr) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.3
            /* JADX INFO: renamed from: ri */
            private void m15900ri(boolean z) {
                if (this.f8581ri != null) {
                    C2889fi.m11112ri(C2889fi.m11109ri(this.f8581ri), z ? 4 : 8);
                }
                if (C3506ri.this.f12717ri != null) {
                    C2897ik.m11147ri(C3506ri.this.f12717ri, z);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                C3577ka.m16533ri(this, C3506ri.this.f12717ri);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof C3222ac) {
                    return;
                }
                m15900ri(z);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                C3506ri.this.m15891ri(pAGVideoAdListener);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof C3222ac) {
            this.jbs = (C3222ac) view;
        }
        return pAGMediaView;
    }

    /* JADX INFO: renamed from: ri */
    private String m15879ri(wjv wjvVar) {
        if (wjvVar.tyz() != null && !TextUtils.isEmpty(wjvVar.tyz().m14073lr())) {
            return wjvVar.tyz().m14073lr();
        }
        if (TextUtils.isEmpty(wjvVar.tpb())) {
            return !TextUtils.isEmpty(wjvVar.m14559xh()) ? wjvVar.m14559xh() : "";
        }
        return wjvVar.tpb();
    }

    /* JADX INFO: renamed from: ri */
    private void m15880ri(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: aw */
    public void m15881aw() {
        C3090di c3090di;
        WeakReference<C3090di> weakReference = this.bgr;
        if (weakReference == null || (c3090di = weakReference.get()) == null) {
            return;
        }
        c3090di.m12403ri(13);
    }

    /* JADX INFO: renamed from: co */
    public void m15882co() {
        Context context = this.f12714lr;
        if (context != null) {
            TTWebsiteActivity.m10758ri(context, this.f12717ri, this.f12712ik);
        }
    }

    /* JADX INFO: renamed from: di */
    public String m15883di() {
        wjv wjvVar = this.f12717ri;
        if (wjvVar != null) {
            return wjvVar.skk();
        }
        return null;
    }

    /* JADX INFO: renamed from: fi */
    public String m15884fi() {
        wjv wjvVar = this.f12717ri;
        if (wjvVar != null) {
            return m15877lr(wjvVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    public PAGImageItem m15885ik() {
        wjv wjvVar = this.f12717ri;
        if (wjvVar == null || wjvVar.m14391fb() == null) {
            return null;
        }
        return new PAGImageItem(this.f12717ri.m14391fb().m14215ik(), this.f12717ri.m14391fb().m14217lr(), this.f12717ri.m14391fb().m14220ri(), (float) this.f12717ri.m14391fb().m14216ka());
    }

    public PAGMediaView jbs() {
        if (!wjv.m14332fi(this.f12717ri)) {
            List<C3286nr> listRbz = this.f12717ri.rbz();
            if (listRbz == null || listRbz.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.f12714lr);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C3286nr c3286nr = listRbz.get(0);
            if (c3286nr != null) {
                C3491ka.m15833ri(c3286nr).mo9652ik(1).mo9658ri(C3490ik.m15828ri(this.f12717ri, c3286nr.m14220ri(), imageView));
            }
            PAGMediaView pAGMediaViewM15878ri = m15878ri(imageView);
            if (this.f12718sf == null || !C3322sf.m14819lr().m14856ka(String.valueOf(this.f12717ri.m14545ur()))) {
                pAGMediaViewM15878ri.setOnClickListener(null);
                pAGMediaViewM15878ri.setOnTouchListener(null);
            } else {
                pAGMediaViewM15878ri.setOnClickListener(this.f12718sf);
                pAGMediaViewM15878ri.setOnTouchListener(this.f12718sf);
            }
            pAGMediaViewM15878ri.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.f12715mj;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.f12715mj.setOnTouchListener(null);
            }
            this.f12715mj = pAGMediaViewM15878ri;
            return pAGMediaViewM15878ri;
        }
        C3504lr c3504lr = this.f12710di;
        if (c3504lr == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewM15869fi = c3504lr.m15869fi();
        if (viewM15869fi == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewM15869fi.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM15869fi.getParent()).removeView(viewM15869fi);
        }
        PAGMediaView pAGMediaView2 = this.f12715mj;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.f12715mj.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.f12714lr, viewM15869fi, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.f12718sf == null || !C3322sf.m14819lr().m14856ka(String.valueOf(this.f12717ri.m14545ur()))) {
            AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik = new AbstractViewOnClickListenerC3218ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.2
                @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
                /* JADX INFO: renamed from: ri */
                protected void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(abstractViewOnClickListenerC3218ik);
            pAGVideoMediaView.setOnTouchListener(abstractViewOnClickListenerC3218ik);
        } else {
            pAGVideoMediaView.setOnClickListener(this.f12718sf);
            pAGVideoMediaView.setOnTouchListener(this.f12718sf);
        }
        this.f12715mj = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    /* JADX INFO: renamed from: ka */
    public String m15886ka() {
        wjv wjvVar = this.f12717ri;
        if (wjvVar != null) {
            return m15879ri(wjvVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public C3222ac m15887lr() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: mj */
    public PAGMediaView m15888mj() {
        return this.f12716qt;
    }

    /* JADX INFO: renamed from: qt */
    public View m15889qt() {
        if (C3299nr.m14642ri() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(C3299nr.m14642ri()) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.4

            /* JADX INFO: renamed from: ri */
            int f12725ri = 0;

            /* JADX INFO: renamed from: lr */
            int f12724lr = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                try {
                    Object parent = getParent();
                    if (parent == null || this.f12725ri == 0 || this.f12724lr == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i5 = this.f12725ri;
                    if (width < i5 || height < this.f12724lr) {
                        float fMin = Math.min(height / this.f12724lr, width / i5);
                        int i6 = (width - this.f12725ri) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i6);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                if (this.f12725ri == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, Integer.MIN_VALUE), i2);
                    this.f12725ri = getMeasuredWidth();
                    this.f12724lr = this.containerHeight;
                }
                setMeasuredDimension(this.f12725ri, this.f12724lr);
            }
        };
        pAGLogoView.initData(this.f12717ri);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3506ri.this.m15882co();
            }
        });
        return pAGLogoView;
    }

    /* JADX INFO: renamed from: ri */
    public PAGMediaView m15890ri() {
        return this.f12715mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m15891ri(PAGVideoAdListener pAGVideoAdListener) {
        C3507ik c3507ik;
        if (this.f12717ri.ajz() == 2 && wjv.m14332fi(this.f12717ri) && (c3507ik = this.xha) != null && (c3507ik instanceof C3508lr)) {
            tan tanVar = (tan) c3507ik.m15912ka();
            if (tanVar != null) {
                tanVar.setVideoAdListener(m15876lr(pAGVideoAdListener));
                return;
            }
            return;
        }
        C3504lr c3504lr = this.f12710di;
        if (c3504lr != null) {
            c3504lr.m15870ri(m15876lr(pAGVideoAdListener));
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15892ri(C3090di c3090di) {
        this.bgr = new WeakReference<>(c3090di);
    }

    /* JADX INFO: renamed from: ri */
    public void m15893ri(C3120di c3120di) {
        this.f12711fi = new WeakReference<>(c3120di);
    }

    /* JADX INFO: renamed from: ri */
    public void m15894ri(C3220lr c3220lr) {
        this.f12709co = c3220lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m15895ri(C3221ri c3221ri) {
        this.f12718sf = c3221ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m15896ri(C3504lr c3504lr) {
        this.f12710di = c3504lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m15897ri(C3507ik c3507ik) {
        this.xha = c3507ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m15898ri(boolean z) {
        this.f12713ka = z;
    }

    /* JADX INFO: renamed from: sf */
    public View m15899sf() {
        wjv wjvVar;
        if (C3299nr.m14642ri() == null || (wjvVar = this.f12717ri) == null || !wjvVar.m14576zz() || !this.f12717ri.wjv()) {
            return null;
        }
        ImageView imageView = new ImageView(C3299nr.m14642ri());
        C2751lr.m10463lr().m10469ri((int) C3583qd.m16603ri(C3299nr.m14642ri(), 14.0f, true), imageView, this.f12717ri);
        return imageView;
    }

    public PAGMediaView xha() {
        PAGMediaView pAGMediaViewJbs;
        C3578lr.m16536ri(this.f12717ri);
        if (this.f12717ri.ajz() == 2) {
            pAGMediaViewJbs = bgr();
            m15880ri(pAGMediaViewJbs);
        } else {
            pAGMediaViewJbs = jbs();
        }
        if (pAGMediaViewJbs != null) {
            pAGMediaViewJbs.setMrcTrackerKey(C2889fi.m11106lr(this.f12717ri));
        } else {
            pAGMediaViewJbs = new PAGMediaView(this.f12714lr) { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    C3577ka.m16533ri(this, C3506ri.this.f12717ri);
                }
            };
        }
        if (pAGMediaViewJbs instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewJbs).setMaterialMeta(this.f12717ri);
        }
        this.f12716qt = pAGMediaViewJbs;
        return pAGMediaViewJbs;
    }
}
