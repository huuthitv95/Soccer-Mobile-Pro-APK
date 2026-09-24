package com.mbridge.msdk.config.component.common.express.operator;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12748c;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.s */
/* JADX INFO: compiled from: OperatorUrl.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12751s {

    /* JADX INFO: renamed from: a */
    private final C12748c f33916a;

    public C12751s(C12748c c12748c) {
        this.f33916a = c12748c;
    }

    /* JADX INFO: renamed from: b */
    private C12746a m35042b(String str, Object obj, List<Object> list) {
        Uri uri;
        String str2;
        if (obj != null && !(obj instanceof String)) {
            return C12746a.m35017c();
        }
        if (obj == null) {
            obj = "";
        }
        try {
            uri = !TextUtils.isEmpty(obj.toString()) ? Uri.parse(obj.toString()) : null;
        } catch (Exception e) {
            C13219q0.m37816b("UrlOperator", e.getMessage());
        }
        try {
            if (str.equals(C12770c.m35209b("822"))) {
                return C12746a.m35016a(m35045c(uri, list));
            }
            if (str.equals(C12770c.m35209b("823"))) {
                return C12746a.m35016a(m35044b(uri, list));
            }
            if (str.equals(C12770c.m35209b("824"))) {
                return C12746a.m35016a(m35039a(uri, list));
            }
            if (str.equals(C12770c.m35209b("884"))) {
                return C12746a.m35016a(uri == null ? null : uri.getHost());
            }
            if (str.equals(C12770c.m35209b("885"))) {
                return C12746a.m35016a(uri == null ? null : uri.getScheme());
            }
            if (str.equals(C12770c.m35209b("825"))) {
                return C12746a.m35016a(uri == null ? null : uri.getQuery());
            }
            if (str.equals(C12770c.m35209b("826"))) {
                return C12746a.m35016a(m35043b(uri));
            }
            if (str.equals(C12770c.m35209b("827"))) {
                return C12746a.m35016a(m35040a(uri));
            }
            if (!str.equals(C12770c.m35209b("828"))) {
                return C12746a.m35017c();
            }
            if (uri == null) {
                str2 = null;
            } else {
                str2 = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
            }
            return C12746a.m35016a(str2);
        } catch (Exception e2) {
            C13219q0.m37817b("UrlOperator", e2.getMessage(), e2);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    private Object m35045c(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (!TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(strValueOf2)) {
                Map<String, String> mapM35040a = m35040a(uri);
                mapM35040a.put(strValueOf, strValueOf2);
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapM35040a.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: a */
    public C12746a m35046a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        return m35041a(str) ? m35042b(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: a */
    private Object m35039a(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                return builderBuildUpon.authority(strValueOf).build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m35040a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String str : query.split(C11744X3.j.f26436c)) {
                String[] strArrSplit = str.split(C11744X3.j.f26434b);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private boolean m35041a(String str) {
        return str.equals(C12770c.m35209b("822")) || str.equals(C12770c.m35209b("823")) || str.equals(C12770c.m35209b("824")) || str.equals(C12770c.m35209b("884")) || str.equals(C12770c.m35209b("885")) || str.equals(C12770c.m35209b("825")) || str.equals(C12770c.m35209b("826")) || str.equals(C12770c.m35209b("827")) || str.equals(C12770c.m35209b("828"));
    }

    /* JADX INFO: renamed from: b */
    private Object m35044b(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                Map<String, String> mapM35040a = m35040a(uri);
                mapM35040a.remove(strValueOf.trim());
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapM35040a.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: b */
    private Object m35043b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String query = uri.getQuery();
        if (TextUtils.isEmpty(query)) {
            return null;
        }
        return query.split(C11744X3.j.f26436c);
    }
}
