package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.model.vast.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8296e {

    /* JADX INFO: renamed from: a */
    public final String f18524a;

    /* JADX INFO: renamed from: b */
    public final String f18525b;

    /* JADX INFO: renamed from: c */
    public int f18526c;

    /* JADX INFO: renamed from: d */
    public final int f18527d;

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    public C8296e(String str, String str2) {
        int i;
        String str3;
        ArrayList arrayListM20702a;
        this.f18524a = str;
        this.f18525b = str2;
        int iIntValue = -1;
        if (TextUtils.isEmpty(str2) || str2.startsWith("-")) {
            i = 0;
        } else if (str2.endsWith("%") && str2.endsWith("%")) {
            try {
                int i2 = TextUtils.isEmpty(str2) ? -1 : Integer.parseInt(str2.substring(0, str2.length() - 1));
                if (i2 >= 0 && i2 <= 100) {
                    i = 1;
                } else if (str2.contains(CertificateUtil.DELIMITER)) {
                    arrayListM20702a = m20702a(str2);
                    if (arrayListM20702a.isEmpty()) {
                        i = 0;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            } catch (NumberFormatException e) {
                IAlog.m21950f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e.getMessage());
            }
        } else if (str2.contains(CertificateUtil.DELIMITER)) {
            arrayListM20702a = m20702a(str2);
            if (arrayListM20702a.isEmpty() || ((Integer) arrayListM20702a.get(0)).intValue() < 0 || ((Integer) arrayListM20702a.get(1)).intValue() < 0 || ((Integer) arrayListM20702a.get(2)).intValue() < 0 || ((Integer) arrayListM20702a.get(3)).intValue() < 0) {
                i = 0;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        this.f18527d = i;
        if (i == 2 && (str3 = this.f18525b) != null) {
            ArrayList arrayListM20702a2 = m20702a(str3);
            iIntValue = ((Integer) arrayListM20702a2.get(3)).intValue() + ((((Integer) arrayListM20702a2.get(2)).intValue() + (((Integer) arrayListM20702a2.get(1)).intValue() * 60) + (((Integer) arrayListM20702a2.get(0)).intValue() * 3600)) * 1000);
        }
        this.f18526c = iIntValue;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m20702a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
            if (strArrSplit.length == 3) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String[] strArrSplit2 = strArrSplit[2].split("\\.");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2.length > 1 ? strArrSplit2[1] : "000";
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
                    return arrayList;
                } catch (NumberFormatException e) {
                    IAlog.m21950f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e.getMessage());
                    return new ArrayList();
                }
            }
        }
        return arrayList;
    }
}
