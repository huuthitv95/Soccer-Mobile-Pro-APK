package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p172ac.C2752ri;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2754lr;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2755ri;
import java.util.Objects;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3563bu {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.bu$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo11471ri();

        /* JADX INFO: renamed from: ri */
        void mo11472ri(C2754lr c2754lr);
    }

    /* JADX INFO: renamed from: ri */
    public static Drawable m16374ri(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16375ri(C2752ri c2752ri, int i, int i2, ri riVar, String str) {
        m16376ri(c2752ri, i, i2, riVar, str, 0);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16376ri(C2752ri c2752ri, int i, int i2, final ri riVar, String str, int i3) {
        Objects.toString(c2752ri);
        C2751lr.m10463lr().m10467ka().m10482ri(c2752ri, new C2755ri.ri() { // from class: com.bytedance.sdk.openadsdk.utils.bu.1
            @Override // com.bytedance.sdk.openadsdk.p172ac.p173ri.C2755ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo10483ri(int i4, String str2, Throwable th) {
                ri riVar2 = riVar;
                if (riVar2 != null) {
                    riVar2.mo11471ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p172ac.p173ri.C2755ri.ri
            /* JADX INFO: renamed from: ri */
            public void mo10484ri(String str2, C2754lr c2754lr) {
                ri riVar2;
                if (c2754lr.m10475fi() && (riVar2 = riVar) != null) {
                    riVar2.mo11472ri(c2754lr);
                    return;
                }
                ri riVar3 = riVar;
                if (riVar3 != null) {
                    riVar3.mo11471ri();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }
}
