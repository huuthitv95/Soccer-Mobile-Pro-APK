package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.adqualitysdk.sdk.p286i.C12081kc;
import com.ironsource.adqualitysdk.sdk.p286i.C12085l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﮐ */
    private final Map<String, String> f26837;

    /* JADX INFO: renamed from: ﺙ */
    private final long f26838;

    /* JADX INFO: renamed from: ﻏ */
    private double f26839;

    /* JADX INFO: renamed from: ﻐ */
    private final int f26840;

    /* JADX INFO: renamed from: ﻛ */
    private final String f26841;

    /* JADX INFO: renamed from: ｋ */
    private final String f26842;

    /* JADX INFO: renamed from: ﾇ */
    private final AtomicBoolean f26843;

    /* JADX INFO: renamed from: ﾒ */
    private final int f26844;

    /* synthetic */ ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    private ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map<String, String> map) {
        this.f26841 = str;
        this.f26840 = i;
        this.f26842 = str2;
        this.f26844 = i2;
        this.f26843 = atomicBoolean;
        this.f26839 = d;
        this.f26838 = j;
        this.f26837 = map;
    }

    public String getName() {
        return this.f26841;
    }

    public int getAge() {
        return this.f26840;
    }

    public String getGender() {
        return this.f26842;
    }

    public int getLevel() {
        return this.f26844;
    }

    public AtomicBoolean getIsPaying() {
        return this.f26843;
    }

    public double getInAppPurchasesTotal() {
        return this.f26839;
    }

    public long getUserCreationDate() {
        return this.f26838;
    }

    public Map<String, String> getCustomData() {
        return this.f26837;
    }

    public static class Builder {

        /* JADX INFO: renamed from: ｋ */
        private String f26851;

        /* JADX INFO: renamed from: ﾒ */
        private String f26853;

        /* JADX INFO: renamed from: ﻐ */
        private double f26849 = 999999.99d;

        /* JADX INFO: renamed from: ﻛ */
        private int f26850 = -1;

        /* JADX INFO: renamed from: ﾇ */
        private int f26852 = -1;

        /* JADX INFO: renamed from: ﱡ */
        private AtomicBoolean f26847 = null;

        /* JADX INFO: renamed from: ﮐ */
        private long f26845 = 0;

        /* JADX INFO: renamed from: ﱟ */
        private double f26846 = -1.0d;

        /* JADX INFO: renamed from: ﺙ */
        private Map<String, String> f26848 = new HashMap();

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (C12081kc.m30862(str) && C12081kc.m30857(str, 32)) {
                this.f26853 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setSegmentName( ");
            sb.append(str);
            sb.append(" ) segment name must be alphanumeric and 1-32 in length");
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setAge(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i <= 199) {
                this.f26850 = i;
                return this;
            }
            StringBuilder sb = new StringBuilder("setAge( ");
            sb.append(i);
            sb.append(" ) age must be between 1-199");
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.C12373a.f31470b) || str.toLowerCase(Locale.ENGLISH).equals(IronSourceConstants.C12373a.f31471c)) {
                this.f26851 = str.toLowerCase(Locale.ENGLISH);
                return this;
            }
            StringBuilder sb = new StringBuilder("setGender( ");
            sb.append(str);
            sb.append(" ) is invalid");
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setLevel(int i) {
            if (i == 0) {
                return this;
            }
            if (i > 0 && i < 999999) {
                this.f26852 = i;
                return this;
            }
            StringBuilder sb = new StringBuilder("setLevel( ");
            sb.append(i);
            sb.append(" ) level must be between 1-999999");
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setIsPaying(boolean z) {
            if (this.f26847 == null) {
                this.f26847 = new AtomicBoolean();
            }
            this.f26847.set(z);
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < this.f26849) {
                this.f26846 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb = new StringBuilder("setIAPTotal( ");
            sb.append(d);
            sb.append(" ) iapt must be between 0-");
            sb.append(this.f26849);
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f26845 = j;
                return this;
            }
            StringBuilder sb = new StringBuilder("setUserCreationDate( ");
            sb.append(j);
            sb.append(" ) is an invalid timestamp");
            C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f26848.size() < 5) {
                        if (C12081kc.m30862(str) && C12081kc.m30862(str2) && C12081kc.m30857(str, 32) && C12081kc.m30857(str2, 32)) {
                            this.f26848.put("sgct_".concat(String.valueOf(str)), str2);
                            return this;
                        }
                        StringBuilder sb = new StringBuilder("setCustomData( ");
                        sb.append(str);
                        sb.append(" , ");
                        sb.append(str2);
                        sb.append(" ) key and value must be alphanumeric and 1-32 in length");
                        C12085l.m30912("ISAdQualitySegment Builder", sb.toString());
                        return this;
                    }
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    C12085l.m30912("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f26853, this.f26850, this.f26851, this.f26852, this.f26847, this.f26846, this.f26845, new HashMap(this.f26848), (byte) 0);
        }
    }
}
