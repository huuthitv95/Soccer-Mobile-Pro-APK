package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2707ac;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3577ka {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.ka$ri */
    private static class ri implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ik */
        private int f13192ik;

        /* JADX INFO: renamed from: lr */
        private int f13193lr;

        /* JADX INFO: renamed from: ri */
        private final Drawable f13194ri;

        public ri(Drawable drawable) {
            this.f13194ri = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.f13193lr && i10 == this.f13192ik) {
                return;
            }
            this.f13193lr = i9;
            this.f13192ik = i10;
            this.f13194ri.setBounds(0, 0, i9, i10);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static Drawable m16531ri(Resources resources, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        try {
            String strM14385dw = wjvVar.m14385dw();
            if (TextUtils.isEmpty(strM14385dw)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strM14385dw, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16532ri(Activity activity, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (activity == null || wjvVar == null || TextUtils.isEmpty(wjvVar.m14385dw())) {
            return;
        }
        try {
            if (activity.getWindow().getDecorView().getTag(slm.f13299sr) != null) {
                return;
            }
            View decorView = activity.getWindow().getDecorView();
            int i = slm.f13299sr;
            decorView.setTag(i, Integer.valueOf(i));
            Drawable drawableM16531ri = m16531ri(activity.getResources(), wjvVar);
            if (drawableM16531ri == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableM16531ri);
        } catch (Throwable th) {
            C2707ac.m10196ik("add overlay fail", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16533ri(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (viewGroup == null || wjvVar == null || TextUtils.isEmpty(wjvVar.m14385dw())) {
            return;
        }
        try {
            if (viewGroup.getTag(slm.f13299sr) != null) {
                return;
            }
            int i = slm.f13299sr;
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable drawableM16531ri = m16531ri(viewGroup.getResources(), wjvVar);
            if (drawableM16531ri == null) {
                return;
            }
            viewGroup.setForeground(drawableM16531ri);
        } catch (Throwable th) {
            C2707ac.m10196ik("add overlay fail", th.getMessage());
        }
    }
}
