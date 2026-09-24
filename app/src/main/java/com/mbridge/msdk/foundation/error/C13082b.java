package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.error.b */
/* JADX INFO: compiled from: MBFailureReason.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13082b implements Serializable {

    /* JADX INFO: renamed from: a */
    private int f35775a;

    /* JADX INFO: renamed from: b */
    private int f35776b;

    /* JADX INFO: renamed from: c */
    private String f35777c;

    /* JADX INFO: renamed from: d */
    private Throwable f35778d;

    /* JADX INFO: renamed from: e */
    private CampaignEx f35779e;

    /* JADX INFO: renamed from: f */
    private MBridgeIds f35780f;

    /* JADX INFO: renamed from: g */
    private String f35781g;

    /* JADX INFO: renamed from: h */
    private String f35782h;

    /* JADX INFO: renamed from: i */
    private boolean f35783i;

    /* JADX INFO: renamed from: j */
    private int f35784j = -1;

    /* JADX INFO: renamed from: k */
    private String f35785k;

    /* JADX INFO: renamed from: l */
    private HashMap<Object, Object> f35786l;

    /* JADX INFO: renamed from: m */
    private int f35787m;

    /* JADX INFO: renamed from: n */
    private String f35788n;

    /* JADX INFO: renamed from: o */
    private String f35789o;

    /* JADX INFO: renamed from: p */
    private String f35790p;

    public C13082b(int i) {
        this.f35775a = i;
        this.f35776b = C13081a.m37013b(i);
    }

    /* JADX INFO: renamed from: a */
    public void m37021a(Throwable th) {
        this.f35778d = th;
    }

    /* JADX INFO: renamed from: b */
    public void m37023b(String str) {
        this.f35782h = str;
    }

    /* JADX INFO: renamed from: c */
    public void m37024c(String str) {
        this.f35777c = str;
    }

    /* JADX INFO: renamed from: d */
    public CampaignEx m37025d() {
        return this.f35779e;
    }

    /* JADX INFO: renamed from: g */
    public int m37027g() {
        return this.f35775a;
    }

    /* JADX INFO: renamed from: h */
    public int m37028h() {
        return this.f35776b;
    }

    /* JADX INFO: renamed from: i */
    public String m37029i() {
        return this.f35790p;
    }

    /* JADX INFO: renamed from: j */
    public MBridgeIds m37030j() {
        if (this.f35780f == null) {
            this.f35780f = new MBridgeIds();
        }
        return this.f35780f;
    }

    /* JADX INFO: renamed from: k */
    public String m37031k() {
        return this.f35782h;
    }

    /* JADX INFO: renamed from: m */
    public String m37033m() {
        return this.f35785k;
    }

    /* JADX INFO: renamed from: n */
    public int m37034n() {
        return this.f35784j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f35775a + ", errorSubType=" + this.f35776b + ", message='" + this.f35777c + "', cause=" + this.f35778d + ", campaign=" + this.f35779e + ", ids=" + this.f35780f + ", requestId='" + this.f35781g + "', localRequestId='" + this.f35782h + "', isHeaderBidding=" + this.f35783i + ", typeD=" + this.f35784j + ", reasonD='" + this.f35785k + "', extraMap=" + this.f35786l + ", serverErrorCode=" + this.f35787m + ", errorUrl='" + this.f35788n + "', serverErrorResponse='" + this.f35789o + "'}";
    }

    /* JADX INFO: renamed from: a */
    public void m37017a(CampaignEx campaignEx) {
        this.f35779e = campaignEx;
    }

    /* JADX INFO: renamed from: d */
    public void m37026d(String str) {
        this.f35785k = str;
    }

    /* JADX INFO: renamed from: a */
    public void m37018a(MBridgeIds mBridgeIds) {
        this.f35780f = mBridgeIds;
    }

    /* JADX INFO: renamed from: l */
    public String m37032l() {
        String strM37012a;
        int i;
        if (TextUtils.isEmpty(this.f35777c)) {
            strM37012a = "";
        } else {
            strM37012a = this.f35777c;
        }
        if (TextUtils.isEmpty(strM37012a) && (i = this.f35775a) != -1) {
            strM37012a = C13081a.m37012a(i);
        }
        Throwable th = this.f35778d;
        if (th == null) {
            return strM37012a;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strM37012a;
        }
        return strM37012a + " # " + message;
    }

    /* JADX INFO: renamed from: a */
    public void m37022a(boolean z) {
        this.f35783i = z;
    }

    /* JADX INFO: renamed from: a */
    public void m37019a(Object obj, Object obj2) {
        if (this.f35786l == null) {
            this.f35786l = new HashMap<>();
        }
        this.f35786l.put(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public Object m37015a(Object obj) {
        HashMap<Object, Object> map = this.f35786l;
        if (map != null && map.containsKey(obj)) {
            return this.f35786l.get(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m37016a(int i) {
        this.f35784j = i;
    }

    /* JADX INFO: renamed from: a */
    public void m37020a(String str) {
        this.f35790p = str;
    }

    public C13082b(int i, String str) {
        this.f35775a = i;
        if (!TextUtils.isEmpty(str)) {
            m37019a("his_reason", str);
        }
        this.f35777c = str;
        this.f35776b = C13081a.m37013b(i);
    }
}
