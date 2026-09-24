package com.bytedance.sdk.openadsdk.core.p190aw.p192lr;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3101ri extends C3099ik implements Comparable<C3101ri> {

    /* JADX INFO: renamed from: ri */
    public long f9847ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        private C3099ik.ik f9848ik = C3099ik.ik.TRACKING_URL;

        /* JADX INFO: renamed from: lr */
        private final long f9849lr;

        /* JADX INFO: renamed from: ri */
        private final String f9850ri;

        public ri(String str, long j) {
            this.f9850ri = str;
            this.f9849lr = j;
        }

        /* JADX INFO: renamed from: ri */
        public C3101ri m12518ri() {
            return new C3101ri(this.f9849lr, this.f9850ri, this.f9848ik, Boolean.FALSE);
        }
    }

    protected C3101ri(long j, String str, C3099ik.ik ikVar, Boolean bool) {
        super(str, ikVar, bool);
        this.f9847ri = j;
    }

    /* JADX INFO: renamed from: ri */
    public static int m12514ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * Constants.ONE_HOUR) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3101ri c3101ri) {
        if (c3101ri == null) {
            return 1;
        }
        long j = this.f9847ri;
        long j2 = c3101ri.f9847ri;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ri */
    public long m12516ri() {
        return this.f9847ri;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m12517ri(long j) {
        return this.f9847ri <= j && !m12506ka();
    }

    public String toString() {
        return super.toString();
    }
}
