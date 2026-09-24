package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.jbs.p158ri.C2642ri;
import com.bytedance.sdk.component.jbs.p158ri.InterfaceC2641lr;
import com.bytedance.sdk.component.utils.C2707ac;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2637ka extends AbstractViewOnTouchListenerC2636ik {

    /* JADX INFO: renamed from: di */
    private View.OnTouchListener f7461di;

    /* JADX INFO: renamed from: fi */
    private final C2634di f7462fi;

    /* JADX INFO: renamed from: ik */
    private final long f7463ik;
    private float jbs;

    /* JADX INFO: renamed from: ka */
    private final Context f7464ka;

    /* JADX INFO: renamed from: lr */
    private final int f7465lr;

    /* JADX INFO: renamed from: mj */
    private float f7466mj;

    /* JADX INFO: renamed from: qt */
    private String f7467qt;

    /* JADX INFO: renamed from: ri */
    private final View.OnTouchListener f7468ri;
    private long xha = -1;

    public C2637ka(Context context, View.OnTouchListener onTouchListener, int i, long j, C2634di c2634di) {
        this.f7464ka = context;
        this.f7468ri = onTouchListener;
        this.f7465lr = i;
        this.f7463ik = j;
        this.f7462fi = c2634di;
    }

    /* JADX INFO: renamed from: ri */
    private void m9796ri(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.f7465lr);
            jSONObject.put("lp_click_interval", this.f7463ik);
        } catch (Throwable th) {
            C2707ac.m10206ri("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (C2642ri.m9829ri().m9830lr() != null) {
            InterfaceC2641lr interfaceC2641lrM9830lr = C2642ri.m9829ri().m9830lr();
            C2634di c2634di = this.f7462fi;
            interfaceC2641lrM9830lr.mo9827ri(c2634di != null ? c2634di.getMaterialMeta() : null, this.f7467qt, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m9797ri(long j) {
        long j2 = this.xha;
        if (j2 == -1) {
            this.xha = j;
            return false;
        }
        int i = this.f7465lr;
        if (i == 1) {
            if (j - j2 <= this.f7463ik) {
                return true;
            }
            this.xha = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.f7463ik) {
                this.xha = j;
                return true;
            }
            this.xha = j;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2637ka c2637ka;
        int action = motionEvent.getAction();
        Integer.valueOf(action);
        Float.valueOf(motionEvent.getX());
        Float.valueOf(motionEvent.getY());
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            c2637ka = this;
            c2637ka.f7466mj = x;
            c2637ka.jbs = y;
        } else if (action != 1) {
            c2637ka = this;
        } else {
            c2637ka = this;
            if (c2637ka.m9795ri(x, y, this.f7466mj, this.jbs, this.f7464ka)) {
                if (m9797ri(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    m9796ri(1, x, y);
                } else {
                    m9796ri(0, x, y);
                }
            }
        }
        View.OnTouchListener onTouchListener = c2637ka.f7468ri;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = c2637ka.f7461di;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.jbs.AbstractViewOnTouchListenerC2636ik
    /* JADX INFO: renamed from: ri */
    public void mo9794ri(View.OnTouchListener onTouchListener) {
        this.f7461di = onTouchListener;
    }

    /* JADX INFO: renamed from: ri */
    public void m9798ri(String str) {
        this.f7467qt = str;
    }
}
