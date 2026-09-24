package com.fyber.inneractive.sdk.serverapi.extradata;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.C7873k;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.AbstractC8044u;
import com.fyber.inneractive.sdk.config.C8021o;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.C8046v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7979g;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.mediationsdk.metadata.C12364a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.serverapi.extradata.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9119d {

    /* JADX INFO: renamed from: f */
    public C8006r f21374f;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f21369a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f21370b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f21371c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f21372d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f21373e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public int f21375g = -1;

    /* JADX INFO: renamed from: a */
    public static void m21926a(HashMap map) {
        C8428w c8428w = new C8428w(EnumC8415t.FIRST_PARTY_EXTRA_DATA_ERROR);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                jSONObject.put(str, value);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", str, value);
            }
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public final TokenParametersOuterClass$TokenParameters m21927a(int i) {
        if (i <= 0) {
            IAlog.m21945a("%sExtra data size limit is invalid: %s", "UserExtraDataManager", Integer.valueOf(i));
            return null;
        }
        IAlog.m21945a("%sExtra data token size limit: %s", "UserExtraDataManager", Integer.valueOf(i));
        C7873k c7873k = (C7873k) m21928a(TokenParametersOuterClass$TokenParameters.newBuilder(), new C9116a());
        if (c7873k == null) {
            IAlog.m21945a("%sExtra data token is empty", "UserExtraDataManager");
            return null;
        }
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = (TokenParametersOuterClass$TokenParameters) c7873k.m21751a();
        String strEncodeToString = Base64.encodeToString(tokenParametersOuterClass$TokenParameters.toByteArray(), 2);
        if (strEncodeToString == null) {
            return null;
        }
        int length = strEncodeToString.length();
        IAlog.m21945a("%sExtra data token size is: %s", "UserExtraDataManager", Integer.valueOf(length));
        if (length <= i) {
            IAlog.m21945a("%sReturning extra data token", "UserExtraDataManager");
            return tokenParametersOuterClass$TokenParameters;
        }
        IAlog.m21945a("%sTrimming extra data from token", "UserExtraDataManager");
        if (this.f21371c.compareAndSet(false, true)) {
            HashMap map = new HashMap();
            map.put("reason", "Token with extra data exceeded limit");
            map.put(UserMetadata.KEYDATA_FILENAME, new JSONArray((Collection) this.f21372d.keySet()));
            m21926a(map);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Object m21928a(Object obj, InterfaceC9118c interfaceC9118c) {
        Integer num;
        int i;
        C8006r c8006r = this.f21374f;
        if (c8006r != null) {
            Boolean boolMo20420c = ((C7979g) c8006r.m20432a(C7979g.class)).mo20420c(C12364a.f31324j);
            boolean zBooleanValue = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
            IAlog.m21945a("ExtraDataFeature %s", String.valueOf(zBooleanValue));
            if (zBooleanValue) {
                if (this.f21372d.isEmpty()) {
                    return null;
                }
                for (Map.Entry entry : this.f21372d.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (this.f21373e.containsKey(str)) {
                        if (this.f21375g == -1) {
                            C8040s c8040s = IAConfigManager.f17654M.f17688t;
                            if (c8040s == null) {
                                IAlog.m21946b("%sGlobalConfigResolver is null, cannot resolve ExtraDataValueMaxLength", new Object[0]);
                            } else {
                                C8021o c8021o = c8040s.f17862b;
                                c8021o.getClass();
                                try {
                                    i = Integer.parseInt(c8021o.m20445a("edvml", Integer.toString(512)));
                                } catch (Throwable unused) {
                                    i = 512;
                                }
                                int i2 = i >= 1 ? i : 512;
                                this.f21375g = i2;
                                IAlog.m21945a("%sExtraDataValueMaxLength: %s", "UserExtraDataManager", Integer.valueOf(i2));
                            }
                        }
                        if (str2.length() > this.f21375g) {
                            if (str != null) {
                                Set hashSet = (Set) this.f21369a.get("value_too_long_keys");
                                if (hashSet == null) {
                                    hashSet = new HashSet();
                                }
                                hashSet.add(str);
                                this.f21369a.put("value_too_long_keys", hashSet);
                            }
                            IAlog.m21945a("%sCould not set extra data for key: %s, value is too long", "UserExtraDataManager", str);
                            this.f21372d.remove(str);
                        } else {
                            if (str != null && (num = (Integer) this.f21373e.get(str)) != null) {
                                if (num.intValue() == 1) {
                                    if (!InneractiveAdManager.isCurrentUserAChild()) {
                                        C8046v c8046v = AbstractC8044u.f17878a.f17886b;
                                        if (c8046v != null ? c8046v.f17883b : false) {
                                        }
                                    }
                                }
                                try {
                                    interfaceC9118c.mo21924a(str, str2, obj);
                                } catch (Exception e) {
                                    IAlog.m21946b("%sCouldn't process entry for %s. %s", "UserExtraDataManager", str, e.getMessage());
                                }
                            }
                            IAlog.m21945a("%sCould not set extra data for key: %s, limited tracking is on", "UserExtraDataManager", str);
                            this.f21372d.remove(str);
                        }
                    } else {
                        if (str != null) {
                            Set hashSet2 = (Set) this.f21369a.get("unsupported_keys");
                            if (hashSet2 == null) {
                                hashSet2 = new HashSet();
                            }
                            hashSet2.add(str);
                            this.f21369a.put("unsupported_keys", hashSet2);
                        }
                        IAlog.m21945a("%sCould not set extra data for unsupported key: %s", "UserExtraDataManager", str);
                        this.f21372d.remove(str);
                    }
                }
                if (!this.f21369a.isEmpty() && this.f21370b.compareAndSet(false, true)) {
                    HashMap map = new HashMap();
                    map.put("reason", "Publisher failed to set extra data");
                    for (Map.Entry entry2 : this.f21369a.entrySet()) {
                        if (entry2.getValue() != null) {
                            map.put((String) entry2.getKey(), new JSONArray((Collection) new ArrayList((Collection) entry2.getValue())));
                        }
                    }
                    m21926a(map);
                }
                if (interfaceC9118c.mo21925a(obj)) {
                    return null;
                }
                return obj;
            }
        }
        IAlog.m21945a("%sFeature is disabled, not providing extra data", "UserExtraDataManager");
        return null;
    }
}
