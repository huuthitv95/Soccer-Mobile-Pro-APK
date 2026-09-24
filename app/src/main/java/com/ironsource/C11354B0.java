package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.B0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11354B0 {
    /* JADX INFO: renamed from: a */
    public static int m25367a(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: b */
    public static int m25368b(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return 1021;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return 1020;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return 1019;
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return 1018;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: c */
    public static int m25369c(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return 612;
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: d */
    public static int m25370d(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return 1027;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: e */
    public static int m25371e(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return 1024;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: f */
    public static int m25372f(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL || enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return 604;
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return 704;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: g */
    public static int m25373g(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return 1022;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }

    /* JADX INFO: renamed from: h */
    public static int m25374h(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 510;
    }
}
