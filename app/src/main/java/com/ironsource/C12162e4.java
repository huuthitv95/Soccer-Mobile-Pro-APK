package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p300io.ByteStreamsKt;
import kotlin.p300io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.ironsource.e4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12162e4 {

    /* JADX INFO: renamed from: b */
    private static final String f30281b = "iads/";

    /* JADX INFO: renamed from: c */
    private static final String f30282c = "CONTROLLER_FROM_BUNDLE";

    /* JADX INFO: renamed from: d */
    private static final String f30283d = "controllerVersion";

    /* JADX INFO: renamed from: e */
    private static final String f30284e = "controller_html_loaded_from_bundle";

    /* JADX INFO: renamed from: g */
    private static volatile boolean f30286g;

    /* JADX INFO: renamed from: a */
    public static final C12162e4 f30280a = new C12162e4();

    /* JADX INFO: renamed from: f */
    private static final List<String> f30285f = CollectionsKt.listOf((Object[]) new String[]{C11744X3.f26144f, C11744X3.f26145g, "mobileController.min.css", "index.html", "index.css", "index.js"});

    private C12162e4() {
    }

    /* JADX INFO: renamed from: a */
    public static final List<String> m31348a() {
        return f30285f;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m31351b() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m31349a(Context context, boolean z) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        f30286g = z;
        if (context != null) {
            IronSourceUtils.m32754b(context, f30284e, z);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m31352b(Context context) {
        if (context != null) {
            f30286g = IronSourceUtils.m32742a(context, f30284e, false);
        }
        return f30286g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final byte[] m31350a(Context context, String fileName) {
        Throwable th;
        ?? bytes = f30281b;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ?? r1 = 0;
        ?? r2 = 0;
        if (context != null) {
            try {
                try {
                    InputStream inputStream = context.getAssets().open(f30281b + fileName);
                    try {
                        Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                        bytes = ByteStreamsKt.readBytes(inputStream);
                        try {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(inputStream, null);
                            return bytes;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(inputStream, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bytes = 0;
                    }
                } catch (Exception e) {
                    e = e;
                    IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                    e.printStackTrace();
                    r1 = r2;
                    return r1;
                }
            } catch (Exception e2) {
                e = e2;
                r2 = bytes;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                e.printStackTrace();
                r1 = r2;
                return r1;
            }
        }
        return r1;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final String m31347a(Context context) {
        if (context != null) {
            try {
                byte[] bArrM31350a = m31350a(context, f30283d);
                String string = bArrM31350a != null ? StringsKt.trim((CharSequence) new String(bArrM31350a, Charsets.UTF_8)).toString() : null;
                if (string != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + string);
                    return string;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return null;
    }
}
