package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.config.component.common.express.entities.C12719a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.f */
/* JADX INFO: compiled from: OperatorCompoundAssignment.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12735f {

    /* JADX INFO: renamed from: b */
    private static final List<String> f33889b = Arrays.asList("+=", "-=", "*=", "/=", "%=");

    /* JADX INFO: renamed from: a */
    private final C12748c f33890a;

    public C12735f(C12748c c12748c) {
        this.f33890a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34945b(String str, Object obj, List<Object> list) {
        String strM34894a;
        Object objM34897b;
        Object objM34942a = m34942a(list);
        if (obj instanceof C12719a) {
            C12719a c12719a = (C12719a) obj;
            strM34894a = c12719a.m34894a();
            objM34897b = c12719a.m34897b();
        } else {
            strM34894a = "";
            objM34897b = null;
        }
        String str2 = strM34894a;
        if (TextUtils.isEmpty(str2)) {
            return C12746a.m35016a(null);
        }
        if (objM34897b instanceof C12894a) {
            C12894a c12894a = (C12894a) objM34897b;
            return m34937a(c12894a, str2, str, c12894a.m36051b(str2), objM34942a);
        }
        if (objM34897b instanceof Map) {
            Map map = (Map) objM34897b;
            return m34939a(map, str2, str, map.get(str2), objM34942a);
        }
        if (objM34897b instanceof List) {
            try {
                int i = Integer.parseInt(str2);
                if (i >= 0 && i < ((List) objM34897b).size()) {
                    return m34938a((List) objM34897b, i, str, ((List) objM34897b).get(i), objM34942a);
                }
                C13219q0.m37816b("CompoundAssignOp", "List index out of bounds: " + str2 + ", list size: " + ((List) objM34897b).size());
            } catch (NumberFormatException unused) {
                C13219q0.m37816b("CompoundAssignOp", "Invalid list index: " + str2);
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34946a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        String strTrim = str.trim();
        Iterator<String> it = f33889b.iterator();
        while (it.hasNext()) {
            if (strTrim.equals(it.next())) {
                return m34945b(strTrim, obj, list);
            }
        }
        return C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private Object m34942a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34937a(C12894a c12894a, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dM34940a = m34940a(obj);
        Double dM34940a2 = m34940a(obj2);
        if (dM34940a != null && dM34940a2 != null) {
            try {
                Object objM34941a = m34941a(dM34940a, dM34940a2, str2);
                if (objM34941a instanceof Double) {
                    double dDoubleValue = ((Double) objM34941a).doubleValue();
                    if (m34943a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objM34941a).intValue());
                    } else {
                        objValueOf = Double.valueOf(m34944b(dDoubleValue));
                    }
                    if (c12894a != null) {
                        c12894a.m36045a(str, objValueOf);
                    }
                    return C12746a.m35016a(objValueOf);
                }
            } catch (Exception e) {
                C13219q0.m37817b("CompoundAssignOp", e.getMessage(), e);
            }
            return C12746a.m35016a(null);
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: b */
    private double m34944b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34939a(Map map, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dM34940a = m34940a(obj);
        Double dM34940a2 = m34940a(obj2);
        if (dM34940a != null && dM34940a2 != null) {
            try {
                Object objM34941a = m34941a(dM34940a, dM34940a2, str2);
                if (objM34941a instanceof Double) {
                    double dDoubleValue = ((Double) objM34941a).doubleValue();
                    if (m34943a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objM34941a).intValue());
                    } else {
                        objValueOf = Double.valueOf(m34944b(dDoubleValue));
                    }
                    if (map != null) {
                        map.put(str, objValueOf);
                    }
                    return C12746a.m35016a(objValueOf);
                }
            } catch (Exception e) {
                C13219q0.m37817b("CompoundAssignOp", e.getMessage(), e);
            }
            return C12746a.m35016a(null);
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34938a(List list, int i, String str, Object obj, Object obj2) {
        Object objValueOf;
        Double dM34940a = m34940a(obj);
        Double dM34940a2 = m34940a(obj2);
        if (dM34940a != null && dM34940a2 != null) {
            try {
                Object objM34941a = m34941a(dM34940a, dM34940a2, str);
                if (objM34941a instanceof Double) {
                    double dDoubleValue = ((Double) objM34941a).doubleValue();
                    if (m34943a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objM34941a).intValue());
                    } else {
                        objValueOf = Double.valueOf(m34944b(dDoubleValue));
                    }
                    if (list != null) {
                        list.set(i, objValueOf);
                    }
                    return C12746a.m35016a(objValueOf);
                }
            } catch (Exception e) {
                C13219q0.m37817b("CompoundAssignOp", e.getMessage(), e);
            }
            return C12746a.m35016a(null);
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: a */
    private Double m34940a(Object obj) {
        if (obj == null) {
            return null;
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

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX INFO: renamed from: a */
    private Object m34941a(Double d, Double d2, String str) {
        byte b;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 1208) {
                if (iHashCode != 1363) {
                    if (iHashCode != 1394) {
                        if (iHashCode != 1456) {
                            if (iHashCode == 1518 && str.equals("/=")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("-=")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("+=")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("*=")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("%=")) {
                b = 4;
            } else {
                b = -1;
            }
            if (b == 0) {
                return Double.valueOf(d.doubleValue() + d2.doubleValue());
            }
            if (b == 1) {
                return Double.valueOf(d.doubleValue() - d2.doubleValue());
            }
            if (b == 2) {
                return Double.valueOf(d.doubleValue() * d2.doubleValue());
            }
            if (b == 3) {
                if (d2.doubleValue() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    return Double.valueOf(new BigDecimal(d.doubleValue()).divide(new BigDecimal(d2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                }
                throw new ArithmeticException("Division by zero");
            }
            if (b != 4) {
                return null;
            }
            if (d2.doubleValue() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return Double.valueOf(d.doubleValue() % d2.doubleValue());
            }
            throw new ArithmeticException("Modulo by zero");
        } catch (Exception e) {
            C13219q0.m37816b("CompoundAssignOp", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m34943a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }
}
