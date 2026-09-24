package com.bytedance.adsdk.p077ri;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements jbs {
    /* JADX INFO: renamed from: ri */
    private int m7314ri(Object obj, int i) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    private Number m7315ri(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m7316ri(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
    }

    @Override // com.bytedance.adsdk.p077ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Number mo7214ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberM7315ri = m7315ri(objArr[0]);
        int iM7314ri = m7314ri(objArr[1], 0);
        boolean zM7316ri = m7316ri(objArr[2], false);
        if (numberM7315ri == null) {
            return null;
        }
        return m7318ri(numberM7315ri, iM7314ri, zM7316ri);
    }

    /* JADX INFO: renamed from: ri */
    public Number m7318ri(Number number, int i, boolean z) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || xha$$ExternalSyntheticBackportWithForwarding0.m7319m(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }
}
