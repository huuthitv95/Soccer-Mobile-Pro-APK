package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p209di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.jbs.p099lr.C2279ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3161ri extends C2279ri {

    /* JADX INFO: renamed from: lr */
    private final C2279ri f10411lr;

    /* JADX INFO: renamed from: ri */
    private final C2279ri f10412ri;

    public C3161ri(Context context) {
        super(context);
        C2279ri c2279ri = new C2279ri(context);
        this.f10412ri = c2279ri;
        addView(c2279ri, new FrameLayout.LayoutParams(-1, -1));
        C2279ri c2279ri2 = new C2279ri(context);
        this.f10411lr = c2279ri2;
        c2279ri2.setBackgroundColor(0);
        addView(c2279ri2, new FrameLayout.LayoutParams(-1, -1));
    }

    public C2279ri getMarkView() {
        return this.f10411lr;
    }

    public C2279ri getVideoView() {
        return this.f10412ri;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10411lr.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f10411lr.setOnTouchListener(onTouchListener);
    }
}
