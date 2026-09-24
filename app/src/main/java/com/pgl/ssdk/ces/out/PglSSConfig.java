package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a */
    private String f41305a;

    /* JADX INFO: renamed from: b */
    private final int f41306b;

    /* JADX INFO: renamed from: c */
    private final int f41307c;

    /* JADX INFO: renamed from: d */
    private String f41308d;

    /* JADX INFO: renamed from: e */
    private Map<String, Object> f41309e;

    /* JADX INFO: renamed from: f */
    private PglSSCallBack f41310f;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private String f41311a;

        /* JADX INFO: renamed from: b */
        private int f41312b = -1;

        /* JADX INFO: renamed from: c */
        private int f41313c = 0;

        /* JADX INFO: renamed from: d */
        private String f41314d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f41311a)) {
                return null;
            }
            return new PglSSConfig(this.f41311a, this.f41312b, this.f41313c, this.f41314d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f41314d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f41311a = str;
            return this;
        }

        public Builder setCollectMode(int i) {
            this.f41313c = i;
            return this;
        }

        public Builder setOVRegionType(int i) {
            this.f41312b = i;
            return this;
        }
    }

    private PglSSConfig(String str, int i, int i2, String str2) {
        this.f41305a = str;
        this.f41306b = i;
        this.f41307c = i2;
        this.f41308d = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f41308d;
    }

    public String getAppId() {
        return this.f41305a;
    }

    public PglSSCallBack getCallBack() {
        return this.f41310f;
    }

    public int getCollectMode() {
        return this.f41307c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f41309e;
    }

    public int getOVRegionType() {
        return this.f41306b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f41310f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f41309e = map;
    }
}
