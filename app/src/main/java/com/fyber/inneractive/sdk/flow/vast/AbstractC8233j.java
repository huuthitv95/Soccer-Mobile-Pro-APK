package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.measurement.C8274h;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8299h;
import com.fyber.inneractive.sdk.model.vast.C8303l;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.C8430x;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11540L6;
import com.ironsource.C12538u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.vast.j */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8233j {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static InneractiveErrorCode m20632a(InneractiveAdRequest inneractiveAdRequest, C9089g c9089g, C8006r c8006r) {
        EnumC8415t enumC8415t;
        InneractiveErrorCode inneractiveErrorCode;
        InneractiveErrorCode inneractiveErrorCode2;
        EnumC8415t enumC8415t2;
        C8430x c8430xM20809a;
        Set<C8309r> setKeySet;
        int i;
        String str;
        String str2 = c9089g.f21309i;
        int i2 = 0;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            enumC8415t2 = EnumC8415t.VAST_ERROR_INVALID_RESPONSE;
            if (c9089g.f21310j != null) {
                c8430xM20809a = new C8430x().m20809a(c9089g.f21310j, "exception");
                EnumC8415t enumC8415t3 = enumC8415t2;
                inneractiveErrorCode = inneractiveErrorCode2;
                enumC8415t = enumC8415t3;
            }
            EnumC8415t enumC8415t4 = enumC8415t2;
            inneractiveErrorCode = inneractiveErrorCode2;
            enumC8415t = enumC8415t4;
            c8430xM20809a = null;
        } else {
            if ("ErrorNoCompatibleMediaFile".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                enumC8415t2 = EnumC8415t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
                LinkedHashMap linkedHashMap = c9089g.f21330M;
                if (linkedHashMap != null && (setKeySet = linkedHashMap.keySet()) != null && setKeySet.size() > 0) {
                    C8430x c8430x = new C8430x();
                    JSONArray jSONArray = new JSONArray();
                    for (C8309r c8309r : setKeySet) {
                        try {
                            C8229f c8229f = (C8229f) linkedHashMap.get(c8309r);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", c8309r.f18570g);
                            jSONObject.put("bitrate", c8309r.f18568e);
                            jSONObject.put("mime", TextUtils.isEmpty(c8309r.f18567d) ? "na" : c8309r.f18567d);
                            jSONObject.put(C12538u.f32486g, c8309r.f18564a);
                            EnumC8228e enumC8228e = c8229f.f18348a;
                            jSONObject.put("reason", enumC8228e != null ? enumC8228e.value : 0);
                            jSONObject.put("required_value", c8229f.f18349b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                            IAlog.m21945a("VastResponseValidator: Failed converting media file data to Extra data json!", new Object[0]);
                        }
                    }
                    c8430x.m20809a(jSONArray, "media_files");
                    inneractiveErrorCode = inneractiveErrorCode2;
                    enumC8415t = enumC8415t2;
                    c8430xM20809a = c8430x;
                }
            } else if ("VastErrorTooManyWrappers".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                enumC8415t2 = EnumC8415t.VAST_ERROR_TOO_MANY_WRAPPERS;
                c8430xM20809a = new C8430x().m20809a(Integer.valueOf(IAConfigManager.f17654M.f17677i.f17790b), "max");
                EnumC8415t enumC8415t5 = enumC8415t2;
                inneractiveErrorCode = inneractiveErrorCode2;
                enumC8415t = enumC8415t5;
            } else if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                enumC8415t2 = EnumC8415t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                enumC8415t2 = EnumC8415t.INTERNAL_CONFIG_MISMATCH;
            } else {
                if ("VastErrorUnsecure".equals(str2)) {
                    inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                    enumC8415t2 = EnumC8415t.VAST_ERROR_UNSECURE_URL;
                } else {
                    enumC8415t = null;
                    inneractiveErrorCode = null;
                }
                c8430xM20809a = null;
            }
            EnumC8415t enumC8415t6 = enumC8415t2;
            inneractiveErrorCode = inneractiveErrorCode2;
            enumC8415t = enumC8415t6;
            c8430xM20809a = null;
        }
        if (enumC8415t != null) {
            JSONArray jSONArrayM20435b = c8006r == null ? null : c8006r.m20435b();
            C8428w c8428w = new C8428w(c9089g);
            c8428w.f18754b = enumC8415t;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArrayM20435b;
            if (c8430xM20809a != null) {
                c8428w.f18758f.put(c8430xM20809a.f18760a);
            }
            c8428w.m20808a((String) null);
        }
        if (c9089g.f21314n != UnitDisplayType.NATIVE) {
            ArrayList<C8299h> arrayList = c9089g.f21331N;
            if (arrayList == null || arrayList.size() <= 0) {
                i = 0;
            } else {
                EnumC8424u enumC8424u = EnumC8424u.VAST_EVENT_COMPANION_FILTERED;
                JSONArray jSONArrayM20435b2 = c8006r == null ? null : c8006r.m20435b();
                C8428w c8428w2 = new C8428w(c9089g);
                c8428w2.f18755c = enumC8424u;
                c8428w2.f18753a = inneractiveAdRequest;
                c8428w2.f18756d = jSONArrayM20435b2;
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                for (C8299h c8299h : arrayList) {
                    c8299h.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    int i3 = i2;
                    try {
                        jSONObject3.put("w", c8299h.f18539a);
                        jSONObject3.put(CmcdData.Factory.STREAMING_FORMAT_HLS, c8299h.f18540b);
                        jSONObject3.put(C11540L6.f24923J0, c8299h.f18545g);
                        jSONObject3.put("clt", c8299h.f18546h);
                        String str3 = c8299h.f18544f;
                        if (str3 != null) {
                            jSONObject3.put("content", str3);
                            str = "HTMLResource";
                        } else {
                            str = null;
                        }
                        C8303l c8303l = c8299h.f18542d;
                        if (c8303l != null) {
                            jSONObject3.put("content", c8303l.f18551b);
                            jSONObject3.put("creativeType", c8299h.f18542d.f18550a);
                            str = "StaticResource";
                        }
                        if (!TextUtils.isEmpty(c8299h.f18543e)) {
                            jSONObject3.put("content", c8299h.f18543e);
                            str = "iFrameResource";
                        }
                        if (str != null) {
                            jSONObject3.put("type", str);
                        }
                        C8225b c8225b = c8299h.f18547i;
                        if (c8225b != null) {
                            jSONObject3.put("reason", c8225b.f18334a);
                            jSONObject3.put("exception", c8299h.f18547i.getMessage());
                        }
                    } catch (JSONException e) {
                        Object[] objArr = new Object[1];
                        objArr[i3] = e.getMessage();
                        IAlog.m21945a("Failed creating Companion json object: %s", objArr);
                        jSONObject3 = null;
                    }
                    jSONArray2.put(jSONObject3);
                    i2 = i3;
                }
                i = i2;
                try {
                    jSONObject2.put("companion_data", jSONArray2);
                } catch (Exception unused2) {
                    Object[] objArr2 = new Object[2];
                    objArr2[i] = "companion_data";
                    objArr2[1] = jSONArray2;
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", objArr2);
                }
                c8428w2.f18758f.put(jSONObject2);
                c8428w2.m20808a((String) null);
            }
            C8293b c8293b = c9089g.f21329L;
            int size = c8293b != null ? c8293b.f18505g.size() : i;
            ArrayList arrayList2 = c9089g.f21331N;
            int size2 = arrayList2 != null ? arrayList2.size() : i;
            EnumC8424u enumC8424u2 = EnumC8424u.NUMBER_OF_COMPANIONS;
            JSONArray jSONArrayM20435b3 = c8006r == null ? null : c8006r.m20435b();
            C8428w c8428w3 = new C8428w(c9089g);
            c8428w3.f18755c = enumC8424u2;
            c8428w3.f18753a = inneractiveAdRequest;
            c8428w3.f18756d = jSONArrayM20435b3;
            JSONObject jSONObject4 = new JSONObject();
            Integer numValueOf = Integer.valueOf(size + size2);
            try {
                jSONObject4.put("number_of_endcards", numValueOf);
            } catch (Exception unused3) {
                Object[] objArr3 = new Object[2];
                objArr3[i] = "number_of_endcards";
                objArr3[1] = numValueOf;
                IAlog.m21950f("Got exception adding param to json object: %s, %s", objArr3);
            }
            c8428w3.f18758f.put(jSONObject4);
            c8428w3.m20808a((String) null);
        } else {
            i = 0;
        }
        if (c9089g.f21329L != null) {
            C8232i<C8274h> c8232i = new C8232i(c9089g);
            if (c8232i.size() > 0) {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                EnumC8424u enumC8424u3 = EnumC8424u.OMID_VAST_DETECTION;
                JSONArray jSONArrayM20435b4 = c8006r == null ? null : c8006r.m20435b();
                C8428w c8428w4 = new C8428w(c9089g);
                c8428w4.f18755c = enumC8424u3;
                c8428w4.f18753a = inneractiveAdRequest;
                c8428w4.f18756d = jSONArrayM20435b4;
                for (C8274h c8274h : c8232i) {
                    c8274h.getClass();
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("success", String.valueOf(c8274h.m20678b()));
                        if (!c8274h.m20678b()) {
                            jSONObject6.put("error_reason", c8274h.m20676a());
                        }
                    } catch (JSONException unused4) {
                        jSONObject6 = null;
                    }
                    if (jSONObject6 != null) {
                        jSONArray3.put(jSONObject6);
                    }
                }
                try {
                    jSONObject5.put("verifications", jSONArray3);
                } catch (Exception unused5) {
                    Object[] objArr4 = new Object[2];
                    objArr4[i] = "verifications";
                    objArr4[1] = jSONArray3;
                    IAlog.m21950f("Got exception adding param to json object: %s, %s", objArr4);
                }
                c8428w4.f18758f.put(jSONObject5);
                c8428w4.m20808a((String) null);
            }
        }
        return inneractiveErrorCode;
    }
}
