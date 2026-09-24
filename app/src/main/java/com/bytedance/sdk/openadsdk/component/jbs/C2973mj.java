package com.bytedance.sdk.openadsdk.component.jbs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.C3335bu;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.jbs.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2973mj {

    /* JADX INFO: renamed from: lr */
    private static Drawable f9038lr;

    /* JADX INFO: renamed from: ri */
    private static boolean f9039ri;

    /* JADX INFO: renamed from: ik */
    private C3335bu f9040ik;

    /* JADX INFO: renamed from: ka */
    private TextView f9041ka;

    /* JADX INFO: renamed from: ik */
    public static Drawable m11552ik() {
        return f9038lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m11553lr() {
        if (f9039ri) {
            return;
        }
        try {
            int iJbs = C3304qt.m14669lr().jbs();
            if (iJbs != 0) {
                f9038lr = C3299nr.m14642ri().getResources().getDrawable(iJbs);
            }
            f9039ri = true;
        } catch (Throwable unused) {
            f9039ri = true;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11554ri() {
        String strM14693mj = C3304qt.m14669lr().m14693mj();
        if (TextUtils.isEmpty(strM14693mj)) {
            this.f9041ka.setVisibility(8);
        } else {
            this.f9041ka.setText(strM14693mj);
        }
        m11553lr();
        try {
            Drawable drawable = f9038lr;
            if (drawable == null) {
                this.f9040ik.setVisibility(8);
                return;
            }
            this.f9040ik.setImageDrawable(drawable);
            if (this.f9041ka.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9040ik.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f9040ik.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.f9040ik.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11555ri(AbstractC2970ik abstractC2970ik, wjv wjvVar, float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (abstractC2970ik != null) {
            this.f9040ik = abstractC2970ik.getHostAppIcon();
            this.f9041ka = abstractC2970ik.getHostAppName();
            View userInfo = abstractC2970ik.getUserInfo();
            if (abstractC2970ik instanceof C2971ka) {
                C3335bu c3335bu = this.f9040ik;
                if (c3335bu != null && (layoutParams2 = c3335bu.getLayoutParams()) != null) {
                    if (wjvVar.bbu() == 1) {
                        int iM16589lr = C3583qd.m16589lr(this.f9040ik.getContext(), 40.0f);
                        layoutParams2.width = iM16589lr;
                        layoutParams2.height = iM16589lr;
                    } else {
                        int iM16589lr2 = C3583qd.m16589lr(this.f9040ik.getContext(), 30.0f);
                        layoutParams2.width = iM16589lr2;
                        layoutParams2.height = iM16589lr2;
                    }
                    this.f9040ik.setLayoutParams(layoutParams2);
                }
                if (this.f9041ka != null) {
                    if (wjvVar.bbu() == 1) {
                        this.f9041ka.setTextSize(30.0f);
                    } else {
                        this.f9041ka.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (wjvVar.bbu() == 1) {
                        layoutParams.height = C3583qd.m16589lr(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = C3583qd.m16589lr(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.jbs.mj.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }
}
