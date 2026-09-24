package com.bytedance.sdk.openadsdk.core.p219ik;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.C3299nr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3216di {

    /* JADX INFO: renamed from: qt */
    public static int f10659qt = 8;

    /* JADX INFO: renamed from: ri */
    public float f10670ri = -1.0f;

    /* JADX INFO: renamed from: lr */
    public float f10667lr = -1.0f;

    /* JADX INFO: renamed from: ik */
    public float f10665ik = -1.0f;

    /* JADX INFO: renamed from: ka */
    public float f10666ka = -1.0f;

    /* JADX INFO: renamed from: fi */
    public long f10664fi = -1;

    /* JADX INFO: renamed from: di */
    public long f10663di = -1;
    public int xha = -1;

    /* JADX INFO: renamed from: mj */
    public int f10668mj = BackupConstant.UNFINISHED_FAIL_CODE;
    public int jbs = -1;

    /* JADX INFO: renamed from: sf */
    public boolean f10671sf = true;

    /* JADX INFO: renamed from: co */
    public SparseArray<AbstractViewOnClickListenerC3218ik.ri> f10662co = new SparseArray<>();

    /* JADX INFO: renamed from: aw */
    private float f10660aw = 0.0f;
    private float bgr = 0.0f;

    /* JADX INFO: renamed from: vr */
    private float f10672vr = 0.0f;
    private float slm = 0.0f;

    /* JADX INFO: renamed from: bu */
    private long f10661bu = 0;

    /* JADX INFO: renamed from: nr */
    private int f10669nr = 0;
    private int tan = 0;

    static {
        if (C3299nr.m14642ri() != null) {
            f10659qt = C3299nr.m14640lr();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX INFO: renamed from: ri */
    public void m13513ri(MotionEvent motionEvent) {
        int i;
        this.f10668mj = motionEvent.getDeviceId();
        int i2 = 0;
        this.xha = motionEvent.getToolType(0);
        this.jbs = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked != 0) {
            i = 3;
            if (actionMasked == 1) {
                this.f10665ik = motionEvent.getRawX();
                this.f10666ka = motionEvent.getRawY();
                this.f10663di = System.currentTimeMillis();
                if (Math.abs(this.f10665ik - this.f10669nr) >= f10659qt || Math.abs(this.f10666ka - this.tan) >= f10659qt) {
                    this.f10671sf = false;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.f10672vr += Math.abs(motionEvent.getX() - this.f10660aw);
                this.slm += Math.abs(motionEvent.getY() - this.bgr);
                this.f10660aw = motionEvent.getX();
                this.bgr = motionEvent.getY();
                if (System.currentTimeMillis() - this.f10661bu > 200) {
                    float f = this.f10672vr;
                    int i4 = f10659qt;
                    if (f <= i4 && this.slm <= i4) {
                        i3 = 2;
                    }
                } else {
                    i3 = 2;
                }
                this.f10665ik = motionEvent.getRawX();
                this.f10666ka = motionEvent.getRawY();
                if (Math.abs(this.f10665ik - this.f10669nr) >= f10659qt || Math.abs(this.f10666ka - this.tan) >= f10659qt) {
                    this.f10671sf = false;
                }
                i = i3;
            }
            this.f10662co.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.f10669nr = (int) motionEvent.getRawX();
        this.tan = (int) motionEvent.getRawY();
        this.f10670ri = motionEvent.getRawX();
        this.f10667lr = motionEvent.getRawY();
        this.f10664fi = System.currentTimeMillis();
        this.xha = motionEvent.getToolType(0);
        this.f10668mj = motionEvent.getDeviceId();
        this.jbs = motionEvent.getSource();
        this.f10672vr = 0.0f;
        this.slm = 0.0f;
        this.f10661bu = System.currentTimeMillis();
        this.f10671sf = true;
        this.f10660aw = motionEvent.getX();
        this.bgr = motionEvent.getY();
        i = i2;
        this.f10662co.put(motionEvent.getActionMasked(), new AbstractViewOnClickListenerC3218ik.ri(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
