package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbid.common.C13298b;
import com.mbridge.msdk.mbbid.common.middle.C13301b;
import com.mbridge.msdk.util.C13884b;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class BidManager {

    /* JADX INFO: renamed from: a */
    private C13301b f36811a;

    /* JADX INFO: renamed from: b */
    private BidListennning f36812b;

    /* JADX INFO: renamed from: c */
    private boolean f36813c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    /* JADX INFO: renamed from: a */
    private void m38379a(String str) {
        BidListennning bidListennning = this.f36812b;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public static String getBuyerUid(Context context) {
        if (C13884b.m41421a()) {
            try {
                C13006c.m36581c(true);
            } catch (Throwable th) {
                C13219q0.m37816b("BidManager", th.getMessage());
            }
        }
        return C13298b.m38348a(context, "");
    }

    public void bid() {
        C13301b c13301b = this.f36811a;
        if (c13301b != null) {
            c13301b.m38368a(this.f36813c);
        } else {
            m38379a("you need init the class :BidManager");
        }
    }

    public void setBidListener(BidListennning bidListennning) {
        this.f36812b = bidListennning;
        C13301b c13301b = this.f36811a;
        if (c13301b != null) {
            c13301b.m38367a(bidListennning);
        }
    }

    public void setRewardPlus(boolean z) {
        this.f36813c = z;
    }

    public BidManager(String str, String str2, String str3) {
        this.f36813c = false;
        this.f36811a = new C13301b(str, str2, str3);
    }

    public static String getBuyerUid(Context context, String str) {
        if (C13884b.m41421a()) {
            try {
                C13006c.m36581c(true);
            } catch (Throwable th) {
                C13219q0.m37816b("BidManager", th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return C13298b.m38348a(context, str);
    }

    public <T extends CommonBidRequestParams> BidManager(T t) {
        this(t == null ? "" : t.getmPlacementId(), t == null ? "" : t.getmUnitId(), t != null ? t.getmFloorPrice() : "");
        if (t instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t;
            this.f36811a.m38366a(bannerBidRequestParams.getHeight());
            this.f36811a.m38370b(bannerBidRequestParams.getWidth());
            this.f36811a.m38365a(296);
            if (t instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t;
                this.f36811a.m38371b(splashBidRequestParams.m38381a());
                this.f36811a.m38369b(splashBidRequestParams.getOrientation());
                this.f36811a.m38365a(297);
                return;
            }
            return;
        }
        if (t instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t;
            this.f36811a.m38366a(advancedNativeBidRequestParams.getHeight());
            this.f36811a.m38370b(advancedNativeBidRequestParams.getWidth());
            this.f36811a.m38365a(298);
        }
    }

    public static String getBuyerUid(Context context, Map<String, String> map) {
        if (C13884b.m41421a()) {
            try {
                C13006c.m36581c(true);
            } catch (Throwable th) {
                C13219q0.m37816b("BidManager", th.getMessage());
            }
        }
        return C13298b.m38350a(context, map);
    }
}
