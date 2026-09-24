package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.ironsource.gd */
/* JADX INFO: loaded from: classes6.dex */
public class C12215gd implements InterfaceC11523K7, InterfaceC11523K7.a {

    /* JADX INFO: renamed from: a */
    private static final String f30429a = "CappingManager.IS_DELIVERY_ENABLED";

    /* JADX INFO: renamed from: b */
    private static final String f30430b = "CappingManager.IS_CAPPING_ENABLED";

    /* JADX INFO: renamed from: c */
    private static final String f30431c = "CappingManager.IS_PACING_ENABLED";

    /* JADX INFO: renamed from: d */
    private static final String f30432d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: e */
    private static final String f30433e = "CappingManager.CAPPING_TYPE";

    /* JADX INFO: renamed from: f */
    private static final String f30434f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* JADX INFO: renamed from: g */
    private static final String f30435g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* JADX INFO: renamed from: h */
    private static final String f30436h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* JADX INFO: renamed from: i */
    private static final String f30437i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: renamed from: com.ironsource.gd$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30438a;

        static {
            int[] iArr = new int[EnumC12233hd.values().length];
            f30438a = iArr;
            try {
                iArr[EnumC12233hd.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30438a[EnumC12233hd.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.gd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.InterfaceC11523K7
    /* JADX INFO: renamed from: a */
    public synchronized b mo26261a(Context context, AbstractC12381n3 abstractC12381n3, IronSource.EnumC12328a enumC12328a) {
        try {
            if (context == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC12381n3 == null) {
                return b.NOT_CAPPED;
            }
            String strM31557a = m31557a(enumC12328a);
            if (abstractC12381n3.m32814c() == null) {
                return b.NOT_CAPPED;
            }
            if (abstractC12381n3.m32811a() == null) {
                return b.NOT_CAPPED;
            }
            return m31561b(context, strM31557a, abstractC12381n3.m32814c());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC11523K7.a
    /* JADX INFO: renamed from: b */
    public synchronized void mo26264b(Context context, AbstractC12381n3 abstractC12381n3, IronSource.EnumC12328a enumC12328a) {
        if (context == null || abstractC12381n3 == null) {
            return;
        }
        C12153dd c12153ddM32811a = abstractC12381n3.m32811a();
        if (c12153ddM32811a == null) {
            return;
        }
        m31560a(context, m31557a(enumC12328a), abstractC12381n3.m32814c(), c12153ddM32811a);
    }

    @Override // com.ironsource.InterfaceC11523K7
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo26262c(Context context, AbstractC12381n3 abstractC12381n3, IronSource.EnumC12328a enumC12328a) {
        return mo26261a(context, abstractC12381n3, enumC12328a) != b.NOT_CAPPED;
    }

    /* JADX INFO: renamed from: b */
    private b m31561b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.m32742a(context, m31558a(str, f30429a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.m32742a(context, m31558a(str, f30431c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.m32730a(context, m31558a(str, f30437i, str2), 0L) < IronSourceUtils.m32729a(context, m31558a(str, f30434f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.m32742a(context, m31558a(str, f30430b, str2), false)) {
            int iM32729a = IronSourceUtils.m32729a(context, m31558a(str, f30432d, str2), 0);
            String strM31558a = m31558a(str, f30435g, str2);
            int iM32729a2 = IronSourceUtils.m32729a(context, strM31558a, 0);
            String strM31558a2 = m31558a(str, f30436h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.m32730a(context, strM31558a2, 0L)) {
                IronSourceUtils.m32752b(context, strM31558a, 0);
                IronSourceUtils.m32753b(context, strM31558a2, 0L);
            } else if (iM32729a2 >= iM32729a) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.InterfaceC11523K7.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo26263a(Context context, String str, IronSource.EnumC12328a enumC12328a) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m31559a(context, m31557a(enumC12328a), str);
    }

    /* JADX INFO: renamed from: a */
    private String m31558a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* JADX INFO: renamed from: a */
    private void m31559a(Context context, String str, String str2) {
        EnumC12233hd enumC12233hd;
        int i = 0;
        if (IronSourceUtils.m32742a(context, m31558a(str, f30431c, str2), false)) {
            IronSourceUtils.m32753b(context, m31558a(str, f30437i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.m32742a(context, m31558a(str, f30430b, str2), false)) {
            String strM31558a = m31558a(str, f30435g, str2);
            int iM32729a = IronSourceUtils.m32729a(context, strM31558a, 0);
            if (iM32729a == 0) {
                String strM32758c = IronSourceUtils.m32758c(context, m31558a(str, f30433e, str2), EnumC12233hd.PER_DAY.toString());
                EnumC12233hd[] enumC12233hdArrValues = EnumC12233hd.values();
                int length = enumC12233hdArrValues.length;
                while (true) {
                    if (i >= length) {
                        enumC12233hd = null;
                        break;
                    }
                    enumC12233hd = enumC12233hdArrValues[i];
                    if (enumC12233hd.f30500a.equals(strM32758c)) {
                        break;
                    } else {
                        i++;
                    }
                }
                IronSourceUtils.m32753b(context, m31558a(str, f30436h, str2), m31556a(enumC12233hd));
            }
            IronSourceUtils.m32752b(context, strM31558a, iM32729a + 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private long m31556a(EnumC12233hd enumC12233hd) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = a.f30438a[enumC12233hd.ordinal()];
        if (i == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m31560a(Context context, String str, String str2, C12153dd c12153dd) {
        boolean zM31321e = c12153dd.m31321e();
        IronSourceUtils.m32754b(context, m31558a(str, f30429a, str2), zM31321e);
        if (zM31321e) {
            boolean zM31320d = c12153dd.m31320d();
            IronSourceUtils.m32754b(context, m31558a(str, f30430b, str2), zM31320d);
            if (zM31320d) {
                IronSourceUtils.m32752b(context, m31558a(str, f30432d, str2), c12153dd.m31318b());
                IronSourceUtils.m32776f(context, m31558a(str, f30433e, str2), c12153dd.m31317a().toString());
            }
            boolean zM31322f = c12153dd.m31322f();
            IronSourceUtils.m32754b(context, m31558a(str, f30431c, str2), zM31322f);
            if (zM31322f) {
                IronSourceUtils.m32752b(context, m31558a(str, f30434f, str2), c12153dd.m31319c());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private String m31557a(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return "Banner";
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return enumC12328a.toString();
    }
}
