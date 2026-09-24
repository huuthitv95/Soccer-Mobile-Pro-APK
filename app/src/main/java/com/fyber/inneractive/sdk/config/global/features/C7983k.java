package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C7983k extends AbstractC7981i {
    public C7983k() {
        super("load_timeouts");
    }

    /* JADX INFO: renamed from: a */
    public static String m20421a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append("_");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m20422d(String str) {
        return UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) || UnitDisplayType.REWARDED.name().equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m20423e(String str) {
        return TextUtils.isEmpty(str) ? "all_mediators" : str.toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: b */
    public final int m20424b(String str, String str2) {
        String strM20421a = m20421a(str, "bidding", "global_timeout", m20423e(str2));
        String strM20421a2 = m20421a(str, "bidding", "global_timeout", "all_mediators");
        int iIntValue = m20422d(str) ? 30000 : 10000;
        Integer numMo20416a = mo20416a(m20421a(str, "global_timeout", "all_mediators"));
        if (numMo20416a != null) {
            iIntValue = numMo20416a.intValue();
        }
        Integer numMo20416a2 = mo20416a(strM20421a2);
        if (numMo20416a2 != null) {
            iIntValue = numMo20416a2.intValue();
        }
        Integer numMo20416a3 = mo20416a(strM20421a);
        return numMo20416a3 != null ? numMo20416a3.intValue() : iIntValue;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7983k c7983k = new C7983k();
        m20418a(c7983k);
        return c7983k;
    }

    /* JADX INFO: renamed from: c */
    public final int m20425c(String str, String str2) {
        String strM20421a = m20421a(str, "global_timeout", m20423e(str2));
        String strM20421a2 = m20421a(str, "global_timeout", "all_mediators");
        int iIntValue = m20422d(str) ? 30000 : 10000;
        Integer numMo20416a = mo20416a(m20421a(str, "global_timeout", "all_mediators"));
        if (numMo20416a != null) {
            iIntValue = numMo20416a.intValue();
        }
        Integer numMo20416a2 = mo20416a(strM20421a2);
        if (numMo20416a2 != null) {
            iIntValue = numMo20416a2.intValue();
        }
        Integer numMo20416a3 = mo20416a(strM20421a);
        return numMo20416a3 != null ? numMo20416a3.intValue() : iIntValue;
    }
}
