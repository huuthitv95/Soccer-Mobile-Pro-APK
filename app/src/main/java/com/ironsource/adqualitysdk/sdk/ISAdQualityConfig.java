package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.p286i.C11821am;
import com.ironsource.adqualitysdk.sdk.p286i.C12081kc;
import com.ironsource.adqualitysdk.sdk.p286i.C12085l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﭴ */
    private final Map<String, String> f26799;

    /* JADX INFO: renamed from: ﮐ */
    private final String f26800;

    /* JADX INFO: renamed from: ﱟ */
    private final boolean f26801;

    /* JADX INFO: renamed from: ﱡ */
    private final ISAdQualityLogLevel f26802;

    /* JADX INFO: renamed from: ﺙ */
    private final boolean f26803;

    /* JADX INFO: renamed from: ﻏ */
    private final ISAdQualityDeviceIdType f26804;

    /* JADX INFO: renamed from: ﻐ */
    private final String f26805;

    /* JADX INFO: renamed from: ﻛ */
    private final boolean f26806;

    /* JADX INFO: renamed from: ｋ */
    private final Set<ISAdQualityInitListener> f26807;

    /* JADX INFO: renamed from: ﾇ */
    private final boolean f26808;

    /* JADX INFO: renamed from: ﾒ */
    private final boolean f26809;

    /* synthetic */ ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b) {
        this(str, z, z2, z3, iSAdQualityLogLevel, set, str2, z4, z5, iSAdQualityDeviceIdType, map);
    }

    private ISAdQualityConfig(String str, boolean z, boolean z2, boolean z3, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z4, boolean z5, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f26805 = str;
        this.f26808 = z;
        this.f26806 = z2;
        this.f26809 = z3;
        this.f26802 = iSAdQualityLogLevel;
        this.f26807 = set;
        this.f26800 = str2;
        this.f26803 = z4;
        this.f26801 = z5;
        this.f26804 = iSAdQualityDeviceIdType;
        this.f26799 = map;
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f26808) {
            builder.setUserId(iSAdQualityConfig.f26805);
        } else if (iSAdQualityConfig2.f26808) {
            builder.setUserId(iSAdQualityConfig2.f26805);
        }
        if (iSAdQualityConfig.f26809) {
            builder.setTestMode(iSAdQualityConfig.f26806);
        } else if (iSAdQualityConfig2.f26809) {
            builder.setTestMode(iSAdQualityConfig2.f26806);
        }
        if (iSAdQualityConfig.f26801) {
            builder.setCoppa(iSAdQualityConfig.f26803);
        } else if (iSAdQualityConfig2.f26801) {
            builder.setCoppa(iSAdQualityConfig2.f26803);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f26802;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f26802;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f26807.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f26807.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f26800;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f26800;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f26804;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f26804;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f26799);
        map.putAll(iSAdQualityConfig.f26799);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public String getUserId() {
        return this.f26805;
    }

    public boolean isUserIdSet() {
        return this.f26808;
    }

    public boolean isTestMode() {
        return this.f26806;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f26802;
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f26807;
    }

    public String getInitializationSource() {
        return this.f26800;
    }

    public boolean getCoppa() {
        return this.f26803;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f26804;
    }

    public Map<String, String> getMetaData() {
        return this.f26799;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ﾒ */
        private String f26820 = null;

        /* JADX INFO: renamed from: ﻐ */
        private boolean f26816 = false;

        /* JADX INFO: renamed from: ﾇ */
        private boolean f26819 = false;

        /* JADX INFO: renamed from: ﻛ */
        private boolean f26817 = false;

        /* JADX INFO: renamed from: ｋ */
        private ISAdQualityLogLevel f26818 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﱡ */
        private final Set<ISAdQualityInitListener> f26813 = new HashSet();

        /* JADX INFO: renamed from: ﮐ */
        private String f26811 = null;

        /* JADX INFO: renamed from: ﱟ */
        private boolean f26812 = false;

        /* JADX INFO: renamed from: ﺙ */
        private boolean f26814 = false;

        /* JADX INFO: renamed from: ﻏ */
        private ISAdQualityDeviceIdType f26815 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﮉ */
        private final Map<String, String> f26810 = new HashMap();

        public Builder setUserId(String str) {
            this.f26820 = str;
            this.f26816 = true;
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.f26819 = z;
            this.f26817 = true;
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f26818 = iSAdQualityLogLevel;
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f26813.add(iSAdQualityInitListener);
            return this;
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f26813.remove(iSAdQualityInitListener);
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (C12081kc.m30857(str, 20)) {
                this.f26811 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setInitializationSource( ");
            sb.append(str);
            sb.append(" ) init source must have length of 1-20");
            C12085l.m30912("ISAdQualityConfig", sb.toString());
            return this;
        }

        public Builder setCoppa(boolean z) {
            this.f26812 = z;
            this.f26814 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f26815 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(string);
                            sb.append(" , ");
                            sb.append(objOpt);
                            sb.append(" ) value must be a string");
                            C12085l.m30912("ISAdQualityConfig", sb.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    if (!C11821am.m28462(str)) {
                        if (C11821am.m28461(this.f26810, str)) {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(str);
                            sb.append(" , ");
                            sb.append(str2);
                            sb.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                            C12085l.m30912("ISAdQualityConfig", sb.toString());
                            return this;
                        }
                        if (!C11821am.m28463(str, str2)) {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(str);
                            sb2.append(" , ");
                            sb2.append(str2);
                            sb2.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                            C12085l.m30912("ISAdQualityConfig", sb2.toString());
                            return this;
                        }
                    }
                    this.f26810.put(str, str2);
                }
            } catch (Exception unused) {
            }
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f26820, this.f26816, this.f26819, this.f26817, this.f26818, this.f26813, this.f26811, this.f26812, this.f26814, this.f26815, this.f26810, (byte) 0);
        }
    }
}
