package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.T1 */
/* JADX INFO: loaded from: classes6.dex */
public class C11674T1 {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f25708a;

    public C11674T1(C11426F0 c11426f0) {
        this.f25708a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m27488a(Double d) {
        HashMap map;
        if (d != null) {
            map = new HashMap();
            map.put(IronSourceConstants.EVENTS_EXT1, "flooring=" + d);
        } else {
            map = null;
        }
        this.f25708a.m25748a(EnumC11372C0.AUCTION_REQUEST, map);
    }

    /* JADX INFO: renamed from: b */
    public void m27490b(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f25708a.m25748a(EnumC11372C0.AUCTION_REQUEST_WATERFALL, map);
    }

    /* JADX INFO: renamed from: c */
    public void m27491c(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f25708a.m25748a(EnumC11372C0.AUCTION_RESULT_WATERFALL, map);
    }

    /* JADX INFO: renamed from: a */
    String m27484a(int i, int i2, int i3, int i4) {
        return "interstitial=" + i + ";rewarded=" + i2 + ";banner=" + i3 + ";native=" + i4;
    }

    /* JADX INFO: renamed from: a */
    public void m27486a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f25708a.m25748a(EnumC11372C0.AUCTION_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27485a(int i, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f25708a.m25748a(EnumC11372C0.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27487a(long j, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f25708a.m25748a(EnumC11372C0.AUCTION_SUCCESS, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27489a(String str) {
        HashMap map = new HashMap();
        map.put("auctionId", str);
        this.f25708a.m25748a(EnumC11372C0.AD_FORMAT_CAPPED, map);
    }
}
