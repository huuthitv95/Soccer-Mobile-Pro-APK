package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.q */
/* JADX INFO: compiled from: OperatorString.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12749q {

    /* JADX INFO: renamed from: a */
    private final C12748c f33914a;

    public C12749q(C12748c c12748c) {
        this.f33914a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m35029b(String str, Object obj, List<Object> list) {
        Object obj2;
        String strValueOf = "";
        if (obj != null) {
            obj2 = obj;
        } else {
            if (!str.equals(C12770c.m35209b("802")) && !str.equals(C12770c.m35209b("803")) && !str.equals(C12770c.m35209b("804")) && !str.equals(C12770c.m35209b("805")) && !str.equals(C12770c.m35209b("811")) && !str.equals(C12770c.m35209b("812")) && !str.equals(C12770c.m35209b("813")) && !str.equals(C12770c.m35209b("814")) && !str.equals(C12770c.m35209b("815")) && !str.equals(C12770c.m35209b("817")) && !str.equals(C12770c.m35209b("818")) && !str.equals(C12770c.m35209b("819")) && !str.equals(C12770c.m35209b("820")) && !str.equals(C12770c.m35209b("821"))) {
                return C12746a.m35016a("");
            }
            obj2 = "";
        }
        String string = obj2.toString();
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        }
        String str2 = strValueOf;
        try {
            if (str.equals(C12770c.m35209b("800"))) {
                return m35022a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.q$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((String) obj3).toLowerCase();
                    }
                });
            }
            if (str.equals(C12770c.m35209b("801"))) {
                return m35022a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.q$$ExternalSyntheticLambda1
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((String) obj3).toUpperCase();
                    }
                });
            }
            if (str.equals(C12770c.m35209b("802"))) {
                return m35021a(obj2, str2);
            }
            if (str.equals(C12770c.m35209b("803"))) {
                return C12746a.m35016a(Boolean.valueOf(string.contains(str2)));
            }
            if (str.equals(C12770c.m35209b("804"))) {
                return C12746a.m35016a(Boolean.valueOf(string.startsWith(str2)));
            }
            if (str.equals(C12770c.m35209b("805"))) {
                return C12746a.m35016a(Boolean.valueOf(string.endsWith(str2)));
            }
            if (str.equals(C12770c.m35209b("806"))) {
                return C12746a.m35016a(Base64.encodeToString(string.getBytes(), 0));
            }
            if (str.equals(C12770c.m35209b("807"))) {
                try {
                    return C12746a.m35016a(new String(Base64.decode(string, 0), "UTF-8"));
                } catch (Exception e) {
                    C13219q0.m37816b("StringOperator", "Base64解码失败: " + e.getMessage());
                    return C12746a.m35016a(null);
                }
            }
            if (str.equals(C12770c.m35209b("808"))) {
                return C12746a.m35016a(C13207k0.m37713b(string));
            }
            if (str.equals(C12770c.m35209b("809"))) {
                return C12746a.m35016a(C13207k0.m37712a(string));
            }
            if (str.equals(C12770c.m35209b("810"))) {
                return C12746a.m35016a(C13229v0.m37905b(string, str2));
            }
            if (str.equals(C12770c.m35209b("811"))) {
                return C12746a.m35016a(Integer.valueOf(string.length()));
            }
            if (str.equals(C12770c.m35209b("812"))) {
                return m35023a(string);
            }
            if (str.equals(C12770c.m35209b("813"))) {
                return C12746a.m35016a(SameMD5.getMD5(string));
            }
            if (str.equals(C12770c.m35209b("814"))) {
                return m35024a(string, str2);
            }
            if (str.equals(C12770c.m35209b("815"))) {
                return m35030b(string, str2);
            }
            if (str.equals(C12770c.m35209b("816"))) {
                return m35031b(string, list);
            }
            if (str.equals(C12770c.m35209b("817"))) {
                return m35035d(string, str2);
            }
            if (str.equals(C12770c.m35209b("818"))) {
                return m35025a(string, list);
            }
            if (str.equals(C12770c.m35209b("819"))) {
                return m35036d(string, list);
            }
            if (str.equals(C12770c.m35209b("820"))) {
                return C12746a.m35016a(C13229v0.m37920d());
            }
            if (str.equals(C12770c.m35209b("821"))) {
                return m35033c(string, list);
            }
            return str.equals(C12770c.m35209b("896")) ? C12746a.m35016a(C13229v0.m37886a(string, str2)) : C12746a.m35017c();
        } catch (Exception e2) {
            C13219q0.m37816b("StringOperator", e2.getMessage());
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m35034c(String str, String str2) {
        if (str2.equals(C12770c.m35209b("800"))) {
            return str.toLowerCase();
        }
        if (str2.equals(C12770c.m35209b("801"))) {
            return str.toUpperCase();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private C12746a m35035d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35016a(arrayList);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList.add(str);
        } else {
            arrayList.addAll(Arrays.asList(str.split(str2)));
        }
        return C12746a.m35016a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public C12746a m35037a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return m35032b(str) ? m35029b(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: c */
    private C12746a m35033c(String str, List<Object> list) {
        Map map;
        if (list != null) {
            boolean z = true;
            if (list.size() == 1) {
                if (str == null) {
                    str = "";
                }
                Object obj = list.get(0);
                boolean z2 = obj instanceof C12894a;
                if (!z2 && !(obj instanceof Map)) {
                    return C12746a.m35016a(str);
                }
                if (z2) {
                    map = new HashMap();
                    for (Map.Entry<String, Object> entry : ((C12894a) obj).m36047a()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    map = (Map) obj;
                }
                try {
                    StringBuilder sb = new StringBuilder(str);
                    if (!str.contains("?")) {
                        sb.append("?");
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (!z) {
                            sb.append(C11744X3.j.f26436c);
                        }
                        sb.append((String) entry2.getKey());
                        sb.append(C11744X3.j.f26434b);
                        sb.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                        z = false;
                    }
                    return C12746a.m35016a(sb.toString());
                } catch (Throwable th) {
                    C13219q0.m37817b("StringOperator", "Error encoding URL parameters: " + th.getMessage(), th);
                    return C12746a.m35016a(null);
                }
            }
        }
        return C12746a.m35016a(str);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m35022a(Object obj, Function<String, String> function) {
        if (obj != null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    return C12746a.m35016a(function.apply(String.valueOf(obj)));
                }
                return C12746a.m35016a(m35034c(String.valueOf(obj), ""));
            } catch (Exception e) {
                C13219q0.m37817b("StringOperator", e.getMessage(), e);
            }
        }
        return C12746a.m35016a(obj);
    }

    /* JADX INFO: renamed from: d */
    private C12746a m35036d(String str, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35016a(str);
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            if (!TextUtils.isEmpty(strEncode)) {
                return C12746a.m35016a(strEncode);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("StringOperator", th.getMessage(), th);
        }
        return C12746a.m35016a(str);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m35021a(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(obj);
        }
        if (str != null) {
            sb.append(str);
        }
        return C12746a.m35016a(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    private C12746a m35023a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13219q0.m37816b("StringOperator", "JSON字符串为空");
            return C12746a.m35016a(null);
        }
        try {
            return C12746a.m35016a(m35026a((Object) new JSONObject(str)));
        } catch (JSONException e) {
            C13219q0.m37816b("StringOperator", "JSON字符串转Map对象失败: " + e.getMessage() + ", JSON字符串: " + str);
            return C12746a.m35016a(null);
        } catch (Exception e2) {
            C13219q0.m37816b("StringOperator", "JSON字符串转Map对象异常: " + e2.getMessage());
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<String, Object> m35028a(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(next)) {
                C13219q0.m37820d("StringOperator", "跳过空键: " + next);
            } else {
                map.put(next, m35026a(jSONObject.get(next)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private List<Object> m35027a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m35026a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private Object m35026a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return m35028a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? m35027a((JSONArray) obj) : obj;
    }

    /* JADX INFO: renamed from: a */
    private C12746a m35024a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return C12746a.m35016a(Integer.valueOf(str.indexOf(str2)));
        }
        return C12746a.m35016a(-1);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m35025a(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (TextUtils.isEmpty(strValueOf)) {
                return C12746a.m35016a(str);
            }
            return C12746a.m35016a(str.replace(strValueOf, strValueOf2));
        }
        return C12746a.m35016a(str);
    }

    /* JADX INFO: renamed from: b */
    private C12746a m35030b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return C12746a.m35016a(Integer.valueOf(str.lastIndexOf(str2)));
        }
        return C12746a.m35016a(-1);
    }

    /* JADX INFO: renamed from: b */
    private C12746a m35031b(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            try {
                int i = Integer.parseInt(String.valueOf(list.get(0)));
                int i2 = Integer.parseInt(String.valueOf(list.get(1)));
                if (i >= 0 && i2 < str.length() && i <= i2) {
                    return C12746a.m35016a(str.substring(i, i2 + 1));
                }
                return C12746a.m35016a(null);
            } catch (NumberFormatException e) {
                C13219q0.m37816b("StringOperator", "subString操作参数格式错误: " + e.getMessage());
                return C12746a.m35016a(null);
            } catch (StringIndexOutOfBoundsException e2) {
                C13219q0.m37816b("StringOperator", "subString操作索引越界: " + e2.getMessage());
                return C12746a.m35016a(null);
            }
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: b */
    private boolean m35032b(String str) {
        return str.equals(C12770c.m35209b("800")) || str.equals(C12770c.m35209b("801")) || str.equals(C12770c.m35209b("802")) || str.equals(C12770c.m35209b("803")) || str.equals(C12770c.m35209b("804")) || str.equals(C12770c.m35209b("805")) || str.equals(C12770c.m35209b("806")) || str.equals(C12770c.m35209b("807")) || str.equals(C12770c.m35209b("808")) || str.equals(C12770c.m35209b("809")) || str.equals(C12770c.m35209b("810")) || str.equals(C12770c.m35209b("811")) || str.equals(C12770c.m35209b("812")) || str.equals(C12770c.m35209b("813")) || str.equals(C12770c.m35209b("814")) || str.equals(C12770c.m35209b("815")) || str.equals(C12770c.m35209b("816")) || str.equals(C12770c.m35209b("817")) || str.equals(C12770c.m35209b("818")) || str.equals(C12770c.m35209b("819")) || str.equals(C12770c.m35209b("820")) || str.equals(C12770c.m35209b("821")) || str.equals(C12770c.m35209b("896"));
    }
}
