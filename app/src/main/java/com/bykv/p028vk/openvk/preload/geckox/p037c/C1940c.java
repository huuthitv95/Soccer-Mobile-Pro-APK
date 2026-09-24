package com.bykv.p028vk.openvk.preload.geckox.p037c;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.buffer.p036a.C1914a;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.p028vk.openvk.preload.geckox.model.Common;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.net.Response;
import com.bykv.p028vk.openvk.preload.geckox.p033a.C1901a;
import com.bykv.p028vk.openvk.preload.geckox.p033a.C1909c;
import com.bykv.p028vk.openvk.preload.geckox.p044d.AbstractC1947a;
import com.bykv.p028vk.openvk.preload.geckox.p047f.C1953a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.C1962c;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1965b;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1968e;
import com.bykv.p028vk.openvk.preload.geckox.utils.ExecutorC1966c;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import com.tiktok.util.UrlConst;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c */
/* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1940c extends AbstractC1886d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* JADX INFO: renamed from: d */
    private C1910b f4393d;

    /* JADX INFO: renamed from: e */
    private Map<String, Map<String, Object>> f4394e;

    /* JADX INFO: renamed from: f */
    private Map<String, List<CheckRequestBodyModel.TargetChannel>> f4395f;

    /* JADX INFO: renamed from: g */
    private AbstractC1947a f4396g;

    /* JADX INFO: renamed from: h */
    private String f4397h;

    /* JADX INFO: renamed from: i */
    private C1914a f4398i = new C1914a();

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c$a */
    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c$b */
    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class b extends RuntimeException {
        b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.c.c$c */
    /* JADX INFO: compiled from: GetServerChannelVersionInterceptorMulti.java */
    public static class c extends RuntimeException {
        c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static long m5998a(List<Pair<String, Long>> list, String str) {
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Object mo5832a(InterfaceC1882b<List<UpdatePackage>> interfaceC1882b, Map<String, List<Pair<String, Long>>> map) throws Exception {
        List<Pair<String, C1953a>> listM6003c;
        int i;
        char c2 = 2;
        int i2 = 0;
        char c3 = 1;
        GeckoLogger.m6040d("gecko-debug-tag", "start get server channel version[v3]... local channel version:", map);
        Map<String, List<UpdatePackage>> mapM5999a = m5999a(map);
        C1962c.m6055a(this.f4393d, this.f4398i);
        Iterator<Map.Entry<String, List<UpdatePackage>>> it = mapM5999a.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<UpdatePackage> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                UpdatePackage next = it2.next();
                long localVersion = next.getLocalVersion();
                long version = next.getVersion();
                if (version < localVersion) {
                    String channel = next.getChannel();
                    Long lValueOf = Long.valueOf(localVersion);
                    Long lValueOf2 = Long.valueOf(version);
                    Object[] objArr = new Object[5];
                    objArr[i2] = channel;
                    objArr[c3] = "rollback：";
                    objArr[c2] = lValueOf;
                    objArr[3] = "->";
                    objArr[4] = lValueOf2;
                    GeckoLogger.m6040d("gecko-debug-tag", objArr);
                    File[] fileArrListFiles = new File(this.f4393d.m5934n(), next.getAccessKey() + File.separator + next.getChannel()).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.1
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        i2 = i2;
                        c2 = 2;
                        c3 = 1;
                    } else {
                        int length = fileArrListFiles.length;
                        int i3 = i2;
                        while (i3 < length) {
                            File file = fileArrListFiles[i3];
                            try {
                                long j = Long.parseLong(file.getName());
                                if (j > version) {
                                    i = i2;
                                    final File file2 = new File(file.getParent(), file.getName() + "--pending-delete");
                                    file.renameTo(file2);
                                    ExecutorC1966c.m6079a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.c.c.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1965b.m6075a(file2);
                                        }
                                    });
                                } else {
                                    i = i2;
                                    if (j == version) {
                                        it2.remove();
                                    }
                                }
                            } catch (Exception unused) {
                                i = i2;
                            }
                            i3++;
                            i2 = i;
                            c2 = 2;
                            c3 = 1;
                        }
                    }
                }
            }
        }
        int i4 = i2;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<UpdatePackage>>> it3 = mapM5999a.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.addAll(it3.next().getValue());
        }
        Object objMo5836a = null;
        try {
            listM6003c = m6003c(arrayList);
            try {
                objMo5836a = interfaceC1882b.mo5836a(arrayList);
                m6002b(listM6003c);
                Object[] objArr2 = new Object[1];
                objArr2[i4] = "all channel update finished";
                GeckoLogger.m6040d("gecko-debug-tag", objArr2);
            } catch (Throwable th) {
                th = th;
                try {
                    GeckoLogger.m6041e("gecko-debug-tag", "filterChannel:", th);
                    m6002b(listM6003c);
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = "all channel update finished";
                    GeckoLogger.m6040d("gecko-debug-tag", objArr3);
                } catch (Throwable th2) {
                    m6002b(listM6003c);
                    Object[] objArr4 = new Object[1];
                    objArr4[i4] = "all channel update finished";
                    GeckoLogger.m6040d("gecko-debug-tag", objArr4);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            listM6003c = null;
        }
        m6000a(arrayList);
        return objMo5836a;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, List<UpdatePackage>> m5999a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        String strM6001b = m6001b(map);
        String str = UrlConst.HTTPS + this.f4393d.m5930j() + "/gecko/server/v3/package";
        try {
            this.f4398i.f4363f = C1968e.m6082a(this.f4393d.m5922a());
            Response responseDoPost = this.f4393d.m5929i().doPost(str, strM6001b);
            this.f4398i.f4364g = responseDoPost.code;
            this.f4398i.f4361d = responseDoPost.msg;
            C1914a c1914a = this.f4398i;
            Map<String, String> map2 = responseDoPost.headers;
            String str2 = "";
            if (map2 != null && !map2.isEmpty()) {
                String str3 = map2.get("x-tt-logid");
                if (TextUtils.isEmpty(str3)) {
                    str3 = map2.get("X-Tt-Logid");
                    if (TextUtils.isEmpty(str3)) {
                        String str4 = map2.get("X-TT-LOGID");
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str3;
                    }
                } else {
                    str2 = str3;
                }
            }
            c1914a.f4362e = str2;
            if (responseDoPost.code != 200) {
                throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
            }
            String str5 = responseDoPost.body;
            GeckoLogger.m6040d("gecko-debug-tag", "response:", str5);
            try {
                com.bykv.p028vk.openvk.preload.geckox.model.Response response = new com.bykv.p028vk.openvk.preload.geckox.model.Response();
                response.fromJson(str5);
                if (response.status != 0) {
                    if (response.status == 2000) {
                        C1901a.m5898a(this.f4393d);
                        return new HashMap();
                    }
                    String str6 = "check update error，unknow status code，response.status：" + response.status;
                    this.f4398i.f4361d = str6;
                    C1962c.m6055a(this.f4393d, this.f4398i);
                    throw new a(str6);
                }
                if (response.data == null) {
                    this.f4398i.f4361d = "check update error：response.data==null";
                    C1962c.m6055a(this.f4393d, this.f4398i);
                    throw new a("check update error：response.data==null");
                }
                C1901a.m5897a(this.f4393d.m5922a(), response.data.getUniversalStrategies(), this.f4393d.m5934n(), this.f4396g);
                Map<String, List<UpdatePackage>> packages = response.data.getPackages();
                if (packages == null || packages.isEmpty()) {
                    C1901a.m5898a(this.f4393d);
                    return new HashMap();
                }
                for (String str7 : this.f4393d.m5927e()) {
                    List<UpdatePackage> list = packages.get(str7);
                    if (list != null && !list.isEmpty()) {
                        for (UpdatePackage updatePackage : list) {
                            updatePackage.setAccessKey(str7);
                            updatePackage.setLocalVersion(m5998a(map.get(str7), updatePackage.getChannel()));
                        }
                    }
                }
                return packages;
            } catch (Throwable th) {
                this.f4398i.f4361d = "json parse failed：" + th.getMessage();
                C1962c.m6055a(this.f4393d, this.f4398i);
                throw new b("json parse failed：" + str5 + " caused by:" + th.getMessage(), th);
            }
        } catch (Exception e) {
            C1962c.m6055a(this.f4393d, this.f4398i);
            throw new c("request failed：url:" + str + ", caused by:" + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6000a(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return;
        }
        for (UpdatePackage updatePackage : list) {
            C1909c.m5915a(new File(new File(this.f4393d.m5934n(), updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: b */
    private String m6001b(Map<String, List<Pair<String, Long>>> map) {
        List<CheckRequestBodyModel.TargetChannel> list;
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context contextM5922a = this.f4393d.m5922a();
        checkRequestBodyModel.setCommon(new Common(this.f4393d.m5931k(), this.f4393d.m5935o(), this.f4393d.m5938r(), C1964a.m6071b(contextM5922a), C1968e.m6082a(contextM5922a), this.f4393d.m5932l(), this.f4393d.m5933m()));
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                map3.put(pair.first, localChannel);
            }
            map2.put(entry.getKey(), map3);
        }
        try {
            if (!map2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str = (String) entry2.getKey();
                    Map map4 = (Map) entry2.getValue();
                    if (map4 != null && !map4.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry3 : map4.entrySet()) {
                            jSONObject2.put((String) entry3.getKey(), ((CheckRequestBodyModel.LocalChannel) entry3.getValue()).toJson());
                        }
                        jSONObject.put(str, jSONObject2);
                    }
                }
                this.f4398i.f4358a = jSONObject.toString();
            }
            checkRequestBodyModel.setLocal(map2);
            HashMap map5 = new HashMap();
            for (String str2 : this.f4393d.m5927e()) {
                CheckRequestBodyModel.Group group = new CheckRequestBodyModel.Group();
                group.groupName = this.f4397h;
                Map<String, List<CheckRequestBodyModel.TargetChannel>> map6 = this.f4395f;
                if (map6 != null && !map6.isEmpty() && (list = this.f4395f.get(str2)) != null && !list.isEmpty()) {
                    group.targetChannels = new ArrayList();
                    group.targetChannels.addAll(list);
                }
                map5.put(str2, group);
            }
            if (!map5.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry4 : map5.entrySet()) {
                    Object value = entry4.getValue();
                    if (value != null && (value instanceof CheckRequestBodyModel.Group)) {
                        jSONObject3.put((String) entry4.getKey(), ((CheckRequestBodyModel.Group) value).toJson());
                    }
                }
                this.f4398i.f4359b = jSONObject3.toString();
            }
            checkRequestBodyModel.setDeployments(map5);
            Map<String, Map<String, Object>> map7 = this.f4394e;
            if (map7 != null) {
                if (!map7.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry<String, Map<String, Object>> entry5 : this.f4394e.entrySet()) {
                        String key = entry5.getKey();
                        Map<String, Object> value2 = entry5.getValue();
                        if (value2 != null && !value2.isEmpty()) {
                            JSONObject jSONObject5 = new JSONObject();
                            for (Map.Entry<String, Object> entry6 : value2.entrySet()) {
                                Object value3 = entry6.getValue();
                                if (value3 instanceof String) {
                                    jSONObject5.put(entry6.getKey(), value3);
                                }
                            }
                            jSONObject4.put(key, jSONObject5);
                        }
                    }
                    this.f4398i.f4360c = jSONObject4.toString();
                }
                checkRequestBodyModel.setCustom(this.f4394e);
            }
            return checkRequestBodyModel.toJson();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m6002b(List<Pair<String, C1953a>> list) {
        if (list == null) {
            return;
        }
        Iterator<Pair<String, C1953a>> it = list.iterator();
        while (it.hasNext()) {
            try {
                ((C1953a) it.next().second).m6025a();
            } catch (Exception e) {
                GeckoLogger.m6041e("gecko-debug-tag", "releaseLock:", e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private List<Pair<String, C1953a>> m6003c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f4393d.m5934n(), updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    C1965b.m6075a(file);
                }
                if (!file.mkdirs() && !file.isDirectory()) {
                    GeckoLogger.m6040d("gecko-debug-tag", "can not create channel dir：", file.getAbsolutePath());
                    throw new RuntimeException("can not create channel dir:" + file.getAbsolutePath());
                }
                C1953a c1953aM6024a = C1953a.m6024a(file.getAbsolutePath() + File.separator + "update.lock");
                if (c1953aM6024a != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), c1953aM6024a));
                    arrayList2.add(updatePackage);
                } else {
                    AbstractC1947a abstractC1947a = this.f4396g;
                    updatePackage.getChannel();
                }
            } catch (Exception e) {
                GeckoLogger.m6041e("gecko-debug-tag", "filterChannel:", e);
                updatePackage.getChannel();
                AbstractC1947a abstractC1947a2 = this.f4396g;
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    @Override // com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d
    /* JADX INFO: renamed from: a */
    protected final void mo5848a(Object... objArr) {
        super.mo5848a(objArr);
        this.f4393d = (C1910b) objArr[0];
        this.f4394e = (Map) objArr[1];
        this.f4395f = (Map) objArr[2];
        this.f4396g = (AbstractC1947a) objArr[3];
        this.f4397h = (String) objArr[4];
    }
}
