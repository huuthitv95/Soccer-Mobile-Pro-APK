package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Build;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.e */
/* JADX INFO: compiled from: OperatorComparison.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12734e {

    /* JADX INFO: renamed from: b */
    private static final List<String> f33887b = Arrays.asList("==", "!=", ">=", "<=", ">", "<");

    /* JADX INFO: renamed from: a */
    private final C12748c f33888a;

    public C12734e(C12748c c12748c) {
        this.f33888a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34929b(String str, Object obj, List<Object> list) {
        byte b = 0;
        BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction = null;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case 60:
                if (!str.equals("<")) {
                    b = -1;
                }
                break;
            case 62:
                b = !str.equals(">") ? (byte) -1 : (byte) 1;
                break;
            case 1084:
                b = !str.equals("!=") ? (byte) -1 : (byte) 2;
                break;
            case 1921:
                b = !str.equals("<=") ? (byte) -1 : (byte) 3;
                break;
            case 1952:
                b = !str.equals("==") ? (byte) -1 : (byte) 4;
                break;
            case 1983:
                b = !str.equals(">=") ? (byte) -1 : (byte) 5;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda6
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34935f((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case 1:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda5
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34934e((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case 2:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda4
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34930b((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case 3:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda3
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34933d((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case 4:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda2
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34921a((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
            case 5:
                biFunction = new BiFunction() { // from class: com.mbridge.msdk.config.component.common.express.operator.e$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return C12734e.m34932c((Comparable) obj3, (Comparable) obj4);
                    }
                };
                break;
        }
        return biFunction == null ? C12746a.m35017c() : m34920a(str, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m34932c(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m34933d(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m34934e(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m34935f(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
    }

    /* JADX INFO: renamed from: a */
    public C12746a m34936a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        Iterator<String> it = f33887b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return m34929b(str, obj, list);
            }
        }
        return C12746a.m35017c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m34921a(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(comparable.equals(comparable2));
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34920a(String str, Object obj, Object obj2, BiFunction<Comparable<Object>, Comparable<Object>, Boolean> biFunction) {
        Object objValueOf;
        Object objValueOf2;
        if (obj != null && obj2 != null) {
            if (obj.getClass().equals(obj2.getClass())) {
                objValueOf = obj;
                objValueOf2 = obj2;
            } else {
                Object[] objArrM34928a = m34928a(obj, obj2);
                if (objArrM34928a != null) {
                    objValueOf = objArrM34928a[0];
                    objValueOf2 = objArrM34928a[1];
                } else {
                    C13219q0.m37816b("ComparisonOperator", "Type conversion failed for comparison: " + obj.getClass().getSimpleName() + " vs " + obj2.getClass().getSimpleName());
                    return C12746a.m35016a(null);
                }
            }
            if ((objValueOf instanceof Comparable) && (objValueOf2 instanceof Comparable)) {
                try {
                    objValueOf = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
                    objValueOf2 = Integer.valueOf(Integer.parseInt(String.valueOf(obj2)));
                } catch (Exception unused) {
                }
                try {
                    Comparable<Object> comparable = (Comparable) objValueOf;
                    Comparable<Object> comparable2 = (Comparable) objValueOf2;
                    if (Build.VERSION.SDK_INT >= 24) {
                        return C12746a.m35016a(biFunction.apply(comparable, comparable2));
                    }
                    return C12746a.m35016a(m34922a(comparable, comparable2, str));
                } catch (Exception e) {
                    C13219q0.m37817b("ComparisonOperator", e.getMessage(), e);
                }
            }
            return C12746a.m35016a(null);
        }
        return C12746a.m35016a(m34923a(obj, obj2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m34930b(Comparable comparable, Comparable comparable2) {
        return Boolean.valueOf(!comparable.equals(comparable2));
    }

    /* JADX INFO: renamed from: b */
    private Number m34931b(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                if (str.contains(".")) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private Boolean m34923a(Object obj, Object obj2, String str) {
        str.hashCode();
        if (str.equals("!=")) {
            return Boolean.valueOf(obj != obj2);
        }
        if (str.equals("==")) {
            return Boolean.valueOf(obj == obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private Boolean m34922a(Comparable<Object> comparable, Comparable<Object> comparable2, String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "<":
                return Boolean.valueOf(comparable.compareTo(comparable2) < 0);
            case ">":
                return Boolean.valueOf(comparable.compareTo(comparable2) > 0);
            case "!=":
                return Boolean.valueOf(comparable.compareTo(comparable2) != 0);
            case "<=":
                return Boolean.valueOf(comparable.compareTo(comparable2) <= 0);
            case "==":
                return Boolean.valueOf(comparable.compareTo(comparable2) == 0);
            case ">=":
                return Boolean.valueOf(comparable.compareTo(comparable2) >= 0);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private Object[] m34928a(Object obj, Object obj2) {
        try {
            if (m34926a(obj) && m34926a(obj2)) {
                return m34927a((Number) obj, (Number) obj2);
            }
            if (m34926a(obj) && (obj2 instanceof String)) {
                Number number = (Number) obj;
                Number numberM34931b = m34931b((String) obj2);
                if (numberM34931b != null) {
                    return m34927a(number, numberM34931b);
                }
                return null;
            }
            if ((obj instanceof String) && m34926a(obj2)) {
                Number numberM34931b2 = m34931b((String) obj);
                Number number2 = (Number) obj2;
                if (numberM34931b2 != null) {
                    return m34927a(numberM34931b2, number2);
                }
                return null;
            }
            if ((obj instanceof String) && (obj2 instanceof String)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof Boolean)) {
                return new Object[]{obj, obj2};
            }
            if ((obj instanceof Boolean) && (obj2 instanceof String)) {
                Boolean bool = (Boolean) obj;
                Boolean boolM34924a = m34924a((String) obj2);
                if (boolM34924a != null) {
                    return new Object[]{bool, boolM34924a};
                }
                return null;
            }
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return null;
            }
            Boolean boolM34924a2 = m34924a((String) obj);
            Boolean bool2 = (Boolean) obj2;
            if (boolM34924a2 != null) {
                return new Object[]{boolM34924a2, bool2};
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37817b("ComparisonOperator", "Type conversion error: " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m34926a(Object obj) {
        return obj instanceof Number;
    }

    /* JADX INFO: renamed from: a */
    private Boolean m34924a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.toLowerCase().trim();
        if (!"true".equals(strTrim) && !"1".equals(strTrim) && !"yes".equals(strTrim)) {
            if ("false".equals(strTrim) || "0".equals(strTrim) || "no".equals(strTrim)) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    private Object[] m34927a(Number number, Number number2) {
        if (m34925a(number) && m34925a(number2)) {
            return new Object[]{Long.valueOf(number.longValue()), Long.valueOf(number2.longValue())};
        }
        return new Object[]{Double.valueOf(number.doubleValue()), Double.valueOf(number2.doubleValue())};
    }

    /* JADX INFO: renamed from: a */
    private boolean m34925a(Number number) {
        return (number instanceof Integer) || (number instanceof Long) || (number instanceof Short) || (number instanceof Byte);
    }
}
