package com.bykv.p028vk.openvk.preload.geckox.p033a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.Common;
import com.bykv.p028vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.p028vk.openvk.preload.geckox.net.Response;
import com.bykv.p028vk.openvk.preload.geckox.p044d.AbstractC1947a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1968e;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1970g;
import com.bykv.p028vk.openvk.preload.geckox.utils.ExecutorC1966c;
import com.ironsource.C11540L6;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a */
/* JADX INFO: compiled from: AbandonChannelClenUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1901a {

    /* JADX INFO: renamed from: a */
    private List<String> f4300a;

    /* JADX INFO: renamed from: b */
    private int f4301b = 1;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a */
    /* JADX INFO: compiled from: AbandonChannelClenUtils.java */
    static class a {

        /* JADX INFO: renamed from: a */
        String f4304a;

        /* JADX INFO: renamed from: b */
        String f4305b;

        /* JADX INFO: renamed from: c */
        int f4306c;

        /* JADX INFO: renamed from: d */
        long f4307d;

        /* JADX INFO: renamed from: e */
        File f4308e;

        a(String str, String str2, int i, long j, File file) {
            this.f4304a = str;
            this.f4305b = str2;
            this.f4306c = i;
            this.f4307d = j;
            this.f4308e = file;
        }
    }

    public C1901a(List<String> list) {
        this.f4300a = list;
    }

    /* JADX INFO: renamed from: a */
    public static List<StatisticModel.PackageStatisticModel> m5896a(Context context) {
        return C1908b.m5910a(context).m5911a();
    }

    /* JADX INFO: renamed from: a */
    public static void m5897a(final Context context, Map<String, ComponentModel.C1958b> map, File file, AbstractC1947a abstractC1947a) {
        final ArrayList arrayList;
        ComponentModel.C1958b value;
        List<Long> listM6085b;
        List<Long> listM6085b2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.C1958b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && value.f4440a != null && !value.f4440a.isEmpty()) {
                    List<ComponentModel.C1957a> list = value.f4440a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.C1957a c1957a : list) {
                        String str = c1957a.f4437a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i = c1957a.f4438b;
                            List<Long> list2 = c1957a.f4439c;
                            File file3 = new File(file2, str);
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new a(key, str, i, 0L, file5));
                                    }
                                } else if (list2 != null && (listM6085b = C1970g.m6085b(file3)) != null && !listM6085b.isEmpty()) {
                                    for (Long l : listM6085b) {
                                        if (list2.get(0).longValue() > l.longValue()) {
                                            File file6 = new File(file3, l + "--pending-delete");
                                            new File(file3, String.valueOf(l)).renameTo(file6);
                                            arrayList.add(new a(key, str, i, l.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list2 != null && (listM6085b2 = C1970g.m6085b(file3)) != null && !listM6085b2.isEmpty()) {
                                for (Long l2 : listM6085b2) {
                                    if (list2.contains(l2)) {
                                        File file7 = new File(file3, l2 + "--pending-delete");
                                        new File(file3, String.valueOf(l2)).renameTo(file7);
                                        arrayList.add(new a(key, str, i, l2.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        ExecutorC1966c.m6079a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<a> list3 = arrayList;
                    if (list3 != null && !list3.isEmpty()) {
                        for (a aVar : list3) {
                            File file8 = aVar.f4308e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zM6075a = C1965b.m6075a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zM6075a) {
                                C1908b.m5910a(context2).m5912a(aVar.f4304a, aVar.f4305b, aVar.f4306c, 200, aVar.f4307d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                C1908b.m5910a(context2).m5912a(aVar.f4304a, aVar.f4305b, aVar.f4306c, 201, aVar.f4307d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e2) {
                    GeckoLogger.m6043w("clean-channel", "", e2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m5898a(C1910b c1910b) {
        if (c1910b.m5925c()) {
            Common common = new Common(c1910b.m5931k(), c1910b.m5935o(), c1910b.m5938r(), C1964a.m6071b(c1910b.m5922a()), C1968e.m6082a(c1910b.m5922a()), c1910b.m5932l(), c1910b.m5933m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(C1908b.m5910a(c1910b.m5922a()).m5911a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = UrlConst.HTTPS + c1910b.m5930j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = c1910b.m5929i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m5899a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4300a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.f4300a.size(); i++) {
                    jSONArray.put(this.f4300a.get(i));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put(C11540L6.f24911F, 0);
            jSONObject.put("msg_type", this.f4301b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
