package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.d */
/* JADX INFO: compiled from: OperatorBasicArithmetic.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12733d {

    /* JADX INFO: renamed from: b */
    private static final List<String> f33885b = Arrays.asList("+", "-", ProxyConfig.MATCH_ALL_SCHEMES, RemoteSettings.FORWARD_SLASH_STRING, "%");

    /* JADX INFO: renamed from: a */
    private final C12748c f33886a;

    public C12733d(C12748c c12748c) {
        this.f33886a = c12748c;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX INFO: renamed from: b */
    private C12746a m34918b(String str, Object obj, List<Object> list) {
        Double dValueOf;
        byte b = 0;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        Double dM34915a = m34915a(obj);
        Double dM34915a2 = m34915a(obj2);
        if (dM34915a == null || dM34915a2 == null) {
            return C12746a.m35016a(null);
        }
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 45) {
                    if (iHashCode != 47) {
                        if (iHashCode != 42) {
                            if (iHashCode != 43 || !str.equals("+")) {
                                b = -1;
                            }
                        } else if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals(RemoteSettings.FORWARD_SLASH_STRING)) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("-")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("%")) {
                b = 4;
            } else {
                b = -1;
            }
            if (b == 0) {
                dValueOf = Double.valueOf(dM34915a.doubleValue() + dM34915a2.doubleValue());
            } else if (b == 1) {
                dValueOf = Double.valueOf(dM34915a.doubleValue() - dM34915a2.doubleValue());
            } else if (b == 2) {
                dValueOf = Double.valueOf(dM34915a.doubleValue() * dM34915a2.doubleValue());
            } else if (b != 3) {
                if (b != 4) {
                    dValueOf = null;
                } else {
                    if (dM34915a2.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        throw new ArithmeticException("Modulo by zero");
                    }
                    dValueOf = Double.valueOf(dM34915a.doubleValue() % dM34915a2.doubleValue());
                }
            } else {
                if (dM34915a2.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    throw new ArithmeticException("Division by zero");
                }
                dValueOf = Double.valueOf(new BigDecimal(dM34915a.doubleValue()).divide(new BigDecimal(dM34915a2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
            }
        } catch (Exception e) {
            C13219q0.m37816b("BasicArithmeticOperator", e.getMessage());
        }
        if (!(dValueOf instanceof Double)) {
            return C12746a.m35016a(null);
        }
        double dDoubleValue = dValueOf.doubleValue();
        return C12746a.m35016a(m34916a(dDoubleValue) ? Integer.valueOf(dValueOf.intValue()) : Double.valueOf(m34917b(dDoubleValue)));
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34919a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        Iterator<String> it = f33885b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return m34918b(str, obj, list);
            }
        }
        return C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private Double m34915a(Object obj) {
        if (obj == null) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m34916a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private double m34917b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
