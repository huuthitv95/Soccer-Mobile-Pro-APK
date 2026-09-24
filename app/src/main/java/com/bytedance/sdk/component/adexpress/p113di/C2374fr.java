package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.p065lr.C2016di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2476qt;
import com.bytedance.sdk.component.utils.C2709ay;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.fr */
/* JADX INFO: loaded from: classes3.dex */
public class C2374fr extends LinearLayout {

    /* JADX INFO: renamed from: di */
    private C2016di f6272di;

    /* JADX INFO: renamed from: fi */
    private LinearLayout f6273fi;

    /* JADX INFO: renamed from: ik */
    private TextView f6274ik;

    /* JADX INFO: renamed from: ka */
    private ri f6275ka;

    /* JADX INFO: renamed from: lr */
    private C2709ay f6276lr;

    /* JADX INFO: renamed from: ri */
    private TextView f6277ri;
    private C2476qt xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.fr$ri */
    public interface ri {
    }

    public C2374fr(Context context, View view, C2476qt c2476qt) {
        super(context);
        this.xha = c2476qt;
        m8219ri(context, view);
    }

    /* JADX INFO: renamed from: ri */
    private void m8219ri(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.f6273fi = (LinearLayout) findViewById(2097610722);
        this.f6277ri = (TextView) findViewById(2097610719);
        this.f6274ik = (TextView) findViewById(2097610718);
        C2016di c2016di = (C2016di) findViewById(2097610706);
        this.f6272di = c2016di;
        c2016di.setAnimation("lottie_json/twist_multi_angle.json");
        this.f6272di.setImageAssetsFolder("images/");
        this.f6272di.m6532ri(true);
    }

    public TextView getTopTextView() {
        return this.f6277ri;
    }

    public LinearLayout getWriggleLayout() {
        return this.f6273fi;
    }

    public View getWriggleProgressIv() {
        return this.f6272di;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f6276lr == null) {
                this.f6276lr = new C2709ay(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.di.fr.2
            };
            C2476qt c2476qt = this.xha;
            if (c2476qt != null) {
                c2476qt.m8644ik();
                this.xha.m8642fi();
                this.xha.m8641di();
                this.xha.m8652mj();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            C2016di c2016di = this.f6272di;
            if (c2016di != null) {
                c2016di.m6520fi();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: renamed from: ri */
    public void m8220ri() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.fr.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C2374fr.this.f6272di.m6527ri();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    public void setOnShakeViewListener(ri riVar) {
        this.f6275ka = riVar;
    }

    public void setShakeText(String str) {
        this.f6274ik.setText(str);
    }
}
