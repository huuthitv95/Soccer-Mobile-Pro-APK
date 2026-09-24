package com.bytedance.adsdk.p077ri.p078lr.p079fi.p080ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2179ik {
    /* JADX INFO: renamed from: ri */
    private static Object m7240ri(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7241ri(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7242ri(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7243ri(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) > number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    public static Object m7244ri(Object obj, Number number) {
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return m7242ri(((Number) obj).intValue(), number);
        }
        if (obj instanceof Long) {
            return m7243ri(((Long) obj).longValue(), number);
        }
        if (obj instanceof Float) {
            return m7241ri(((Float) obj).floatValue(), number);
        }
        if (obj instanceof Double) {
            return m7240ri(((Double) obj).doubleValue(), number);
        }
        if (!(obj instanceof String)) {
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
        try {
            return m7241ri(Float.parseFloat((String) obj), number);
        } catch (NumberFormatException unused) {
            throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
        }
    }
}
