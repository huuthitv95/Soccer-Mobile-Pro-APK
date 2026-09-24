package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C11341A5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13076j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.util.C13884b;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i */
    private static volatile String f36214i;

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f36215a;

    /* JADX INFO: renamed from: b */
    private int f36216b;

    /* JADX INFO: renamed from: c */
    private CopyOnWriteArrayList<CampaignEx> f36217c;

    /* JADX INFO: renamed from: d */
    private Context f36218d;

    /* JADX INFO: renamed from: e */
    private volatile Boolean f36219e;

    /* JADX INFO: renamed from: f */
    private CampaignEx f36220f;

    /* JADX INFO: renamed from: g */
    private volatile C13179g f36221g;

    /* JADX INFO: renamed from: h */
    private volatile MiOverseaMiniCardBroadcasterReceiver f36222h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                C13219q0.m37816b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        C13154c c13154c = new C13154c();
                        C13157e c13157e = new C13157e();
                        c13157e.m37501a("key", URLEncoder.encode("m_mini_card", C11341A5.f23802O));
                        CampaignEx campaignExM37558a = MIMManager.m37565b().m37558a(stringExtra);
                        if (campaignExM37558a != null) {
                            c13157e.m37501a("rid", campaignExM37558a.getRequestId());
                            c13157e.m37501a("rid_n", campaignExM37558a.getRequestIdNotice());
                            c13157e.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExM37558a.getCampaignUnitId());
                            c13157e.m37501a("u_stid", AbstractC13003a.f35476r.get(campaignExM37558a.getCampaignUnitId()));
                            c13154c.m37421a(campaignExM37558a);
                        }
                        c13157e.m37501a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        c13157e.m37501a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            c13157e.m37501a("reasonCode", String.valueOf(intExtra2));
                        }
                        c13154c.m37423a("m_mini_card", c13157e);
                        C13156d.m37475b().m37484a("m_mini_card", c13154c);
                    } catch (Exception e) {
                        C13219q0.m37816b("MIMManager", e.getMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$a */
    class RunnableC13173a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36223a;

        RunnableC13173a(Context context) {
            this.f36223a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f36215a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f36219e = mIMManager.m37560a();
                } catch (Exception e) {
                    C13219q0.m37813a("MIMManager", e.getMessage());
                }
                if (MIMManager.this.f36219e == null || !MIMManager.this.f36219e.booleanValue() || this.f36223a == null) {
                    return;
                }
                try {
                    MIMManager.this.f36221g = new C13179g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f36223a.registerReceiver(MIMManager.this.f36221g, intentFilter);
                } catch (Exception e2) {
                    C13219q0.m37813a("MIMManager", e2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$b */
    class RunnableC13174b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36225a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36226b;

        RunnableC13174b(Context context, CampaignEx campaignEx) {
            this.f36225a = context;
            this.f36226b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.m37575e(this.f36225a, this.f36226b);
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$c */
    class RunnableC13175c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36228a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36229b;

        RunnableC13175c(Context context, CampaignEx campaignEx) {
            this.f36228a = context;
            this.f36229b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.m37573d(this.f36228a, this.f36229b);
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$d */
    class RunnableC13176d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36231a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36232b;

        RunnableC13176d(Context context, CampaignEx campaignEx) {
            this.f36231a = context;
            this.f36232b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.m37576f(this.f36231a, this.f36232b);
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            } finally {
                if (MIMManager.this.f36217c != null && MIMManager.this.f36217c.contains(this.f36232b)) {
                    MIMManager.this.f36217c.remove(this.f36232b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$e */
    class RunnableC13177e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f36234a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36235b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f36236c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f36237d;

        RunnableC13177e(Context context, String str, CampaignEx campaignEx, int i) {
            this.f36234a = context;
            this.f36235b = str;
            this.f36236c = campaignEx;
            this.f36237d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f36234a == null || TextUtils.isEmpty(this.f36235b) || this.f36236c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000100");
                jSONObject.put("network_type", C13211m0.m37770s(this.f36234a));
                jSONObject.put("rid", this.f36236c.getRequestId());
                jSONObject.put("rid_n", this.f36236c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f36236c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36236c.getCampaignUnitId());
                    String str = AbstractC13003a.f35476r.get(this.f36236c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put("cid", this.f36236c.getId());
                jSONObject.put("status", this.f36235b);
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, this.f36237d);
                C13156d.m37475b().m37488a(jSONObject);
            } catch (Throwable th) {
                C13219q0.m37816b("MIMManager", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$f */
    private static final class C13178f {

        /* JADX INFO: renamed from: a */
        private static final MIMManager f36239a = new MIMManager(null);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.MIMManager$g */
    private static class C13179g extends BroadcastReceiver {
        private C13179g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExM37558a;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i = extras.getInt("statusCode", -1);
                String string = extras.getString("packageName", "");
                if (i != -1 && !TextUtils.isEmpty(string) && (campaignExM37558a = MIMManager.m37565b().m37558a(string)) != null) {
                    MIMManager.m37565b().m37578a(context, campaignExM37558a, i);
                    MIMManager.m37565b().m37579a(context, "dm_page_status", i, MIMManager.m37565b().m37583c());
                }
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }

        /* synthetic */ C13179g(RunnableC13173a runnableC13173a) {
            this();
        }
    }

    /* synthetic */ MIMManager(RunnableC13173a runnableC13173a) {
        this();
    }

    /* JADX INFO: renamed from: f */
    public void m37586f() {
        this.f36216b++;
    }

    /* JADX INFO: renamed from: g */
    public void m37587g() {
        int i = this.f36216b - 1;
        this.f36216b = i;
        if (i <= 0) {
            m37577a(this.f36218d);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m37588h() {
        try {
            if (this.f36222h == null) {
                this.f36222h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(C13207k0.m37712a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                contextM36542d.registerReceiver(this.f36222h, intentFilter);
            }
        } catch (Exception e) {
            C13219q0.m37813a("MIMManager", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m37589i() {
        try {
            if (this.f36222h != null) {
                Context contextM36542d = C13008c.m36588n().m36542d();
                if (contextM36542d != null) {
                    contextM36542d.unregisterReceiver(this.f36222h);
                }
                this.f36220f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36217c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f36217c = null;
                this.f36222h = null;
            }
        } catch (Exception e) {
            C13219q0.m37813a("MIMManager", e.getMessage());
        }
    }

    private MIMManager() {
        this.f36216b = 0;
        this.f36217c = new CopyOnWriteArrayList<>();
        this.f36215a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m37576f(Context context, CampaignEx campaignEx) {
        String[] strArrM36887B;
        if (campaignEx != null) {
            try {
                C13076j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrM36887B = nativeVideoTracking.m36887B()) == null) {
                    return;
                }
                int length = strArrM36887B.length;
                int i = 0;
                while (i < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    C12682a.m34605a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrM36887B[i], false, false);
                    i++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m37584d() {
        try {
            return f36214i == null ? "" : String.format("[%s]", f36214i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public Boolean m37585e() {
        return this.f36219e;
    }

    /* JADX INFO: renamed from: b */
    public static MIMManager m37565b() {
        return C13178f.f36239a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m37575e(Context context, CampaignEx campaignEx) {
        String[] strArrM36886A;
        if (campaignEx != null) {
            try {
                C13076j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrM36886A = nativeVideoTracking.m36886A()) == null) {
                    return;
                }
                int length = strArrM36886A.length;
                int i = 0;
                while (i < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    C12682a.m34605a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrM36886A[i], false, false);
                    i++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    CampaignEx m37583c() {
        return this.f36220f;
    }

    /* JADX INFO: renamed from: c */
    private Runnable m37570c(Context context, CampaignEx campaignEx) {
        return new RunnableC13176d(context, campaignEx);
    }

    /* JADX INFO: renamed from: b */
    public void m37581b(Context context) {
        this.f36218d = context;
        C13167a.m37543b().execute(new RunnableC13173a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m37573d(Context context, CampaignEx campaignEx) {
        String[] strArrM36931z;
        if (campaignEx != null) {
            try {
                C13076j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrM36931z = nativeVideoTracking.m36931z()) == null) {
                    return;
                }
                int length = strArrM36931z.length;
                int i = 0;
                while (i < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    C12682a.m34605a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrM36931z[i], false, false);
                    i++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e) {
                C13219q0.m37816b("MIMManager", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37580a(CampaignEx campaignEx) {
        try {
            if (this.f36219e != null && campaignEx != null && this.f36219e.booleanValue()) {
                this.f36220f = campaignEx;
                this.f36217c.add(campaignEx);
            }
            if (C13884b.m41422b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f36222h == null) {
                    m37588h();
                }
                this.f36220f = campaignEx;
                this.f36217c.add(campaignEx);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MIMManager", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37582b(CampaignEx campaignEx) {
        try {
            if (this.f36219e == null || campaignEx == null || !this.f36219e.booleanValue()) {
                return;
            }
            this.f36220f = null;
            try {
                this.f36217c.remove(campaignEx);
            } catch (Exception e) {
                C13219q0.m37813a("MIMManager", e.getMessage());
            }
        } catch (Exception e2) {
            C13219q0.m37816b("MIMManager", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private Runnable m37567b(Context context, CampaignEx campaignEx) {
        return new RunnableC13174b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public CampaignEx m37558a(String str) {
        try {
            CampaignEx campaignEx = this.f36220f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f36220f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36217c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f36217c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e) {
            C13219q0.m37816b("MIMManager", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Boolean m37560a() {
        Cursor cursorQuery;
        Context contextM36542d = C13008c.m36588n().m36542d();
        Boolean boolValueOf = null;
        if (contextM36542d != null) {
            try {
                if (contextM36542d.getContentResolver() != null) {
                    try {
                        cursorQuery = contextM36542d.getContentResolver().query(Uri.parse(C13207k0.m37712a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e) {
                                C13219q0.m37813a("MIMManager", e.getMessage());
                            }
                            try {
                                f36214i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e2) {
                                C13219q0.m37813a("MIMManager", e2.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e3) {
                            C13219q0.m37813a("MIMManager", e3.getMessage());
                        }
                    }
                }
            } catch (Exception e4) {
                C13219q0.m37816b("MIMManager", e4.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e A[PHI: r4
  0x002e: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:19:0x002c, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m37577a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f36221g != null) {
                        context.unregisterReceiver(this.f36221g);
                    }
                    if (this.f36222h != null) {
                        context.unregisterReceiver(this.f36222h);
                    }
                    this.f36220f = null;
                    copyOnWriteArrayList = this.f36217c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                } catch (Exception e) {
                    C13219q0.m37813a("MIMManager", e.getMessage());
                    this.f36220f = null;
                    copyOnWriteArrayList = this.f36217c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                }
                this.f36217c = null;
                this.f36221g = null;
                this.f36218d = null;
            } catch (Throwable th) {
                this.f36220f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f36217c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f36217c = null;
                this.f36221g = null;
                this.f36218d = null;
                throw th;
            }
        }
        try {
            m37589i();
        } catch (Throwable th2) {
            C13219q0.m37816b("MIMManager", th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    void m37578a(Context context, CampaignEx campaignEx, int i) {
        Runnable runnableM37567b;
        if (i == 3001) {
            runnableM37567b = m37567b(context, campaignEx);
        } else if (i != 3002) {
            runnableM37567b = i != 3008 ? null : m37570c(context, campaignEx);
        } else {
            runnableM37567b = m37562a(context, campaignEx);
        }
        if (runnableM37567b != null) {
            C13167a.m37543b().execute(runnableM37567b);
        }
    }

    /* JADX INFO: renamed from: a */
    private Runnable m37562a(Context context, CampaignEx campaignEx) {
        return new RunnableC13175c(context, campaignEx);
    }

    /* JADX INFO: renamed from: a */
    void m37579a(Context context, String str, int i, CampaignEx campaignEx) {
        C13167a.m37543b().execute(new RunnableC13177e(context, str, campaignEx, i));
    }
}
