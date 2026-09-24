package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8534c extends AbstractC8536e {

    /* JADX INFO: renamed from: b */
    public long f19169b;

    public C8534c() {
        super(null);
        this.f19169b = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public static Serializable m21040a(int i, C8815n c8815n) {
        if (i == 8) {
            return m21041a(c8815n);
        }
        if (i == 10) {
            int iM21355m = c8815n.m21355m();
            ArrayList arrayList = new ArrayList(iM21355m);
            for (int i2 = 0; i2 < iM21355m; i2++) {
                arrayList.add(m21040a(c8815n.m21352j(), c8815n));
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(c8815n.m21349g()));
            c8815n.m21347e(c8815n.f20644b + 2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c8815n.m21349g()));
        }
        if (i == 1) {
            return Boolean.valueOf(c8815n.m21352j() == 1);
        }
        if (i == 2) {
            int iM21357o = c8815n.m21357o();
            int i3 = c8815n.f20644b;
            c8815n.m21347e(i3 + iM21357o);
            return new String(c8815n.f20643a, i3, iM21357o);
        }
        if (i != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iM21357o2 = c8815n.m21357o();
            int i4 = c8815n.f20644b;
            c8815n.m21347e(i4 + iM21357o2);
            String str = new String(c8815n.f20643a, i4, iM21357o2);
            int iM21352j = c8815n.m21352j();
            if (iM21352j == 9) {
                return map;
            }
            map.put(str, m21040a(iM21352j, c8815n));
        }
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m21041a(C8815n c8815n) {
        int iM21355m = c8815n.m21355m();
        HashMap map = new HashMap(iM21355m);
        for (int i = 0; i < iM21355m; i++) {
            int iM21357o = c8815n.m21357o();
            int i2 = c8815n.f20644b;
            c8815n.m21347e(i2 + iM21357o);
            map.put(new String(c8815n.f20643a, i2, iM21357o), m21040a(c8815n.m21352j(), c8815n));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final void m21042a(C8815n c8815n, long j) throws C8711r {
        if (c8815n.m21352j() != 2) {
            throw new C8711r();
        }
        int iM21357o = c8815n.m21357o();
        int i = c8815n.f20644b;
        c8815n.m21347e(i + iM21357o);
        if ("onMetaData".equals(new String(c8815n.f20643a, i, iM21357o)) && c8815n.m21352j() == 8) {
            HashMap mapM21041a = m21041a(c8815n);
            if (mapM21041a.containsKey("duration")) {
                double dDoubleValue = ((Double) mapM21041a.get("duration")).doubleValue();
                if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f19169b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }
}
