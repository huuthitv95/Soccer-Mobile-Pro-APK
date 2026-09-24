package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.common.net.C13303a;
import com.mbridge.msdk.mbbid.common.report.C13306a;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.util.C13884b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.middle.b */
/* JADX INFO: compiled from: RequesManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13301b {

    /* JADX INFO: renamed from: a */
    private String f36791a;

    /* JADX INFO: renamed from: b */
    private String f36792b;

    /* JADX INFO: renamed from: c */
    private String f36793c;

    /* JADX INFO: renamed from: e */
    private BidListennning f36795e;

    /* JADX INFO: renamed from: f */
    private BidResponsedEx f36796f;

    /* JADX INFO: renamed from: g */
    private int f36797g;

    /* JADX INFO: renamed from: i */
    private long f36799i;

    /* JADX INFO: renamed from: j */
    private long f36800j;

    /* JADX INFO: renamed from: k */
    private boolean f36801k;

    /* JADX INFO: renamed from: l */
    private int f36802l;

    /* JADX INFO: renamed from: h */
    private boolean f36798h = false;

    /* JADX INFO: renamed from: d */
    private Context f36794d = C13008c.m36588n().m36542d();

    public C13301b(String str, String str2, String str3) {
        this.f36791a = str;
        this.f36792b = str2;
        this.f36793c = str3;
    }

    /* JADX INFO: renamed from: b */
    public void m38371b(boolean z) {
        this.f36801k = z;
    }

    /* JADX INFO: renamed from: b */
    public void m38369b(int i) {
        this.f36802l = i;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbid.common.middle.b$a */
    /* JADX INFO: compiled from: RequesManager.java */
    class a extends AbstractC13300a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36803b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(str, str2);
            this.f36803b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.AbstractC13305c
        /* JADX INFO: renamed from: a */
        public void mo38373a(BidResponsedEx bidResponsedEx) {
            C13301b.this.f36798h = false;
            C13301b.this.f36796f = bidResponsedEx;
            C13306a.m38378a(C13301b.this.f36794d, C13301b.this.f36792b, bidResponsedEx.getBidId(), this.f36803b, bidResponsedEx.getBidToken());
            C13301b.this.m38361a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.AbstractC13305c
        /* JADX INFO: renamed from: a */
        public void mo38372a(int i, String str) {
            C13301b.this.f36798h = false;
            C13306a.m38377a(C13301b.this.f36794d, C13301b.this.f36792b, str, this.f36803b);
            C13301b.this.m38362a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38370b(long j) {
        this.f36800j = j;
    }

    /* JADX INFO: renamed from: a */
    public void m38365a(int i) {
        this.f36797g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m38366a(long j) {
        this.f36799i = j;
    }

    /* JADX INFO: renamed from: a */
    public void m38368a(boolean z) {
        try {
            if (!this.f36798h) {
                this.f36798h = true;
                if (this.f36794d == null) {
                    m38362a("context is null");
                }
                C13303a c13303a = new C13303a(this.f36794d);
                C13126e c13126e = new C13126e();
                String strM36533b = C13008c.m36588n().m36533b();
                c13126e.m37245a("app_id", strM36533b);
                c13126e.m37245a("sign", SameMD5.getMD5(strM36533b + C13008c.m36588n().m36538c()));
                c13126e.m37245a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36792b);
                if (TextUtils.isEmpty(this.f36791a)) {
                    this.f36791a = "";
                }
                c13126e.m37245a("placement_id", this.f36791a);
                if (C13884b.m41421a()) {
                    c13126e.m37245a("install_ids", C13302c.m38374a());
                }
                c13126e.m37245a("bid_floor", this.f36793c);
                c13126e.m37245a(C13126e.f36057h, C13229v0.m37881a(this.f36794d, this.f36792b));
                c13126e.m37245a(C13126e.f36056g, C13091b.m37102a(this.f36792b, ""));
                String str = "1";
                c13126e.m37245a("req_type", this.f36801k ? "1" : "2");
                c13126e.m37245a("orientation", C13211m0.m37728G(this.f36794d) + "");
                int i = this.f36797g;
                if (i == 296) {
                    if (this.f36799i > 0 && this.f36800j > 0) {
                        c13126e.m37245a(AbstractC13068b.JSON_KEY_UNIT_SIZE, this.f36800j + "x" + this.f36799i);
                        try {
                            int i2 = BannerUtils.f36737a;
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f36792b) instanceof String) {
                                c13126e.m37245a("close_id", method.invoke(null, this.f36792b).toString());
                            }
                        } catch (Exception unused) {
                            m38362a("banner module is miss");
                            return;
                        }
                    } else {
                        m38362a("bid required param is missing or error");
                        return;
                    }
                } else if (i == 297) {
                    if (this.f36799i > 0 && this.f36800j > 0) {
                        c13126e.m37245a(AbstractC13068b.JSON_KEY_UNIT_SIZE, this.f36800j + "x" + this.f36799i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f36802l);
                        sb.append("");
                        c13126e.m37245a("orientation", sb.toString());
                    } else {
                        m38362a("ad display area is too small");
                        return;
                    }
                } else if (i != 298) {
                    if (!z) {
                        str = "0";
                    }
                    c13126e.m37245a("rw_plus", str);
                } else if (this.f36799i > 0 && this.f36800j > 0) {
                    c13126e.m37245a(AbstractC13068b.JSON_KEY_UNIT_SIZE, this.f36800j + "x" + this.f36799i);
                } else {
                    m38362a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(C13229v0.m37920d());
                c13126e.m37245a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar = new a(this.f36791a, this.f36792b, md5);
                aVar.setUnitId(this.f36792b);
                aVar.setPlacementId(this.f36791a);
                c13303a.get(1, C13121d.m37226h().m37228a(false, ""), c13126e, aVar, "bid_request", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                return;
            }
            m38362a("current unit is biding");
        } catch (Throwable th) {
            m38362a(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38367a(BidListennning bidListennning) {
        this.f36795e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38362a(String str) {
        BidListennning bidListennning = this.f36795e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38361a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f36795e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
