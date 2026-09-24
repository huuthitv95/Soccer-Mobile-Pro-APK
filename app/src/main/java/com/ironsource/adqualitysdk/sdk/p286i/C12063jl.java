package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jl */
/* JADX INFO: loaded from: classes6.dex */
public final class C12063jl {

    /* JADX INFO: renamed from: ﾒ */
    private static C12063jl f29672;

    /* JADX INFO: renamed from: ﻐ */
    private Map<String, b> f29673 = new HashMap();

    /* JADX INFO: renamed from: ﻛ */
    private Handler f29674 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ｋ */
    private Map<String, b> f29675;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jl$b */
    public enum b {
        f29682,
        f29684,
        f29681;


        /* JADX INFO: renamed from: ﮐ */
        private static int f29679 = 0;

        /* JADX INFO: renamed from: ﺙ */
        private static int f29680 = 1;

        /* JADX INFO: renamed from: ﾒ */
        private static int f29685;

        /* JADX INFO: renamed from: ｋ */
        static void m30708() {
            f29685 = 25;
        }

        public static b valueOf(String str) {
            int i = 2 % 2;
            int i2 = f29680 + 29;
            f29679 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i3 != 0) {
                super.hashCode();
                throw null;
            }
            int i4 = f29680 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29679 = i4 % 128;
            if (i4 % 2 == 0) {
                return bVar;
            }
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            int i = 2 % 2;
            int i2 = f29679 + 91;
            f29680 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            b[] bVarArr = (b[]) values().clone();
            int i3 = f29680 + 33;
            f29679 = i3 % 128;
            int i4 = i3 % 2;
            return bVarArr;
        }

        static {
            m30708();
            int i = f29679 + 81;
            f29680 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
        /* JADX INFO: renamed from: ﻐ */
        public static b m30706(String str) {
            byte b;
            int i = 2 % 2;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 3642) {
                if (iHashCode != 96921) {
                    if (iHashCode == 109261 && str.equals(m30707("\u0001\u0000\u0000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, TextUtils.indexOf("", "", 0, 0) + 135).intern())) {
                        int i2 = f29679 + 23;
                        f29680 = i2 % 128;
                        int i3 = i2 % 2;
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (!str.equals(m30707("\u0001\ufff6\t", 3 - View.MeasureSpec.makeMeasureSpec(0, 0), false, (Process.myTid() >> 22) + 1, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (str.equals(m30707("\u0003�", 2 - View.combineMeasuredStates(0, 0), true, View.resolveSizeAndState(0, 0, 0) + 1, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 135).intern())) {
                int i4 = f29679 + 59;
                f29680 = i4 % 128;
                b = i4 % 2 == 0 ? (byte) 4 : (byte) 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                return f29682;
            }
            if (b == 1) {
                return f29684;
            }
            if (b != 2) {
                return null;
            }
            b bVar = f29681;
            int i5 = f29679 + 49;
            f29680 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 36 / 0;
            }
            return bVar;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30707(String str, int i, boolean z, int i2, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11889d.f28479) {
                char[] cArr2 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    C11889d.f28480 = cArr[C11889d.f28481];
                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                    int i4 = C11889d.f28481;
                    cArr2[i4] = (char) (cArr2[i4] - f29685);
                    C11889d.f28481++;
                }
                if (i2 > 0) {
                    C11889d.f28478 = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
                }
                if (z) {
                    char[] cArr4 = new char[i];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i) {
                        cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                        C11889d.f28481++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static synchronized C12063jl m30700() {
        if (f29672 == null) {
            f29672 = new C12063jl();
        }
        return f29672;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final synchronized void m30704(final String str, final b bVar) {
        this.f29674.post(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                synchronized (C12063jl.this) {
                    C12063jl.this.f29673.put(str, bVar);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﾒ */
    public final synchronized boolean m30705(Activity activity) {
        return b.f29684 == m30698(activity);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final synchronized boolean m30703(Activity activity) {
        return b.f29681 == m30698(activity);
    }

    /* JADX INFO: renamed from: ﻛ */
    private synchronized b m30698(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m30699().containsKey(name)) {
                return m30699().get(name);
            }
            if (m30702().containsKey(name)) {
                return m30702().get(name);
            }
        }
        return b.m30706(AbstractC11823ao.m28472().mo28482());
    }

    /* JADX INFO: renamed from: ﻛ */
    private synchronized Map<String, b> m30699() {
        return new HashMap(this.f29673);
    }

    /* JADX INFO: renamed from: ﾒ */
    private synchronized Map<String, b> m30702() {
        if (this.f29675 == null) {
            this.f29675 = new HashMap();
            JSONObject jSONObjectMo28480 = AbstractC11823ao.m28472().mo28480();
            if (jSONObjectMo28480 != null) {
                this.f29675 = C12077jz.m30810(jSONObjectMo28480, new C12077jz.c<b>() { // from class: com.ironsource.adqualitysdk.sdk.i.jl.4
                    @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
                    /* JADX INFO: renamed from: ﾒ */
                    public final /* synthetic */ b mo28541(JSONObject jSONObject, String str) {
                        return b.m30706(jSONObject.optString(str));
                    }
                });
            }
        }
        return this.f29675;
    }
}
