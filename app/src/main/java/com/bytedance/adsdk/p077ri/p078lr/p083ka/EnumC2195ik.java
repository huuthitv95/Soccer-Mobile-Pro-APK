package com.bytedance.adsdk.p077ri.p078lr.p083ka;

import androidx.webkit.ProxyConfig;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2195ik implements InterfaceC2194fi {
    QUESTION("?", 0),
    COLON(CertificateUtil.DELIMITER, 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI(ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION(RemoteSettings.FORWARD_SLASH_STRING, 4),
    MOD("%", 4);


    /* JADX INFO: renamed from: nr */
    private final String f5434nr;
    private final int tan;
    private static final Map<String, EnumC2195ik> slm = new HashMap(128);

    /* JADX INFO: renamed from: bu */
    private static final Set<EnumC2195ik> f5422bu = new HashSet();

    static {
        for (EnumC2195ik enumC2195ik : values()) {
            slm.put(enumC2195ik.m7281ri(), enumC2195ik);
            f5422bu.add(enumC2195ik);
        }
    }

    EnumC2195ik(String str, int i) {
        this.f5434nr = str;
        this.tan = i;
    }

    /* JADX INFO: renamed from: ri */
    public static EnumC2195ik m7278ri(String str) {
        return slm.get(str);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m7279ri(InterfaceC2194fi interfaceC2194fi) {
        return interfaceC2194fi instanceof EnumC2195ik;
    }

    /* JADX INFO: renamed from: lr */
    public int m7280lr() {
        return this.tan;
    }

    /* JADX INFO: renamed from: ri */
    public String m7281ri() {
        return this.f5434nr;
    }
}
