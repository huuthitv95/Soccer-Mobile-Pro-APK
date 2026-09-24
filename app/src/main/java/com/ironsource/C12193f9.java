package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9 */
/* JADX INFO: loaded from: classes6.dex */
public class C12193f9 {

    /* JADX INFO: renamed from: a */
    public static final a f30402a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.f9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final JSONObject m31472a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.m32770e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m31473b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C12596x3 c12596x3M31475d = m31475d(context);
            return c12596x3M31475d.m34134d().length() > 0 && c12596x3M31475d.m34135e().length() > 0;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final C11494Ie m31474c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C12596x3 c12596x3M31475d = m31475d(context);
            if (c12596x3M31475d.m34134d().length() <= 0 || c12596x3M31475d.m34135e().length() <= 0) {
                c12596x3M31475d = null;
            }
            if (c12596x3M31475d == null) {
                return null;
            }
            C11494Ie c11494Ie = new C11494Ie(context, c12596x3M31475d.m34134d(), c12596x3M31475d.m34136f(), c12596x3M31475d.m34135e());
            c11494Ie.m26132a(C11494Ie.a.CACHE);
            return c11494Ie;
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final C12596x3 m31475d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObjectM31472a = m31472a(context);
            String cachedAppKey = jSONObjectM31472a.optString("appKey");
            String cachedUserId = jSONObjectM31472a.optString("userId");
            String cachedSettings = jSONObjectM31472a.optString(C11494Ie.f24627n);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C12596x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m31469a(Context context) {
        return f30402a.m31473b(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final C11494Ie m31470b(Context context) {
        return f30402a.m31474c(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final C12596x3 m31471c(Context context) {
        return f30402a.m31475d(context);
    }
}
