package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* JADX INFO: loaded from: classes6.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* JADX INFO: renamed from: ln */
    protected String f36814ln;
    private String price;

    /* JADX INFO: renamed from: wn */
    protected String f36815wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f36814ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f36815wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.f36814ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(this.f36814ln);
        if (this.f36814ln.contains("?")) {
            sb.append(C11744X3.j.f26436c);
        } else {
            sb.append("?");
        }
        sb.append("reason=");
        sb.append(bidLossCode.getCurrentCode());
        C12682a.m34605a(context, (CampaignEx) null, "", sb.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.f36815wn) || context == null) {
            return;
        }
        C12682a.m34605a(context, (CampaignEx) null, "", this.f36815wn, false, false);
    }

    protected void setBidId(String str) {
        this.bidId = str;
    }

    protected void setBidToken(String str) {
        this.bidToken = str;
    }

    protected void setCur(String str) {
        this.cur = str;
    }

    protected void setPrice(String str) {
        this.price = str;
    }
}
