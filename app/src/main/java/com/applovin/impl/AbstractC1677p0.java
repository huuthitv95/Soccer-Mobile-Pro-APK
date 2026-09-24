package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.p0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1677p0 {

    /* JADX INFO: renamed from: a */
    private static final Map f2494a = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: b */
    private static final Map f2495b = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: c */
    private static final Map f2496c = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: d */
    private static final Map f2497d = new HashMap(2);

    /* JADX INFO: renamed from: com.applovin.impl.p0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f2498a;

        /* JADX INFO: renamed from: b */
        private int f2499b;

        /* JADX INFO: renamed from: c */
        private int f2500c;

        /* JADX INFO: renamed from: d */
        private int f2501d;

        public a(int i, int i2, int i3, int i4) {
            this.f2498a = i;
            this.f2499b = i2;
            this.f2500c = i3;
            this.f2501d = i4;
        }

        /* JADX INFO: renamed from: a */
        public static a m3816a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }

        /* JADX INFO: renamed from: a */
        public int m3817a() {
            return this.f2501d;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m3818a(Object obj) {
            return obj instanceof a;
        }

        /* JADX INFO: renamed from: b */
        public int m3819b() {
            return this.f2498a;
        }

        /* JADX INFO: renamed from: c */
        public int m3820c() {
            return this.f2500c;
        }

        /* JADX INFO: renamed from: d */
        public int m3821d() {
            return this.f2499b;
        }

        /* JADX INFO: renamed from: e */
        public Map m3822e() {
            HashMap map = new HashMap();
            map.put("left", Integer.valueOf(this.f2498a));
            map.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, Integer.valueOf(this.f2499b));
            map.put("right", Integer.valueOf(this.f2500c));
            map.put("bottom", Integer.valueOf(this.f2501d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.m3818a(this) && m3819b() == aVar.m3819b() && m3821d() == aVar.m3821d() && m3820c() == aVar.m3820c() && m3817a() == aVar.m3817a();
        }

        public int hashCode() {
            return ((((((m3819b() + 59) * 59) + m3821d()) * 59) + m3820c()) * 59) + m3817a();
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + m3819b() + ", top=" + m3821d() + ", right=" + m3820c() + ", bottom=" + m3817a() + ")";
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private int f2502a;

        /* JADX INFO: renamed from: b */
        private int f2503b;

        /* JADX INFO: renamed from: c */
        private int f2504c;

        /* JADX INFO: renamed from: d */
        private int f2505d;

        /* JADX INFO: renamed from: com.applovin.impl.p0$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private int f2506a;

            /* JADX INFO: renamed from: b */
            private int f2507b;

            /* JADX INFO: renamed from: c */
            private int f2508c;

            /* JADX INFO: renamed from: d */
            private int f2509d;

            a() {
            }

            /* JADX INFO: renamed from: a */
            public a m3828a(int i) {
                this.f2508c = i;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public b m3829a() {
                return new b(this.f2506a, this.f2507b, this.f2508c, this.f2509d);
            }

            /* JADX INFO: renamed from: b */
            public a m3830b(int i) {
                this.f2509d = i;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m3831c(int i) {
                this.f2506a = i;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public a m3832d(int i) {
                this.f2507b = i;
                return this;
            }

            public String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f2506a + ", topRight=" + this.f2507b + ", bottomLeft=" + this.f2508c + ", bottomRight=" + this.f2509d + ")";
            }
        }

        b(int i, int i2, int i3, int i4) {
            this.f2502a = i;
            this.f2503b = i2;
            this.f2504c = i3;
            this.f2505d = i4;
        }

        /* JADX INFO: renamed from: a */
        public int m3823a() {
            return this.f2504c;
        }

        /* JADX INFO: renamed from: a */
        protected boolean m3824a(Object obj) {
            return obj instanceof b;
        }

        /* JADX INFO: renamed from: b */
        public int m3825b() {
            return this.f2505d;
        }

        /* JADX INFO: renamed from: c */
        public int m3826c() {
            return this.f2502a;
        }

        /* JADX INFO: renamed from: d */
        public int m3827d() {
            return this.f2503b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.m3824a(this) && m3826c() == bVar.m3826c() && m3827d() == bVar.m3827d() && m3823a() == bVar.m3823a() && m3825b() == bVar.m3825b();
        }

        public int hashCode() {
            return ((((((m3826c() + 59) * 59) + m3827d()) * 59) + m3823a()) * 59) + m3825b();
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + m3826c() + ", topRight=" + m3827d() + ", bottomLeft=" + m3823a() + ", bottomRight=" + m3825b() + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m3792a(int i, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static Point m3793a(Context context) {
        Display defaultDisplay = AbstractC1701q7.m4104f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: a */
    public static a m3794a(WindowInsets windowInsets, C1748l c1748l) {
        if (c1748l == null || !((Boolean) c1748l.m4801a(C1831z4.f3731H4)).booleanValue() || windowInsets == null || !m3804b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    /* JADX INFO: renamed from: a */
    public static b m3795a(Context context, C1748l c1748l) {
        WindowManager windowManagerM4104f;
        if (((Boolean) c1748l.m4801a(C1831z4.f3899c4)).booleanValue() && m3815i() && (windowManagerM4104f = AbstractC1701q7.m4104f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerM4104f.getDefaultDisplay();
                return new b.a().m3831c(m3792a(0, defaultDisplay)).m3832d(m3792a(1, defaultDisplay)).m3828a(m3792a(3, defaultDisplay)).m3830b(m3792a(2, defaultDisplay)).m3829a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Map m3796a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f2494a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m3797a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3798a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f2494a.put(str, aVar.m3822e());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3799a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static Point m3800b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        C1748l c1748l = C1748l.f3003E0;
        boolean z = c1748l == null || ((Boolean) c1748l.m4801a(C1831z4.f3725G6)).booleanValue();
        if (!m3809c(context) || z) {
            Map map = f2497d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        WindowManager windowManagerM4104f = AbstractC1701q7.m4104f(context);
        if (windowManagerM4104f != null) {
            Display defaultDisplay = windowManagerM4104f.getDefaultDisplay();
            if (m3804b()) {
                Rect bounds = windowManagerM4104f.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f2497d.put(Integer.valueOf(orientation), point);
        return point;
    }

    /* JADX INFO: renamed from: b */
    public static a m3801b(WindowInsets windowInsets, C1748l c1748l) {
        if (c1748l == null || !((Boolean) c1748l.m4801a(C1831z4.f3731H4)).booleanValue() || windowInsets == null || !m3804b()) {
            return null;
        }
        return a.m3816a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    /* JADX INFO: renamed from: b */
    public static Map m3802b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f2496c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m3803b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f2496c.put(str, aVar.m3822e());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3804b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: renamed from: c */
    public static a m3805c(WindowInsets windowInsets, C1748l c1748l) {
        if (c1748l == null || !((Boolean) c1748l.m4801a(C1831z4.f3731H4)).booleanValue() || windowInsets == null || !m3804b()) {
            return null;
        }
        return a.m3816a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    /* JADX INFO: renamed from: c */
    public static Map m3806c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f2495b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m3807c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f2495b.put(str, aVar.m3822e());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3808c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3809c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m3810d() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3811e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3812f() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m3813g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3814h() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3815i() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
