package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.ic */
/* JADX INFO: loaded from: classes6.dex */
public final class C12250ic {

    /* JADX INFO: renamed from: com.ironsource.ic$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f30582a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f30583b = "SDKPluginType";

        /* JADX INFO: renamed from: c */
        public static final String f30584c = "sessionid";

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m31741a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.f30583b, pluginType);
        }
        String strM32764d = IronSourceUtils.m32764d();
        if (strM32764d != null) {
            linkedHashMap.put("sessionid", strM32764d);
        }
        return linkedHashMap;
    }
}
