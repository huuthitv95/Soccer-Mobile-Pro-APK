package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.C2708aw;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3269mj extends View implements com.bytedance.sdk.component.utils.igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: aw */
    private boolean f11072aw;
    private final Runnable bgr;

    /* JADX INFO: renamed from: co */
    private boolean f11073co;

    /* JADX INFO: renamed from: di */
    private List<View> f11074di;

    /* JADX INFO: renamed from: fi */
    private List<View> f11075fi;

    /* JADX INFO: renamed from: ik */
    private ri f11076ik;
    private final Handler jbs;

    /* JADX INFO: renamed from: ka */
    private View f11077ka;

    /* JADX INFO: renamed from: lr */
    private boolean f11078lr;

    /* JADX INFO: renamed from: mj */
    private int f11079mj;

    /* JADX INFO: renamed from: qt */
    private final AtomicBoolean f11080qt;

    /* JADX INFO: renamed from: ri */
    private boolean f11081ri;

    /* JADX INFO: renamed from: sf */
    private ViewTreeObserver.OnGlobalLayoutListener f11082sf;
    private boolean xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.mj$ri */
    public interface ri {
        /* JADX INFO: renamed from: lr */
        void mo13020lr();

        /* JADX INFO: renamed from: ri */
        void mo13021ri();

        /* JADX INFO: renamed from: ri */
        void mo13022ri(View view);

        /* JADX INFO: renamed from: ri */
        void mo13023ri(boolean z);
    }

    public C3269mj(Context context, View view, boolean z) {
        super(C3299nr.m14642ri());
        this.jbs = new com.bytedance.sdk.component.utils.igq(C3332vr.m14978lr().getLooper(), this);
        this.f11080qt = new AtomicBoolean(true);
        this.f11072aw = false;
        this.bgr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.3
            @Override // java.lang.Runnable
            public void run() {
                if (C3269mj.this.f11076ik != null) {
                    C3269mj.this.f11076ik.mo13022ri(C3269mj.this.f11077ka);
                }
            }
        };
        this.f11073co = z;
        this.f11077ka = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f11082sf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (C3269mj.this.f11072aw) {
                    return;
                }
                C3269mj.this.m13918fi();
                C3269mj.this.m13922ka();
            }
        };
    }

    /* JADX INFO: renamed from: di */
    private boolean m13916di() {
        View view = this.f11077ka;
        if (view instanceof C3222ac) {
            return ((C3222ac) view).wjv();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public void m13918fi() {
        if (this.f11081ri) {
            this.jbs.removeCallbacksAndMessages(null);
            this.f11081ri = false;
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m13919ik() {
        ri riVar;
        if (this.f11080qt.getAndSet(true) || (riVar = this.f11076ik) == null) {
            return;
        }
        riVar.mo13020lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m13922ka() {
        if (!this.f11078lr || this.f11081ri) {
            return;
        }
        this.f11081ri = true;
        this.jbs.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: lr */
    private void m13923lr() {
        ri riVar;
        if (!this.f11080qt.getAndSet(false) || (riVar = this.f11076ik) == null) {
            return;
        }
        riVar.mo13021ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m13926ri(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.jbs.m10234lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mj.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (C3269mj.this.f11082sf != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(C3269mj.this.f11082sf);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    C3269mj.this.f11082sf = null;
                }
            }
        });
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xha = false;
        m13923lr();
        if (this.f11082sf != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f11082sf);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13918fi();
        this.xha = true;
        m13919ik();
        m13926ri(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m13923lr();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m13919ik();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ri riVar = this.f11076ik;
        if (riVar != null) {
            riVar.mo13023ri(z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13928ri() {
        m13929ri(this.f11075fi, (AbstractViewOnClickListenerC3218ik) null);
        m13929ri(this.f11074di, (AbstractViewOnClickListenerC3218ik) null);
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what == 1 && this.f11081ri) {
            if (!m13916di() || !C3302pv.m14656ri(this.f11077ka, 20, this.f11079mj, this.f11073co)) {
                this.jbs.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            m13918fi();
            this.f11072aw = true;
            C3332vr.m14976ik().post(this.bgr);
            m13926ri(true);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13929ri(List<View> list, AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik) {
        if (C2708aw.m10208lr(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(abstractViewOnClickListenerC3218ik);
                    view.setOnTouchListener(abstractViewOnClickListenerC3218ik);
                }
            }
        }
    }

    public void setAdType(int i) {
        this.f11079mj = i;
    }

    public void setCallback(ri riVar) {
        this.f11076ik = riVar;
    }

    public void setNeedCheckingShow(boolean z) {
        this.f11078lr = z;
        if (!z && this.f11081ri) {
            m13918fi();
        } else {
            if (!z || this.f11081ri) {
                return;
            }
            m13922ka();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.f11075fi = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f11074di = list;
    }
}
