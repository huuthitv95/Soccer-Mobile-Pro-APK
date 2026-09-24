package com.bytedance.sdk.openadsdk.component.reward.p188ri;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C3023sf {

    /* JADX INFO: renamed from: ik */
    private boolean f9416ik;

    /* JADX INFO: renamed from: lr */
    private final C3022ri f9417lr;

    /* JADX INFO: renamed from: ri */
    protected int f9418ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.sf$lr */
    public static class lr {

        /* JADX INFO: renamed from: ri */
        private ri f9422ri;

        /* JADX INFO: renamed from: ri */
        public void m12025ri(Activity activity) {
            Window window;
            if (this.f9422ri == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.f9422ri);
            this.f9422ri = null;
        }

        /* JADX INFO: renamed from: ri */
        public void m12026ri(final Activity activity, final int i, final float f, final boolean z) {
            if (this.f9422ri == null) {
                try {
                    boolean z2 = true;
                    if (C3299nr.m14639ka().zyn() != 1) {
                        z2 = false;
                    }
                    final boolean z3 = z2;
                    final boolean zM16584ik = C3583qd.m16584ik(activity);
                    if (zM16584ik || z3) {
                        try {
                            this.f9422ri = new ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.lr.1

                                /* JADX INFO: renamed from: ri */
                                boolean f9429ri;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                /* JADX INFO: renamed from: lr */
                                private void m12027lr() {
                                    try {
                                        int iM12007ik = C3023sf.m12007ik(activity, i);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iM12007ik == 0) {
                                            int[] iArrM12014lr = C3023sf.m12014lr(activity, decorView, i, zM16584ik, z3);
                                            if (iArrM12014lr[4] == 1) {
                                                this.f9429ri = C3023sf.m12012lr(decorView, iArrM12014lr[0], iArrM12014lr[1], iArrM12014lr[2], iArrM12014lr[3], f);
                                            }
                                        } else if (this.f9429ri) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.f9429ri = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                                /* JADX INFO: renamed from: ri */
                                private void m12028ri() {
                                    int iAbs;
                                    float fM16601ri;
                                    try {
                                        if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                            iAbs = Math.abs(C3583qd.m16573aw(activity) - activity.getWindow().getDecorView().getWidth());
                                        } else {
                                            iAbs = Math.abs(C3583qd.m16575co(activity) - activity.getWindow().getDecorView().getHeight());
                                        }
                                        View decorView = activity.getWindow().getDecorView();
                                        int paddingLeft = decorView.getPaddingLeft();
                                        int paddingRight = decorView.getPaddingRight();
                                        int paddingBottom = decorView.getPaddingBottom();
                                        if (iAbs != 0) {
                                            if (this.f9429ri) {
                                                decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                                this.f9429ri = false;
                                                return;
                                            }
                                            return;
                                        }
                                        int paddingTop = decorView.getPaddingTop();
                                        if (i != 1 || activity.getResources().getConfiguration().orientation != 1) {
                                            if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                                if (zM16584ik) {
                                                    paddingLeft += (int) C3583qd.m16601ri();
                                                }
                                                if (z3) {
                                                    fM16601ri = C3583qd.m16601ri();
                                                }
                                            }
                                            if (decorView.isAttachedToWindow()) {
                                                decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                this.f9429ri = true;
                                            }
                                            if (f == 100.0f) {
                                                decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                            }
                                        }
                                        fM16601ri = C3583qd.m16601ri();
                                        paddingTop += (int) fM16601ri;
                                        if (decorView.isAttachedToWindow()) {
                                            decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                            this.f9429ri = true;
                                        }
                                        if (f == 100.0f) {
                                            decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.p188ri.C3023sf.ri
                                /* JADX INFO: renamed from: ri */
                                void mo12029ri(int i2, int i3) {
                                    if (z) {
                                        m12027lr();
                                    } else {
                                        m12028ri();
                                    }
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.f9422ri);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.ri.sf$ri */
    private static abstract class ri implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: lr */
        private int f9430lr;

        /* JADX INFO: renamed from: ri */
        private int f9431ri;

        private ri() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.f9431ri && i10 == this.f9430lr) {
                return;
            }
            this.f9431ri = i9;
            this.f9430lr = i10;
            mo12029ri(i9, i10);
        }

        /* JADX INFO: renamed from: ri */
        abstract void mo12029ri(int i, int i2);
    }

    public C3023sf(C3022ri c3022ri) {
        this.f9418ri = 0;
        this.f9416ik = false;
        this.f9417lr = c3022ri;
        m12010lr();
        try {
            this.f9418ri = C3583qd.m16581ik(c3022ri.f9384ig, C3583qd.m16601ri());
            if (!c3022ri.f9384ig.getWindow().hasFeature(1)) {
                c3022ri.f9384ig.requestWindowFeature(1);
            }
            c3022ri.f9384ig.getWindow().addFlags(16777344);
            if (c3022ri.bnj == 2 || !C3583qd.m16584ik(c3022ri.f9384ig)) {
                c3022ri.f9384ig.getWindow().addFlags(1024);
            }
            this.f9416ik = c3022ri.f9383id;
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    /* JADX INFO: renamed from: fi */
    private float m12006fi() {
        return C3583qd.m16581ik(this.f9417lr.f9384ig, C3583qd.m16575co(this.f9417lr.f9384ig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static int m12007ik(Activity activity, int i) {
        int i2 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (m12018ri(i, i2)) {
            return Math.abs(C3583qd.m16573aw(activity) - decorView.getWidth());
        }
        return Math.abs(C3583qd.m16575co(activity) - decorView.getHeight());
    }

    /* JADX INFO: renamed from: ik */
    private void m12008ik() {
        if (this.f9417lr.bnj != 2) {
            m12011lr(this.f9417lr.f9384ig, 1);
        } else if (this.f9417lr.rzk) {
            m12011lr(this.f9417lr.f9384ig, 8);
        } else {
            m12011lr(this.f9417lr.f9384ig, 0);
        }
    }

    /* JADX INFO: renamed from: ka */
    private float m12009ka() {
        return C3583qd.m16581ik(this.f9417lr.f9384ig, C3583qd.m16573aw(this.f9417lr.f9384ig));
    }

    /* JADX INFO: renamed from: lr */
    private void m12010lr() {
        C3022ri c3022ri = this.f9417lr;
        c3022ri.siy = c3022ri.f9389lr.m14406gz();
        C3022ri c3022ri2 = this.f9417lr;
        c3022ri2.bnj = m12016ri(c3022ri2.f9384ig, this.f9417lr.f9389lr);
    }

    /* JADX INFO: renamed from: lr */
    private static void m12011lr(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        int i2 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m12012lr(View view, int i, int i2, int i3, int i4, float f) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i, i2, i3, i4);
        if (f != 100.0f) {
            return true;
        }
        view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        return true;
    }

    /* JADX INFO: renamed from: lr */
    private float[] m12013lr(int i) {
        float fM12006fi = m12006fi();
        float fM12009ka = m12009ka();
        if ((this.f9417lr.bnj == 1) != (fM12006fi > fM12009ka)) {
            float f = fM12006fi + fM12009ka;
            fM12009ka = f - fM12009ka;
            fM12006fi = f - fM12009ka;
        }
        if (this.f9417lr.bnj == 1) {
            fM12006fi -= i;
        } else {
            fM12009ka -= i;
        }
        return new float[]{fM12009ka, fM12006fi};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static int[] m12014lr(Activity activity, View view, int i, boolean z, boolean z2) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fM16601ri;
        int i2 = 0;
        if (activity == null || view == null) {
            if (view != null) {
                paddingLeft = view.getPaddingLeft();
                paddingTop = view.getPaddingTop();
                paddingRight = view.getPaddingRight();
                paddingBottom = view.getPaddingBottom();
            } else {
                paddingLeft = 0;
                paddingBottom = 0;
                paddingTop = 0;
                paddingRight = 0;
            }
            return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
        }
        int i3 = activity.getResources().getConfiguration().orientation;
        int paddingLeft2 = view.getPaddingLeft();
        int paddingTop2 = view.getPaddingTop();
        int paddingRight2 = view.getPaddingRight();
        int paddingBottom2 = view.getPaddingBottom();
        if (i == 1) {
            if (i3 == 1) {
                fM16601ri = C3583qd.m16601ri();
                paddingTop2 += (int) fM16601ri;
                i2 = 1;
            } else {
                paddingLeft2 += (int) C3583qd.m16601ri();
            }
        } else if (i == 2) {
            if (i3 == 2) {
                if (z) {
                    paddingLeft2 += (int) C3583qd.m16601ri();
                    i2 = 1;
                }
                if (z2) {
                    fM16601ri = C3583qd.m16601ri();
                    paddingTop2 += (int) fM16601ri;
                    i2 = 1;
                }
            } else {
                paddingTop2 += (int) C3583qd.m16601ri();
            }
        }
        return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i2};
    }

    /* JADX INFO: renamed from: ri */
    public static int m12016ri(Activity activity, wjv wjvVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return wjvVar.bbu();
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m12018ri(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    /* JADX INFO: renamed from: ri */
    public void m12021ri() {
        C3583qd.m16608ri(this.f9417lr.f9384ig);
        this.f9417lr.f9384ig.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (C3023sf.this.f9417lr.f9384ig.isFinishing()) {
                            return;
                        }
                        C3023sf.this.f9417lr.f9384ig.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3583qd.m16608ri(C3023sf.this.f9417lr.f9384ig);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        C2707ac.m10196ik("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m12022ri(igq igqVar) {
        if (igqVar == null) {
            return;
        }
        igqVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = C3023sf.this.f9417lr.f9384ig.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX INFO: renamed from: ri */
    public void m12023ri(boolean z) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    m12008ik();
                } catch (Throwable unused) {
                }
            } else {
                m12008ik();
            }
        }
        float fM12009ka = m12009ka();
        float fM12006fi = m12006fi();
        if (this.f9417lr.bnj == 2) {
            fMin = Math.max(fM12009ka, fM12006fi);
            fMax = Math.min(fM12009ka, fM12006fi);
        } else {
            fMin = Math.min(fM12009ka, fM12006fi);
            fMax = Math.max(fM12009ka, fM12006fi);
        }
        Activity activity = this.f9417lr.f9384ig;
        int iM16581ik = C3583qd.m16581ik(activity, C3583qd.m16601ri());
        if (this.f9417lr.bnj != 2) {
            if (C3583qd.m16584ik(activity)) {
                fMax -= iM16581ik;
            }
        } else if (C3583qd.m16584ik(activity)) {
            fMin -= iM16581ik;
        }
        if (z) {
            this.f9417lr.whw = (int) fMin;
            this.f9417lr.f9411xm = (int) fMax;
            return;
        }
        int i2 = 20;
        if (this.f9417lr.bnj != 2) {
            if (this.f9417lr.siy == 0.0f || this.f9417lr.siy == 100.0f) {
                i2 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / this.f9417lr.siy)) / 2.0f, 0.0f);
                i = iMax2;
                iMax = 20;
            }
        } else if (this.f9417lr.siy == 0.0f || this.f9417lr.siy == 100.0f) {
            i2 = 0;
            iMax = 0;
            iMax2 = 0;
            i = 0;
        } else {
            iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * this.f9417lr.siy)) / 2.0f, 0.0f);
            iMax2 = 20;
            i = 20;
            i2 = iMax;
        }
        float f = i2;
        float f2 = iMax;
        this.f9417lr.whw = (int) ((fMin - f) - f2);
        float f3 = iMax2;
        float f4 = i;
        this.f9417lr.f9411xm = (int) ((fMax - f3) - f4);
        if (this.f9417lr.ajz == null || this.f9417lr.ajz.f8473qt == 0) {
            activity.getWindow().getDecorView().setPadding(C3583qd.m16589lr(activity, f), C3583qd.m16589lr(activity, f3), C3583qd.m16589lr(activity, f2), C3583qd.m16589lr(activity, f4));
        }
    }

    /* JADX INFO: renamed from: ri */
    public float[] m12024ri(int i) {
        float[] fArrM12013lr = new float[2];
        Activity activity = this.f9417lr.f9384ig;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.f9416ik && paddingLeft == 0 && paddingTop == 0 && m12007ik(activity, i) == 0) {
            int[] iArrM12014lr = m12014lr(activity, decorView, i, C3583qd.m16584ik(activity), C3299nr.m14639ka().zyn() == 1);
            int i2 = iArrM12014lr[0];
            paddingTop = iArrM12014lr[1];
            paddingLeft = i2;
        }
        if (Build.VERSION.SDK_INT < 35 || this.f9417lr.f9389lr.m14406gz() != 100.0f) {
            fArrM12013lr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrM12013lr[1] = decorView.getHeight() - (paddingTop * 2);
        } else {
            fArrM12013lr[0] = decorView.getWidth() - paddingLeft;
            fArrM12013lr[1] = decorView.getHeight() - paddingTop;
        }
        fArrM12013lr[0] = C3583qd.m16581ik(activity, fArrM12013lr[0]);
        float fM16581ik = C3583qd.m16581ik(activity, fArrM12013lr[1]);
        fArrM12013lr[1] = fM16581ik;
        if (fArrM12013lr[0] < 10.0f || fM16581ik < 10.0f) {
            fArrM12013lr = m12013lr(this.f9418ri);
        }
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                    if (i == 2) {
                        float f = fArrM12013lr[0];
                        float f2 = fArrM12013lr[1];
                        if (f < f2) {
                            fArrM12013lr[1] = f;
                            fArrM12013lr[0] = f2;
                        }
                    } else {
                        float f3 = fArrM12013lr[0];
                        float f4 = fArrM12013lr[1];
                        if (f3 > f4) {
                            fArrM12013lr[1] = f3;
                            fArrM12013lr[0] = f4;
                        }
                    }
                }
            }
            float f5 = fArrM12013lr[0];
            float f6 = fArrM12013lr[1];
        }
        return fArrM12013lr;
    }
}
