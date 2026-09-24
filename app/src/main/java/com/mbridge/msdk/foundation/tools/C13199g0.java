package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.g0 */
/* JADX INFO: compiled from: NetAddressManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13199g0 {

    /* JADX INFO: renamed from: a */
    private JSONObject f36301a;

    /* JADX INFO: renamed from: b */
    private C13638j f36302b;

    /* JADX INFO: renamed from: c */
    private long f36303c;

    /* JADX INFO: renamed from: d */
    private final BroadcastReceiver f36304d;

    /* JADX INFO: renamed from: e */
    IntentFilter f36305e;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.g0$b */
    /* JADX INFO: compiled from: NetAddressManager.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        static final C13199g0 f36306a = new C13199g0();
    }

    /* JADX INFO: renamed from: a */
    public static C13199g0 m37691a() {
        return b.f36306a;
    }

    /* JADX INFO: renamed from: b */
    public String m37693b() {
        try {
            if (this.f36301a == null) {
                this.f36301a = new JSONObject();
            }
            if (this.f36301a.length() < 2) {
                try {
                    this.f36301a.put("KEY_INFO", (String) C13189d.m37650a(C13008c.m36588n().m36542d(), "KEY_INFO", ""));
                } catch (Exception e) {
                    C13219q0.m37816b("NetAddressManager", e.getMessage());
                }
                try {
                    this.f36301a.put("KEY_TIME", ((Long) C13189d.m37650a(C13008c.m36588n().m36542d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e2) {
                    C13219q0.m37816b("NetAddressManager", e2.getMessage());
                }
            }
            String strOptString = this.f36301a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
            return System.currentTimeMillis() - this.f36301a.optLong("KEY_TIME") > (c13635gM39714b != null ? c13635gM39714b.m39440S() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e3) {
            C13219q0.m37816b("NetAddressManager", e3.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37694c() {
        Context contextM36542d;
        try {
            if (C13636h.m39706b().m39714b(C13008c.m36588n().m36533b()).m39442T() != 1 || (contextM36542d = C13008c.m36588n().m36542d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f36305e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextM36542d.registerReceiver(this.f36304d, this.f36305e);
        } catch (Exception e) {
            C13219q0.m37816b("NetAddressManager", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m37695d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f36303c > 3000) {
            if (this.f36302b == null) {
                this.f36302b = new C13638j();
            }
            this.f36302b.m39747c(C13008c.m36588n().m36542d(), C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c());
            this.f36303c = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m37696e() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            try {
                contextM36542d.unregisterReceiver(this.f36304d);
            } catch (Exception e) {
                C13219q0.m37816b("NetAddressManager", e.getMessage());
            }
        }
    }

    private C13199g0() {
        this.f36301a = new JSONObject();
        this.f36304d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f36305e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* JADX INFO: renamed from: a */
    public void m37692a(String str) {
        if (this.f36301a == null) {
            this.f36301a = new JSONObject();
        }
        try {
            if (!this.f36301a.optString("KEY_INFO", "").equals(str)) {
                this.f36301a.put("KEY_INFO", str);
                C13189d.m37651b(C13008c.m36588n().m36542d(), "KEY_INFO", str);
            }
        } catch (Exception e) {
            C13219q0.m37816b("NetAddressManager", e.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f36301a.put("KEY_TIME", jCurrentTimeMillis);
            C13189d.m37651b(C13008c.m36588n().m36542d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e2) {
            C13219q0.m37816b("NetAddressManager", e2.getMessage());
        }
    }
}
