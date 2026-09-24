package com.bytedance.sdk.openadsdk.core.p219ik;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC3218ik implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: dw */
    protected static int f10673dw = 8;
    protected View hcw;

    /* JADX INFO: renamed from: ac */
    protected float f10674ac = -1.0f;
    protected float ihz = -1.0f;

    /* JADX INFO: renamed from: uq */
    protected float f10685uq = -1.0f;
    protected float wjv = -1.0f;

    /* JADX INFO: renamed from: ay */
    protected long f10675ay = -1;

    /* JADX INFO: renamed from: fr */
    protected long f10678fr = -1;

    /* JADX INFO: renamed from: su */
    protected int f10684su = -1;
    protected int igq = BackupConstant.UNFINISHED_FAIL_CODE;

    /* JADX INFO: renamed from: zf */
    protected int f10686zf = -1;
    protected boolean ory = true;

    /* JADX INFO: renamed from: oh */
    public SparseArray<ri> f10682oh = new SparseArray<>();

    /* JADX INFO: renamed from: ri */
    private float f10683ri = 0.0f;

    /* JADX INFO: renamed from: lr */
    private float f10681lr = 0.0f;

    /* JADX INFO: renamed from: ik */
    private float f10679ik = 0.0f;

    /* JADX INFO: renamed from: ka */
    private float f10680ka = 0.0f;

    /* JADX INFO: renamed from: fi */
    private long f10677fi = 0;

    /* JADX INFO: renamed from: di */
    private int f10676di = 0;
    private int xha = 0;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.ik$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        public double f10687ik;

        /* JADX INFO: renamed from: ka */
        public long f10688ka;

        /* JADX INFO: renamed from: lr */
        public double f10689lr;

        /* JADX INFO: renamed from: ri */
        public int f10690ri;

        public ri(int i, double d, double d2, long j) {
            this.f10690ri = i;
            this.f10689lr = d;
            this.f10687ik = d2;
            this.f10688ka = j;
        }
    }

    static {
        if (C3299nr.m14642ri() != null) {
            f10673dw = C3299nr.m14640lr();
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m13514ri(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C3220lr.m13516lr(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (m13514ri(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: di */
    public boolean m13515di() {
        return this.ory;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (xha.m14907ri()) {
            mo10681ri(view, this.f10674ac, this.ihz, this.f10685uq, this.wjv, this.f10682oh, this.ory);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.igq = motionEvent.getDeviceId();
        this.f10684su = motionEvent.getToolType(0);
        this.f10686zf = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i = 1;
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                this.f10685uq = motionEvent.getRawX();
                this.wjv = motionEvent.getRawY();
                this.f10678fr = System.currentTimeMillis();
                if (Math.abs(this.f10685uq - this.f10676di) >= f10673dw || Math.abs(this.wjv - this.xha) >= f10673dw) {
                    this.ory = false;
                }
                Point point = new Point((int) this.f10685uq, (int) this.wjv);
                if (view != null && !C3220lr.m13516lr(view) && m13514ri((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.f10679ik += Math.abs(motionEvent.getX() - this.f10683ri);
                this.f10680ka += Math.abs(motionEvent.getY() - this.f10681lr);
                this.f10683ri = motionEvent.getX();
                this.f10681lr = motionEvent.getY();
                if (System.currentTimeMillis() - this.f10677fi > 200) {
                    float f = this.f10679ik;
                    int i3 = f10673dw;
                    if (f <= i3 && this.f10680ka <= i3) {
                        i = 2;
                    }
                } else {
                    i = 2;
                }
                this.f10685uq = motionEvent.getRawX();
                this.wjv = motionEvent.getRawY();
                if (Math.abs(this.f10685uq - this.f10676di) >= f10673dw || Math.abs(this.wjv - this.xha) >= f10673dw) {
                    this.ory = false;
                }
            }
            i = i2;
        } else {
            this.f10676di = (int) motionEvent.getRawX();
            this.xha = (int) motionEvent.getRawY();
            this.f10674ac = motionEvent.getRawX();
            this.ihz = motionEvent.getRawY();
            this.f10675ay = System.currentTimeMillis();
            this.f10684su = motionEvent.getToolType(0);
            this.igq = motionEvent.getDeviceId();
            this.f10686zf = motionEvent.getSource();
            this.f10679ik = 0.0f;
            this.f10680ka = 0.0f;
            this.f10677fi = System.currentTimeMillis();
            this.ory = true;
            this.hcw = view;
            C3324ik.m14916ri(motionEvent);
            this.f10683ri = motionEvent.getX();
            this.f10681lr = motionEvent.getY();
            i = 0;
        }
        this.f10682oh.put(motionEvent.getActionMasked(), new ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    /* JADX INFO: renamed from: ri */
    protected abstract void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<ri> sparseArray, boolean z);
}
