package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class CampaignUnit extends AbstractC13068b implements Serializable, NoProGuard {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.AbstractC13068b
    public String assembCParams() {
        String str;
        String strValueOf;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String strM37689d = C13198g.m37689d();
            Context contextM36542d = C13008c.m36588n().m36542d();
            String strM37768r = C13211m0.m37768r(contextM36542d);
            String strM37766q = C13211m0.m37766q(contextM36542d);
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                strValueOf = String.valueOf(C13211m0.m37770s(contextM36542d));
                str = C13211m0.m37760n(contextM36542d) + "x" + C13211m0.m37757m(contextM36542d);
            } else {
                str = "";
                strValueOf = str;
            }
            this.cParams = this.cParams.append(getAdType()).append("|").append(nullToEmpty("1")).append("|").append(nullToEmpty(Build.VERSION.RELEASE)).append("|").append(nullToEmpty(MBConfiguration.SDK_VERSION)).append("|").append(nullToEmpty(C13211m0.m37762o())).append("|").append(nullToEmpty(str)).append("|").append(nullToEmpty(Integer.valueOf(C13211m0.m37728G(C13008c.m36588n().m36542d())))).append("|").append(nullToEmpty(C13211m0.m37763p(C13008c.m36588n().m36542d()))).append("|").append(nullToEmpty(strValueOf)).append("|").append(nullToEmpty(strM37766q)).append(nullToEmpty(strM37768r)).append("|").append("|").append("|").append("|").append(nullToEmpty(strM37689d)).append("|").append(nullToEmpty("")).append("|").append(nullToEmpty(C13211m0.m37771t())).append("|").append(nullToEmpty("")).append("|").append("").append("|").append(nullToEmpty("")).append("|").append(nullToEmpty(C13088a.f35856V + "," + C13088a.f35865g)).append("|").append(C13211m0.m37751j()).append("|");
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b(TAG, th.getMessage(), th);
            }
        }
        return this.cParams.toString();
    }
}
