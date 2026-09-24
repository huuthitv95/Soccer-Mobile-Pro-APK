package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C7998j implements InterfaceC7970d {

    /* JADX INFO: renamed from: a */
    public final String f17766a;

    /* JADX INFO: renamed from: b */
    public final boolean f17767b;

    public C7998j(boolean z, String str) {
        this.f17766a = str;
        this.f17767b = z;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC7970d
    /* JADX INFO: renamed from: a */
    public final boolean mo20412a(C7971e c7971e) {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f17766a)) {
            String version = InneractiveAdManager.getVersion();
            IAlog.m21945a("%s: shouldApply - running version: %s", "j", version);
            IAlog.m21945a("%s: shouldApply - filter version: %s", "j", this.f17766a);
            String[] strArrSplit = version.split("\\.", 4);
            String[] strArrSplit2 = this.f17766a.split("\\.", 4);
            String str = strArrSplit2[strArrSplit2.length - 1];
            if (str.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                int i = 0;
                while (true) {
                    if (i >= strArrSplit2.length - 1) {
                        IAlog.m21945a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                        z2 = false;
                        break;
                    }
                    if (strArrSplit.length < i) {
                        IAlog.m21945a("%s: shouldApplyByAsterix - running version is shorter than filter. applying", "j");
                    } else if (strArrSplit[i].equals(strArrSplit2[i])) {
                        i++;
                    } else {
                        IAlog.m21945a("%s: shouldApplyByAsterix - running version does not comply with filter. applying", "j");
                    }
                    z2 = true;
                    break;
                }
                IAlog.m21945a("%s: shouldApply - * version match: %b", "j", Boolean.valueOf(!z2));
                if (z2) {
                    return this.f17767b;
                }
                return !this.f17767b;
            }
            if (str.equals("+")) {
                int i2 = 0;
                while (true) {
                    if (i2 < strArrSplit2.length - 1) {
                        if (strArrSplit.length < i2) {
                            IAlog.m21945a("%s: shouldApplyByPlus - running version is shorter than filter. applying", "j");
                        } else {
                            try {
                                int iIntValue = Integer.valueOf(strArrSplit2[i2]).intValue();
                                int iIntValue2 = Integer.valueOf(strArrSplit[i2]).intValue();
                                if (iIntValue2 > iIntValue) {
                                    IAlog.m21945a("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", "j");
                                } else if (iIntValue2 < iIntValue) {
                                    IAlog.m21945a("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", "j");
                                } else {
                                    i2++;
                                }
                            } catch (NumberFormatException e) {
                                IAlog.m21945a("%s: shouldApplyByPlus - Error in version string! Not a number. %s", "j", e.getMessage());
                            }
                        }
                        z = true;
                        IAlog.m21945a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z));
                        if (z) {
                            return this.f17767b;
                        }
                        if (this.f17767b) {
                            return false;
                        }
                        return true;
                    }
                    IAlog.m21945a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                    z = false;
                    IAlog.m21945a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z));
                    if (z) {
                        return this.f17767b;
                    }
                    if (this.f17767b) {
                        return true;
                    }
                    return false;
                }
            }
            boolean zEqualsIgnoreCase = this.f17766a.equalsIgnoreCase(version);
            IAlog.m21945a("%s: shouldApply - exact version match: %b", "j", Boolean.valueOf(zEqualsIgnoreCase));
            if (!zEqualsIgnoreCase) {
                return this.f17767b;
            }
            if (!this.f17767b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "sdk - " + this.f17766a + " include: " + this.f17767b;
    }
}
