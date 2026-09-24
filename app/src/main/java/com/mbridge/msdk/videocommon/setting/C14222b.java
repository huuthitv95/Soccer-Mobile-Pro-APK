package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.report.C13148j;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.videocommon.entity.C14215b;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.net.C14218a;
import com.mbridge.msdk.videocommon.net.InterfaceC14220c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.setting.b */
/* JADX INFO: compiled from: RewardSettingManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14222b {

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap<String, C14223c> f41100c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public static C14221a f41101d = null;

    /* JADX INFO: renamed from: e */
    private static volatile C14222b f41102e;

    /* JADX INFO: renamed from: a */
    private volatile boolean f41103a = false;

    /* JADX INFO: renamed from: b */
    private CopyOnWriteArrayList<String> f41104b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.setting.b$a */
    /* JADX INFO: compiled from: RewardSettingManager.java */
    class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f41105a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f41106b;

        a(String str, String str2) {
            this.f41105a = str;
            this.f41106b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            C13148j.m37384a(C13008c.m36588n().m36542d(), this.f41105a, this.f41106b, 2, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            C13148j.m37384a(C13008c.m36588n().m36542d(), this.f41105a, this.f41106b, 1, "");
        }
    }

    private C14222b() {
    }

    /* JADX INFO: renamed from: a */
    private void m42656a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            H5DownLoadManager.getInstance().downloadH5Res(new C13154c(true), str, new a(str, str2));
            return;
        }
        C13148j.m37384a(C13008c.m36588n().m36542d(), str, str2, 2, "alert url is exception ,url:" + str);
    }

    /* JADX INFO: renamed from: a */
    private final boolean m42657a(C14223c c14223c) {
        C14221a c14221aM42670c = m42670c();
        if (c14221aM42670c == null || c14223c == null) {
            return true;
        }
        return c14223c.m42731j() + c14221aM42670c.m42652h() <= System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public static C14222b m42658b() {
        if (f41102e == null) {
            synchronized (C14222b.class) {
                if (f41102e == null) {
                    f41102e = new C14222b();
                }
            }
        }
        return f41102e;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m42659c(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray.length() > 0 && !TextUtils.isEmpty(strOptString)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C14221a m42660a() {
        C14221a c14221a = new C14221a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new C14216c("Virtual Item", 1));
        c14221a.m42636a(map);
        c14221a.m42640b(map2);
        c14221a.m42642c(43200L);
        c14221a.m42648e(5400L);
        c14221a.m42645d(3600L);
        c14221a.m42638b(3600L);
        c14221a.m42650f(5L);
        c14221a.m42634a(1);
        return c14221a;
    }

    /* JADX INFO: renamed from: a */
    public C14223c m42661a(String str, String str2, boolean z) {
        C14223c c14223c;
        boolean zM42657a;
        String str3 = "reward_" + str + "_" + str2;
        if (f41100c.containsKey(str3)) {
            try {
                c14223c = f41100c.get(str3);
                try {
                    zM42657a = m42657a(c14223c);
                } catch (Exception unused) {
                    zM42657a = false;
                }
            } catch (Exception unused2) {
                c14223c = null;
            }
            if (zM42657a) {
                m42665a(str, C13008c.m36588n().m36538c(), str2, null);
            }
            return c14223c;
        }
        C14223c c14223cM42680a = C14223c.m42680a(C12998a.m36460b().m36462a(str3));
        if (!m42657a(c14223cM42680a)) {
            f41100c.put(str3, c14223cM42680a);
            return c14223cM42680a;
        }
        if (c14223cM42680a != null) {
            return c14223cM42680a;
        }
        m42665a(str, C13008c.m36588n().m36538c(), str2, null);
        return m42662a(z);
    }

    /* JADX INFO: renamed from: a */
    public C14223c m42662a(boolean z) {
        C14223c c14223c = new C14223c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C14215b(1, 30, null));
            c14223c.m42703a((List<C14215b>) arrayList);
            c14223c.m42707b(1);
            c14223c.m42717e(1);
            c14223c.m42691E(1);
            c14223c.m42726h(1);
            c14223c.m42755u(1);
            c14223c.m42741n(1);
            c14223c.m42689D(3);
            c14223c.m42687C(80);
            c14223c.m42763y(100);
            c14223c.m42729i(0);
            c14223c.m42743o(2);
            c14223c.m42695G(-1);
            c14223c.m42745p(70);
            c14223c.m42697H(2);
            if (z) {
                c14223c.m42698I(5);
            } else {
                c14223c.m42698I(-1);
            }
            c14223c.m42739m(0);
            c14223c.m42683A(0);
            c14223c.m42735k(1);
            c14223c.m42685B(1);
            c14223c.m42720f(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            c14223c.m42702a(arrayList2);
            c14223c.m42747q(1);
            c14223c.m42693F(1);
            c14223c.m42749r(60);
            return c14223c;
        } catch (Exception e) {
            e.printStackTrace();
            return c14223c;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42663a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f41104b.add(str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42664a(String str, String str2, String str3) {
        String str4 = "reward_" + str + "_" + str2;
        C12998a.m36460b().m36464a(str4, str3);
        C14223c c14223cM42680a = C14223c.m42680a(str3);
        f41100c.put(str4, c14223cM42680a);
        if (C13884b.m41421a() || TextUtils.isEmpty(c14223cM42680a.m42710c())) {
            return;
        }
        m42656a(c14223cM42680a.m42710c(), str2);
    }

    /* JADX INFO: renamed from: a */
    public void m42665a(String str, String str2, String str3, InterfaceC14220c interfaceC14220c) {
        try {
            if (!TextUtils.isEmpty(str3) && !this.f41104b.contains(str3)) {
                m42663a(str3);
                new C14218a().m42631a(C13008c.m36588n().m36542d(), str, str2, str3, interfaceC14220c);
                return;
            }
            C13219q0.m37813a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m42666a(C14221a c14221a) {
        if (c14221a != null) {
            return c14221a.m42637b() + c14221a.m42644d() <= System.currentTimeMillis();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public String m42667b(String str, String str2) {
        return C12998a.m36460b().m36462a("reward_" + str + "_" + str2);
    }

    /* JADX INFO: renamed from: b */
    public void m42668b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strM42710c = m42658b().m42661a(C13008c.m36588n().m36533b(), str, false).m42710c();
        if (TextUtils.isEmpty(strM42710c) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(strM42710c))) {
            return;
        }
        m42656a(strM42710c, str);
    }

    /* JADX INFO: renamed from: b */
    public void m42669b(boolean z) {
        this.f41103a = z;
    }

    /* JADX INFO: renamed from: c */
    public C14221a m42670c() {
        C14221a c14221a = f41101d;
        if (c14221a != null) {
            return c14221a;
        }
        String strM36462a = C12998a.m36460b().m36462a("reward_" + C13008c.m36588n().m36533b());
        if (TextUtils.isEmpty(strM36462a)) {
            m42676e(C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c());
            return m42660a();
        }
        C14221a c14221aM42632a = C14221a.m42632a(strM36462a);
        if (!m42666a(c14221aM42632a)) {
            return c14221aM42632a;
        }
        m42676e(C13008c.m36588n().m36533b(), C13008c.m36588n().m36538c());
        return m42660a();
    }

    /* JADX INFO: renamed from: c */
    public C14223c m42671c(String str, String str2) {
        C14223c c14223c;
        boolean zM42657a;
        String str3 = "reward_" + str + "_" + str2;
        if (!f41100c.containsKey(str3)) {
            C14223c c14223cM42680a = C14223c.m42680a(C12998a.m36460b().m36462a(str3));
            if (m42657a(c14223cM42680a)) {
                m42665a(str, C13008c.m36588n().m36538c(), str2, null);
                return null;
            }
            f41100c.put(str3, c14223cM42680a);
            return c14223cM42680a;
        }
        try {
            c14223c = f41100c.get(str3);
            try {
                zM42657a = m42657a(c14223c);
            } catch (Exception unused) {
                zM42657a = false;
            }
        } catch (Exception unused2) {
            c14223c = null;
        }
        if (zM42657a) {
            m42665a(str, C13008c.m36588n().m36538c(), str2, null);
        }
        return c14223c;
    }

    /* JADX INFO: renamed from: d */
    public C14221a m42672d() {
        String str = "reward_" + C13008c.m36588n().m36533b();
        if (f41101d == null) {
            String strM36462a = C12998a.m36460b().m36462a(str);
            if (!TextUtils.isEmpty(strM36462a)) {
                C14221a c14221aM42632a = C14221a.m42632a(strM36462a);
                if (c14221aM42632a != null) {
                    f41101d = c14221aM42632a;
                }
                return c14221aM42632a;
            }
        }
        return f41101d;
    }

    /* JADX INFO: renamed from: d */
    public C14223c m42673d(String str, String str2) {
        String str3 = "reward_" + str + "_" + str2;
        if (f41100c.containsKey(str3)) {
            return f41100c.get(str3);
        }
        C14223c c14223cM42680a = C14223c.m42680a(C12998a.m36460b().m36462a(str3));
        if (c14223cM42680a != null) {
            f41100c.put(str3, c14223cM42680a);
        }
        return c14223cM42680a;
    }

    /* JADX INFO: renamed from: d */
    public String m42674d(String str) {
        return C12998a.m36460b().m36462a("reward_" + str);
    }

    /* JADX INFO: renamed from: e */
    public void m42675e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f41104b.remove(str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m42676e(String str, String str2) {
        if (this.f41103a) {
            return;
        }
        this.f41103a = true;
        new C14218a().m42630a(C13008c.m36588n().m36542d(), str, str2);
    }

    /* JADX INFO: renamed from: f */
    public void m42677f(String str) {
        try {
            String strM36462a = C12998a.m36460b().m36462a("reward_" + str);
            if (TextUtils.isEmpty(strM36462a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM36462a);
            jSONObject.put("current_time", System.currentTimeMillis());
            m42678f(str, jSONObject.toString());
        } catch (Throwable th) {
            C13219q0.m37816b("RewardSettingManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m42678f(String str, String str2) {
        C12998a.m36460b().m36464a("reward_" + str, str2);
        f41101d = C14221a.m42632a(str2);
    }

    /* JADX INFO: renamed from: g */
    public void m42679g(String str, String str2) {
        try {
            String strM36462a = C12998a.m36460b().m36462a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(strM36462a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM36462a);
            jSONObject.put("current_time", System.currentTimeMillis());
            m42664a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            C13219q0.m37816b("RewardSettingManager", th.getMessage());
        }
    }
}
