package com.bytedance.adsdk.ugeno.core.p088lr;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2235fi {

    /* JADX INFO: renamed from: aw */
    private C2239ri f5523aw;

    /* JADX INFO: renamed from: co */
    private boolean f5524co;
    private String jbs;

    /* JADX INFO: renamed from: mj */
    private C2226aw f5530mj;

    /* JADX INFO: renamed from: qt */
    private Context f5531qt;

    /* JADX INFO: renamed from: sf */
    private boolean f5533sf;
    private C2226aw xha;

    /* JADX INFO: renamed from: ri */
    private float f5532ri = Float.MIN_VALUE;

    /* JADX INFO: renamed from: lr */
    private float f5529lr = Float.MIN_VALUE;

    /* JADX INFO: renamed from: ik */
    private int f5527ik = 0;

    /* JADX INFO: renamed from: ka */
    private int f5528ka = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: fi */
    private int f5526fi = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: di */
    private AtomicBoolean f5525di = new AtomicBoolean(true);

    public C2235fi(Context context, C2226aw c2226aw, C2226aw c2226aw2, boolean z, boolean z2) {
        this.f5531qt = context;
        this.xha = c2226aw;
        this.f5530mj = c2226aw2;
        this.f5533sf = z;
        this.f5524co = z2;
        m7366ik();
    }

    public C2235fi(Context context, C2226aw c2226aw, boolean z, boolean z2) {
        this.f5531qt = context;
        this.xha = c2226aw;
        this.f5533sf = z;
        this.f5524co = z2;
        m7366ik();
    }

    /* JADX INFO: renamed from: ik */
    private void m7366ik() {
        if (this.f5524co) {
            this.f5523aw = new C2239ri();
        }
        C2226aw c2226aw = this.xha;
        if (c2226aw == null) {
            return;
        }
        this.f5527ik = c2226aw.m7320ik().optInt("slideThreshold");
        this.jbs = this.xha.m7320ik().optString("slideDirection");
        this.f5528ka = this.xha.m7320ik().optInt("frequency", Integer.MAX_VALUE);
        this.f5526fi = this.xha.m7320ik().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.f5528ka + ", mEffectiveDuration: " + this.f5526fi + ", inEffectiveDuation: " + this.f5525di.get());
    }

    /* JADX INFO: renamed from: ri */
    private void m7368ri(InterfaceC2247vr interfaceC2247vr, C2226aw c2226aw, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (this.f5528ka <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            m7369ri(abstractViewOnTouchListenerC2318ik);
        } else {
            if (!this.f5525di.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                m7369ri(abstractViewOnTouchListenerC2318ik);
                return;
            }
            interfaceC2247vr.mo7436ri(c2226aw, abstractViewOnTouchListenerC2318ik, abstractViewOnTouchListenerC2318ik);
            int i = this.f5528ka;
            if (i != Integer.MAX_VALUE) {
                this.f5528ka = i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7369ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (this.f5523aw != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f5523aw.m7381ri(abstractViewOnTouchListenerC2318ik);
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m7370lr() {
        this.f5532ri = Float.MIN_VALUE;
        this.f5529lr = Float.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ri */
    public void m7371ri() {
        if (this.f5526fi == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                C2235fi.this.f5525di.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.f5526fi);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX INFO: renamed from: ri */
    public boolean m7372ri(InterfaceC2247vr interfaceC2247vr, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent, boolean z) {
        float x;
        float y;
        int iM8042lr;
        int iM8042lr2;
        C2239ri c2239ri = this.f5523aw;
        if (c2239ri != null) {
            if (c2239ri.m7383ri(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.f5523aw.m7382ri(abstractViewOnTouchListenerC2318ik, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5532ri = motionEvent.getX();
            this.f5529lr = motionEvent.getY();
        } else if (action == 1) {
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.f5533sf && Math.abs(x - this.f5532ri) <= 10.0f && Math.abs(y - this.f5529lr) <= 10.0f && interfaceC2247vr != null) {
                m7370lr();
                interfaceC2247vr.mo7436ri(this.f5530mj, abstractViewOnTouchListenerC2318ik, abstractViewOnTouchListenerC2318ik);
                return true;
            }
            if (this.f5527ik != 0 && interfaceC2247vr != null) {
                m7370lr();
                m7368ri(interfaceC2247vr, this.xha, abstractViewOnTouchListenerC2318ik);
                return true;
            }
            iM8042lr = C2347mj.m8042lr(this.f5531qt, x - this.f5532ri);
            iM8042lr2 = C2347mj.m8042lr(this.f5531qt, y - this.f5529lr);
            if (TextUtils.equals(this.jbs, "up")) {
                iM8042lr = -iM8042lr2;
            } else if (!TextUtils.equals(this.jbs, "down")) {
                iM8042lr = iM8042lr2;
            } else if (TextUtils.equals(this.jbs, "left")) {
                iM8042lr = -iM8042lr;
            } else if (!TextUtils.equals(this.jbs, "right")) {
                iM8042lr = (int) Math.abs(Math.sqrt(Math.pow(iM8042lr, 2.0d) + Math.pow(iM8042lr2, 2.0d)));
            }
            if (iM8042lr >= this.f5527ik) {
                m7370lr();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                m7369ri(abstractViewOnTouchListenerC2318ik);
                return false;
            }
            Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
            if (interfaceC2247vr != null) {
                m7370lr();
                m7368ri(interfaceC2247vr, this.xha, abstractViewOnTouchListenerC2318ik);
                return true;
            }
            m7370lr();
        } else if (action == 3) {
            if (this.f5532ri == Float.MIN_VALUE || this.f5529lr == Float.MIN_VALUE) {
                Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                return false;
            }
            Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
            x = motionEvent.getX();
            y = motionEvent.getY();
            if (!this.f5533sf) {
            }
            if (this.f5527ik != 0) {
            }
            iM8042lr = C2347mj.m8042lr(this.f5531qt, x - this.f5532ri);
            iM8042lr2 = C2347mj.m8042lr(this.f5531qt, y - this.f5529lr);
            if (TextUtils.equals(this.jbs, "up")) {
                iM8042lr = -iM8042lr2;
            } else if (!TextUtils.equals(this.jbs, "down")) {
                iM8042lr = iM8042lr2;
            } else if (TextUtils.equals(this.jbs, "left")) {
                iM8042lr = -iM8042lr;
            } else if (!TextUtils.equals(this.jbs, "right")) {
                iM8042lr = (int) Math.abs(Math.sqrt(Math.pow(iM8042lr, 2.0d) + Math.pow(iM8042lr2, 2.0d)));
            }
            if (iM8042lr >= this.f5527ik) {
                m7370lr();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                m7369ri(abstractViewOnTouchListenerC2318ik);
                return false;
            }
            Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
            if (interfaceC2247vr != null) {
                m7370lr();
                m7368ri(interfaceC2247vr, this.xha, abstractViewOnTouchListenerC2318ik);
                return true;
            }
            m7370lr();
        }
        return true;
    }
}
