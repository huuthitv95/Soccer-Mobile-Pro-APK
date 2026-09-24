package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.db */
/* JADX INFO: loaded from: classes9.dex */
public final class C3708db {

    /* JADX INFO: renamed from: a */
    public final PackageManager f13817a;

    /* JADX INFO: renamed from: b */
    public final Function0 f13818b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.db$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f13819b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public C3708db(PackageManager packageManager, Function0 intentFactory) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        this.f13817a = packageManager;
        this.f13818b = intentFactory;
    }

    public /* synthetic */ C3708db(PackageManager packageManager, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i & 2) != 0 ? a.f13819b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final Intent m17272a(String str) {
        Intent intent = (Intent) this.f13818b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public final List m17273a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            Intrinsics.checkNotNullExpressionValue(resolveInfoFlagsOf, "of(...)");
            return m17274a(intent, resolveInfoFlagsOf);
        }
        List<ResolveInfo> listQueryIntentActivities = this.f13817a.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        return listQueryIntentActivities;
    }

    /* JADX INFO: renamed from: a */
    public final List m17274a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List listQueryIntentActivities = this.f13817a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        return listQueryIntentActivities;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17275b(String str) {
        if (str != null && str.length() != 0) {
            try {
                return !m17273a(m17272a(str)).isEmpty();
            } catch (Exception e) {
                C4048sb.m19410b("Cannot open URL", e);
            }
        }
        return false;
    }
}
