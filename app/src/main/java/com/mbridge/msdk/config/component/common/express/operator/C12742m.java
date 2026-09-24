package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.m */
/* JADX INFO: compiled from: OperatorMath.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12742m {

    /* JADX INFO: renamed from: b */
    private static final List<String> f33902b = Arrays.asList(C12770c.m35209b("841"), C12770c.m35209b("842"), C12770c.m35209b("843"), C12770c.m35209b("844"), C12770c.m35209b("845"), C12770c.m35209b("846"), C12770c.m35209b("847"), C12770c.m35209b("848"));

    /* JADX INFO: renamed from: a */
    private final C12748c f33903a;

    public C12742m(C12748c c12748c) {
        this.f33903a = c12748c;
    }

    /* JADX INFO: renamed from: a */
    private Object m34990a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return Double.valueOf(d);
        }
        return d == Math.floor(d) ? Integer.valueOf((int) d) : Double.valueOf(m34992b(d));
    }

    /* JADX INFO: renamed from: b */
    private double m34992b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0089 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0096 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00af A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x010e A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0129 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0136 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013b A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0160 A[Catch: Exception -> 0x016a, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0165 A[Catch: Exception -> 0x016a, TRY_LEAVE, TryCatch #2 {Exception -> 0x016a, blocks: (B:43:0x007d, B:45:0x0089, B:47:0x0096, B:49:0x00a2, B:51:0x00af, B:53:0x00bb, B:55:0x00c8, B:57:0x00d4, B:59:0x00e2, B:62:0x00f0, B:63:0x00fd, B:65:0x0102, B:67:0x010e, B:69:0x011b, B:72:0x0129, B:73:0x0136, B:75:0x013b, B:79:0x014b, B:81:0x0160, B:83:0x0165), top: B:92:0x007d }] */
    /* JADX INFO: renamed from: b */
    private C12746a m34993b(String str, Object obj, List<Object> list) {
        double dDoubleValue;
        double dDoubleValue2;
        Object obj2;
        Object obj3;
        if (obj == null) {
            return C12746a.m35017c();
        }
        try {
            dDoubleValue = obj instanceof Number ? ((Number) obj).doubleValue() : 0.0d;
            try {
                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                    dDoubleValue = Double.parseDouble(obj.toString());
                }
                if (list == null || list.isEmpty()) {
                    dDoubleValue2 = 0.0d;
                    obj3 = null;
                } else {
                    obj3 = list.get(0);
                    try {
                        dDoubleValue2 = obj3 instanceof Number ? ((Number) obj3).doubleValue() : 0.0d;
                        try {
                            if ((obj3 instanceof String) && !TextUtils.isEmpty(obj3.toString())) {
                                dDoubleValue2 = Double.parseDouble(obj3.toString());
                            }
                        } catch (Exception e) {
                            obj2 = obj3;
                            e = e;
                            C13219q0.m37817b("MathOperator", e.getMessage(), e);
                            obj3 = obj2;
                        }
                    } catch (Exception e2) {
                        obj2 = obj3;
                        e = e2;
                        dDoubleValue2 = 0.0d;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                dDoubleValue2 = 0.0d;
                obj2 = null;
                C13219q0.m37817b("MathOperator", e.getMessage(), e);
                obj3 = obj2;
                if (str.equals(C12770c.m35209b("841"))) {
                    return C12746a.m35016a(m34990a(Math.abs(dDoubleValue)));
                }
                if (str.equals(C12770c.m35209b("842"))) {
                    return C12746a.m35016a(m34990a(Math.ceil(dDoubleValue)));
                }
                if (str.equals(C12770c.m35209b("843"))) {
                    return C12746a.m35016a(m34990a(Math.floor(dDoubleValue)));
                }
                if (str.equals(C12770c.m35209b("844"))) {
                    return C12746a.m35016a(m34990a(Math.round(dDoubleValue)));
                }
                if (str.equals(C12770c.m35209b("845"))) {
                    return obj3 != null ? C12746a.m35016a(m34990a(Math.pow(dDoubleValue, dDoubleValue2))) : C12746a.m35016a(null);
                }
                if (str.equals(C12770c.m35209b("846"))) {
                    return C12746a.m35016a(m34990a(Math.sqrt(dDoubleValue)));
                }
                if (str.equals(C12770c.m35209b("847"))) {
                    return obj3 != null ? C12746a.m35016a(m34990a(Math.atan2(dDoubleValue, dDoubleValue2))) : C12746a.m35016a(null);
                }
                if (str.equals(C12770c.m35209b("848"))) {
                    return C12746a.m35017c();
                }
                if (dDoubleValue2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    return C12746a.m35016a(Integer.valueOf((int) (Math.random() * ((double) ((int) Math.floor(dDoubleValue2))))));
                }
                return C12746a.m35016a(null);
            }
        } catch (Exception e4) {
            e = e4;
            dDoubleValue = 0.0d;
            dDoubleValue2 = 0.0d;
        }
        try {
            if (str.equals(C12770c.m35209b("841"))) {
                return C12746a.m35016a(m34990a(Math.abs(dDoubleValue)));
            }
            if (str.equals(C12770c.m35209b("842"))) {
                return C12746a.m35016a(m34990a(Math.ceil(dDoubleValue)));
            }
            if (str.equals(C12770c.m35209b("843"))) {
                return C12746a.m35016a(m34990a(Math.floor(dDoubleValue)));
            }
            if (str.equals(C12770c.m35209b("844"))) {
                return C12746a.m35016a(m34990a(Math.round(dDoubleValue)));
            }
            if (str.equals(C12770c.m35209b("845"))) {
                if (obj3 != null) {
                }
            }
            if (str.equals(C12770c.m35209b("846"))) {
                return C12746a.m35016a(m34990a(Math.sqrt(dDoubleValue)));
            }
            if (str.equals(C12770c.m35209b("847"))) {
                if (obj3 != null) {
                }
            }
            if (str.equals(C12770c.m35209b("848"))) {
                return C12746a.m35017c();
            }
            if (dDoubleValue2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return C12746a.m35016a(Integer.valueOf((int) (Math.random() * ((double) ((int) Math.floor(dDoubleValue2))))));
            }
            return C12746a.m35016a(null);
        } catch (Exception e5) {
            C13219q0.m37816b("MathOperator", e5.getMessage());
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34994a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        if (m34991a(str)) {
            return m34993b(str, obj, list);
        }
        return C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private boolean m34991a(String str) {
        return str.equals(C12770c.m35209b("841")) || str.equals(C12770c.m35209b("842")) || str.equals(C12770c.m35209b("843")) || str.equals(C12770c.m35209b("844")) || str.equals(C12770c.m35209b("845")) || str.equals(C12770c.m35209b("846")) || str.equals(C12770c.m35209b("847")) || str.equals(C12770c.m35209b("848"));
    }
}
