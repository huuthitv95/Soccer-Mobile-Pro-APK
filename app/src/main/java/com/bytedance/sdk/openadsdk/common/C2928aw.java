package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2928aw {

    /* JADX INFO: renamed from: di */
    private final String f8752di;

    /* JADX INFO: renamed from: fi */
    private ImageView f8753fi;

    /* JADX INFO: renamed from: ik */
    private final Context f8754ik;

    /* JADX INFO: renamed from: ka */
    private C2634di f8755ka;

    /* JADX INFO: renamed from: lr */
    private RelativeLayout f8756lr;

    /* JADX INFO: renamed from: mj */
    private boolean f8757mj;

    /* JADX INFO: renamed from: ri */
    private final wjv f8758ri;
    private ihz xha;

    public C2928aw(Context context, wjv wjvVar, String str, boolean z) {
        this.f8754ik = context;
        this.f8758ri = wjvVar;
        this.f8752di = str;
        this.f8757mj = z;
        m11241fi();
    }

    /* JADX INFO: renamed from: fi */
    private void m11241fi() {
        RelativeLayout relativeLayoutM11242ri = m11242ri(this.f8754ik, this.f8757mj);
        this.f8756lr = relativeLayoutM11242ri;
        this.f8755ka = (C2634di) relativeLayoutM11242ri.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13267fe);
        ihz ihzVar = new ihz(this.f8754ik, (RelativeLayout) this.f8756lr.findViewById(com.bytedance.sdk.openadsdk.utils.slm.yjm), this.f8758ri, this.f8755ka, this.f8752di, this.f8757mj);
        this.xha = ihzVar;
        this.f8753fi = ihzVar.m11338ik();
    }

    /* JADX INFO: renamed from: ri */
    private static RelativeLayout m11242ri(Context context, boolean z) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new jbs(context));
        new C2634di(context, C2634di.ik.LANDING_PAGE);
        C2634di c2634di = z ? new C2634di(context, C2634di.ik.PRIVACY) : new C2634di(context, C2634di.ik.LANDING_PAGE);
        c2634di.setId(com.bytedance.sdk.openadsdk.utils.slm.f13267fe);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.slm.yjm);
        if (z) {
            relativeLayout.addView(c2634di, layoutParams);
        }
        return relativeLayout;
    }

    /* JADX INFO: renamed from: ik */
    public C2634di m11243ik() {
        return this.f8755ka;
    }

    /* JADX INFO: renamed from: ka */
    public View m11244ka() {
        return this.f8756lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m11245lr() {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.m11341lr();
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11246lr(String str) {
        this.xha.m11342lr(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11247ri() {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.m11343ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11248ri(WebView webView, C3347di.ri riVar) {
        ihz ihzVar = this.xha;
        if (ihzVar != null) {
            ihzVar.m11344ri(webView, riVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11249ri(String str) {
        this.xha.m11345ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11250ri(boolean z) {
        this.xha.m11346ri(z);
    }
}
