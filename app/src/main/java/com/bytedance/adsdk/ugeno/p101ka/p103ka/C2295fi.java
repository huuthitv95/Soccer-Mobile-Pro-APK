package com.bytedance.adsdk.ugeno.p101ka.p103ka;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ka.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2295fi extends AbstractC2296ik {

    /* JADX INFO: renamed from: aw */
    private int f5804aw;
    private int bgr;

    /* JADX INFO: renamed from: bu */
    private int f5805bu;

    /* JADX INFO: renamed from: co */
    private float f5806co;

    /* JADX INFO: renamed from: nr */
    private String f5807nr;

    /* JADX INFO: renamed from: sf */
    private float f5808sf;
    private AtomicBoolean slm;

    /* JADX INFO: renamed from: vr */
    private int f5809vr;

    public C2295fi(Context context) {
        super(context);
        this.f5804aw = 0;
        this.bgr = Integer.MAX_VALUE;
        this.f5809vr = Integer.MAX_VALUE;
        this.slm = new AtomicBoolean(true);
        this.f5805bu = 0;
        this.f5807nr = "up";
    }

    /* JADX INFO: renamed from: ri */
    private void m7778ri() {
        if (this.f5809vr == Integer.MAX_VALUE || this.f5814lr == null || System.currentTimeMillis() - this.f5814lr.m7841fr() < this.f5809vr) {
            return;
        }
        this.slm.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7779ri(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7780ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, float f, float f2) {
        if (this.bgr <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.slm.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.f5805bu == 1 && !m7779ri(abstractViewOnTouchListenerC2318ik.m7879sf(), f, f2)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.f5817ri.mo7771ri(abstractViewOnTouchListenerC2318ik, this.f5810di, this.f5812ik.m7744lr());
        int i = this.bgr;
        if (i != Integer.MAX_VALUE) {
            this.bgr = i - 1;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX INFO: renamed from: ri */
    private boolean m7781ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        byte b;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5808sf = motionEvent.getX();
            this.f5806co = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f5804aw == 0 && this.f5817ri != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return m7780ri(abstractViewOnTouchListenerC2318ik, x, y);
            }
            int iM8042lr = C2347mj.m8042lr(this.f5816qt, x - this.f5808sf);
            int iM8042lr2 = C2347mj.m8042lr(this.f5816qt, y - this.f5806co);
            switch (this.f5807nr) {
                case "up":
                    b = 0;
                    break;
                case "all":
                    b = 4;
                    break;
                case "down":
                    b = 1;
                    break;
                case "left":
                    b = 2;
                    break;
                case "right":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                iM8042lr = -iM8042lr2;
            } else if (b == 1) {
                iM8042lr = iM8042lr2;
            } else if (b == 2) {
                iM8042lr = -iM8042lr;
            } else if (b != 3) {
                iM8042lr = (int) Math.abs(Math.sqrt(Math.pow(iM8042lr, 2.0d) + Math.pow(iM8042lr2, 2.0d)));
            }
            if (iM8042lr < this.f5804aw) {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
            Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
            if (this.f5817ri != null) {
                this.f5808sf = 0.0f;
                this.f5806co = 0.0f;
                return m7780ri(abstractViewOnTouchListenerC2318ik, x, y);
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik
    /* JADX INFO: renamed from: ri */
    public boolean mo7777ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        if (this.f5811fi != null) {
            this.f5807nr = TextUtils.isEmpty(this.f5811fi.get("direction")) ? "all" : this.f5811fi.get("direction");
            this.f5804aw = C2343ik.m8030ri(this.f5811fi.get("distance"), 0);
            if (this.bgr == Integer.MAX_VALUE) {
                this.bgr = C2343ik.m8030ri(this.f5811fi.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.f5809vr == Integer.MAX_VALUE) {
                this.f5809vr = C2343ik.m8030ri(this.f5811fi.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.f5805bu = C2343ik.m8030ri(this.f5811fi.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.bgr + ", mEffectiveDuration: " + this.f5809vr + ", inEffectiveDuation: " + this.slm.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        m7778ri();
        return m7781ri(this.f5814lr, motionEvent);
    }
}
