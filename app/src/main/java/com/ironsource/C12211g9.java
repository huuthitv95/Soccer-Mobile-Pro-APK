package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12211g9 {

    /* JADX INFO: renamed from: com.ironsource.g9$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30428a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30428a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31551a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        C11613P7.m27208a(C11613P7.f25510a, runnable, 0L, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m31554b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C11613P7.f25510a.mo27215a(callback);
    }

    /* JADX INFO: renamed from: a */
    public final IronSource.EnumC12328a[] m31552a(List<? extends IronSourceAds.AdFormat> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = a.f30428a[it.next().ordinal()];
            if (i == 1) {
                arrayList.add(IronSource.EnumC12328a.BANNER);
            } else if (i == 2) {
                arrayList.add(IronSource.EnumC12328a.INTERSTITIAL);
            } else if (i == 3) {
                arrayList.add(IronSource.EnumC12328a.REWARDED_VIDEO);
            }
        }
        return (IronSource.EnumC12328a[]) arrayList.toArray(new IronSource.EnumC12328a[0]);
    }

    /* JADX INFO: renamed from: b */
    public final C12136ce m31553b(C12136ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.m31274c() == 2080 ? new C12136ce(error.m31274c(), "serverResponseIsNotValid") : error;
    }

    /* JADX INFO: renamed from: a */
    public final IronSourceError m31547a(C12136ce error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.m31274c() != 2070 && error.m31274c() != 2110) {
            if (error.m31274c() != 2080 && error.m31274c() != 2100) {
                if (error.m31274c() == 2090) {
                    return C12526t5.f32437a.m33741a();
                }
                return new IronSourceError(510, error.m31275d());
            }
            return C12526t5.f32437a.m33747c();
        }
        return C12526t5.f32437a.m33744b();
    }

    /* JADX INFO: renamed from: a */
    public final void m31549a(long j, C11494Ie.a responseOrigin) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(true);
        try {
            jSONObjectM32751b.put("isMultipleAdObjects", 1);
            jSONObjectM32751b.put("duration", j);
            jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.m26145b());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.SDK_INIT_SUCCESS, jSONObjectM32751b));
    }

    /* JADX INFO: renamed from: a */
    public final void m31550a(C12136ce error, long j) {
        Intrinsics.checkNotNullParameter(error, "error");
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(true);
        try {
            jSONObjectM32751b.put("errorCode", error.m31274c());
            jSONObjectM32751b.put("reason", error.m31275d());
            jSONObjectM32751b.put("duration", j);
            jSONObjectM32751b.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.SDK_INIT_FAILED, jSONObjectM32751b));
    }

    /* JADX INFO: renamed from: a */
    public final void m31548a(long j, long j2, long j3, long j4, long j5) {
        JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(true);
        try {
            jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, "parsingDurationMs=" + j + ";javaHeapKb=" + j2 + ";nativeHeapKb=" + j3 + ";sharedOtherKb=" + j4 + ";initResponseJsonSizeKb=" + j5);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_INIT_SUCCESS, jSONObjectM32751b));
    }
}
