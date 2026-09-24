package com.bykv.p028vk.openvk.preload.geckox.model;

import com.bykv.p028vk.openvk.preload.falconx.p032a.C1896a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ComponentModel {
    private Map<String, List<UpdatePackage>> packages;
    private Map<String, C1958b> universalStrategies;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.model.ComponentModel$a */
    public static class C1957a {

        /* JADX INFO: renamed from: a */
        public String f4437a;

        /* JADX INFO: renamed from: b */
        public int f4438b;

        /* JADX INFO: renamed from: c */
        public List<Long> f4439c;

        /* JADX INFO: renamed from: a */
        public final C1957a m6044a(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("c")) {
                        this.f4437a = (String) C1896a.m5882a(jSONObject, "c", String.class);
                    }
                    if (jSONObject.has("clean_type")) {
                        this.f4438b = jSONObject.optInt("clean_type");
                    }
                    if (jSONObject.has("version") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("version")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f4439c = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            this.f4439c.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i)));
                        }
                    }
                    if (jSONObject.has("status")) {
                        jSONObject.optInt("status");
                    }
                    if (jSONObject.has("pkg_id")) {
                        jSONObject.optInt("pkg_id");
                    }
                    if (jSONObject.has("err_code")) {
                        jSONObject.optInt("err_code");
                    }
                    if (jSONObject.has("err_msg")) {
                        C1896a.m5882a(jSONObject, "err_msg", String.class);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.model.ComponentModel$b */
    public static class C1958b {

        /* JADX INFO: renamed from: a */
        public List<C1957a> f4440a;

        /* JADX INFO: renamed from: b */
        private C1959c f4441b;

        /* JADX INFO: renamed from: a */
        public final C1958b m6045a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("specified_clean") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("specified_clean")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f4440a = new ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject2 != null) {
                                C1957a c1957a = new C1957a();
                                c1957a.m6044a(jSONObjectOptJSONObject2);
                                this.f4440a.add(c1957a);
                            }
                        }
                    }
                    if (jSONObject.has("group_clean") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("group_clean")) != null) {
                        C1959c c1959c = new C1959c();
                        this.f4441b = c1959c;
                        c1959c.m6046a(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.model.ComponentModel$c */
    public static class C1959c {
        /* JADX INFO: renamed from: a */
        public final C1959c m6046a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("rule")) {
                        jSONObject.optInt("rule");
                    }
                    if (jSONObject.has("policy")) {
                        jSONObject.optInt("policy");
                    }
                    if (jSONObject.has("limit")) {
                        jSONObject.optInt("limit");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public ComponentModel fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("packages") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("packages")) != null) {
                    this.packages = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject3 != null) {
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.fromJson(jSONObjectOptJSONObject3);
                                    arrayList.add(updatePackage);
                                }
                            }
                            this.packages.put(next, arrayList);
                        }
                    }
                }
                if (jSONObject.has("universal_strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("universal_strategies")) != null) {
                    this.universalStrategies = new HashMap();
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(next2);
                        if (jSONObjectOptJSONObject4 != null) {
                            C1958b c1958b = new C1958b();
                            c1958b.m6045a(jSONObjectOptJSONObject4);
                            this.universalStrategies.put(next2, c1958b);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, C1958b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
