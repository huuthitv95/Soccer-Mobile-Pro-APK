package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.InterfaceC3125ri;
import com.bytedance.sdk.openadsdk.p269vr.C3600fi;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C3333ac {

    /* JADX INFO: renamed from: di */
    private boolean f11702di = false;

    /* JADX INFO: renamed from: fi */
    private lr f11703fi;

    /* JADX INFO: renamed from: ik */
    private Context f11704ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC3125ri f11705ka;

    /* JADX INFO: renamed from: lr */
    private TextView f11706lr;

    /* JADX INFO: renamed from: mj */
    private ViewGroup f11707mj;

    /* JADX INFO: renamed from: ri */
    private View f11708ri;
    private C1997lr xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ac$lr */
    public interface lr {
        /* JADX INFO: renamed from: qt */
        boolean mo12848qt();

        /* JADX INFO: renamed from: sf */
        void mo12864sf();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ac$ri */
    public enum ri {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m14983ik() {
        if (this.f11704ik == null) {
            return;
        }
        m14984ka();
    }

    /* JADX INFO: renamed from: ka */
    private void m14984ka() {
        View view = this.f11708ri;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m14986lr() {
        this.xha = null;
    }

    /* JADX INFO: renamed from: ri */
    private ViewGroup.LayoutParams m14987ri(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m14988ri(Context context, View view, boolean z) {
        ViewGroup.LayoutParams layoutParamsM14987ri;
        if (context == null || view == null || this.f11708ri != null || (layoutParamsM14987ri = m14987ri(this.f11707mj)) == null) {
            return;
        }
        C3600fi c3600fi = new C3600fi(context);
        this.f11708ri = c3600fi;
        c3600fi.setLayoutParams(layoutParamsM14987ri);
        this.f11707mj.addView(this.f11708ri);
        this.f11706lr = (TextView) this.f11708ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13274ib);
        View viewFindViewById = this.f11708ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.mvf);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ac.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    C3333ac.this.m14983ik();
                    if (C3333ac.this.f11705ka != null) {
                        C3333ac.this.f11705ka.mo12959ri(ri.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m14989ri(C1997lr c1997lr, boolean z) {
        View view;
        String str;
        View view2;
        if (c1997lr == null || (view = this.f11708ri) == null || this.f11704ik == null || view.getVisibility() == 0) {
            return;
        }
        lr lrVar = this.f11703fi;
        if (lrVar != null) {
            lrVar.mo12864sf();
        }
        double dCeil = Math.ceil((c1997lr.m6342fi() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(C2729uq.m10311ri(this.f11704ik, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = C2729uq.m10311ri(this.f11704ik, "tt_video_without_wifi_tips") + C2729uq.m10311ri(this.f11704ik, "tt_video_bytesize");
        }
        C3583qd.m16612ri(this.f11708ri, 0);
        C3583qd.m16620ri(this.f11706lr, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!C3583qd.m16588ka(this.f11708ri) || (view2 = this.f11708ri) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }

    /* JADX INFO: renamed from: ri */
    private boolean m14991ri(int i) {
        lr lrVar;
        if (m14995ri() || this.f11702di) {
            return true;
        }
        if (this.f11705ka != null && (lrVar = this.f11703fi) != null) {
            if (lrVar.mo12848qt()) {
                this.f11705ka.mo6407fi(null, null);
            }
            this.f11705ka.mo12959ri(ri.PAUSE_VIDEO, (String) null);
        }
        m14989ri(this.xha, true);
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public void m14992ri(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.f11707mj = viewGroup;
        this.f11704ik = C3299nr.m14642ri().getApplicationContext();
    }

    /* JADX INFO: renamed from: ri */
    public void m14993ri(InterfaceC3125ri interfaceC3125ri, lr lrVar) {
        this.f11703fi = lrVar;
        this.f11705ka = interfaceC3125ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14994ri(boolean z) {
        if (z) {
            m14986lr();
        }
        m14984ka();
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14995ri() {
        View view = this.f11708ri;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14996ri(int i, C1997lr c1997lr, boolean z) {
        Context context = this.f11704ik;
        if (context == null || c1997lr == null) {
            return true;
        }
        m14988ri(context, this.f11707mj, z);
        this.xha = c1997lr;
        if (i == 1 || i == 2) {
            return m14991ri(i);
        }
        return true;
    }
}
