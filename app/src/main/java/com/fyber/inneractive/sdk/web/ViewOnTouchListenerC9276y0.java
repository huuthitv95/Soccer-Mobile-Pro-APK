package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC9276y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9274x0 f21714a;

    /* JADX INFO: renamed from: b */
    public float f21715b;

    /* JADX INFO: renamed from: c */
    public float f21716c;

    /* JADX INFO: renamed from: d */
    public final float f21717d;

    public ViewOnTouchListenerC9276y0(InterfaceC9274x0 interfaceC9274x0, Context context) {
        this.f21714a = interfaceC9274x0;
        this.f21717d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f21714a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((AbstractC9238i) this.f21714a).m22064i();
                this.f21715b = motionEvent.getX();
                this.f21716c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((AbstractC9238i) this.f21714a).m22064i();
                this.f21716c = -1.0f;
                this.f21715b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.f21715b;
                if (f >= 0.0f && this.f21716c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f - motionEvent.getX()));
                    float fRound2 = Math.round(Math.abs(this.f21716c - motionEvent.getY()));
                    float f2 = this.f21717d;
                    if (fRound < f2 && fRound2 < f2) {
                        AbstractC9238i abstractC9238i = (AbstractC9238i) this.f21714a;
                        abstractC9238i.getClass();
                        IAlog.m21945a("IAWebViewController onClicked()", new Object[0]);
                        if (abstractC9238i.f21575l != null) {
                            IAlog.m21949e("Native click detected in time. Processing pending click", new Object[0]);
                            abstractC9238i.f21575l.mo22057d();
                            RunnableC9223d runnableC9223d = abstractC9238i.f21576m;
                            if (runnableC9223d != null) {
                                AbstractC9183r.f21478b.removeCallbacks(runnableC9223d);
                            }
                            abstractC9238i.f21575l = null;
                            abstractC9238i.m22064i();
                        } else {
                            if (abstractC9238i.f21577n != null) {
                                AbstractC9183r.f21478b.postDelayed(abstractC9238i.f21577n, IAConfigManager.f17654M.f17688t.f17862b.m20443a("click_timeout", 1000, 1000));
                            }
                            abstractC9238i.f21573j = true;
                        }
                    }
                    this.f21715b = -1.0f;
                    this.f21716c = -1.0f;
                }
            }
        }
        return false;
    }
}
