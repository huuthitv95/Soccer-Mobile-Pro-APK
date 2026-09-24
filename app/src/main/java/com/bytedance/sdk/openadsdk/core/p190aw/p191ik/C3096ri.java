package com.bytedance.sdk.openadsdk.core.p190aw.p191ik;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3096ri {

    /* JADX INFO: renamed from: ri */
    public static final Set<String> f9783ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ri.1
        {
            add("image/jpeg");
            add(MimeTypes.IMAGE_PNG);
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };

    /* JADX INFO: renamed from: lr */
    public static Set<String> f9782lr = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ri.2
        {
            add("application/x-javascript");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ri$lr */
    public enum lr {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.ik.ri$ri */
    public enum ri {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* JADX INFO: renamed from: ri */
    public static Point m12456ri(Context context, int i, int i2, lr lrVar) {
        if (context == null) {
            context = C3299nr.m14642ri();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int iM16589lr = C3583qd.m16589lr(context, i);
        int iM16589lr2 = C3583qd.m16589lr(context, i2);
        if (iM16589lr > width || iM16589lr2 > height) {
            Point point2 = new Point();
            if (lr.HTML_RESOURCE == lrVar) {
                point2.x = Math.min(width, iM16589lr);
                point2.y = Math.min(height, iM16589lr2);
            } else {
                float f = iM16589lr;
                float f2 = f / width;
                float f3 = iM16589lr2;
                float f4 = f3 / height;
                if (f2 >= f4) {
                    point2.x = width;
                    point2.y = (int) (f3 / f2);
                } else {
                    point2.x = (int) (f / f4);
                    point2.y = height;
                }
            }
            if (point2.x >= 0 && point2.y >= 0) {
                point2.x = C3583qd.m16581ik(context, point2.x);
                point2.y = C3583qd.m16581ik(context, point2.y);
                return point2;
            }
        }
        return point;
    }
}
