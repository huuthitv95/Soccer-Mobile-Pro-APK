package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C12513v;

/* JADX INFO: renamed from: com.ironsource.y2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12613y2 {

    /* JADX INFO: renamed from: a */
    public static C12613y2 f33200a;

    /* JADX INFO: renamed from: com.ironsource.y2$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33201a;

        static {
            int[] iArr = new int[C12386n8.a.values().length];
            f33201a = iArr;
            try {
                iArr[C12386n8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33201a[C12386n8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33201a[C12386n8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C12613y2 m34201a() {
        C12613y2 c12613y2 = f33200a;
        return c12613y2 == null ? new C12613y2() : c12613y2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m34202a(Activity activity) {
        if (a.f33201a[C11802aa.m28151e().m28156b().ordinal()] != 3) {
            return false;
        }
        try {
            C12513v c12513v = (C12513v) C11561M9.m26506b((Context) activity).mo26512a().m33428k();
            if (c12513v == null) {
                return true;
            }
            c12513v.m33581l("back");
            return true;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
