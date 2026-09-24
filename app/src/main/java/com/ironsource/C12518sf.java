package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sf */
/* JADX INFO: loaded from: classes6.dex */
public class C12518sf {

    /* JADX INFO: renamed from: a */
    private static final Map<IronSource.EnumC12328a, C12450r0> f32413a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.sf$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f32414a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f32415b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f32415b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32415b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32415b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32415b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.EnumC12328a.values().length];
            f32414a = iArr2;
            try {
                iArr2[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32414a[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32414a[IronSource.EnumC12328a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32414a[IronSource.EnumC12328a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11656S0 m33673a(AbstractC12593x0 abstractC12593x0, int i) {
        return m33675a(abstractC12593x0).m33207a(abstractC12593x0.mo26467b().m31570c(), abstractC12593x0.m34083m(), i);
    }

    /* JADX INFO: renamed from: b */
    public static b m33683b(IronSource.EnumC12328a enumC12328a) {
        return new b(enumC12328a);
    }

    /* JADX INFO: renamed from: c */
    public static int m33684c(IronSource.EnumC12328a enumC12328a) {
        int i = a.f32414a[enumC12328a.ordinal()];
        if (i == 1) {
            return AbstractC12295l3.e.REWARDED_VIDEO.m32048b();
        }
        if (i == 2) {
            return AbstractC12295l3.e.INTERSTITIAL.m32048b();
        }
        if (i != 3) {
            return i != 4 ? AbstractC12295l3.e.NOT_SUPPORTED.m32048b() : AbstractC12295l3.e.BANNER.m32048b();
        }
        return AbstractC12295l3.e.NATIVE_AD.m32048b();
    }

    /* JADX INFO: renamed from: b */
    public static IronSource.EnumC12328a m33682b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i = a.f32415b[adFormat.ordinal()];
        if (i == 1) {
            return IronSource.EnumC12328a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.EnumC12328a.INTERSTITIAL;
        }
        if (i == 3) {
            return IronSource.EnumC12328a.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return IronSource.EnumC12328a.NATIVE_AD;
    }

    /* JADX INFO: renamed from: a */
    private static C12450r0 m33675a(AbstractC12593x0 abstractC12593x0) {
        Map<IronSource.EnumC12328a, C12450r0> map = f32413a;
        if (map.containsKey(abstractC12593x0.mo26467b().m31567a())) {
            return map.get(abstractC12593x0.mo26467b().m31567a());
        }
        C12450r0 c12450r0 = new C12450r0();
        map.put(abstractC12593x0.mo26467b().m31567a(), c12450r0);
        return c12450r0;
    }

    /* JADX INFO: renamed from: com.ironsource.sf$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final IronSource.EnumC12328a f32416a;

        public b(IronSource.EnumC12328a enumC12328a) {
            this.f32416a = enumC12328a;
        }

        /* JADX INFO: renamed from: b */
        private String m33685b() {
            IronSource.EnumC12328a enumC12328a = this.f32416a;
            return enumC12328a != null ? enumC12328a.name() : "";
        }

        /* JADX INFO: renamed from: a */
        public String m33688a(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append(m33685b());
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb.append(str3);
            String string = sb.toString();
            if (TextUtils.isEmpty(str)) {
                return string;
            }
            return string + " - " + str;
        }

        /* JADX INFO: renamed from: a */
        public String m33687a(String str) {
            return m33688a(str, null);
        }

        /* JADX INFO: renamed from: a */
        public String m33686a() {
            return m33687a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11767Y9 m33674a() {
        return C12367p.m32628h().m32673n();
    }

    /* JADX INFO: renamed from: a */
    public static void m33680a(Throwable th) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th.getMessage());
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        m33678a(EnumC12598x5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static void m33679a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        m33678a(EnumC12598x5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static void m33678a(EnumC12598x5 enumC12598x5, JSONObject jSONObject) {
        C11455Gb.m25891U().mo25850q().mo25281a(new C12580w5(enumC12598x5, C12194fa.m31480a(IronSourceUtils.m32751b(false), jSONObject)));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m33681a(AdapterBaseInterface adapterBaseInterface, IronSource.EnumC12328a enumC12328a, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(m33676a(enumC12328a))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m33677a(LevelPlay.AdFormat adFormat) {
        int i = a.f32415b[adFormat.ordinal()];
        if (i == 1) {
            return "rewarded";
        }
        if (i == 2) {
            return "interstitial";
        }
        if (i == 3) {
            return "banner";
        }
        if (i != 4) {
            return "";
        }
        return "nativeAd";
    }

    /* JADX INFO: renamed from: a */
    public static LevelPlay.AdFormat m33676a(IronSource.EnumC12328a enumC12328a) {
        int i = a.f32414a[enumC12328a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}
