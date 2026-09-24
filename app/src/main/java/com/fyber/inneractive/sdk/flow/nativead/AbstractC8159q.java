package com.fyber.inneractive.sdk.flow.nativead;

import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.q */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8159q {

    /* JADX INFO: renamed from: a */
    public static final String f18170a;

    /* JADX INFO: renamed from: b */
    public static final String f18171b;

    static {
        String strM21999b = AbstractC9174o.m21999b("ia_js_load_monitor.txt");
        f18170a = "<html><head>" + strM21999b + "<script src='%s'></script></head><body></body></html>";
        f18171b = "<html><head>" + strM21999b + "%s</head><body></body></html>";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20572a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m20573b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (str.startsWith(iAConfigManager.f17685q ? "https" : ProxyConfig.MATCH_HTTP)) {
            return String.format(f18170a, str);
        }
        if (iAConfigManager.f17685q && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(f18171b, str);
    }
}
